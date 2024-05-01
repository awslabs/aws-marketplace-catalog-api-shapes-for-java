package com.amazonaws.services.marketplacecatalog.model.saasproduct_1_0;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaaSProduct1_0Tests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testSaasProductEntityDetail() throws Exception {
        String json = "{\n" +
                "  \"Description\": {\n" +
                "    \"ProductTitle\": \"Test Product\",\n" +
                "    \"ProductCode\": \"5cqs4jta6m2iuh6jak7s7bjsy\",\n" +
                "    \"ShortDescription\": \"Test Product\",\n" +
                "    \"Manufacturer\": \"SaaS seller name\",\n" +
                "    \"LongDescription\": \"SaaS test product\",\n" +
                "    \"Sku\": \"SKU\",\n" +
                "    \"Highlights\": [\"Config adds no run-time overheads\"],\n" +
                "    \"AssociatedProducts\": null,\n" +
                "    \"SearchKeywords\": [\"example\", \"keywords\"],\n" +
                "    \"Visibility\": \"Restricted\",\n" +
                "    \"ReplacementProductId\": \"prod-1234567890123\",\n" +
                "    \"ProductState\": \"Active\",\n" +
                "    \"Categories\": [\"Source Control\"]\n" +
                "  },\n" +
                "  \"PromotionalResources\": {\n" +
                "    \"LogoUrl\": \"https://s3.amazonaws.com/awsmp-logos/logo.png\",\n" +
                "    \"Videos\": [{\n" +
                "      \"Type\": \"Link\",\n" +
                "      \"Title\": \"Product Video\",\n" +
                "      \"Url\": \"https://www.youtube.com\"\n" +
                "    }],\n" +
                "    \"AdditionalResources\": [{\n" +
                "      \"Type\": \"Link\",\n" +
                "      \"Text\": \"Sample Resource\",\n" +
                "      \"Url\": \"https://amazon.com\"\n" +
                "    }],\n" +
                "    \"PromotionalMedia\": null\n" +
                "  },\n" +
                "  \"SupportInformation\": {\n" +
                "    \"Description\": \"Product support information\"\n" +
                "  },\n" +
                "  \"Dimensions\": [{\n" +
                "    \"Name\": \"Free Forever Plan\",\n" +
                "    \"Description\": \"Free Forever Plan\",\n" +
                "    \"Key\": \"FreePlan\",\n" +
                "    \"Unit\": \"Units\",\n" +
                "    \"Types\": [\"ExternallyMetered\"]\n" +
                "  }, {\n" +
                "    \"Name\": \"Starter Plan\",\n" +
                "    \"Description\": \"Starter Plan\",\n" +
                "    \"Key\": \"StarterPlan\",\n" +
                "    \"Unit\": \"Units\",\n" +
                "    \"Types\": [\"ExternallyMetered\"]\n" +
                "  }, {\n" +
                "    \"Name\": \"Pro Plan\",\n" +
                "    \"Description\": \"Pro Plan\",\n" +
                "    \"Key\": \"ProPlan\",\n" +
                "    \"Unit\": \"Units\",\n" +
                "    \"Types\": [\"ExternallyMetered\"]\n" +
                "  }, {\n" +
                "    \"Name\": \"Business Plan\",\n" +
                "    \"Description\": \"Business Plan\",\n" +
                "    \"Key\": \"BusinessPlan\",\n" +
                "    \"Unit\": \"Units\",\n" +
                "    \"Types\": [\"ExternallyMetered\"]\n" +
                "  }, {\n" +
                "    \"Name\": \"Enterprise Plan\",\n" +
                "    \"Description\": \"Enterprise Plan\",\n" +
                "    \"Key\": \"EnterprisePlan\",\n" +
                "    \"Unit\": \"Units\",\n" +
                "    \"Types\": [\"ExternallyMetered\"]\n" +
                "  }],\n" +
                "  \"Versions\": [{\n" +
                "    \"Id\": \"version-57xgyhrofhrqm\",\n" +
                "    \"DeliveryOptions\": [{\n" +
                "      \"Id\": \"do-lgvhsajjzx7u6\",\n" +
                "      \"Type\": \"SoftwareRegistration\",\n" +
                "      \"FulfillmentUrl\": \"https://amazon.com\"\n" +
                "    }, {\n" +
                "      \"Id\": \"do-a5xyrbn3y2kzg\",\n" +
                "      \"Type\": \"SoftwareRegistration\",\n" +
                "      \"FulfillmentUrl\": \"https://amazon.com\",\n" +
                "      \"QuickLaunchEnabled\": true,\n" +
                "      \"LaunchUrl\": \"https://amazon.com\",\n" +
                "      \"DeploymentTemplates\": [{\n" +
                "        \"Type\": \"CloudFormation@1.0\",\n" +
                "        \"Title\": \"Title\",\n" +
                "        \"Description\": \"Description\",\n" +
                "        \"IamPolicy\": \"{\\\"Version\\\":\\\"2012-10-17\\\"," +
                "\\\"Statement\\\":[{\\\"Effect\\\":\\\"Allow\\\"," +
                "\\\"Action\\\":[\\\"s3:Get*\\\",\\\"s3:List*\\\"]," +
                "\\\"Resource\\\":\\\\n[\\\"arn:aws:s3:::EXAMPLE-BUCKET\\\"," +
                "\\\"arn:aws:s3:::EXAMPLE-BUCKET/*\\\"]}]}\",\n" +
                "        \"DefaultStackName\": \"default-stack-name\",\n" +
                "        \"TemplateUrl\": \"https://amazon.com\"\n" +
                "      }],\n" +
                "      \"UsageInstructions\": \"Instructions to configure the product.\",\n" +
                "      \"Visibility\": \"Limited\",\n" +
                "      \"Targeting\": {\n" +
                "        \"PositiveTargeting\": {\n" +
                "          \"BuyerAccounts\": [\"123456789123\"]\n" +
                "        }\n" +
                "      }\n" +
                "    }]\n" +
                "  }],\n" +
                "  \"Targeting\": {\n" +
                "    \"PositiveTargeting\": {\n" +
                "      \"BuyerAccounts\": [\"123456789123\"]\n" +
                "    }\n" +
                "  }\n" +
                "}";

        SaaSProductEntityDetail actualDetail = mapper.readValue(json, SaaSProductEntityDetail.class);

                SaaSProductEntityDetail expectedDetail = new SaaSProductEntityDetail()
                .description(new Description()
                        .productTitle("Test Product")
                        .productCode("5cqs4jta6m2iuh6jak7s7bjsy")
                        .shortDescription("Test Product")
                        .manufacturer("SaaS seller name")
                        .longDescription("SaaS test product")
                        .highlights(Collections.singletonList("Config adds no run-time overheads"))
                        .searchKeywords(Arrays.asList("example", "keywords"))
                        .sku("SKU")
                        .visibility("Restricted")
                        .replacementProductId("prod-1234567890123")
                        .productState("Active")
                        .categories(Collections.singletonList("Source Control")))
                .promotionalResources(new PromotionalResources()
                        .logoUrl("https://s3.amazonaws.com/awsmp-logos/logo.png")
                        .videos(Collections.singletonList(new Video()
                                .type("Link")
                                .title("Product Video")
                                .url("https://www.youtube.com")))
                        .additionalResources(Collections.singletonList(new EntityAdditionalResource()
                                .type("Link")
                                .text("Sample Resource")
                                .url("https://amazon.com"))))
                .supportInformation(new SupportInformation()
                        .description("Product support information"))
                .dimensions(Arrays.asList(
                        new Dimension()
                                .name("Free Forever Plan")
                                .description("Free Forever Plan")
                                .key("FreePlan")
                                .unit("Units")
                                .types(Collections.singletonList("ExternallyMetered")),
                        new Dimension()
                                .name("Starter Plan")
                                .description("Starter Plan")
                                .key("StarterPlan")
                                .unit("Units")
                                .types(Collections.singletonList("ExternallyMetered")),
                        new Dimension()
                                .name("Pro Plan")
                                .description("Pro Plan")
                                .key("ProPlan")
                                .unit("Units")
                                .types(Collections.singletonList("ExternallyMetered")),
                        new Dimension()
                                .name("Business Plan")
                                .description("Business Plan")
                                .key("BusinessPlan")
                                .unit("Units")
                                .types(Collections.singletonList("ExternallyMetered")),
                        new Dimension()
                                .name("Enterprise Plan")
                                .description("Enterprise Plan")
                                .key("EnterprisePlan")
                                .unit("Units")
                                .types(Collections.singletonList("ExternallyMetered"))))
                .versions(Collections.singletonList(new Version()
                        .id("version-57xgyhrofhrqm")
                        .deliveryOptions(Arrays.asList(
                                new EntityDeliveryOption()
                                        .id("do-lgvhsajjzx7u6")
                                        .type("SoftwareRegistration")
                                        .fulfillmentUrl("https://amazon.com"),
                                new EntityDeliveryOption()
                                        .id("do-a5xyrbn3y2kzg")
                                        .type("SoftwareRegistration")
                                        .fulfillmentUrl("https://amazon.com")
                                        .visibility("Limited")
                                        .targeting(new EntityTargeting()
                                                .positiveTargeting(new EntityPositiveTargeting()
                                                        .buyerAccounts(Collections.singletonList("123456789123"))))
                                        .quickLaunchEnabled(true)
                                        .launchUrl("https://amazon.com")
                                        .deploymentTemplates(Collections.singletonList(
                                                new EntityDeploymentTemplate()
                                                        .type("CloudFormation@1.0")
                                                        .title("Title")
                                                        .description("Description")
                                                        .iamPolicy("{\"Version\":\"2012-10-17\"," +
                                                                "\"Statement\":[{\"Effect\":\"Allow\"," +
                                                                "\"Action\":[\"s3:Get*\",\"s3:List*\"]," +
                                                                "\"Resource\":\\n[\"arn:aws:s3:::EXAMPLE-BUCKET\"," +
                                                                "\"arn:aws:s3:::EXAMPLE-BUCKET/*\"]}]}")
                                                        .templateUrl("https://amazon.com")
                                                        .defaultStackName("default-stack-name")))
                                        .usageInstructions("Instructions to configure the product.")))))
                .targeting(new EntityTargeting()
                        .positiveTargeting(new EntityPositiveTargeting()
                                .buyerAccounts(Collections.singletonList("123456789123"))));

        assertEquals(expectedDetail, actualDetail);
    }

    @Test
    public void testUpdateInformationChangeDetail() throws Exception {
        UpdateInformationChangeDetail detail = new UpdateInformationChangeDetail()
                .productTitle("MyProductTitle")
                .shortDescription("My Product")
                .longDescription("My Product long description")
                .sku("SKU")
                .videoUrls(Collections.singletonList("https://s3.amazonaws.com/awsmp-media/video.mp4"))
                .logoUrl("https://s3.amazonaws.com/awsmp-logos/logo.png")
                .highlights(Collections.singletonList("Highlight"))
                .additionalResources(Collections.singletonList(new AdditionalResource()
                        .text("url")
                        .url("https://amazon.com")))
                .supportDescription("Support description")
                .categories(Arrays.asList("Operating Systems", "Network Infrastructure", "Application Development"))
                .searchKeywords(Arrays.asList("example", "keywords"));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"ProductTitle\": \"MyProductTitle\",\n" +
                "  \"ShortDescription\": \"My Product\",\n" +
                "  \"LongDescription\": \"My Product long description\",\n" +
                "  \"Sku\": \"SKU\",\n" +
                "  \"LogoUrl\": \"https://s3.amazonaws.com/awsmp-logos/logo.png\",\n" +
                "  \"VideoUrls\": [\"https://s3.amazonaws.com/awsmp-media/video.mp4\"],\n" +
                "  \"Highlights\": [\"Highlight\"],\n" +
                "  \"AdditionalResources\": [{\n" +
                "      \"Text\": \"url\",\n" +
                "      \"Url\": \"https://amazon.com\"\n" +
                "  }],\n" +
                "  \"SupportDescription\": \"Support description\",\n" +
                "  \"Categories\": [\"Operating Systems\", \"Network Infrastructure\", \"Application Development\"],\n" +
                "  \"SearchKeywords\": [\"example\", \"keywords\"]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAddDeliveryOptionsChangeDetail() throws Exception {
        AddDeliveryOptionsChangeDetail detail = new AddDeliveryOptionsChangeDetail()
                .deliveryOptions(Collections.singletonList(new AddDeliveryOption()
                        .details(new AddDeliveryOptionDetails()
                                .saaSUrlDeliveryOptionDetails(new AddSaaSUrlDeliveryOptionDetails()
                                        .fulfillmentUrl("https://amazon.com")
                                        .launchUrl("https://amazon.com")
                                        .deploymentTemplates(Collections.singletonList(new DeploymentTemplate()
                                                .title("title")
                                                .description("description")
                                                .iamPolicy("iam policy")
                                                .cloudFormationDetails(new CloudFormationDetails()
                                                        .defaultStackName("stack-name")
                                                        .templateUrl("https://www.example.s3.amazonaws.com/example.txt"))))
                                        .usageInstructions("instructions")
                                        .quickLaunchEnabled(Boolean.FALSE)))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptions\": [{\n" +
                "      \"Details\": {\n" +
                "          \"SaaSUrlDeliveryOptionDetails\":  {\n" +
                "            \"FulfillmentUrl\": \"https://amazon.com\",\n" +
                "            \"LaunchUrl\": \"https://amazon.com\",\n" +
                "            \"DeploymentTemplates\": [{\n" +
                "              \"Title\": \"title\",\n" +
                "              \"Description\": \"description\",\n" +
                "              \"IamPolicy\": \"iam policy\",\n" +
                "              \"CloudFormationDetails\": {\n" +
                "                \"DefaultStackName\": \"stack-name\",\n" +
                "                \"TemplateUrl\": \"https://www.example.s3.amazonaws.com/example.txt\"\n" +
                "              }\n" +
                "            }],\n" +
                "            \"UsageInstructions\": \"instructions\",\n" +
                "            \"QuickLaunchEnabled\": false\n" +
                "          }\n" +
                "      }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateDeliveryOptionsChangeDetail() throws Exception {
        UpdateDeliveryOptionsChangeDetail detail = new UpdateDeliveryOptionsChangeDetail()
                .deliveryOptions(Collections.singletonList(new UpdateDeliveryOption()
                        .id("do-1234567891234567891234")
                        .details(new UpdateDeliveryOptionDetails()
                                .saaSUrlDeliveryOptionDetails(new UpdateSaaSUrlDeliveryOptionDetails()
                                        .fulfillmentUrl("https://amazon.com")
                                        .launchUrl("https://amazon.com")
                                        .deploymentTemplates(Collections.singletonList(new DeploymentTemplate()
                                                .title("title")
                                                .description("description")
                                                .iamPolicy("iam policy")
                                                .cloudFormationDetails(new CloudFormationDetails()
                                                        .defaultStackName("stack-name")
                                                        .templateUrl("https://www.example.s3.amazonaws.com/example.txt"))))
                                        .usageInstructions("instructions")))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptions\": [{\n" +
                "      \"Id\": \"do-1234567891234567891234\",\n" +
                "      \"Details\": {\n" +
                "          \"SaaSUrlDeliveryOptionDetails\":  {\n" +
                "            \"FulfillmentUrl\": \"https://amazon.com\",\n" +
                "            \"LaunchUrl\": \"https://amazon.com\",\n" +
                "            \"DeploymentTemplates\": [{\n" +
                "              \"Title\": \"title\",\n" +
                "              \"Description\": \"description\",\n" +
                "              \"IamPolicy\": \"iam policy\",\n" +
                "              \"CloudFormationDetails\": {\n" +
                "                \"DefaultStackName\": \"stack-name\",\n" +
                "                \"TemplateUrl\": \"https://www.example.s3.amazonaws.com/example.txt\"\n" +
                "              }\n" +
                "            }],\n" +
                "            \"UsageInstructions\": \"instructions\"\n" +
                "          }\n" +
                "      }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateDeliveryOptionsVisibilityChangeDetail() throws Exception {
        UpdateDeliveryOptionsVisibilityChangeDetail detail = new UpdateDeliveryOptionsVisibilityChangeDetail()
                .deliveryOptions(Arrays.asList(
                        new UpdateDeliveryOptionVisibility()
                                .id("do-1234567891234567891234")
                                .targetVisibility(UpdateDeliveryOptionsTargetVisibility.PUBLIC),
                        new UpdateDeliveryOptionVisibility()
                                .id("do-43210987654321")
                                .targetVisibility(UpdateDeliveryOptionsTargetVisibility.LIMITED)
                                .targeting(new Targeting()
                                        .positiveTargeting(new PositiveTargeting()
                                                .buyerAccounts(Collections.singletonList("123456789012"))))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptions\": [{\n" +
                "      \"Id\": \"do-1234567891234567891234\",\n" +
                "      \"TargetVisibility\": \"Public\"\n" +
                "  }, {\n" +
                "      \"Id\": \"do-43210987654321\",\n" +
                "      \"TargetVisibility\": \"Limited\",\n" +
                "      \"Targeting\": {\n" +
                "        \"PositiveTargeting\": {\n" +
                "          \"BuyerAccounts\": [\"123456789012\"]\n" +
                "        }\n" +
                "      }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testCreateProductChangeDetail() throws Exception {
       CreateProductChangeDetail detail = new CreateProductChangeDetail()
                .productTitle("ProductTitle");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"ProductTitle\": \"ProductTitle\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAddDimensionChangeDetail() throws Exception {
        AddDimensionChangeDetail detail = new AddDimensionChangeDetail()
                .name("Course Fee")
                .description("Course Fee Description")
                .key("Premium")
                .unit("UnitHrs")
                .types(Collections.singletonList(DimensionType.ENTITLED));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"Course Fee\",\n" +
                "  \"Description\": \"Course Fee Description\",\n" +
                "  \"Key\": \"Premium\",\n" +
                "  \"Unit\": \"UnitHrs\",\n" +
                "  \"Types\": [\"Entitled\"]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateDimensionChangeDetail() throws Exception {
        UpdateDimensionChangeDetail detail = new UpdateDimensionChangeDetail()
                .name("Updated Course Fee")
                .description("Updated Course Fee Description")
                .key("CourseFee")
                .types(Collections.singletonList(DimensionType.EXTERNALLY_METERED));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"Updated Course Fee\",\n" +
                "  \"Description\": \"Updated Course Fee Description\",\n" +
                "  \"Key\": \"CourseFee\",\n" +
                "  \"Types\": [\"ExternallyMetered\"]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateTargetingChangeDetail() throws Exception {
        UpdateTargetingChangeDetail detail = new UpdateTargetingChangeDetail()
                .positiveTargeting(new PositiveTargeting()
                        .buyerAccounts(Arrays.asList("123456789012", "098765432112")));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"PositiveTargeting\": {\n" +
                "    \"BuyerAccounts\": [\"123456789012\", \"098765432112\"]\n" +
                "  }\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateVisibilityChangeDetail() throws Exception {
        UpdateVisibilityChangeDetail detail = new UpdateVisibilityChangeDetail()
                .targetVisibility(TargetVisibility.PUBLIC)
                .replacementProductId("prod-1234567890123");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"TargetVisibility\": \"Public\",\n" +
                "  \"ReplacementProductId\": \"prod-1234567890123\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testRestrictDimensionChangeDetail() throws Exception {
        RestrictDimensionChangeDetail detail = new RestrictDimensionChangeDetail()
                .key("Basic")
                .types(Arrays.asList(DimensionType.EXTERNALLY_METERED, DimensionType.METERED));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Key\": \"Basic\",\n" +
                "  \"Types\": [\"ExternallyMetered\", \"Metered\"]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testReleaseProductChangeDetail() throws Exception {
        ReleaseProductChangeDetail detail = new ReleaseProductChangeDetail();

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }
}
