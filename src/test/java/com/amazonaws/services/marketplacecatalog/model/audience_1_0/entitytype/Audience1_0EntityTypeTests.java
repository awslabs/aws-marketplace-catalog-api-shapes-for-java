package com.amazonaws.services.marketplacecatalog.model.audience_1_0.entitytype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Audience1_0EntityTypeTests {

    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testAudienceEntityDetail() throws Exception {
        String json = "{\n" +
                "  \"Name\": \"Audience for Experience exp-123ab4567\",\n" +
                "  \"Description\": \"This Audience is used for a test.\",\n" +
                "  \"Principals\": [\"o-orgidfortesting\", \"ou-123abc-12345abcde\"],\n" +
                "  \"ExperienceId\": \"exp-123ab4567\"\n" +
                "}";

        AudienceEntityDetail actualDetail = mapper.readValue(json, AudienceEntityDetail.class);

        AudienceEntityDetail expectedDetail = new AudienceEntityDetail()
                .name("Audience for Experience exp-123ab4567")
                .description("This Audience is used for a test.")
                .principals(Arrays.asList("o-orgidfortesting", "ou-123abc-12345abcde"))
                .experienceId("exp-123ab4567");

        assertEquals(expectedDetail, actualDetail);
    }
}
