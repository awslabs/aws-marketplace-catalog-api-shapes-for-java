package com.amazonaws.services.marketplacecatalog.model.seller_1_0;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

public class Seller1_0Tests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testCreateSellerChangeDetail() throws Exception {
        CreateSellerChangeDetail detail = new CreateSellerChangeDetail()
                .legalName("LegalName");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"LegalName\": \"LegalName\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateDisbursementPreferencesChangeDetail() throws Exception {
        UpdateDisbursementPreferencesChangeDetail detail = new UpdateDisbursementPreferencesChangeDetail()
                ._default(new UpdateDisbursementPreferencesDefault()
                        .paymentInstrumentArn("Payment instrument ARN")
                        .schedule(Schedule.DAILY)
                        .scheduleDay(1));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Default\": {\n" +
                "    \"PaymentInstrumentArn\":  \"Payment instrument ARN\",\n" +
                "    \"Schedule\":  \"Daily\",\n" +
                "    \"ScheduleDay\":  1\n" +
                "  }\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateInformationChangeDetail() throws Exception {
        UpdateInformationChangeDetail detail = new UpdateInformationChangeDetail()
                .displayName("Display name")
                .description("Description")
                .logoUrl("https://s3.amazonaws.com/awsmp-logos/logo.png")
                .websiteUrl("https://amazon.com");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DisplayName\": \"Display name\",\n" +
                "  \"Description\": \"Description\",\n" +
                "  \"LogoUrl\": \"https://s3.amazonaws.com/awsmp-logos/logo.png\",\n" +
                "  \"WebsiteUrl\": \"https://amazon.com\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }
}
