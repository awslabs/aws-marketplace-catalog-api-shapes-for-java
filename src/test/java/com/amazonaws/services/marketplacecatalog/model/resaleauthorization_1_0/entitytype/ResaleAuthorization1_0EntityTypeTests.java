package com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.entitytype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResaleAuthorization1_0EntityTypeTests {
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
                .preExistingBuyerAgreement(new PreExistingBuyerAgreement()
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
                                .rateCards(Collections.singletonList(new RateCards()
                                        .rateCard(Arrays.asList(
                                                new RateCard()
                                                        .dimensionKey("resource_number")
                                                        .price("0.05"),
                                                new RateCard()
                                                        .dimensionKey("scanned_data")
                                                        .price("0.05"))))),
                        new Term()
                                .type("ResaleConfigurableUpfrontPricingTerm")
                                .id("term_id_placeholder")
                                .currencyCode("USD")
                                .rateCards(Collections.singletonList(new RateCards()
                                        .selector(new Selector()
                                                .type("Duration")
                                                .value("P24M"))
                                        .rateCard(Arrays.asList(
                                                new RateCard()
                                                        .dimensionKey("hundredresources")
                                                        .price("0.04"),
                                                new RateCard()
                                                        .dimensionKey("tenTBData")
                                                        .price("0.03"),
                                                new RateCard()
                                                        .dimensionKey("channel_custom")
                                                        .price("0.02")))
                                        .constraints(new Constraints()
                                                .multipleDimensionSelection("Allowed")
                                                .quantityConfiguration("Allowed")))),
                        new Term()
                                .type("ResaleFixedUpfrontPricingTerm")
                                .id("term-sdh27fb2")
                                .currencyCode("USD")
                                .duration("P180D")
                                .price("0.0")
                                .grants(Collections.singletonList(new Grant()
                                        .dimensionKey("sdf73rbns93nl120d10xm1")
                                        .maxQuantity(1))),
                        new Term()
                                .type("ResalePaymentScheduleTerm")
                                .id("term-sdh27fb2")
                                .currencyCode("USD")
                                .schedule(Arrays.asList(
                                        new Schedule()
                                                .chargeDate("2018-07-01T00:00:00.000Z")
                                                .chargeAmount("200.00"),
                                        new Schedule()
                                                .chargeDate("2019-05-01T00:00:00.000Z")
                                                .chargeAmount("200.00"))),
                        new Term()
                                .type("BuyerLegalTerm")
                                .id("term_id_placeholder")
                                .documents(Collections.singletonList(new Document()
                                        .type("StandardEula")
                                        .url("https://amazon.com"))),
                        new Term()
                                .type("ResaleLegalTerm")
                                .id("term_id_placeholder")
                                .documents(Collections.singletonList(new Document()
                                        .type("StandardResellerContract")
                                        .url("https://amazon.com"))),
                        new Term()
                                .type("BuyerValidityTerm")
                                .id("term_id_placeholder")
                                .maximumAgreementStartDate("2023-09-25T23:59:59.000Z"),
                        new Term()
                                .type("BuyerTargetingTerm")
                                .id("term_id_placeholder")
                                .positiveTargeting(new PositiveTargeting()
                                        .buyerAccounts(Collections.singletonList(new BuyerAccount()
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

        assertEquals(expectedDetail, actualDetail);
    }

}
