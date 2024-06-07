package com.amazonaws.services.marketplacecatalog.model.brandingsettings_1_0.entitytype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrandingSettings1_0EntityTypeTests {

    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testBrandingSettingsEntityDetail() throws Exception {
        String json = "{\n" +
                "  \"Name\": \"SampleBranding\",\n" +
                "  \"Description\": \"Sample Branding Description\",\n" +
                "  \"Configuration\": {\n" +
                "    \"Title\": \"My Company\",\n" +
                "    \"Information\": \"Custom branding welcome message\",\n" +
                "    \"ThemeColor\": \"#232f3e\",\n" +
                "    \"LogoUrl\": \"https://mybucket.s3.us-east-1.amazonaws.com/test.jpg\"\n" +
                "  }\n" +
                "}";

        BrandingSettingsEntityDetail actualDetail = mapper.readValue(json, BrandingSettingsEntityDetail.class);

        BrandingSettingsEntityDetail expectedDetail = new BrandingSettingsEntityDetail()
                .name("SampleBranding")
                .description("Sample Branding Description")
                ._configuration(new ModelConfiguration()
                        .title("My Company")
                        .information("Custom branding welcome message")
                        .themeColor("#232f3e")
                        .logoUrl("https://mybucket.s3.us-east-1.amazonaws.com/test.jpg")
                );

        assertEquals(expectedDetail, actualDetail);
    }
}
