package com.amazonaws.services.marketplacecatalog.model.subsidiaryauthorization_1_0.changetypes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class SubsidiaryAuthorization1_0ChangeTypeTests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    }

    @Test
    public void testCreateSubsidiaryAuthorizationChangeDetail() throws Exception {
        CreateSubsidiaryAuthorizationChangeDetail detail = new CreateSubsidiaryAuthorizationChangeDetail()
                .name("Acme LATAM - Mexico")
                .description("Authorization for Acme Mexico subsidiary")
                .resource(new ResourceInput()
                        .arn("arn:aws:aws-marketplace:us-east-1:123456789012:AWSMarketplace/SaaSProduct/prod-abc123")
                        .resourceTypeDetails(new ResourceTypeDetailsInput()
                                .productDetails(new ProductDetailsInput()
                                        .dimensions(Arrays.asList(
                                                new DimensionInput().key("users_id"),
                                                new DimensionInput().key("api_requests_id"))))))
                .subsidiaryAccountId("987654321098")
                .terms(Collections.singletonList(
                        new TermInput()
                                .type(TermTypeValue.BUYER_TARGETING_TERM)
                                .positiveTargeting(new PositiveTargetingInput()
                                        .countryCodes(new LinkedHashSet<>(Arrays.asList("BR", "AR")))
                                        .offerTargeting(Collections.singleton(OfferTargetingValue.PRIVATE_OFFER)))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"Acme LATAM - Mexico\",\n" +
                "  \"Description\": \"Authorization for Acme Mexico subsidiary\",\n" +
                "  \"Resource\": {\n" +
                "    \"Arn\": \"arn:aws:aws-marketplace:us-east-1:123456789012:AWSMarketplace/SaaSProduct/prod-abc123\",\n" +
                "    \"ResourceTypeDetails\": {\n" +
                "      \"ProductDetails\": {\n" +
                "        \"Dimensions\": [\n" +
                "          { \"Key\": \"users_id\" },\n" +
                "          { \"Key\": \"api_requests_id\" }\n" +
                "        ]\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"SubsidiaryAccountId\": \"987654321098\",\n" +
                "  \"Terms\": [\n" +
                "    {\n" +
                "      \"Type\": \"BuyerTargetingTerm\",\n" +
                "      \"PositiveTargeting\": {\n" +
                "        \"CountryCodes\": [\"BR\", \"AR\"],\n" +
                "        \"OfferTargeting\": [\"PrivateOffer\"]\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateInformationChangeDetail() throws Exception {
        UpdateInformationChangeDetail detail = new UpdateInformationChangeDetail()
                .name("Acme LATAM - Mexico (updated)")
                .description("Revised description after PM review.")
                .resource(new ResourceInput()
                        .arn("arn:aws:aws-marketplace:us-east-1:123456789012:AWSMarketplace/SaaSProduct/prod-abc123")
                        .resourceTypeDetails(new ResourceTypeDetailsInput()
                                .productDetails(new ProductDetailsInput()
                                        .dimensions(Arrays.asList(
                                                new DimensionInput().key("users_id"),
                                                new DimensionInput().key("api_requests_id"),
                                                new DimensionInput().key("storage_gb_id"))))))
                .terms(Collections.singletonList(
                        new TermInput()
                                .type(TermTypeValue.BUYER_TARGETING_TERM)
                                .positiveTargeting(new PositiveTargetingInput()
                                        .countryCodes(new LinkedHashSet<>(Arrays.asList("BR", "AR", "MX")))
                                        .offerTargeting(Collections.singleton(OfferTargetingValue.PRIVATE_OFFER)))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"Acme LATAM - Mexico (updated)\",\n" +
                "  \"Description\": \"Revised description after PM review.\",\n" +
                "  \"Resource\": {\n" +
                "    \"Arn\": \"arn:aws:aws-marketplace:us-east-1:123456789012:AWSMarketplace/SaaSProduct/prod-abc123\",\n" +
                "    \"ResourceTypeDetails\": {\n" +
                "      \"ProductDetails\": {\n" +
                "        \"Dimensions\": [\n" +
                "          { \"Key\": \"users_id\" },\n" +
                "          { \"Key\": \"api_requests_id\" },\n" +
                "          { \"Key\": \"storage_gb_id\" }\n" +
                "        ]\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"Terms\": [\n" +
                "    {\n" +
                "      \"Type\": \"BuyerTargetingTerm\",\n" +
                "      \"PositiveTargeting\": {\n" +
                "        \"CountryCodes\": [\"BR\", \"AR\", \"MX\"],\n" +
                "        \"OfferTargeting\": [\"PrivateOffer\"]\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateAvailabilityChangeDetail() throws Exception {
        UpdateAvailabilityChangeDetail detail = new UpdateAvailabilityChangeDetail()
                .status(StatusValue.ACTIVE);

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Status\": \"Active\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }
}
