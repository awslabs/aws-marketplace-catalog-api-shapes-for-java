package com.amazonaws.services.marketplacecatalog.model.experience_1_0;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Experience1_0Tests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testCreateExperienceChangeDetail() throws Exception {
         CreateExperienceChangeDetail detail = new CreateExperienceChangeDetail()
                 .name("MyExperience")
                 .description("Creating a new experience")
                 .catalog("aws-mp-commercial-prod");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"MyExperience\",\n" +
                "  \"Description\": \"Creating a new experience\",\n" +
                "  \"Catalog\": \"aws-mp-commercial-prod\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateExperienceChangeDetail() throws Exception {
        UpdateExperienceChangeDetail detail = new UpdateExperienceChangeDetail()
                .name("MyExperience")
                .description("Creating a new experience")
                .status(Status.ENABLED);

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"MyExperience\",\n" +
                "  \"Description\": \"Creating a new experience\",\n" +
                "  \"Status\": \"Enabled\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testRestrictExperienceChangeDetail() throws Exception {
        RestrictExperienceChangeDetail detail = new RestrictExperienceChangeDetail();

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testReviveExperienceChangeDetail() throws Exception {
        ReviveExperienceChangeDetail detail = new ReviveExperienceChangeDetail();

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAllowProductProcurementChangeDetail() throws Exception {
        Set<String> ids_1 = new HashSet<>();
        ids_1.add("example-1234-abcd-5678-90abcded1234");
        ids_1.add("example-1234-abcd-5678-90abcded4321");
        Set<String> ids_2 = new HashSet<>();
        ids_2.add("example-1234-abcd-5678-90abcded9876");

        AllowProductProcurementChangeDetail detail = new AllowProductProcurementChangeDetail()
                .products(Arrays.asList(
                        new Product()
                                .ids(ids_1)
                                .notes("Useful product"),
                        new Product()
                                .ids(ids_2)
                ));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Products\": [{\n" +
                "    \"Ids\": [\"example-1234-abcd-5678-90abcded1234\", \"example-1234-abcd-5678-90abcded4321\"],\n" +
                "    \"Notes\": \"Useful product\"\n" +
                "  },{\n" +
                "    \"Ids\": [\"example-1234-abcd-5678-90abcded9876\"]\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testDenyProductProcurementChangeDetail() throws Exception {
        Set<String> ids_1 = new HashSet<>();
        ids_1.add("example-1234-abcd-5678-90abcded1234");
        ids_1.add("example-1234-abcd-5678-90abcded4321");
        Set<String> ids_2 = new HashSet<>();
        ids_2.add("example-1234-abcd-5678-90abcded9876");

        DenyProductProcurementChangeDetail detail = new DenyProductProcurementChangeDetail()
                .products(Arrays.asList(
                        new Product()
                                .ids(ids_1)
                                .notes("Useful product"),
                        new Product()
                                .ids(ids_2)
                ));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Products\": [{\n" +
                "    \"Ids\": [\"example-1234-abcd-5678-90abcded1234\", \"example-1234-abcd-5678-90abcded4321\"],\n" +
                "    \"Notes\": \"Useful product\"\n" +
                "  },{\n" +
                "    \"Ids\": [\"example-1234-abcd-5678-90abcded9876\"]\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testCreateProcurementPolicyChangeDetail() throws Exception {
        CreateProcurementPolicyChangeDetail detail = new CreateProcurementPolicyChangeDetail()
                .name("Developer Policy")
                .description("Procurement policy used for developers")
                ._configuration(new ProcurementPolicyConfiguration()
                        .policyResourceRequests(PolicyResourceRequests.ALLOW));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"Developer Policy\",\n" +
                "  \"Description\": \"Procurement policy used for developers\",\n" +
                "  \"Configuration\": {\n" +
                "    \"PolicyResourceRequests\": \"Allow\"\n" +
                "  }\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateProcurementPolicyChangeDetail() throws Exception {
        UpdateProcurementPolicyChangeDetail detail = new UpdateProcurementPolicyChangeDetail()
                .name("Developer Policy")
                .description("Procurement policy used for developers")
                ._configuration(new ProcurementPolicyConfiguration()
                        .policyResourceRequests(PolicyResourceRequests.ALLOW));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"Developer Policy\",\n" +
                "  \"Description\": \"Procurement policy used for developers\",\n" +
                "  \"Configuration\": {\n" +
                "    \"PolicyResourceRequests\": \"Allow\"\n" +
                "  }\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testCreateBrandingSettingsChangeDetail() throws Exception {
        CreateBrandingSettingsChangeDetail detail = new CreateBrandingSettingsChangeDetail()
                .name("SampleBranding")
                .description("Sample Branding Description")
                ._configuration(new BrandingConfiguration()
                        .title("Company Title")
                        .information("Information")
                        .themeColor("#232f3e")
                        .logoUrl("https://mybucket.s3.us-east-1.amazonaws.com/test.jpg"));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"SampleBranding\",\n" +
                "  \"Description\": \"Sample Branding Description\",\n" +
                "  \"Configuration\": {\n" +
                "    \"Title\": \"Company Title\",\n" +
                "    \"Information\": \"Information\",\n" +
                "    \"ThemeColor\": \"#232f3e\",\n" +
                "    \"LogoUrl\": \"https://mybucket.s3.us-east-1.amazonaws.com/test.jpg\"\n" +
                "  }\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateBrandingSettingsChangeDetail() throws Exception {
        UpdateBrandingSettingsChangeDetail detail = new UpdateBrandingSettingsChangeDetail()
                .name("SampleBranding")
                .description("Sample Branding Description")
                ._configuration(new BrandingConfiguration()
                        .title("Company Title")
                        .information("Information")
                        .themeColor("#232f3e")
                        .logoUrl("https://mybucket.s3.us-east-1.amazonaws.com/test.jpg"));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"SampleBranding\",\n" +
                "  \"Description\": \"Sample Branding Description\",\n" +
                "  \"Configuration\": {\n" +
                "    \"Title\": \"Company Title\",\n" +
                "    \"Information\": \"Information\",\n" +
                "    \"ThemeColor\": \"#232f3e\",\n" +
                "    \"LogoUrl\": \"https://mybucket.s3.us-east-1.amazonaws.com/test.jpg\"\n" +
                "  }\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAssociateAudienceChangeDetail() throws Exception {
        Set<String> principals = new HashSet<>();
        principals.add("123456789012");
        AssociateAudienceChangeDetail detail = new AssociateAudienceChangeDetail()
                .name("Name for Audience")
                .description("This Audience is used for a test.")
                .principals(principals);

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"Name for Audience\",\n" +
                "  \"Description\": \"This Audience is used for a test.\",\n" +
                "  \"Principals\": [\"123456789012\"]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testDisassociateAudienceChangeDetail() throws Exception {
        Set<String> principals = new HashSet<>();
        principals.add("123456789012");
        DisassociateAudienceChangeDetail detail = new DisassociateAudienceChangeDetail()
                .principals(principals);

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Principals\": [\"123456789012\"]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }
}
