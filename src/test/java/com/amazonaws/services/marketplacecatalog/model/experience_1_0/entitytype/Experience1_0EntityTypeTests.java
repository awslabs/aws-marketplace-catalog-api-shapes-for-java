package com.amazonaws.services.marketplacecatalog.model.experience_1_0.entitytype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Experience1_0EntityTypeTests {

    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testExperienceEntityDetail() throws Exception {
        String json = "{\n" +
                "  \"Name\": \"SampleExperience\",\n" +
                "  \"Description\": \"Sample Experience\",\n" +
                "  \"Status\": \"Enabled\",\n" +
                "  \"AdminStatus\": \"Editable\",\n" +
                "  \"ProcurementPolicies\": [\"procpolicy-abcdef12345\"],\n" +
                "  \"DiscoveryPolicies\": [\"discopolicy-abcdef12345\"],\n" +
                "  \"BrandingSettings\": [\"brandsettings-abcdef12345\"],\n" +
                "  \"Integration\": \"integ-abcdefgh12345\"\n" +
                "}";

        ExperienceEntityDetail actualDetail = mapper.readValue(json, ExperienceEntityDetail.class);

        ExperienceEntityDetail expectedDetail = new ExperienceEntityDetail()
                .name("SampleExperience")
                .description("Sample Experience")
                .status("Enabled")
                .adminStatus("Editable")
                .procurementPolicies(Collections.singletonList("procpolicy-abcdef12345"))
                .discoveryPolicies(Collections.singletonList("discopolicy-abcdef12345"))
                .brandingSettings(Collections.singletonList(("brandsettings-abcdef12345")))
                .integration("integ-abcdefgh12345");

        assertEquals(expectedDetail, actualDetail);
    }
}
