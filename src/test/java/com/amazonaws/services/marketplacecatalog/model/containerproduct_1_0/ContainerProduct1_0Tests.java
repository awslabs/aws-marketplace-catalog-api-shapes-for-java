package com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.util.Arrays;
import java.util.Collections;

public class ContainerProduct1_0Tests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testCreateProductChangeDetail() throws Exception {
        CreateProductChangeDetail detail = new CreateProductChangeDetail()
                .productTitle("MyProductTitle");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"ProductTitle\": \"MyProductTitle\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateDeliveryOptionsChangeDetail() throws Exception {
        UpdateDeliveryOptionsChangeDetail detail = new UpdateDeliveryOptionsChangeDetail()
                .version(new UpdateVersion().releaseNotes("Release notes"))
                .deliveryOptions(Collections.singletonList(new UpdateDeliveryOption()
                        .id("00000000-0000-0000-0000-000000000000")
                        .details(new UpdateDetails()
                                .amiDeliveryOptionDetails(new UpdateAmiDeliveryOptionDetails()
                                        .usageInstructions("instructions")
                                        .recommendedInstanceType("m4.2xlarge")
                                        .accessEndpointUrl(new AccessEndpointUrl()
                                                .port(8443)
                                                .protocol("https")
                                                .relativePath("/index.html"))
                                        .securityGroups(Collections.singletonList(new SecurityGroup()
                                                .ipProtocol("tcp")
                                                .fromPort(443)
                                                .toPort(443)
                                                .ipRanges(Collections.singletonList("0.0.0.0/0"))))
                                ))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Version\": {\n" +
                "    \"ReleaseNotes\":  \"Release notes\"\n" +
                "  },\n" +
                "  \"DeliveryOptions\": [{\n" +
                "    \"Id\":  \"00000000-0000-0000-0000-000000000000\",\n" +
                "    \"Details\":  {\n" +
                "      \"AmiDeliveryOptionDetails\":  {\n" +
                "        \"UsageInstructions\": \"instructions\",\n" +
                "        \"AccessEndpointUrl\": {\n" +
                "          \"Port\": 8443,\n" +
                "          \"Protocol\": \"https\",\n" +
                "          \"RelativePath\": \"/index.html\"\n" +
                "        },\n" +
                "        \"RecommendedInstanceType\": \"m4.2xlarge\",\n" +
                "        \"SecurityGroups\": [{\n" +
                "          \"FromPort\": 443,\n" +
                "          \"IpProtocol\": \"tcp\",\n" +
                "          \"IpRanges\": [\"0.0.0.0/0\"],\n" +
                "          \"ToPort\": 443\n" +
                "        }]\n" +
                "      }\n" +
                "    }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAddDeliveryOptionsChangeDetail() throws Exception {
       AddDeliveryOptionsChangeDetail detail = new AddDeliveryOptionsChangeDetail()
               .version(new AddVersion()
                       .versionTitle("Version title")
                       .releaseNotes(("Release notes")))
               .deliveryOptions(Arrays.asList(new AddDeliveryOption()
                       .details(new AddDetails()
                               .amiDeliveryOptionDetails(new AddAmiDeliveryOptionDetails()
                                       .amiSource(new AmiSource()
                                               .amiId("ami-086d874dcc2f96d24")
                                               .accessRoleArn("arn:aws:iam::123456789012:role/myRole")
                                               .userName("username")
                                               .operatingSystemName("Windows")
                                               .operatingSystemVersion("10.5")
                                               .scanningPort(22))
                                       .usageInstructions("instructions")
                                       .recommendedInstanceType("m4.2xlarge")
                                       .accessEndpointUrl(new AccessEndpointUrl()
                                               .port(8443)
                                               .protocol("https")
                                               .relativePath("/index.html"))
                                       .securityGroups(Collections.singletonList(new SecurityGroup()
                                               .ipProtocol("tcp")
                                               .fromPort(443)
                                               .toPort(443)
                                               .ipRanges(Collections.singletonList("0.0.0.0/0"))))))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Version\": {\n" +
                "    \"VersionTitle\":  \"Version title\",\n" +
                "    \"ReleaseNotes\":  \"Release notes\"\n" +
                "  },\n" +
                "  \"DeliveryOptions\": [{\n" +
                "    \"Details\":  {\n" +
                "      \"AmiDeliveryOptionDetails\":  {\n" +
                "        \"AmiSource\": {\n" +
                "          \"AmiId\": \"ami-086d874dcc2f96d24\",\n" +
                "          \"AccessRoleArn\": \"arn:aws:iam::123456789012:role/myRole\",\n" +
                "          \"UserName\": \"username\",\n" +
                "          \"ScanningPort\": 22,\n" +
                "          \"OperatingSystemName\": \"Windows\",\n" +
                "          \"OperatingSystemVersion\": \"10.5\"\n" +
                "        },\n" +
                "        \"UsageInstructions\": \"instructions\",\n" +
                "        \"AccessEndpointUrl\": {\n" +
                "          \"Port\": 8443,\n" +
                "          \"Protocol\": \"https\",\n" +
                "          \"RelativePath\": \"/index.html\"\n" +
                "        },\n" +
                "        \"RecommendedInstanceType\": \"m4.2xlarge\",\n" +
                "        \"SecurityGroups\": [{\n" +
                "          \"FromPort\": 443,\n" +
                "          \"IpProtocol\": \"tcp\",\n" +
                "          \"IpRanges\":  [\"0.0.0.0/0\"],\n" +
                "          \"ToPort\": 443\n" +
                "        }]\n" +
                "      }\n" +
                "    }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testRestrictDeliveryOptionsChangeDetail() throws Exception {
        RestrictDeliveryOptionsChangeDetail detail = new RestrictDeliveryOptionsChangeDetail()
                .deliveryOptionIds(Collections.singletonList("00000000-0000-0000-0000-000000000000"));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptionIds\": [\"00000000-0000-0000-0000-000000000000\"]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateDeliveryOptionsVisibilityChangeDetail() throws Exception {
        UpdateDeliveryOptionsVisibilityChangeDetail detail = new UpdateDeliveryOptionsVisibilityChangeDetail()
                .deliveryOptions(Collections.singletonList(new UpdateDeliveryOptionVisibility()
                        .id("00000000-0000-0000-0000-000000000000")
                        .targetVisibility(UpdateDeliveryOptionsTargetVisibility.PUBLIC)));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptions\": [{\n" +
                "    \"Id\": \"00000000-0000-0000-0000-000000000000\",\n" +
                "    \"TargetVisibility\": \"Public\"\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateInformationChangeDetail() throws Exception {
        UpdateInformationChangeDetail detail = new UpdateInformationChangeDetail()
                .productTitle("MyProductTitle")
                .shortDescription("My Product")
                .longDescription("My Product long description")
                .sku("SKU")
                .logoUrl("https://s3.amazonaws.com/awsmp-logos/logo.png")
                .videoUrls(Collections.singletonList("https://s3.amazonaws.com/awsmp-media/video.mp4"))
                .highlights(Collections.singletonList("Highlight"))
                .additionalResources(Collections.singletonList(new AdditionalResource()
                        .text("url")
                        .url("https://amazon.com")))
                .supportDescription("Support description")
                .categories(Arrays.asList("Operating Systems", "Network Infrastructure", "Application Development"))
                .searchKeywords(Arrays.asList("example", "keywords"));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"ProductTitle\": \"MyProductTitle\",\n" +
                "  \"ShortDescription\": \"My Product\",\n" +
                "  \"LongDescription\": \"My Product long description\",\n" +
                "  \"Sku\": \"SKU\",\n" +
                "  \"LogoUrl\": \"https://s3.amazonaws.com/awsmp-logos/logo.png\",\n" +
                "  \"VideoUrls\": [\"https://s3.amazonaws.com/awsmp-media/video.mp4\"],\n" +
                "  \"Highlights\": [\"Highlight\"],\n" +
                "  \"AdditionalResources\": [{\n" +
                "      \"Text\": \"url\",\n" +
                "      \"Url\": \"https://amazon.com\"\n" +
                "  }],\n" +
                "  \"SupportDescription\": \"Support description\",\n" +
                "  \"Categories\": [\"Operating Systems\", \"Network Infrastructure\", \"Application Development\"],\n" +
                "  \"SearchKeywords\": [\"example\", \"keywords\"]\n" +
                "}";


        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAddRepositoriesChangeDetail() throws Exception {
        AddRepositoriesChangeDetail detail = new AddRepositoriesChangeDetail()
                .repositories(Collections.singletonList(new Repository()
                        .repositoryName("MyRepositoryName")
                        .repositoryType("ECR")));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Repositories\": [{\n" +
                "    \"RepositoryName\": \"MyRepositoryName\",\n" +
                "    \"RepositoryType\": \"ECR\"\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAddDimensionChangeDetail() throws Exception {
        AddDimensionChangeDetail detail = new AddDimensionChangeDetail()
                .name("Course Fee")
                .description("Course Fee Description")
                .key("Premium")
                .unit("UnitHrs")
                .types(Collections.singletonList(DimensionType.ENTITLED));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"Course Fee\",\n" +
                "  \"Description\": \"Course Fee Description\",\n" +
                "  \"Key\": \"Premium\",\n" +
                "  \"Unit\": \"UnitHrs\",\n" +
                "  \"Types\": [\"Entitled\"]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateDimensionChangeDetail() throws Exception {
        UpdateDimensionChangeDetail detail = new UpdateDimensionChangeDetail()
                .name("Updated Course Fee")
                .description("Updated Course Fee Description")
                .key("CourseFee")
                .types(Collections.singletonList(DimensionType.EXTERNALLY_METERED));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Name\": \"Updated Course Fee\",\n" +
                "  \"Description\": \"Updated Course Fee Description\",\n" +
                "  \"Key\": \"CourseFee\",\n" +
                "  \"Types\": [\"ExternallyMetered\"]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateTargetingChangeDetail() throws Exception {
        UpdateTargetingChangeDetail detail = new UpdateTargetingChangeDetail()
                .positiveTargeting(new PositiveTargeting()
                        .buyerAccounts(Arrays.asList("123456789012", "098765432112")));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"PositiveTargeting\": {\n" +
                "    \"BuyerAccounts\": [\"123456789012\", \"098765432112\"]\n" +
                "  }\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateVisibilityChangeDetail() throws Exception {
        UpdateVisibilityChangeDetail detail = new UpdateVisibilityChangeDetail()
                .targetVisibility(TargetVisibility.PUBLIC)
                .replacementProductId("prod-1234567890123");

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"TargetVisibility\": \"Public\",\n" +
                "  \"ReplacementProductId\": \"prod-1234567890123\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testReleaseProductChangeDetail() throws Exception {
        ReleaseProductChangeDetail detail = new ReleaseProductChangeDetail();

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }
}
