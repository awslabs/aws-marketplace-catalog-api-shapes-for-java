package com.amazonaws.services.marketplacecatalog.model.saasproduct_1_0.entitytype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaaSProduct1_0EntityTypeTests {
    
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
                "      \"Url\": \"https://s3.amazonaws.com/awsmp-media/video.mp4\"\n" +
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
                                .url("https://s3.amazonaws.com/awsmp-media/video.mp4")))
                        .additionalResources(Collections.singletonList(new AdditionalResource()
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
                                new DeliveryOption()
                                        .id("do-lgvhsajjzx7u6")
                                        .type("SoftwareRegistration")
                                        .fulfillmentUrl("https://amazon.com"),
                                new DeliveryOption()
                                        .id("do-a5xyrbn3y2kzg")
                                        .type("SoftwareRegistration")
                                        .fulfillmentUrl("https://amazon.com")
                                        .visibility("Limited")
                                        .targeting(new Targeting()
                                                .positiveTargeting(new PositiveTargeting()
                                                        .buyerAccounts(Collections.singletonList("123456789123"))))
                                        .quickLaunchEnabled(true)
                                        .launchUrl("https://amazon.com")
                                        .deploymentTemplates(Collections.singletonList(
                                                new DeploymentTemplate()
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
                .targeting(new Targeting()
                        .positiveTargeting(new PositiveTargeting()
                                .buyerAccounts(Collections.singletonList("123456789123"))));

        assertEquals(expectedDetail, actualDetail);
    }
}
