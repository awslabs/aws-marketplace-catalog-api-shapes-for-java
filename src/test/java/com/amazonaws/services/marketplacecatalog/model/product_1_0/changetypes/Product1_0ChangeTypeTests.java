package com.amazonaws.services.marketplacecatalog.model.product_1_0.changetypes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.util.Arrays;
import java.util.Collections;

public class Product1_0ChangeTypeTests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
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
    public void testReleaseProductChangeDetail() throws Exception {
        ReleaseProductChangeDetail detail = new ReleaseProductChangeDetail();

        String actualJson = mapper.writeValueAsString(detail);

        JSONAssert.assertEquals("{}", actualJson, JSONCompareMode.NON_EXTENSIBLE);
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
    public void testUpdateVisibilityChangeDetail() throws Exception {
        UpdateVisibilityChangeDetail detail = new UpdateVisibilityChangeDetail()
                .targetVisibility(TargetVisibility.RESTRICTED)
                .replacementProductId("prod-1234567890123");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"TargetVisibility\": \"Restricted\",\n" +
                "  \"ReplacementProductId\": \"prod-1234567890123\"\n" +
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
    public void testAddDimensionChangeDetail() throws Exception {
        AddDimensionChangeDetail detail = new AddDimensionChangeDetail()
                .name("Premium Tier")
                .description("Premium tier access")
                .key("PremiumTier")
                .unit("Units")
                .types(Collections.singletonList(DimensionType.ENTITLED));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"Premium Tier\",\n" +
                "  \"Description\": \"Premium tier access\",\n" +
                "  \"Key\": \"PremiumTier\",\n" +
                "  \"Unit\": \"Units\",\n" +
                "  \"Types\": [\"Entitled\"]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateDimensionChangeDetail() throws Exception {
        UpdateDimensionChangeDetail detail = new UpdateDimensionChangeDetail()
                .name("Updated Premium Tier")
                .description("Updated premium tier access")
                .key("PremiumTier")
                .types(Collections.singletonList(DimensionType.ENTITLED));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"Updated Premium Tier\",\n" +
                "  \"Description\": \"Updated premium tier access\",\n" +
                "  \"Key\": \"PremiumTier\",\n" +
                "  \"Types\": [\"Entitled\"]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testRestrictDimensionChangeDetail() throws Exception {
        RestrictDimensionChangeDetail detail = new RestrictDimensionChangeDetail()
                .key("ApiCalls")
                .types(Arrays.asList(DimensionType.METERED, DimensionType.EXTERNALLY_METERED));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Key\": \"ApiCalls\",\n" +
                "  \"Types\": [\"Metered\", \"ExternallyMetered\"]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateBuyerEngagementOptionChangeDetail() throws Exception {
        UpdateBuyerEngagementOptionChangeDetail demo = new UpdateBuyerEngagementOptionChangeDetail()
                .engagementOption(EngagementOption.REQUEST_PRODUCT_DEMO);
        UpdateBuyerEngagementOptionChangeDetail privateOffer = new UpdateBuyerEngagementOptionChangeDetail()
                .engagementOption(EngagementOption.REQUEST_PRIVATE_OFFER);

        String actualJson = mapper.writeValueAsString(Arrays.asList(demo, privateOffer));

        String expectedJson = "[\n" +
                "  {\"EngagementOption\": \"RequestProductDemo\"},\n" +
                "  {\"EngagementOption\": \"RequestPrivateOffer\"}\n" +
                "]";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAddDeliveryOptionChangeDetail() throws Exception {
        AddDeliveryOptionChangeDetail detail = new AddDeliveryOptionChangeDetail()
                .deliveryOptions(Collections.singletonList(new AddDeliveryOption()
                        .details(new AddDeliveryOptionDetails()
                                .deliveryOptionDetails(new AddDeliveryOptionDetail()
                                        .type("example-delivery-option-type")
                                        .usageInstructions("Instructions to configure the product.")))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptions\": [{\n" +
                "    \"Details\": {\n" +
                "      \"DeliveryOptionDetails\": {\n" +
                "        \"Type\": \"example-delivery-option-type\",\n" +
                "        \"UsageInstructions\": \"Instructions to configure the product.\"\n" +
                "      }\n" +
                "    }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateDeliveryOptionChangeDetail() throws Exception {
        UpdateDeliveryOptionChangeDetail detail = new UpdateDeliveryOptionChangeDetail()
                .deliveryOptions(Collections.singletonList(new UpdateDeliveryOption()
                        .id("do-abcdefghijklm")
                        .details(new UpdateDeliveryOptionDetails()
                                .deliveryOptionDetails(new UpdateDeliveryOptionDetail()
                                        .usageInstructions("Updated instructions to configure the product.")))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptions\": [{\n" +
                "    \"Id\": \"do-abcdefghijklm\",\n" +
                "    \"Details\": {\n" +
                "      \"DeliveryOptionDetails\": {\n" +
                "        \"UsageInstructions\": \"Updated instructions to configure the product.\"\n" +
                "      }\n" +
                "    }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateHostingArchitectureChangeDetail() throws Exception {
        UpdateHostingArchitectureChangeDetail detail = new UpdateHostingArchitectureChangeDetail()
                .deliveryOptionId("do-abcdefghijklm")
                .hostingArchitecture(new HostingArchitecture()
                        .architectureDiagramUrl("https://s3.amazonaws.com/example-bucket/architecture.png")
                        .platforms(Arrays.asList(
                                new ArchitecturalComponent()
                                        .provider(Provider.AWS)
                                        .component(Component.CONTROL_PLANE)
                                        .environmentOwner(EnvironmentOwner.PARTNER),
                                new ArchitecturalComponent()
                                        .provider(Provider.AWS)
                                        .component(Component.APPLICATION_PLANE)
                                        .environmentOwner(EnvironmentOwner.BUYER))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptionId\": \"do-abcdefghijklm\",\n" +
                "  \"HostingArchitecture\": {\n" +
                "    \"ArchitectureDiagramUrl\": \"https://s3.amazonaws.com/example-bucket/architecture.png\",\n" +
                "    \"Platforms\": [{\n" +
                "      \"Provider\": \"AWS\",\n" +
                "      \"Component\": \"CONTROL_PLANE\",\n" +
                "      \"EnvironmentOwner\": \"PARTNER\"\n" +
                "    }, {\n" +
                "      \"Provider\": \"AWS\",\n" +
                "      \"Component\": \"APPLICATION_PLANE\",\n" +
                "      \"EnvironmentOwner\": \"BUYER\"\n" +
                "    }]\n" +
                "  }\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }
}
