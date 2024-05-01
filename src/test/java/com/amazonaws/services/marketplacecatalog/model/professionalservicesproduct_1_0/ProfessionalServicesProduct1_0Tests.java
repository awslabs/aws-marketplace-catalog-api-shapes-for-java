package com.amazonaws.services.marketplacecatalog.model.professionalservicesproduct_1_0;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.util.Arrays;
import java.util.Collections;

public class ProfessionalServicesProduct1_0Tests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
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
                .associatedProducts(Collections.singletonList("22509f00-8f07-4a19-aacb-53fe1acb1231"))
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
                "  \"AssociatedProducts\": [\"22509f00-8f07-4a19-aacb-53fe1acb1231\"],\n" +
                "  \"SearchKeywords\": [\"example\", \"keywords\"]\n" +
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
    public void testReleaseProductChangeDetail() throws Exception {
        ReleaseProductChangeDetail detail = new ReleaseProductChangeDetail();

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }
}
