/*
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package net.coru.kloadgen.config.valueserialized;

import static net.coru.kloadgen.util.PropsKeysHelper.VALUE_SCHEMA_PROPERTIES;
import static net.coru.kloadgen.util.PropsKeysHelper.VALUE_SUBJECT_NAME;
import static net.coru.kloadgen.util.SchemaRegistryKeyHelper.SCHEMA_REGISTRY_PASSWORD_KEY;
import static net.coru.kloadgen.util.SchemaRegistryKeyHelper.SCHEMA_REGISTRY_URL;
import static net.coru.kloadgen.util.SchemaRegistryKeyHelper.SCHEMA_REGISTRY_USERNAME_KEY;
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.WireMockServer;
import io.confluent.kafka.serializers.subject.TopicNameStrategy;
import java.io.File;
import java.util.Collections;
import java.util.Locale;
import net.coru.kloadgen.serializer.AvroSerializer;
import org.apache.jmeter.threads.JMeterContext;
import org.apache.jmeter.threads.JMeterContextService;
import org.apache.jmeter.threads.JMeterVariables;
import org.apache.jmeter.util.JMeterUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import ru.lanwen.wiremock.ext.WiremockResolver;
import ru.lanwen.wiremock.ext.WiremockResolver.Wiremock;
import ru.lanwen.wiremock.ext.WiremockUriResolver;

@ExtendWith({
    WiremockResolver.class,
    WiremockUriResolver.class
})
class ValueSerializedConfigElementTest {

  @BeforeEach
  public void setUp() {
    File file = new File("src/test/resources");
    String absolutePath = file.getAbsolutePath();
    JMeterUtils.loadJMeterProperties(absolutePath + "/kloadgen.properties");
    JMeterContext jmcx = JMeterContextService.getContext();
    jmcx.setVariables(new JMeterVariables());
    JMeterUtils.setLocale(Locale.ENGLISH);
  }

  @Test
  public void iterationStart( @Wiremock WireMockServer server) {

    JMeterContextService.getContext().getProperties().put(SCHEMA_REGISTRY_URL, "http://localhost:" + server.port());
    JMeterContextService.getContext().getProperties().put(SCHEMA_REGISTRY_USERNAME_KEY, "foo");
    JMeterContextService.getContext().getProperties().put(SCHEMA_REGISTRY_PASSWORD_KEY, "foo");

    ValueSerializedConfigElement
        valueSerializedConfigElement = new ValueSerializedConfigElement("avroSubject", Collections.emptyList(), "AVRO",
            AvroSerializer.class.getSimpleName(), TopicNameStrategy.class.getSimpleName());
    valueSerializedConfigElement.iterationStart(null);
    assertThat(JMeterContextService.getContext().getVariables().getObject(VALUE_SUBJECT_NAME)).isNotNull();
    assertThat(JMeterContextService.getContext().getVariables().getObject(VALUE_SCHEMA_PROPERTIES)).isNotNull();

  }

}