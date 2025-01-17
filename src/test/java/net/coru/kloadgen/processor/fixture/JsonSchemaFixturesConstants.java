package net.coru.kloadgen.processor.fixture;

import net.coru.kloadgen.model.ConstraintTypeEnum;
import net.coru.kloadgen.model.FieldValueMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static net.coru.kloadgen.model.ConstraintTypeEnum.*;

public class JsonSchemaFixturesConstants {

    public static final List<FieldValueMapping> SIMPLE_SCHEMA = new ArrayList<FieldValueMapping>(Arrays.asList(
            FieldValueMapping.builder()
                    .fieldName("firstName")
                    .fieldType("string")
                    .valueLength(0)
                    .fieldValueList("null")
                    .required(false)
                    .isParentRequired(false)
                    .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                        put(MINIMUM_VALUE, "0");
                        put(MAXIMUM_VALUE, "0");
                    }})
                    .build(),
            FieldValueMapping.builder()
                    .fieldName("lastName")
                    .fieldType("string")
                    .valueLength(0)
                    .fieldValueList("García")
                    .required(true)
                    .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                        put(MINIMUM_VALUE, "0");
                        put(MAXIMUM_VALUE, "0");
                    }})
                    .build(),
            FieldValueMapping.builder()
                    .fieldName("age")
                    .fieldType("number")
                    .valueLength(0)
                    .fieldValueList("null")
                    .required(false)
                    .constrains(new HashMap<ConstraintTypeEnum, String>() {
                    })
                    .build()
    ));

    public static final String SIMPLE_SCHEMA_EXPECTED = "{\"lastName\":\"García\"}";

    public static final List<FieldValueMapping> SIMPLE_SCHEMA_ARRAY = new ArrayList<FieldValueMapping>(Arrays.asList(
            FieldValueMapping.builder()
                    .fieldName("fruits[]")
                    .fieldType("string-array")
                    .valueLength(0)
                    .fieldValueList("null")
                    .required(false)
                    .isParentRequired(false)
                    .constrains(new HashMap<ConstraintTypeEnum, String>() {
                    })
                    .build(),
            FieldValueMapping.builder()
                    .fieldName("vegetables[].veggieName")
                    .fieldType("string")
                    .valueLength(0)
                    .fieldValueList("null")
                    .required(false)
                    .isParentRequired(false)
                    .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                        put(MINIMUM_VALUE, "0");
                        put(MAXIMUM_VALUE, "0");
                    }})
                    .build(),
            FieldValueMapping.builder()
                    .fieldName("vegetables[].veggieLike")
                    .fieldType("boolean")
                    .valueLength(0)
                    .fieldValueList("null")
                    .required(false)
                    .isParentRequired(false)
                    .constrains(new HashMap<ConstraintTypeEnum, String>() {
                    })
                    .build()
    ));

    public static final String SIMPLE_SCHEMA_ARRAY_EXPECTED = "{}";

    public static final List<FieldValueMapping> SIMPLE_SCHEMA_MAP = new ArrayList<FieldValueMapping>(Arrays.asList(
            FieldValueMapping.builder()
                    .fieldName("firstName")
                    .fieldType("string")
                    .valueLength(0)
                    .fieldValueList("null")
                    .required(false)
                    .isParentRequired(false)
                    .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                        put(MINIMUM_VALUE, "0");
                        put(MAXIMUM_VALUE, "0");
                    }})
                    .build(),
            FieldValueMapping.builder()
                    .fieldName("lastName")
                    .fieldType("string")
                    .valueLength(0)
                    .fieldValueList("García")
                    .required(true)
                    .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                        put(MINIMUM_VALUE, "0");
                        put(MAXIMUM_VALUE, "0");
                    }})
                    .build(),
            FieldValueMapping.builder()
                    .fieldName("age")
                    .fieldType("number")
                    .valueLength(0)
                    .fieldValueList("null")
                    .required(false)
                    .constrains(new HashMap<ConstraintTypeEnum, String>() {
                    })
                    .build(),
            FieldValueMapping.builder()
                    .fieldName("testMap.itemType[]")
                    .fieldType("number-map")
                    .valueLength(0)
                    .fieldValueList("null")
                    .required(false)
                    .isParentRequired(true)
                    .build(),
            FieldValueMapping.builder()
                    .fieldName("testMap.itemTipo[]")
                    .fieldType("string-map")
                    .valueLength(0)
                    .fieldValueList("null")
                    .required(false)
                    .isParentRequired(true)
                    .build()
    ));

    public static final String SIMPLE_SCHEMA_MAP_EXPECTED = "{\"lastName\":\"García\",\"age\":1.0,\"itemTipo\":{\"UVRf\":\"nCsU\",\"BRIr\":\"jjeD\",\"BdrP\":\"cKOH\"}}";

    public static final List<FieldValueMapping> COMPLEX_SCHEMA =
            new ArrayList<FieldValueMapping>(Arrays.asList(
                    FieldValueMapping.builder()
                            .fieldName("_id")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("1")
                            .required(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("userId")
                            .fieldType("number")
                            .valueLength(0)
                            .fieldValueList("2")
                            .required(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "1");
                                put(MAXIMUM_VALUE, "0");
                                put(EXCLUDED_MINIMUM_VALUE, "0");
                                put(EXCLUDED_MAXIMUM_VALUE, "0");
                                put(MULTIPLE_OF, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("storeId")
                            .fieldType("number")
                            .valueLength(0)
                            .fieldValueList("3")
                            .required(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                                put(EXCLUDED_MINIMUM_VALUE, "0");
                                put(EXCLUDED_MAXIMUM_VALUE, "0");
                                put(MULTIPLE_OF, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("snapshotId")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("snap")
                            .required(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("addressId")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("address")
                            .required(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("addressLine")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("addressLine")
                            .required(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("alias")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("alias")
                            .required(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("contactInformation.email")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("email")
                            .required(true)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("contactInformation.firstName")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("firstname")
                            .required(true)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("contactInformation.middleName")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("contactInformation.lastName")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("contactInformation.honorific")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                                put(REGEX, "^[a-zA-Z]{2,3}$");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("contactInformation.phones[].prefix")
                            .fieldType("string")
                            .valueLength(0)
                            .required(false)
                            .fieldValueList("null")
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "2");
                                put(MAXIMUM_VALUE, "3");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("contactInformation.phones[].number")
                            .fieldType("string")
                            .valueLength(0)
                            .required(false)
                            .fieldValueList("null")
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("countryCode")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("co")
                            .required(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "2");
                                put(MAXIMUM_VALUE, "2");
                                put(REGEX, "^[a-zA-Z]{2}$");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("location.streetName")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("location.streetNumber")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("location.floor")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("location.door")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("location.doorCode")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("location.zipCode")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("geopoliticalSubdivisions.level1.code")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "2");
                                put(MAXIMUM_VALUE, "3");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("geopoliticalSubdivisions.level1.freeForm")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null, freeForm")
                            .required(false)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "1");
                                put(MAXIMUM_VALUE, "256");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("geopoliticalSubdivisions.level2.code")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "2");
                                put(MAXIMUM_VALUE, "3");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("geopoliticalSubdivisions.level2.freeForm")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "1");
                                put(MAXIMUM_VALUE, "256");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("geopoliticalSubdivisions.level3.code")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "2");
                                put(MAXIMUM_VALUE, "3");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("geopoliticalSubdivisions.level3.freeForm")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "1");
                                put(MAXIMUM_VALUE, "256");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("geopoliticalSubdivisions.level4.code")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "2");
                                put(MAXIMUM_VALUE, "3");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("geopoliticalSubdivisions.level4.freeForm")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "1");
                                put(MAXIMUM_VALUE, "256");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("_metadata.createdAt")
                            .fieldType("timestamp")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {
                            })
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("_metadata.createdBy")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("createdBy")
                            .required(true)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("_metadata.lastUpdatedAt")
                            .fieldType("timestamp")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {
                            })
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("_metadata.lastUpdatedBy")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("lastUpdated")
                            .required(true)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("_metadata.deletedAt")
                            .fieldType("timestamp")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {
                            })
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("_metadata.projectVersion")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("projectVersion")
                            .required(true)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("_metadata.projectName")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("projectName")
                            .required(true)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("_metadata.deletedBy")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("null")
                            .required(false)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("_metadata.schema")
                            .fieldType("string")
                            .valueLength(0)
                            .fieldValueList("schema")
                            .required(true)
                            .isParentRequired(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {{
                                put(MINIMUM_VALUE, "0");
                                put(MAXIMUM_VALUE, "0");
                                put(EXCLUDED_MINIMUM_VALUE, "0");
                                put(EXCLUDED_MAXIMUM_VALUE, "0");
                                put(MULTIPLE_OF, "0");
                            }})
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("_entity")
                            .fieldType("enum")
                            .valueLength(0)
                            .fieldValueList("AddressSnapshot")
                            .required(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {
                            })
                            .build(),
                    FieldValueMapping.builder()
                            .fieldName("_class")
                            .fieldType("enum")
                            .valueLength(0)
                            .fieldValueList("AddressSnapshot")
                            .required(true)
                            .constrains(new HashMap<ConstraintTypeEnum, String>() {
                            })
                            .build()
            ));

    public static final String COMPLEX_SCHEMA_EXPECTED = "{\"_id\":\"1\",\"userId\":2.0,\"storeId\":3.0,\"snapshotId\":\"snap\",\"addressId\":\"address\",\"addressLine\":\"addressLine\",\"alias\":\"alias\",\"contactInformation\":{\"email\":\"email\",\"firstName\":\"firstname\"},\"countryCode\":\"co\",\"location\":{},\"geopoliticalSubdivisions\":{\"level1\":{\"freeForm\":\"freeForm\"},\"level2\":{},\"level3\":{},\"level4\":{}},\"_metadata\":{\"createdBy\":\"createdBy\",\"lastUpdatedBy\":\"lastUpdated\",\"projectVersion\":\"projectVersion\",\"projectName\":\"projectName\",\"schema\":\"schema\"},\"_entity\":\"AddressSnapshot\",\"_class\":\"AddressSnapshot\"}";

}
