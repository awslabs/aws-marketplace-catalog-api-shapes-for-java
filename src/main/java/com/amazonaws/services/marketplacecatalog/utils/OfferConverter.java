package com.amazonaws.services.marketplacecatalog.utils;

import com.amazonaws.services.marketplacecatalog.model.offer_1_0.Term;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.UpdateInformationChangeDetail;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class OfferConverter {
    private static ObjectMapper mapper = new ObjectMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);

    private OfferConverter() {}

    public static Term convertToTerm(final Object object) {
        try {
            return mapper.readValue(mapper.writeValueAsString(object), Term.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static UpdateInformationChangeDetail convertToUpdateInformationChangeDetail(final Object object) {
        try {
            return mapper.readValue(mapper.writeValueAsString(object), UpdateInformationChangeDetail.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
