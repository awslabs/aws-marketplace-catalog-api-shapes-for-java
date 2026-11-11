package com.amazonaws.services.marketplacecatalog.model.subsidiaryauthorization_1_0.entitytype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubsidiaryAuthorization1_0EntityTypeTests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testSubsidiaryAuthorizationEntityDetail() throws Exception {
        String json = "{\n" +
                "  \"Name\": \"Acme LATAM - Mexico\",\n" +
                "  \"Description\": \"Authorization for Acme Mexico subsidiary to sell Cloud Security Suite in BR and AR\",\n" +
                "  \"Status\": \"Active\",\n" +
                "  \"CreatedDate\": \"2026-05-12T22:32:19Z\",\n" +
                "  \"Issuer\": {\n" +
                "    \"AccountId\": \"123456789012\",\n" +
                "    \"LegalName\": \"Acme Global Inc.\"\n" +
                "  },\n" +
                "  \"Resource\": {\n" +
                "    \"Arn\": \"arn:aws:aws-marketplace:us-east-1:123456789012:AWSMarketplace/SaaSProduct/prod-abc123\",\n" +
                "    \"Name\": \"Cloud Security Suite\",\n" +
                "    \"Description\": \"Enterprise endpoint security suite\",\n" +
                "    \"ResourceTypeDetails\": {\n" +
                "      \"ProductDetails\": {\n" +
                "        \"Dimensions\": [\n" +
                "          {\n" +
                "            \"Name\": \"Users - Contract Pricing\",\n" +
                "            \"Description\": \"Licensed users - CUPT term\",\n" +
                "            \"Key\": \"users_id\",\n" +
                "            \"Unit\": \"Units\",\n" +
                "            \"Types\": [\"Entitled\"]\n" +
                "          },\n" +
                "          {\n" +
                "            \"Name\": \"API Requests - Contract Only\",\n" +
                "            \"Description\": \"API requests - CUPT term only\",\n" +
                "            \"Key\": \"api_requests_id\",\n" +
                "            \"Unit\": \"Requests\",\n" +
                "            \"Types\": [\"Entitled\"]\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"Terms\": [\n" +
                "    {\n" +
                "      \"Type\": \"BuyerTargetingTerm\",\n" +
                "      \"PositiveTargeting\": {\n" +
                "        \"CountryCodes\": [\"BR\", \"AR\"],\n" +
                "        \"OfferTargeting\": [\"PrivateOffer\"]\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"Type\": \"PartnerTargetingTerm\",\n" +
                "      \"PositiveTargeting\": {\n" +
                "        \"PartnerAccounts\": []\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"Rules\": [\n" +
                "    {\n" +
                "      \"Type\": \"SubsidiaryTargetingRule\",\n" +
                "      \"AccountId\": \"987654321098\",\n" +
                "      \"LegalName\": \"Acme Mexico Ltda\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        SubsidiaryAuthorizationEntityDetail actualDetail = mapper.readValue(json,
                SubsidiaryAuthorizationEntityDetail.class);

        SubsidiaryAuthorizationEntityDetail expectedDetail = new SubsidiaryAuthorizationEntityDetail()
                .name("Acme LATAM - Mexico")
                .description("Authorization for Acme Mexico subsidiary to sell Cloud Security Suite in BR and AR")
                .status("Active")
                .createdDate("2026-05-12T22:32:19Z")
                .issuer(new Issuer()
                        .accountId("123456789012")
                        .legalName("Acme Global Inc."))
                .resource(new Resource()
                        .arn("arn:aws:aws-marketplace:us-east-1:123456789012:AWSMarketplace/SaaSProduct/prod-abc123")
                        .name("Cloud Security Suite")
                        .description("Enterprise endpoint security suite")
                        .resourceTypeDetails(new ResourceTypeDetails()
                                .productDetails(new ProductDetails()
                                        .dimensions(Arrays.asList(
                                                new Dimension()
                                                        .name("Users - Contract Pricing")
                                                        .description("Licensed users - CUPT term")
                                                        .key("users_id")
                                                        .unit("Units")
                                                        .types(Collections.singletonList("Entitled")),
                                                new Dimension()
                                                        .name("API Requests - Contract Only")
                                                        .description("API requests - CUPT term only")
                                                        .key("api_requests_id")
                                                        .unit("Requests")
                                                        .types(Collections.singletonList("Entitled")))))))
                .terms(Arrays.asList(
                        new Term()
                                .type("BuyerTargetingTerm")
                                .positiveTargeting(new PositiveTargeting()
                                        .countryCodes(Arrays.asList("BR", "AR"))
                                        .offerTargeting(Collections.singletonList("PrivateOffer"))),
                        new Term()
                                .type("PartnerTargetingTerm")
                                .positiveTargeting(new PositiveTargeting()
                                        .partnerAccounts(Collections.emptyList()))))
                .rules(Collections.singletonList(
                        new Rule()
                                .type("SubsidiaryTargetingRule")
                                .accountId("987654321098")
                                .legalName("Acme Mexico Ltda")));

        assertEquals(expectedDetail, actualDetail);
    }
}
