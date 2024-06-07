package com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.changetypes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ResaleAuthorization1_0ChangeTypeTests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testCreateResaleAuthorizationChangeDetail() throws Exception {
        CreateResaleAuthorizationChangeDetail detail = new CreateResaleAuthorizationChangeDetail()
                .productId("ProductId")
                .name("Name")
                .description("Description")
                .resellerAccountId("123456789012");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"ProductId\": \"ProductId\",\n" +
                "  \"Name\": \"Name\",\n" +
                "  \"Description\": \"Description\",\n" +
                "  \"ResellerAccountId\": \"123456789012\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateBuyerTargetingTermsChangeDetail() throws Exception {
        Set<String> accounts = new HashSet<>();
        accounts.add("218196967966");
        accounts.add("218196967988");

        UpdateBuyerTargetingTermsChangeDetail detail = new UpdateBuyerTargetingTermsChangeDetail()
                .terms(Collections.singletonList(new BuyerTargetingTerm()
                        .type(BuyerTargetingTermType.BUYER_TARGETING_TERM)
                        .positiveTargeting(new PositiveTargeting()
                                .buyerAccounts(accounts))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"BuyerTargetingTerm\",\n" +
                "    \"PositiveTargeting\": {\n" +
                "      \"BuyerAccounts\": [\"218196967966\", \"218196967988\"]\n" +
                "    }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateAvailabilityChangeDetail() throws Exception {
        UpdateAvailabilityChangeDetail detail = new UpdateAvailabilityChangeDetail()
                .availabilityEndDate("2096-02-29")
                .offersMaxQuantity(1);

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"AvailabilityEndDate\": \"2096-02-29\",\n" +
                "  \"OffersMaxQuantity\": 1\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateBuyerValidityTermsChangeDetail() throws Exception {
        UpdateBuyerValidityTermsChangeDetail detail = new UpdateBuyerValidityTermsChangeDetail()
                .terms(Collections.singletonList(new BuyerValidityTerm()
                        .type(BuyerValidityTermType.BUYER_VALIDITY_TERM)
                        .maximumAgreementStartDate("2026-05-01")
                ));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"BuyerValidityTerm\",\n" +
                "    \"MaximumAgreementStartDate\": \"2026-05-01\"\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateInformationChangeDetail() throws Exception {
        UpdateInformationChangeDetail detail = new UpdateInformationChangeDetail()
                .name("name")
                .description("description")
                .preExistingBuyerAgreement(new PreExistingBuyerAgreement()
                        .acquisitionChannel(AcquisitionChannel.AWS_MARKETPLACE)
                        .pricingModel(PricingModel.BYOL));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"name\",\n" +
                "  \"Description\": \"description\",\n" +
                "  \"PreExistingBuyerAgreement\": {\n" +
                "    \"AcquisitionChannel\": \"AwsMarketplace\",\n" +
                "    \"PricingModel\": \"Byol\"\n" +
                "  }\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateLegalTermsChangeDetail() throws Exception {
        UpdateLegalTermsChangeDetail detail = new UpdateLegalTermsChangeDetail()
                .terms(Arrays.asList(
                        new LegalTerm()
                                .type(LegalTermType.BUYER_LEGAL_TERM)
                                .documents(Collections.singletonList(new LegalDocument()
                                        .type(LegalDocumentType.CUSTOM_EULA)
                                        .url("https://s3.amazonaws.com/EULA/custom-eula-1234.txt"))),
                        new LegalTerm()
                                .type(LegalTermType.RESALE_LEGAL_TERM)
                                .documents(Collections.singletonList((new LegalDocument()
                                        .type(LegalDocumentType.CUSTOM_RESELLER_CONTRACT)
                                        .url("https://s3.amazonaws.com/reseller/custom-reseller-1234.txt"))))
                ));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"BuyerLegalTerm\",\n" +
                "    \"Documents\": [{\n" +
                "      \"Type\": \"CustomEula\",\n" +
                "      \"Url\": \"https://s3.amazonaws.com/EULA/custom-eula-1234.txt\"\n" +
                "    }]\n" +
                "  },{\n" +
                "    \"Type\": \"ResaleLegalTerm\",\n" +
                "    \"Documents\": [{\n" +
                "      \"Type\": \"CustomResellerContract\",\n" +
                "      \"Url\": \"https://s3.amazonaws.com/reseller/custom-reseller-1234.txt\"\n" +
                "    }]\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdatePricingTermsChangeDetail() throws Exception {
        UpdatePricingTermsChangeDetail detail = new UpdatePricingTermsChangeDetail()
                .pricingModel(UpdatePricingModel.CONTRACT)
                .terms(Arrays.asList(
                        new PricingTerm()
                                .type(PricingTermType.RESALE_USAGE_BASED_PRICING_TERM)
                                .currencyCode(PricingTermCurrencyCode.USD)
                                .rateCards(Collections.singletonList(
                                        new RateCards()
                                                .rateCard(Arrays.asList(
                                                        new RateCard()
                                                                .dimensionKey("m3.large")
                                                                .price("0.10"),
                                                        new RateCard()
                                                                .dimensionKey("m4.xlarge")
                                                                .price("0.20"))))),
                        new PricingTerm()
                                .type(PricingTermType.RESALE_CONFIGURABLE_UPFRONT_PRICING_TERM)
                                .currencyCode(PricingTermCurrencyCode.USD)
                                .rateCards(Collections.singletonList(
                                        new RateCards()
                                                .selector(new Selector()
                                                        .type(SelectorType.DURATION)
                                                        .value("P12M"))
                                                .constraints(new Constraints()
                                                        .multipleDimensionSelection(Constraint.ALLOWED)
                                                        .quantityConfiguration(Constraint.ALLOWED))
                                                .rateCard(Arrays.asList(
                                                        new RateCard()
                                                                .dimensionKey("m3.large")
                                                                .price("300"),
                                                        new RateCard()
                                                                .dimensionKey("m4.xlarge")
                                                                .price("400"))))),
                        new PricingTerm()
                                .type(PricingTermType.RESALE_FIXED_UPFRONT_PRICING_TERM)
                                .currencyCode(PricingTermCurrencyCode.USD)
                                .price("00.00")
                                .duration("P12M")
                                .grants(Collections.singletonList(new Grant()
                                        .dimensionKey("Users")
                                        .maxQuantity(10)))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"PricingModel\": \"Contract\",\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"ResaleUsageBasedPricingTerm\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"RateCards\": [{\n" +
                "      \"RateCard\": [{\n" +
                "        \"DimensionKey\": \"m3.large\",\n" +
                "        \"Price\": \"0.10\"\n" +
                "      },{\n" +
                "        \"DimensionKey\": \"m4.xlarge\",\n" +
                "        \"Price\": \"0.20\"\n" +
                "      }]\n" +
                "    }]\n" +
                "  },{\n" +

                "    \"Type\": \"ResaleConfigurableUpfrontPricingTerm\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"RateCards\": [{\n" +
                "      \"Selector\": {\n" +
                "        \"Type\": \"Duration\",\n" +
                "        \"Value\": \"P12M\"\n" +
                "      },\n" +
                "      \"Constraints\": {\n" +
                "        \"MultipleDimensionSelection\": \"Allowed\",\n" +
                "        \"QuantityConfiguration\": \"Allowed\"\n" +
                "      },\n" +
                "      \"RateCard\": [{\n" +
                "        \"DimensionKey\": \"m3.large\",\n" +
                "        \"Price\": \"300\"\n" +
                "      },{\n" +
                "        \"DimensionKey\": \"m4.xlarge\",\n" +
                "        \"Price\": \"400\"\n" +
                "      }]\n" +
                "    }]\n" +
                "  },{\n" +

                "    \"Type\": \"ResaleFixedUpfrontPricingTerm\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"Price\": \"00.00\",\n" +
                "    \"Grants\": [{\n" +
                "      \"DimensionKey\": \"Users\",\n" +
                "      \"MaxQuantity\": 10\n" +
                "    }],\n" +
                "    \"Duration\": \"P12M\"\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdatePaymentScheduleTermsChangeDetail() throws Exception {
        UpdatePaymentScheduleTermsChangeDetail detail = new UpdatePaymentScheduleTermsChangeDetail()
                .terms(Collections.singletonList(new UpdatePaymentScheduleTerm()
                        .type(ResalePaymentScheduleTermType.RESALE_PAYMENT_SCHEDULE_TERM)
                        .currencyCode(UpdatePaymentScheduleTermCurrencyCode.USD)
                        .schedule(Arrays.asList(
                                new Schedule()
                                        .chargeDate("2021-12-01")
                                        .chargeAmount("200.00"),
                                new Schedule()
                                        .chargeDate("2022-03-01")
                                        .chargeAmount("250.00")))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"ResalePaymentScheduleTerm\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"Schedule\": [{\n" +
                "      \"ChargeDate\": \"2021-12-01\",\n" +
                "      \"ChargeAmount\": \"200.00\"\n" +
                "    },{\n" +
                "      \"ChargeDate\": \"2022-03-01\",\n" +
                "      \"ChargeAmount\": \"250.00\"\n" +
                "    }]\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testReleaseResaleAuthorizationChangeDetail() throws Exception {
        ReleaseResaleAuthorizationChangeDetail detail = new ReleaseResaleAuthorizationChangeDetail();

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testRestrictResaleAuthorizationChangeDetail() throws Exception {
        RestrictResaleAuthorizationChangeDetail detail = new RestrictResaleAuthorizationChangeDetail();

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }
}
