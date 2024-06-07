package com.amazonaws.services.marketplacecatalog.utils;

import com.amazonaws.services.marketplacecatalog.model.offer_1_0.Term;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.DocumentItem;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.PreExistingAgreement;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.UpdateInformationChangeDetail;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.AcquisitionChannel;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.LegalDocumentType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.LegalDocumentVersion;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.LegalTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.LegalTermType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.PricingModel;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OfferConverterTests {
    @Test
    public void testConvertToTerm() {
        LegalTerm term = new LegalTerm()
                .type(LegalTermType.LEGAL_TERM)
                .documents(Collections.singletonList(
                        new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.DocumentItem()
                                .type(LegalDocumentType.STANDARD_EULA)
                                .version(LegalDocumentVersion._2019_04_24)));

        Term actualTerm = OfferConverter.convertToTerm(term);

        Term expectedTerm = new Term()
                .type("LegalTerm")
                .documents(Collections.singletonList(new DocumentItem()
                        .type("StandardEula")
                        .version("2019-04-24")));

        assertEquals(expectedTerm, actualTerm);
    }

    @Test
    public void testInvalidStringConvertToTerm() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Term term = OfferConverter.convertToTerm("test");
        });
    }

    @Test
    public void testInvalidObjectConvertToTerm() {
        com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.UpdateInformationChangeDetail detail =
                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.UpdateInformationChangeDetail()
                        .name("Updated Name")
                        .description("Updated description")
                        .preExistingAgreement(new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.PreExistingAgreement()
                                .acquisitionChannel(AcquisitionChannel.AWS_MARKETPLACE)
                                .pricingModel(PricingModel.FREE));

        Exception exception = assertThrows(RuntimeException.class, () -> {
            Term term = OfferConverter.convertToTerm(detail);
        });
    }

    @Test
    public void testConvertToUpdateInformationChangeDetail() {
        com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.UpdateInformationChangeDetail detail =
                new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.UpdateInformationChangeDetail()
                        .name("Updated Name")
                        .description("Updated description")
                        .preExistingAgreement(new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.PreExistingAgreement()
                                .acquisitionChannel(AcquisitionChannel.AWS_MARKETPLACE)
                                .pricingModel(PricingModel.FREE));

        UpdateInformationChangeDetail actualDetail = OfferConverter.convertToUpdateInformationChangeDetail(detail);

        UpdateInformationChangeDetail expectedDetail = new UpdateInformationChangeDetail()
                .name("Updated Name")
                .description("Updated description")
                        .preExistingAgreement(new PreExistingAgreement()
                                .acquisitionChannel("AwsMarketplace")
                                .pricingModel("Free"));

        assertEquals(expectedDetail, actualDetail);
    }

    @Test
    public void testInvalidStringConvertToUpdateInformationChangeDetail() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            UpdateInformationChangeDetail detail = OfferConverter.convertToUpdateInformationChangeDetail("test");
        });
    }

    @Test
    public void testInvalidObjectConvertToUpdateInformationChangeDetail() {
        LegalTerm term = new LegalTerm()
                .documents(Collections.singletonList(
                        new com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.DocumentItem()
                                .type(LegalDocumentType.STANDARD_EULA)
                                .version(LegalDocumentVersion._2019_04_24)));

        Exception exception = assertThrows(RuntimeException.class, () -> {
            UpdateInformationChangeDetail detail = OfferConverter.convertToUpdateInformationChangeDetail(term);
        });
    }
}
