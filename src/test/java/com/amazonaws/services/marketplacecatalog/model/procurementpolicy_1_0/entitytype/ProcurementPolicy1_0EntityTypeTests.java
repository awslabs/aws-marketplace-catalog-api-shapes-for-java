package com.amazonaws.services.marketplacecatalog.model.procurementpolicy_1_0.entitytype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcurementPolicy1_0EntityTypeTests {

    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testProcurementPolicyEntityDetail() throws Exception {
        String json = "{\n" +
                "  \"Name\": \"Procurement Policy\",\n" +
                "  \"Description\": \"Procurement Policy for Private Marketplace\",\n" +
                "  \"Statements\": [{\n" +
                "    \"Effect\": \"Deny\",\n" +
                "    \"Resources\": [{\n" +
                "      \"Type\": \"Product\",\n" +
                "      \"Ids\": [\"abcdefgh-1234-1234-abcd-123abc456def\"],\n" +
                "      \"Notes\": \"Declined\"\n" +
                "    }, {\n" +
                "      \"Type\": \"Product\",\n" +
                "      \"Ids\": [\"abcdefgh-1234-1234-abcd-abc123def456\"]\n" +
                "    }, {\n" +
                "      \"Type\": \"Product\",\n" +
                "      \"Ids\": [\"abcdefgh-1234-1234-abcd-246abc135def\"],\n" +
                "      \"Notes\": \"Declined for no reason\"\n" +
                "    }]\n" +
                "  }, {\n" +
                "    \"Effect\": \"Allow\",\n" +
                "    \"Resources\": [{\n" +
                "      \"Type\": \"Product\",\n" +
                "      \"Ids\": [\"abcdefgh-1234-1234-abcd-abc246def135\"]\n" +
                "    }, {\n" +
                "      \"Type\": \"Product\",\n" +
                "      \"Ids\": [\"abcdefgh-1234-1234-abcd-135abc246def\"],\n" +
                "      \"Notes\": \"Approved\"\n" +
                "    }]\n" +
                "  }],\n" +
                "  \"Configuration\": {\n" +
                "    \"PolicyResourceRequests\": \"Deny\"\n" +
                "  }\n" +
                "}";

        ProcurementPolicyEntityDetail actualDetail = mapper.readValue(json, ProcurementPolicyEntityDetail.class);

        ProcurementPolicyEntityDetail expectedDetail = new ProcurementPolicyEntityDetail()
                .name("Procurement Policy")
                .description("Procurement Policy for Private Marketplace")
                .statements(Arrays.asList(
                        new Statement()
                              .effect("Deny")
                              .resources(Arrays.asList(
                                      new Resource()
                                              .type("Product")
                                              .ids(Collections.singletonList("abcdefgh-1234-1234-abcd-123abc456def"))
                                              .notes("Declined"),
                                      new Resource()
                                              .type("Product")
                                              .ids(Collections.singletonList("abcdefgh-1234-1234-abcd-abc123def456")),
                                      new Resource()
                                              .type("Product")
                                              .ids(Collections.singletonList("abcdefgh-1234-1234-abcd-246abc135def"))
                                              .notes("Declined for no reason"))),
                        new Statement()
                                .effect("Allow")
                                .resources(Arrays.asList(
                                        new Resource()
                                                .type("Product")
                                                .ids(Collections.singletonList("abcdefgh-1234-1234-abcd-abc246def135")),
                                        new Resource()
                                                .type("Product")
                                                .ids(Collections.singletonList("abcdefgh-1234-1234-abcd-135abc246def"))
                                                .notes("Approved")))))
                ._configuration(new ModelConfiguration()
                        .policyResourceRequests("Deny"));

        assertEquals(expectedDetail, actualDetail);
    }
}
