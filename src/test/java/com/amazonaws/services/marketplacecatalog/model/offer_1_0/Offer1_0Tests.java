package com.amazonaws.services.marketplacecatalog.model.offer_1_0;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.util.Arrays;
import java.util.Collections;

public class Offer1_0Tests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testCreateOfferChangeDetail() throws Exception {
        CreateOfferChangeDetail detail = new CreateOfferChangeDetail()
                .name("New name")
                .productId("prod-12345");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"New name\",\n" +
                "  \"ProductId\": \"prod-12345\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testCreateReplacementOfferChangeDetail() throws Exception {
        CreateReplacementOfferChangeDetail detail = new CreateReplacementOfferChangeDetail()
                .name("New name")
                .agreementId("agmt-12345");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"New name\",\n" +
                "  \"AgreementId\": \"agmt-12345\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateInformationChangeDetail() throws Exception {
        UpdateInformationChangeDetail detail = new UpdateInformationChangeDetail()
                .name("Updated Offer Name")
                .description("Updated offer description")
                .preExistingAgreement(new PreExistingAgreement()
                        .acquisitionChannel(AcquisitionChannel.AWS_MARKETPLACE)
                        .pricingModel(PricingModel.FREE));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"Updated Offer Name\",\n" +
                "  \"Description\": \"Updated offer description\",\n" +
                "  \"PreExistingAgreement\": {\n" +
                "    \"AcquisitionChannel\": \"AwsMarketplace\",\n" +
                "    \"PricingModel\": \"Free\"\n" +
                "  }\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateLegalTermsChangeDetailStandard() throws Exception {
        UpdateLegalTermsChangeDetail detail = new UpdateLegalTermsChangeDetail()
                .terms(Arrays.asList(
                        new LegalTerm()
                                .type(LegalTermType.LEGAL_TERM)
                                .documents(Collections.singletonList(
                                        new Document()
                                                .type(LegalDocumentType.STANDARD_EULA)
                                                .version(Version._2019_04_24)))
                ));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"LegalTerm\",\n" +
                "    \"Documents\": [{\n" +
                "      \"Type\": \"StandardEula\",\n" +
                "      \"Version\": \"2019-04-24\"\n" +
                "    }]\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateLegalTermsChangeDetailCustom() throws Exception {
        UpdateLegalTermsChangeDetail detail = new UpdateLegalTermsChangeDetail()
                .terms(Collections.singletonList(
                        new LegalTerm()
                                .type(LegalTermType.LEGAL_TERM)
                                .documents(Collections.singletonList(
                                        new Document()
                                                .type(LegalDocumentType.CUSTOM_EULA)
                                                .url("https://s3.amazonaws.com/offer")
                                ))
                ));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"LegalTerm\",\n" +
                "    \"Documents\": [{\n" +
                "      \"Type\": \"CustomEula\",\n" +
                "      \"Url\": \"https://s3.amazonaws.com/offer\"\n" +
                "    }]\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateAvailabilityChangeDetail() throws Exception {
        UpdateAvailabilityChangeDetail detail = new UpdateAvailabilityChangeDetail()
                .availabilityEndDate("2019-01-17");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"AvailabilityEndDate\": \"2019-01-17\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateSupportTermsChangeDetail() throws Exception {
        UpdateSupportTermsChangeDetail detail = new UpdateSupportTermsChangeDetail()
                .terms(Collections.singletonList(new SupportTerm()
                        .type(SupportTermType.SUPPORT_TERM)
                        .refundPolicy("refund policy")));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"SupportTerm\",\n" +
                "    \"RefundPolicy\": \"refund policy\"\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdatePricingTermsChangeDetail() throws Exception {
        UpdatePricingTermsChangeDetail detail = new UpdatePricingTermsChangeDetail()
                .pricingModel(PricingModel.CONTRACT)
                .terms(Arrays.asList(
                        new UpdatePricingTerm()
                                .type(UpdatePricingType.BYOL_PRICING_TERM),
                        new UpdatePricingTerm()
                                .type(UpdatePricingType.FREE_TRIAL_PRICING_TERM)
                                .duration("P30D")
                                .grants(Arrays.asList(
                                        new Grant()
                                                .dimensionKey("m3.xlarge")
                                                .maxQuantity(20),
                                        new Grant()
                                                .dimensionKey("m4.xlarge")
                                                .maxQuantity(10))),
                        new UpdatePricingTerm()
                                .type(UpdatePricingType.USAGE_BASED_PRICING_TERM)
                                .currencyCode(CurrencyCode.USD)
                                .rateCards(Collections.singletonList(
                                        new RateCardsMember()
                                                .rateCard(Arrays.asList(
                                                        new RateCardMember()
                                                                .dimensionKey("m3.large")
                                                                .price("0.10123"),
                                                        new RateCardMember()
                                                                .dimensionKey("m4.xlarge")
                                                                .price("0.20"))))),
                        new UpdatePricingTerm()
                                .type(UpdatePricingType.CONFIGURABLE_UPFRONT_PRICING_TERM)
                                .currencyCode(CurrencyCode.USD)
                                .rateCards(Collections.singletonList(
                                        new RateCardsMember()
                                                .selector(new Selector()
                                                        .type(SelectorType.DURATION)
                                                        .value("P12M"))
                                                .constraints(new Constraints()
                                                        .multipleDimensionSelection(Constraint.ALLOWED)
                                                        .quantityConfiguration(Constraint.ALLOWED))
                                                .rateCard(Arrays.asList(
                                                        new RateCardMember()
                                                                .dimensionKey("m3.large")
                                                                .price("300.00"),
                                                        new RateCardMember()
                                                                .dimensionKey("m4.xlarge")
                                                                .price("400.00"))))),
                        new UpdatePricingTerm()
                                .type(UpdatePricingType.FIXED_UPFRONT_PRICING_TERM)
                                .currencyCode(CurrencyCode.USD)
                                .duration("P180D")
                                .price("200.00")
                                .grants(Collections.singletonList(new Grant()
                                        .dimensionKey("Users")
                                        .maxQuantity(10))),
                        new UpdatePricingTerm()
                                .type(UpdatePricingType.RECURRING_PAYMENT_TERM)
                                .currencyCode(CurrencyCode.USD)
                                .price("10.00")
                                .billingPeriod(BillingPeriod.MONTHLY)
                ));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"PricingModel\": \"Contract\",\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"ByolPricingTerm\"\n" +
                "  },{\n" +
                "    \"Type\": \"FreeTrialPricingTerm\",\n" +
                "    \"Duration\": \"P30D\",\n" +
                "    \"Grants\": [{\n" +
                "      \"DimensionKey\": \"m3.xlarge\",\n" +
                "      \"MaxQuantity\": 20\n" +
                "      },{\n" +
                "      \"DimensionKey\": \"m4.xlarge\",\n" +
                "      \"MaxQuantity\": 10\n" +
                "    }]\n" +
                "  },{\n" +
                "    \"Type\": \"UsageBasedPricingTerm\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"RateCards\": [{\n" +
                "      \"RateCard\": [{\n" +
                "        \"DimensionKey\": \"m3.large\",\n" +
                "        \"Price\": \"0.10123\"\n" +
                "      },{\n" +
                "        \"DimensionKey\": \"m4.xlarge\",\n" +
                "        \"Price\": \"0.20\"\n" +
                "      }]\n" +
                "    }]\n" +
                "  },{\n" +
                "    \"Type\": \"ConfigurableUpfrontPricingTerm\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"RateCards\": [{\n" +
                "      \"RateCard\": [{\n" +
                "        \"DimensionKey\": \"m3.large\",\n" +
                "        \"Price\": \"300.00\"\n" +
                "      },{\n" +
                "        \"DimensionKey\": \"m4.xlarge\",\n" +
                "        \"Price\": \"400.00\"\n" +
                "      }],\n" +
                "      \"Selector\": {\n" +
                "        \"Type\": \"Duration\",\n" +
                "        \"Value\": \"P12M\"\n" +
                "      },\n" +
                "      \"Constraints\": {\n" +
                "        \"MultipleDimensionSelection\": \"Allowed\",\n" +
                "        \"QuantityConfiguration\": \"Allowed\"\n" +
                "      }\n" +
                "    }]\n" +
                "  },{\n" +
                "    \"Type\": \"FixedUpfrontPricingTerm\",\n" +
                "    \"Duration\": \"P180D\",\n" +
                "    \"Grants\": [{\n" +
                "      \"DimensionKey\": \"Users\",\n" +
                "      \"MaxQuantity\": 10\n" +
                "    }],\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"Price\": \"200.00\"\n" +
                "  },{\n" +
                "    \"Type\": \"RecurringPaymentTerm\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"BillingPeriod\": \"Monthly\",\n" +
                "    \"Price\": \"10.00\"\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateTargetingChangeDetailPositiveBuyerAccounts() throws Exception {
        UpdateTargetingChangeDetail detail = new UpdateTargetingChangeDetail()
                .positiveTargeting(new PositiveTargeting()
                        .buyerAccounts(Collections.singletonList("118033953248")));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"PositiveTargeting\": {\n" +
                "    \"BuyerAccounts\": [\"118033953248\"]\n" +
                "  }\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateTargetingChangeDetailPositiveCountryCodes() throws Exception {
        UpdateTargetingChangeDetail detail = new UpdateTargetingChangeDetail()
                .positiveTargeting(new PositiveTargeting()
                        .countryCodes(Arrays.asList("US", "CA")));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"PositiveTargeting\": {\n" +
                "    \"CountryCodes\": [\"US\", \"CA\"]\n" +
                "  }\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateTargetingChangeDetailNegative() throws Exception {
        UpdateTargetingChangeDetail detail = new UpdateTargetingChangeDetail()
                .negativeTargeting(new NegativeTargeting()
                        .countryCodes(Arrays.asList("US", "CA")));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"NegativeTargeting\": {\n" +
                "    \"CountryCodes\": [\"US\", \"CA\"]\n" +
                "  }\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateCustomerVerificationTermsChangeDetail() throws Exception {
        UpdateCustomerVerificationTermsChangeDetail detail = new UpdateCustomerVerificationTermsChangeDetail()
                .terms(Collections.singletonList(new CustomerVerificationTerm()
                        .type(CustomerVerificationTermType.CUSTOMER_VERIFICATION_TERM)
                        .approvalStrategy(ApprovalStrategy.AUTO_APPROVE_ON_EXPIRATION)
                        .expirationDuration("P22D")));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"CustomerVerificationTerm\",\n" +
                "    \"ApprovalStrategy\": \"AutoApproveOnExpiration\",\n" +
                "    \"ExpirationDuration\": \"P22D\"\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdatePaymentScheduleTermsChangeDetail() throws Exception {
        UpdatePaymentScheduleTermsChangeDetail detail = new UpdatePaymentScheduleTermsChangeDetail()
                .terms(Collections.singletonList(new PaymentScheduleTerm()
                        .type(PaymentScheduleTermType.PAYMENT_SCHEDULE_TERM)
                        .currencyCode(CurrencyCode.USD)
                        .schedule(Arrays.asList(
                                new Schedule()
                                        .chargeDate("2020-12-01")
                                        .chargeAmount("1000.00"),
                                new Schedule()
                                        .chargeDate("2021-06-15")
                                        .chargeAmount("1250.00")
                        ))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"PaymentScheduleTerm\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"Schedule\": [{\n" +
                "      \"ChargeDate\": \"2020-12-01\",\n" +
                "      \"ChargeAmount\": \"1000.00\"\n" +
                "    },{\n" +
                "      \"ChargeDate\": \"2021-06-15\",\n" +
                "      \"ChargeAmount\": \"1250.00\"\n" +
                "    }]\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateRenewalTermsChangeDetail() throws Exception {
        UpdateRenewalTermsChangeDetail detail = new UpdateRenewalTermsChangeDetail()
                .terms(Collections.singletonList(new RenewalTerm()
                        .type(RenewalTermType.RENEWAL_TERM)));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"RenewalTerm\"\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateValidityTermsChangeDetailAgreementDuration() throws Exception {
        UpdateValidityTermsChangeDetail detail = new UpdateValidityTermsChangeDetail()
                .terms(Collections.singletonList(new ValidityTerm()
                        .type(ValidityTermType.VALIDITY_TERM)
                        .agreementStartDate("2021-08-01")
                        .agreementDuration("P30D")));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"ValidityTerm\",\n" +
                "    \"AgreementStartDate\": \"2021-08-01\",\n" +
                "    \"AgreementDuration\": \"P30D\"\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateValidityTermsChangeDetailAgreementEndDate() throws Exception {
        UpdateValidityTermsChangeDetail detail = new UpdateValidityTermsChangeDetail()
                .terms(Collections.singletonList(new ValidityTerm()
                        .type(ValidityTermType.VALIDITY_TERM)
                        .agreementStartDate("2021-08-01")
                        .agreementEndDate("2022-08-01")));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"ValidityTerm\",\n" +
                "    \"AgreementStartDate\": \"2021-08-01\",\n" +
                "    \"AgreementEndDate\": \"2022-08-01\"\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testCreateOfferUsingResaleAuthorizationChangeDetail() throws Exception {
        CreateOfferUsingResaleAuthorizationChangeDetail detail = new CreateOfferUsingResaleAuthorizationChangeDetail()
                .resaleAuthorizationId("resaleAuthorizationId")
                .name("name")
                .description("description");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"ResaleAuthorizationId\": \"resaleAuthorizationId\",\n" +
                "  \"Name\": \"name\",\n" +
                "  \"Description\": \"description\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testCreateReplacementOfferUsingResaleAuthorizationChangeDetail() throws Exception {
        CreateReplacementOfferUsingResaleAuthorizationChangeDetail detail = new CreateReplacementOfferUsingResaleAuthorizationChangeDetail()
                .resaleAuthorizationId("resaleAuthorizationId")
                .name("name")
                .agreementId("agreementId");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"ResaleAuthorizationId\": \"resaleAuthorizationId\",\n" +
                "  \"Name\": \"name\",\n" +
                "  \"AgreementId\": \"agreementId\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateMarkupChangeDetail() throws Exception {
        UpdateMarkupChangeDetail detail = new UpdateMarkupChangeDetail()
                .percentage("15.123456789");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Percentage\": \"15.123456789\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testReleaseOfferChangeDetail() throws Exception {
        ReleaseOfferChangeDetail detail = new ReleaseOfferChangeDetail();

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }
}
