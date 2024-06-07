package com.amazonaws.services.marketplacecatalog.model.offer_1_0;

import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.ApprovalStrategy;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.BillingPeriod;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.ByolPricingTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.ByolPricingTermType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.ConfigurableUpfrontPricingTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.ConfigurableUpfrontPricingTermType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.ConfigurableUpfrontRateCardItem;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.Constraint;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.CurrencyCode;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.CustomerVerificationTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.CustomerVerificationTermType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.FixedUpfrontPricingTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.FixedUpfrontPricingTermType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.FreeTrialPricingTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.FreeTrialPricingTermType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.LegalDocumentType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.LegalDocumentVersion;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.LegalTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.LegalTermType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.PaymentScheduleTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.PaymentScheduleTermType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.RecurringPaymentTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.RecurringPaymentTermType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.RenewalTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.RenewalTermType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.SelectorType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.SupportTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.SupportTermType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.UsageBasedPricingTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.UsageBasedPricingTermType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.UsageBasedRateCardItem;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.ValidityTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.ValidityTermType;
import com.amazonaws.services.marketplacecatalog.utils.OfferConverter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Offer1_0Tests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testOfferEntityDetail() throws Exception {
        String json = "{\n" +
                "  \"Description\": \"Worldwide offer for Test Product\",\n" +
                "  \"Id\": \"offer-3rEXAMPLErn\",\n" +
                "  \"State\": \"Released\",\n" +
                "  \"MarkupPercentage\": \"20\",\n" +
                "  \"Name\": \"Test Offer\",\n" +
                "  \"PreExistingAgreement\": {" +
                "    \"AcquisitionChannel\": \"External\",\n" +
                "    \"PricingModel\": \"Contract\"\n" +
                "  },\n" +
                "  \"ProductId\": \"prod-ad8EXAMPLE51\",\n" +
                "  \"Rules\": [{\n" +
                "    \"Type\": \"TargetingRule\",\n" +
                "    \"PositiveTargeting\": {" +
                "      \"CountryCodes\": [\"US\", \"CA\"],\n" +
                "      \"BuyerAccounts\": [\"444455556666\"]\n" +
                "    },\n" +
                "    \"NegativeTargeting\": {" +
                "      \"CountryCodes\": [\"XX\"]\n" +
                "    }\n" +
                "  }, {\n" +
                "    \"Type\": \"AvailabilityRule\",\n" +
                "    \"AvailabilityEndDate\": \"2024-08-30T01:56:03.000Z\"\n" +
                "  }],\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"ConfigurableUpfrontPricingTerm\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"RateCards\": [{\n" +
                "      \"Selector\": {\n" +
                "        \"Type\": \"Duration\",\n" +
                "        \"Value\": \"P365D\"\n" +
                "      },\n" +
                "      \"RateCard\": [{\n" +
                "        \"DimensionKey\": \"m3.large\",\n" +
                "        \"Price\": \"300.00\"\n" +
                "      }, {\n" +
                "        \"DimensionKey\": \"m4.xlarge\",\n" +
                "        \"Price\": \"400.00\"\n" +
                "      }],\n" +
                "      \"Constraints\": {" +
                "        \"MultipleDimensionSelection\": \"Allowed\",\n" +
                "        \"QuantityConfiguration\": \"Allowed\"\n" +
                "      }\n" +
                "    }]\n" +
                "  }, {\n" +
                "    \"Type\": \"ByolPricingTerm\"\n" +
                "  }, {\n" +
                "    \"Type\": \"FreeTrialPricingTerm\",\n" +
                "    \"Duration\": \"P30D\",\n" +
                "    \"Grants\": [{\n" +
                "      \"DimensionKey\": \"m3.xlarge\",\n" +
                "      \"MaxQuantity\": 10\n" +
                "    }, {\n" +
                "      \"DimensionKey\": \"m4.xlarge\",\n" +
                "      \"MaxQuantity\": 10\n" +
                "    }]\n" +
                "  }, {\n" +
                "    \"Type\": \"UsageBasedPricingTerm\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"RateCards\": [{\n" +
                "      \"RateCard\": [{\n" +
                "        \"DimensionKey\": \"m3.large\",\n" +
                "        \"Price\": \"0.10\"\n" +
                "      }, {\n" +
                "        \"DimensionKey\": \"m4.xlarge\",\n" +
                "        \"Price\": \"0.20\"\n" +
                "      }]\n" +
                "    }]\n" +
                "  }, {\n" +
                "    \"Type\": \"RecurringPaymentTerm\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"BillingPeriod\": \"Monthly\",\n" +
                "    \"Price\": \"100.0\"\n" +
                "  }, {\n" +
                "    \"Type\": \"FixedUpfrontPricingTerm\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"Price\": \"200.0\",\n" +
                "    \"Grants\": [{\n" +
                "      \"DimensionKey\": \"Users\",\n" +
                "      \"MaxQuantity\": 10\n" +
                "    }]\n" +
                "  }, {\n" +
                "    \"Type\": \"PaymentScheduleTerm\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"Schedule\": [{\n" +
                "      \"ChargeDate\": \"2020-12-01T00:00:00.000Z\",\n" +
                "      \"ChargeAmount\": \"1000.00\"\n" +
                "    }, {\n" +
                "      \"ChargeDate\": \"2021-06-15T00:00:00.000Z\",\n" +
                "      \"ChargeAmount\": \"1250.00\"\n" +
                "    }]\n" +
                "  }, {\n" +
                "    \"Type\": \"LegalTerm\",\n" +
                "    \"Documents\": [{\n" +
                "      \"Type\": \"CustomEula\",\n" +
                "      \"Url\": \"https://s3.amazonaws.com/EULA/custom-eula-1234.txt\"\n" +
                "    }, {\n" +
                "      \"Type\": \"StandardEula\",\n" +
                "      \"Version\": \"2022-07-14\"\n" +
                "    }]\n" +
                "  }, {\n" +
                "    \"Type\": \"RenewalTerm\"\n" +
                "  }, {\n" +
                "    \"Type\": \"SupportTerm\",\n" +
                "    \"RefundPolicy\": \"If you need to request a refund for software sold by Amazon Web Services, LLC, please contact AWS Customer Service.\"\n" +
                "  }, {\n" +
                "    \"Type\": \"ValidityTerm\",\n" +
                "    \"AgreementStartDate\": \"2021-08-01\",\n" +
                "    \"AgreementDuration\": \"P30D\"\n" +
                "  }, {\n" +
                "    \"Type\": \"ValidityTerm\",\n" +
                "    \"AgreementStartDate\": \"2021-08-01\",\n" +
                "    \"AgreementEndDate\": \"2022-08-01\"\n" +
                "  }]\n" +
                "}";

        OfferEntityDetail actualDetail = mapper.readValue(json, OfferEntityDetail.class);

        OfferEntityDetail expectedDetail = new OfferEntityDetail()
                .description("Worldwide offer for Test Product")
                .id("offer-3rEXAMPLErn")
                .state("Released")
                .markupPercentage("20")
                .name("Test Offer")
                .preExistingAgreement(new PreExistingAgreement()
                        .acquisitionChannel("External")
                        .pricingModel("Contract"))
                .productId("prod-ad8EXAMPLE51")
                .rules(Arrays.asList(
                        new Rule()
                                .type("TargetingRule")
                                .positiveTargeting(new PositiveTargeting()
                                        .countryCodes(Arrays.asList("US", "CA"))
                                        .buyerAccounts(Collections.singletonList("444455556666")))
                                .negativeTargeting(new NegativeTargeting()
                                        .countryCodes(Collections.singletonList("XX"))),
                        new Rule()
                                .type("AvailabilityRule")
                                .availabilityEndDate("2024-08-30T01:56:03.000Z")))
                .terms(Arrays.asList(
                        new Term()
                                .type("ConfigurableUpfrontPricingTerm")
                                .currencyCode("USD")
                                .rateCards(Collections.singletonList(
                                        new RateCardsItem()
                                                .selector(new Selector()
                                                        .type("Duration")
                                                        .value("P365D"))
                                                .rateCard(Arrays.asList(
                                                        new RateCardItem()
                                                                .dimensionKey("m3.large")
                                                                .price("300.00"),
                                                        new RateCardItem()
                                                                .dimensionKey("m4.xlarge")
                                                                .price("400.00")))
                                                .constraints(new Constraints()
                                                        .multipleDimensionSelection("Allowed")
                                                        .quantityConfiguration("Allowed")))),
                        new Term()
                                .type("ByolPricingTerm"),
                        new Term()
                                .type("FreeTrialPricingTerm")
                                .duration("P30D")
                                .grants(Arrays.asList(
                                        new GrantItem()
                                                .dimensionKey("m3.xlarge")
                                                .maxQuantity(10),
                                        new GrantItem()
                                                .dimensionKey("m4.xlarge")
                                                .maxQuantity(10))),
                        new Term()
                                .type("UsageBasedPricingTerm")
                                .currencyCode("USD")
                                .rateCards(Arrays.asList(
                                        new RateCardsItem()
                                                .rateCard(Arrays.asList(
                                                        new RateCardItem()
                                                                .dimensionKey("m3.large")
                                                                .price("0.10"),
                                                        new RateCardItem()
                                                                .dimensionKey("m4.xlarge")
                                                                .price("0.20"))))),
                        new Term()
                                .type("RecurringPaymentTerm")
                                .currencyCode("USD")
                                .billingPeriod("Monthly")
                                .price("100.0"),
                        new Term()
                                .type("FixedUpfrontPricingTerm")
                                .currencyCode("USD")
                                .price("200.0")
                                .grants(Collections.singletonList(
                                        new GrantItem()
                                                .dimensionKey("Users")
                                                .maxQuantity(10))),
                        new Term()
                                .type("PaymentScheduleTerm")
                                .currencyCode("USD")
                                .schedule(Arrays.asList(
                                        new ScheduleItem()
                                                .chargeDate("2020-12-01T00:00:00.000Z")
                                                .chargeAmount("1000.00"),
                                        new ScheduleItem()
                                                .chargeDate("2021-06-15T00:00:00.000Z")
                                                .chargeAmount("1250.00"))),
                        new Term()
                                .type("LegalTerm")
                                .documents(Arrays.asList(
                                        new DocumentItem()
                                                .type("CustomEula")
                                                .url("https://s3.amazonaws.com/EULA/custom-eula-1234.txt"),
                                        new DocumentItem()
                                                .type("StandardEula")
                                                .version("2022-07-14"))),
                        new Term()
                                .type("RenewalTerm"),
                        new Term()
                                .type("SupportTerm")
                                .refundPolicy("If you need to request a refund for software sold by Amazon Web Services, LLC, please contact AWS Customer Service."),
                        new Term()
                                .type("ValidityTerm")
                                .agreementStartDate("2021-08-01")
                                .agreementDuration("P30D"),
                        new Term()
                                .type("ValidityTerm")
                                .agreementStartDate("2021-08-01")
                                .agreementEndDate("2022-08-01")));

        assertEquals(expectedDetail, actualDetail);
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
        UpdateInformationChangeDetail detail = OfferConverter.convertToUpdateInformationChangeDetail(
                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.UpdateInformationChangeDetail()
                        .name("Updated Offer Name")
                        .description("Updated offer description")
                        .preExistingAgreement(new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.PreExistingAgreement()
                                .acquisitionChannel(com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.AcquisitionChannel.AWS_MARKETPLACE)
                                .pricingModel(com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.PricingModel.FREE)));

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
        List<Object> terms = Collections.singletonList(
                new LegalTerm()
                        .type(LegalTermType.LEGAL_TERM)
                        .documents(Collections.singletonList(
                                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.DocumentItem()
                                        .type(LegalDocumentType.STANDARD_EULA)
                                        .version(LegalDocumentVersion._2019_04_24))));

        UpdateLegalTermsChangeDetail detail = new UpdateLegalTermsChangeDetail()
                .terms(terms.stream().map(OfferConverter::convertToTerm).collect(Collectors.toList()));

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
        List<Object> terms = Collections.singletonList(
                new LegalTerm()
                        .type(LegalTermType.LEGAL_TERM)
                        .documents(Collections.singletonList(
                                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.DocumentItem()
                                        .type(LegalDocumentType.CUSTOM_EULA)
                                        .url("https://s3.amazonaws.com/offer"))));

        UpdateLegalTermsChangeDetail detail = new UpdateLegalTermsChangeDetail()
                .terms(terms.stream().map(OfferConverter::convertToTerm).collect(Collectors.toList()));

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
                .terms(Collections.singletonList(OfferConverter.convertToTerm(
                        new SupportTerm()
                                .type(SupportTermType.SUPPORT_TERM)
                                .refundPolicy("refund policy"))));

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
        List<Object> terms = Arrays.asList(
                new ByolPricingTerm()
                        .type(ByolPricingTermType.BYOL_PRICING_TERM),
                new FreeTrialPricingTerm()
                        .type(FreeTrialPricingTermType.FREE_TRIAL_PRICING_TERM)
                        .duration("P30D")
                        .grants(Arrays.asList(
                                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.GrantItem()
                                        .dimensionKey("m3.xlarge")
                                        .maxQuantity(20),
                                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.GrantItem()
                                        .dimensionKey("m4.xlarge")
                                        .maxQuantity(10))),
                new UsageBasedPricingTerm()
                        .type(UsageBasedPricingTermType.USAGE_BASED_PRICING_TERM)
                        .currencyCode(CurrencyCode.USD)
                        .rateCards(Collections.singletonList(
                                new UsageBasedRateCardItem()
                                        .rateCard(Arrays.asList(
                                                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.RateCardItem()
                                                        .dimensionKey("m3.large")
                                                        .price("0.10123"),
                                                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.RateCardItem()
                                                        .dimensionKey("m4.xlarge")
                                                        .price("0.20"))))),
                new ConfigurableUpfrontPricingTerm()
                        .type(ConfigurableUpfrontPricingTermType.CONFIGURABLE_UPFRONT_PRICING_TERM_TYPE)
                        .currencyCode(CurrencyCode.USD)
                        .rateCards(Collections.singletonList(
                                new ConfigurableUpfrontRateCardItem()
                                        .selector(new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.Selector()
                                                .type(SelectorType.DURATION)
                                                .value("P12M"))
                                        .constraints(new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.Constraints()
                                                .multipleDimensionSelection(Constraint.ALLOWED)
                                                .quantityConfiguration(Constraint.ALLOWED))
                                        .rateCard(Arrays.asList(
                                                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.RateCardItem()
                                                        .dimensionKey("m3.large")
                                                        .price("300.00"),
                                                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.RateCardItem()
                                                        .dimensionKey("m4.xlarge")
                                                        .price("400.00"))))),
                new FixedUpfrontPricingTerm()
                        .type(FixedUpfrontPricingTermType.FIXED_UPFRONT_PRICING_TERM)
                        .currencyCode(CurrencyCode.USD)
                        .duration("P180D")
                        .price("200.00")
                        .grants(Collections.singletonList(
                                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.GrantItem()
                                .dimensionKey("Users")
                                .maxQuantity(10))),
                new RecurringPaymentTerm()
                        .type(RecurringPaymentTermType.RECURRING_PAYMENT_TERM)
                        .currencyCode(CurrencyCode.USD)
                        .price("10.00")
                        .billingPeriod(BillingPeriod.MONTHLY));

        UpdatePricingTermsChangeDetail detail = new UpdatePricingTermsChangeDetail()
                .pricingModel(PricingModel.CONTRACT)
                .terms(terms.stream().map(OfferConverter::convertToTerm).collect(Collectors.toList()));

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
        List<Object> terms = Collections.singletonList(
                new CustomerVerificationTerm()
                        .type(CustomerVerificationTermType.CUSTOMER_VERIFICATION_TERM)
                        .approvalStrategy(ApprovalStrategy.AUTO_APPROVE_ON_EXPIRATION)
                        .expirationDuration("P22D"));

        UpdateCustomerVerificationTermsChangeDetail detail = new UpdateCustomerVerificationTermsChangeDetail()
                .terms(terms.stream().map(OfferConverter::convertToTerm).collect(Collectors.toList()));

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
        List<Object> terms = Collections.singletonList(
                new PaymentScheduleTerm()
                        .type(PaymentScheduleTermType.PAYMENT_SCHEDULE_TERM_TYPE)
                        .currencyCode(CurrencyCode.USD)
                        .schedule(Arrays.asList(
                                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.ScheduleItem()
                                        .chargeDate("2020-12-01")
                                        .chargeAmount("1000.00"),
                                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.ScheduleItem()
                                        .chargeDate("2021-06-15")
                                        .chargeAmount("1250.00"))));

        UpdatePaymentScheduleTermsChangeDetail detail = new UpdatePaymentScheduleTermsChangeDetail()
        .terms(terms.stream().map(OfferConverter::convertToTerm).collect(Collectors.toList()));

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
        List<Object> terms = Collections.singletonList(
                new RenewalTerm()
                        .type(RenewalTermType.RENEWAL_TERM));

        UpdateRenewalTermsChangeDetail detail = new UpdateRenewalTermsChangeDetail()
                .terms(terms.stream().map(OfferConverter::convertToTerm).collect(Collectors.toList()));

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
        List<Object> terms = Collections.singletonList(
                new ValidityTerm()
                        .type(ValidityTermType.VALIDITY_TERM)
                        .agreementStartDate("2021-08-01")
                        .agreementDuration("P30D"));

        UpdateValidityTermsChangeDetail detail = new UpdateValidityTermsChangeDetail()
                .terms(terms.stream().map(OfferConverter::convertToTerm).collect(Collectors.toList()));


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
        List<Object> terms = Collections.singletonList(
                new ValidityTerm()
                        .type(ValidityTermType.VALIDITY_TERM)
                        .agreementStartDate("2021-08-01")
                        .agreementEndDate("2022-08-01"));

        UpdateValidityTermsChangeDetail detail = new UpdateValidityTermsChangeDetail()
                .terms(terms.stream().map(OfferConverter::convertToTerm).collect(Collectors.toList()));

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
