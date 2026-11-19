package com.amazonaws.services.marketplacecatalog.model.product_1_0.entitytype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Product1_0EntityTypeTests {

    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    }

    @Test
    public void testProductEntityDetail() throws Exception {
        String json = "{\n" +
                "  \"Description\": {\n" +
                "    \"ProductTitle\": \"Test Product\",\n" +
                "    \"ProductCode\": \"5cqs4jta6m2iuh6jak7s7bjsy\",\n" +
                "    \"ShortDescription\": \"Test Product\",\n" +
                "    \"LongDescription\": \"Test product long description\",\n" +
                "    \"Sku\": \"SKU\",\n" +
                "    \"Highlights\": [\"Highlight\"],\n" +
                "    \"SearchKeywords\": [\"example\", \"keywords\"],\n" +
                "    \"Visibility\": \"Limited\",\n" +
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
                "    }]\n" +
                "  },\n" +
                "  \"SupportInformation\": {\n" +
                "    \"Description\": \"Product support information\"\n" +
                "  },\n" +
                "  \"Dimensions\": [{\n" +
                "    \"Name\": \"Premium Tier\",\n" +
                "    \"Description\": \"Premium tier access\",\n" +
                "    \"Key\": \"PremiumTier\",\n" +
                "    \"Unit\": \"Units\",\n" +
                "    \"Types\": [\"Entitled\"]\n" +
                "  }, {\n" +
                "    \"Name\": \"API Calls\",\n" +
                "    \"Description\": \"Number of API calls\",\n" +
                "    \"Key\": \"ApiCalls\",\n" +
                "    \"Unit\": \"Requests\",\n" +
                "    \"Types\": [\"Metered\", \"ExternallyMetered\"]\n" +
                "  }],\n" +
                "  \"Targeting\": {\n" +
                "    \"PositiveTargeting\": {\n" +
                "      \"BuyerAccounts\": [\"123456789012\"]\n" +
                "    }\n" +
                "  },\n" +
                "  \"BuyerEngagement\": [\n" +
                "    {\"EngagementOption\": \"RequestProductDemo\"},\n" +
                "    {\"EngagementOption\": \"RequestPrivateOffer\"}\n" +
                "  ],\n" +
                "  \"Versions\": [{\n" +
                "    \"Id\": \"version-57xgyhrofhrqm\",\n" +
                "    \"DeliveryOptions\": [{\n" +
                "      \"Id\": \"do-abcdefghijklm\",\n" +
                "      \"Type\": \"example-delivery-option-type\",\n" +
                "      \"Details\": {\n" +
                "        \"DeliveryOptionDetails\": {\n" +
                "          \"UsageInstructions\": \"Instructions to configure the product.\",\n" +
                "          \"CreationDate\": \"2026-01-15T10:30:00.000Z\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"HostingArchitecture\": {\n" +
                "        \"ArchitectureDiagramUrl\": \"https://s3.amazonaws.com/example-bucket/architecture.png\",\n" +
                "        \"Platforms\": [{\n" +
                "          \"Provider\": \"AWS\",\n" +
                "          \"Component\": \"CONTROL_PLANE\",\n" +
                "          \"EnvironmentOwner\": \"PARTNER\"\n" +
                "        }, {\n" +
                "          \"Provider\": \"AWS\",\n" +
                "          \"Component\": \"APPLICATION_PLANE\",\n" +
                "          \"EnvironmentOwner\": \"BUYER\"\n" +
                "        }]\n" +
                "      }\n" +
                "    }]\n" +
                "  }]\n" +
                "}";

        ProductEntityDetail actualDetail = mapper.readValue(json, ProductEntityDetail.class);

        ProductEntityDetail expectedDetail = new ProductEntityDetail()
                .description(new Description()
                        .productTitle("Test Product")
                        .productCode("5cqs4jta6m2iuh6jak7s7bjsy")
                        .shortDescription("Test Product")
                        .longDescription("Test product long description")
                        .sku("SKU")
                        .highlights(Collections.singletonList("Highlight"))
                        .searchKeywords(Arrays.asList("example", "keywords"))
                        .visibility("Limited")
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
                                .name("Premium Tier")
                                .description("Premium tier access")
                                .key("PremiumTier")
                                .unit("Units")
                                .types(Collections.singletonList("Entitled")),
                        new Dimension()
                                .name("API Calls")
                                .description("Number of API calls")
                                .key("ApiCalls")
                                .unit("Requests")
                                .types(Arrays.asList("Metered", "ExternallyMetered"))))
                .targeting(new Targeting()
                        .positiveTargeting(new PositiveTargeting()
                                .buyerAccounts(Collections.singletonList("123456789012"))))
                .buyerEngagement(Arrays.asList(
                        new BuyerEngagementOption().engagementOption("RequestProductDemo"),
                        new BuyerEngagementOption().engagementOption("RequestPrivateOffer")))
                .versions(Collections.singletonList(new Version()
                        .id("version-57xgyhrofhrqm")
                        .deliveryOptions(Collections.singletonList(new DeliveryOption()
                                .id("do-abcdefghijklm")
                                .type("example-delivery-option-type")
                                .details(new DeliveryOptionDetails()
                                        .deliveryOptionDetails(new DeliveryOptionDetail()
                                                .usageInstructions("Instructions to configure the product.")
                                                .creationDate("2026-01-15T10:30:00.000Z")))
                                .hostingArchitecture(new HostingArchitecture()
                                        .architectureDiagramUrl("https://s3.amazonaws.com/example-bucket/architecture.png")
                                        .platforms(Arrays.asList(
                                                new Platform()
                                                        .provider("AWS")
                                                        .component("CONTROL_PLANE")
                                                        .environmentOwner("PARTNER"),
                                                new Platform()
                                                        .provider("AWS")
                                                        .component("APPLICATION_PLANE")
                                                        .environmentOwner("BUYER"))))))));

        assertEquals(expectedDetail, actualDetail);
    }
}
