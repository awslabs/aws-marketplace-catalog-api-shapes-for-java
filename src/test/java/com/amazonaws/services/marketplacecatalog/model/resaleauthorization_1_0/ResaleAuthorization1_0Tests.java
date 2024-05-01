package com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0;

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

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResaleAuthorization1_0Tests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testResaleAuthorizationEntityDetail() throws Exception {
        String json = "{\n" +
                "  \"Name\": \"CanaryTestOpportunityBackFillCustomDimension\",\n" +
                "  \"Description\": \"Canary test description\",\n" +
                "  \"ProductId\": \"b199549a-6c5d-49a0-8217-607972c6f4f9\",\n" +
                "  \"ProductName\": \"Channel CAPI Integ Test Product (SaaS CCP)\",\n" +
                "  \"Status\": \"Active\",\n" +
                "  \"PreExistingBuyerAgreement\": {\n" +
                "    \"AcquisitionChannel\": \"Unknown\",\n" +
                "    \"PricingModel\": \"Unknown\"\n" +
                "  },\n" +
                "  \"Dimensions\": [{\n" +
                "    \"Name\": \"Protected Resources\",\n" +
                "    \"Description\": \"Additional 100 protected resources\",\n" +
                "    \"Key\": \"hundredresources\",\n" +
                "    \"Unit\": \"Units\",\n" +
                "    \"Types\": [\"Entitled\"]\n" +
                "  }, {\n" +
                "    \"Name\": \"Scanned Data\",\n" +
                "    \"Description\": \"Additional 10TB of Data Scanned\",\n" +
                "    \"Key\": \"tenTBData\",\n" +
                "    \"Unit\": \"Units\",\n" +
                "    \"Types\": [\"Entitled\"]\n" +
                "  }, {\n" +
                "    \"Name\": \"Number of protected resources beyond contract subscription - Monthly\",\n" +
                "    \"Description\": \"Number of protected resources beyond contract subscription - Monthly\",\n" +
                "    \"Key\": \"resource_number\",\n" +
                "    \"Unit\": \"Units\",\n" +
                "    \"Types\": [\"Metered\", \"ExternallyMetered\"]\n" +
                "  }, {\n" +
                "    \"Name\": \"Gigabytes of data scanned for malware beyond contract subscription\",\n" +
                "    \"Description\": \"Gigabytes of data scanned for malware beyond contract subscription\",\n" +
                "    \"Key\": \"scanned_data\",\n" +
                "    \"Unit\": \"Units\",\n" +
                "    \"Types\": [\"Metered\", \"ExternallyMetered\"]\n" +
                "  }, {\n" +
                "    \"Name\": \"Channel Custom Dimension\",\n" +
                "    \"Description\": \"Channel Custom Dimension\",\n" +
                "    \"Key\": \"channel_custom\",\n" +
                "    \"Unit\": \"Units\",\n" +
                "    \"Types\": [\"Entitled\"]\n" +
                "  }],\n" +
                "  \"OfferDetails\": {\n" +
                "    \"OfferExtendedStatus\": \"Not Started\",\n" +
                "    \"OfferCreatedCount\": 0\n" +
                "  },\n" +
                "  \"Terms\": [{\n" +
                "    \"Type\": \"ResaleUsageBasedPricingTerm\",\n" +
                "    \"Id\": \"term_id_placeholder\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"RateCards\": [{\n" +
                "      \"RateCard\": [{\n" +
                "        \"DimensionKey\": \"resource_number\",\n" +
                "        \"Price\": \"0.05\"\n" +
                "      },{\n" +
                "        \"DimensionKey\": \"scanned_data\",\n" +
                "        \"Price\": \"0.05\"\n" +
                "      }]\n" +
                "    }]\n" +
                "  },{\n" +
                "    \"Type\": \"ResaleConfigurableUpfrontPricingTerm\",\n" +
                "    \"Id\": \"term_id_placeholder\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"RateCards\": [{\n" +
                "      \"Selector\": {\n" +
                "        \"Type\": \"Duration\",\n" +
                "        \"Value\": \"P24M\"\n" +
                "      },\n" +
                "      \"RateCard\": [{\n" +
                "        \"DimensionKey\": \"hundredresources\",\n" +
                "        \"Price\": \"0.04\"\n" +
                "      }, {\n" +
                "        \"DimensionKey\": \"tenTBData\",\n" +
                "        \"Price\": \"0.03\"\n" +
                "      }, {\n" +
                "        \"DimensionKey\": \"channel_custom\",\n" +
                "        \"Price\": \"0.02\"\n" +
                "      }],\n" +
                "      \"Constraints\": {\n" +
                "        \"MultipleDimensionSelection\": \"Allowed\",\n" +
                "        \"QuantityConfiguration\": \"Allowed\"\n" +
                "      }\n" +
                "    }]\n" +
                "  }, {\n" +
                "    \"Type\": \"ResaleFixedUpfrontPricingTerm\",\n" +
                "    \"Id\": \"term-sdh27fb2\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"Duration\": \"P180D\",\n" +
                "    \"Price\": \"0.0\",\n" +
                "    \"Grants\": [{\n" +
                "      \"DimensionKey\": \"sdf73rbns93nl120d10xm1\",\n" +
                "      \"MaxQuantity\": 1\n" +
                "    }]\n" +
                "  }, {\n" +
                "    \"Type\": \"ResalePaymentScheduleTerm\",\n" +
                "    \"Id\": \"term-sdh27fb2\",\n" +
                "    \"CurrencyCode\": \"USD\",\n" +
                "    \"Schedule\": [{\n" +
                "      \"ChargeDate\": \"2018-07-01T00:00:00.000Z\",\n" +
                "      \"ChargeAmount\": \"200.00\"\n" +
                "    }, {\n" +
                "      \"ChargeDate\": \"2019-05-01T00:00:00.000Z\",\n" +
                "      \"ChargeAmount\": \"200.00\"\n" +
                "    }]\n" +
                "  }, {\n" +
                "    \"Type\": \"BuyerLegalTerm\",\n" +
                "    \"Id\": \"term_id_placeholder\",\n" +
                "    \"Documents\": [{\n" +
                "      \"Type\": \"StandardEula\",\n" +
                "      \"Url\": \"https://amazon.com\"\n" +
                "    }]\n" +
                "  }, {\n" +
                "    \"Type\": \"ResaleLegalTerm\",\n" +
                "    \"Id\": \"term_id_placeholder\",\n" +
                "    \"Documents\": [{\n" +
                "      \"Type\": \"StandardResellerContract\",\n" +
                "      \"Url\": \"https://amazon.com\"\n" +
                "    }]\n" +
                "  }, {\n" +
                "    \"Type\": \"BuyerValidityTerm\",\n" +
                "    \"Id\": \"term_id_placeholder\",\n" +
                "    \"MaximumAgreementStartDate\": \"2023-09-25T23:59:59.000Z\"\n" +
                "  }, {\n" +
                "    \"Type\": \"BuyerTargetingTerm\",\n" +
                "    \"Id\": \"term_id_placeholder\",\n" +
                "    \"PositiveTargeting\": {\n" +
                "      \"BuyerAccounts\": [{\n" +
                "        \"AwsAccountId\": \"123456789123\",\n" +
                "        \"LegalName\": \"Buyer Account\"\n" +
                "      }]\n" +
                "    }\n" +
                "  }],\n" +
                "  \"Rules\": [{\n" +
                "    \"Type\": \"AvailabilityRule\",\n" +
                "    \"Id\": \"availability_rule_id_placeholder\",\n" +
                "    \"Usage\": \"Limited\",\n" +
                "    \"AvailabilityEndDate\": \"2022-05-31T00:00:00Z\",\n" +
                "    \"OffersMaxQuantity\": 1\n" +
                "  }, {\n" +
                "    \"Type\": \"PartnerTargetingRule\",\n" +
                "    \"Id\": \"partner_targeting_rule_id_placeholder\",\n" +
                "    \"ResellerAccountId\": \"123456789123\",\n" +
                "    \"ResellerLegalName\": \"ChannelCAPICP.Inc\"\n" +
                "  }],\n" +
                "  \"CreatedDate\": \"2023-09-12T14:15:02.000Z\",\n" +
                "  \"ManufacturerLegalName\": \"ChannelCAPI.Inc\",\n" +
                "  \"ManufacturerAccountId\": \"123456789123\"\n" +
                "}";

        ResaleAuthorizationEntityDetail actualDetail = mapper.readValue(json, ResaleAuthorizationEntityDetail.class);

        ResaleAuthorizationEntityDetail expectedDetail = new ResaleAuthorizationEntityDetail()
                .name("CanaryTestOpportunityBackFillCustomDimension")
                .description("Canary test description")
                .productId("b199549a-6c5d-49a0-8217-607972c6f4f9")
                .productName("Channel CAPI Integ Test Product (SaaS CCP)")
                .status("Active")
                .preExistingBuyerAgreement(new EntityPreExistingBuyerAgreement()
                        .acquisitionChannel("Unknown")
                        .pricingModel("Unknown"))
                .dimensions(Arrays.asList(
                        new Dimension()
                                .name("Protected Resources")
                                .description("Additional 100 protected resources")
                                .key("hundredresources")
                                .unit("Units")
                                .types(Collections.singletonList("Entitled")),
                        new Dimension()
                                .name("Scanned Data")
                                .description("Additional 10TB of Data Scanned")
                                .key("tenTBData")
                                .unit("Units")
                                .types(Collections.singletonList("Entitled")),
                        new Dimension()
                                .name("Number of protected resources beyond contract subscription - Monthly")
                                .description("Number of protected resources beyond contract subscription - Monthly")
                                .key("resource_number")
                                .unit("Units")
                                .types(Arrays.asList("Metered", "ExternallyMetered")),
                        new Dimension()
                                .name("Gigabytes of data scanned for malware beyond contract subscription")
                                .description("Gigabytes of data scanned for malware beyond contract subscription")
                                .key("scanned_data")
                                .unit("Units")
                                .types(Arrays.asList("Metered", "ExternallyMetered")),
                        new Dimension()
                                .name("Channel Custom Dimension")
                                .description("Channel Custom Dimension")
                                .key("channel_custom")
                                .unit("Units")
                                .types(Collections.singletonList("Entitled"))))
                .offerDetails(new OfferDetails()
                        .offerExtendedStatus("Not Started")
                        .offerCreatedCount(0))
                .terms(Arrays.asList(
                        new Term()
                                .type("ResaleUsageBasedPricingTerm")
                                .id("term_id_placeholder")
                                .currencyCode("USD")
                                .rateCards(Collections.singletonList(new EntityRateCardsMember()
                                        .rateCard(Arrays.asList(
                                                new EntityRateCardMember()
                                                        .dimensionKey("resource_number")
                                                        .price("0.05"),
                                                new EntityRateCardMember()
                                                        .dimensionKey("scanned_data")
                                                        .price("0.05"))))),
                        new Term()
                                .type("ResaleConfigurableUpfrontPricingTerm")
                                .id("term_id_placeholder")
                                .currencyCode("USD")
                                .rateCards(Collections.singletonList(new EntityRateCardsMember()
                                        .selector(new EntitySelector()
                                                .type("Duration")
                                                .value("P24M"))
                                        .rateCard(Arrays.asList(
                                                new EntityRateCardMember()
                                                        .dimensionKey("hundredresources")
                                                        .price("0.04"),
                                                new EntityRateCardMember()
                                                        .dimensionKey("tenTBData")
                                                        .price("0.03"),
                                                new EntityRateCardMember()
                                                        .dimensionKey("channel_custom")
                                                        .price("0.02")))
                                        .constraints(new EntityConstraints()
                                                .multipleDimensionSelection("Allowed")
                                                .quantityConfiguration("Allowed")))),
                        new Term()
                                .type("ResaleFixedUpfrontPricingTerm")
                                .id("term-sdh27fb2")
                                .currencyCode("USD")
                                .duration("P180D")
                                .price("0.0")
                                .grants(Collections.singletonList(new EntityGrant()
                                        .dimensionKey("sdf73rbns93nl120d10xm1")
                                        .maxQuantity(1))),
                        new Term()
                                .type("ResalePaymentScheduleTerm")
                                .id("term-sdh27fb2")
                                .currencyCode("USD")
                                .schedule(Arrays.asList(
                                        new EntitySchedule()
                                                .chargeDate("2018-07-01T00:00:00.000Z")
                                                .chargeAmount("200.00"),
                                        new EntitySchedule()
                                                .chargeDate("2019-05-01T00:00:00.000Z")
                                                .chargeAmount("200.00"))),
                        new Term()
                                .type("BuyerLegalTerm")
                                .id("term_id_placeholder")
                                .documents(Collections.singletonList(new EntityDocument()
                                        .type("StandardEula")
                                        .url("https://amazon.com"))),
                        new Term()
                                .type("ResaleLegalTerm")
                                .id("term_id_placeholder")
                                .documents(Collections.singletonList(new EntityDocument()
                                        .type("StandardResellerContract")
                                        .url("https://amazon.com"))),
                        new Term()
                                .type("BuyerValidityTerm")
                                .id("term_id_placeholder")
                                .maximumAgreementStartDate("2023-09-25T23:59:59.000Z"),
                        new Term()
                                .type("BuyerTargetingTerm")
                                .id("term_id_placeholder")
                                .positiveTargeting(new EntityPositiveTargeting()
                                        .buyerAccounts(Collections.singletonList(new EntityBuyerAccount()
                                                .awsAccountId("123456789123")
                                                .legalName("Buyer Account"))))))
                .rules(Arrays.asList(
                       new Rule()
                               .type("AvailabilityRule")
                               .id("availability_rule_id_placeholder")
                               .usage("Limited")
                               .availabilityEndDate("2022-05-31T00:00:00Z")
                               .offersMaxQuantity(1),
                        new Rule()
                                .type("PartnerTargetingRule")
                                .id("partner_targeting_rule_id_placeholder")
                                .resellerAccountId("123456789123")
                                .resellerLegalName("ChannelCAPICP.Inc")))
                .createdDate("2023-09-12T14:15:02.000Z")
                .manufacturerLegalName("ChannelCAPI.Inc")
                .manufacturerAccountId("123456789123");

        String actualJson = mapper.writeValueAsString(expectedDetail);

        assertEquals(expectedDetail, actualDetail);
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
                                .currencyCode(CurrencyCodeUSDOnly.USD)
                                .rateCards(Collections.singletonList(
                                        new RateCardsMember()
                                                .rateCard(Arrays.asList(
                                                        new RateCardMember()
                                                                .dimensionKey("m3.large")
                                                                .price("0.10"),
                                                        new RateCardMember()
                                                                .dimensionKey("m4.xlarge")
                                                                .price("0.20"))))),
                        new PricingTerm()
                                .type(PricingTermType.RESALE_CONFIGURABLE_UPFRONT_PRICING_TERM)
                                .currencyCode(CurrencyCodeUSDOnly.USD)
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
                                                                .price("300"),
                                                        new RateCardMember()
                                                                .dimensionKey("m4.xlarge")
                                                                .price("400"))))),
                        new PricingTerm()
                                .type(PricingTermType.RESALE_FIXED_UPFRONT_PRICING_TERM)
                                .currencyCode(CurrencyCodeUSDOnly.USD)
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
                        .currencyCode(CurrencyCodeUSDOnly.USD)
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
