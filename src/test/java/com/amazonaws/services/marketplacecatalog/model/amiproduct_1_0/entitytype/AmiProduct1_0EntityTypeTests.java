package com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.entitytype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmiProduct1_0EntityTypeTests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void testAmiProductEntityDetail() throws Exception {
        String json = "{\n" +
                "  \"Versions\": [{\n" +
                "    \"Id\": \"123abc02-0480-43b2-910e-6903901b9abc\",\n" +
                "    \"ReleaseNotes\": \"Initial Release\",\n" +
                "    \"UpgradeInstructions\": \"NA\",\n" +
                "    \"VersionTitle\": \"1\",\n" +
                "    \"CreationDate\": \"2023-03-12T00:00:00.000Z\",\n" +
                "    \"DeliveryOptions\": [{\n" +
                "      \"Id\": \"cf01e606-1c1b-3310-9315-a123456bcd99\",\n" +
                "      \"Type\": \"CloudFormationTemplate\",\n" +
                "      \"SourceId\": \"cf012b3c-6dce-32dc-84f5-12z0d56b1239\",\n" +
                "      \"Title\": \"Cloud Formation Template\",\n" +
                "      \"ShortDescription\": \"CloudFormation delivery option example\",\n" +
                "      \"LongDescription\": \"CloudFormation delivery option example long description\",\n" +
                "      \"Visibility\": \"Public\",\n" +
                "      \"Instructions\": {\n" +
                "        \"Usage\": \"Usage instructions\"\n" +
                "      }\n" +
                "    }, {\n" +
                "      \"Id\": \"ami1e606-1c1b-3310-9315-a123456bcd99\",\n" +
                "      \"Type\": \"AmazonMachineImage\",\n" +
                "      \"SourceId\": \"ami12b3c-6dce-32dc-84f5-12z0d56b1239\",\n" +
                "      \"ShortDescription\": \"AMI delivery option example\",\n" +
                "      \"Visibility\": \"Public\",\n" +
                "      \"Instructions\": {\n" +
                "        \"Usage\": \"Usage instructions\",\n" +
                "        \"Access\": {\n" +
                "          \"Type\": \"Endpoint\",\n" +
                "          \"Port\": 8443,\n" +
                "          \"Protocol\": \"https\",\n" +
                "          \"RelativePath\": \"index.html\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"Recommendations\": {\n" +
                "        \"SecurityGroups\": [{\n" +
                "          \"Protocol\": \"tcp\",\n" +
                "          \"FromPort\": 22,\n" +
                "          \"ToPort\": 22,\n" +
                "          \"CidrIps\": [\"0.0.0.0/0\"]\n" +
                "        }],\n" +
                "        \"InstanceType\": \"t2.large\"\n" +
                "      },\n" +
                "      \"Title\": \"(x86_64) Amazon Machine Image\",\n" +
                "      \"AmiAlias\": \"/aws/service/marketplace/prod-testid/2\"\n" +
                "    }],\n" +
                "    \"Sources\": [{\n" +
                "      \"Id\": \"cft85b1c-1c1b-3310-9315-a123456bcd99\",\n" +
                "      \"Type\": \"CloudFormationTemplate\",\n" +
                "      \"Template\": \"https://awsmp-ingestion-cf-templates.s3.amazonaws.com/Template\",\n" +
                "      \"NestedDocuments\": [\"Document\"],\n" +
                "      \"ConsumedSources\": [\"abcd123c-4aff-328b-85b3-0ccf1019c6e3\"],\n" +
                "      \"ArchitectureDiagram\": \"https://awsmp-ingestion-cf-templates.s3.amazonaws.com/ArchitectureDiagram\",\n" +
                "      \"AWSDependentServices\": [\"Amazon EC2\", \"Amazon EBS\"]\n" +
                "    }, {\n" +
                "      \"Id\": \"ami85b1c-1c1b-3310-9315-a123456bcd99\",\n" +
                "      \"Type\": \"AmazonMachineImage\",\n" +
                "      \"Image\": \"ami-0123449f427774b03a\",\n" +
                "      \"Architecture\": \"x86_64\",\n" +
                "      \"VirtualizationType\": \"hvm\",\n" +
                "      \"Compatibility\": {\n" +
                "        \"AvailableInstanceTypes\": [\"t2.medium\"],\n" +
                "        \"RestrictedInstanceTypes\": [\"t2.large\"]\n" +
                "      },\n" +
                "      \"OperatingSystem\": {\n" +
                "        \"Name\": \"AMAZONLINUX\",\n" +
                "        \"Version\": \"2.0\",\n" +
                "        \"Username\": \"Administrator\",\n" +
                "        \"ScanningPort\": 22\n" +
                "      }\n" +
                "    }]\n" +
                "  }],\n" +
                "  \"Description\": {\n" +
                "    \"ProductTitle\": \"AMI Test Product\",\n" +
                "    \"ProductCode\": \"9abcdefg9bw4k0zssg7thx123\",\n" +
                "    \"ShortDescription\": \"Product description\",\n" +
                "    \"Manufacturer\": \"AWS-Tester\",\n" +
                "    \"LongDescription\": \"Long product description\",\n" +
                "    \"Sku\": \"SKU\",\n" +
                "    \"Highlights\": [\"Test product\"],\n" +
                "    \"AssociatedProducts\": null,\n" +
                "    \"SearchKeywords\": [\"AWS\"],\n" +
                "    \"Visibility\": \"Limited\",\n" +
                "    \"ProductState\": \"Active\",\n" +
                "    \"Categories\": [\"Operating Systems\"]\n" +
                "  },\n" +
                "  \"Targeting\": {\n" +
                "    \"PositiveTargeting\": {\n" +
                "      \"BuyerAccounts\": [\"123456789123\"]\n" +
                "    }\n" +
                "  },\n" +
                "  \"Compatibility\": {\n" +
                "    \"AvailableInstanceTypes\": [\"t2.medium\"],\n" +
                "    \"RestrictedInstanceTypes\": [\"t2.large\"]\n" +
                "  },\n" +
                "  \"PromotionalResources\": {\n" +
                "    \"LogoUrl\": \"https://s3.amazonaws.com/awsmp-logos/logo.png\",\n" +
                "    \"Videos\": [],\n" +
                "    \"AdditionalResources\": [{\n" +
                "      \"Type\": \"Link\",\n" +
                "      \"Text\": \"Additional Resource\",\n" +
                "      \"Url\": \"amazon.com\"\n" +
                "    }],\n" +
                "    \"PromotionalMedia\": null\n" +
                "  },\n" +
                "  \"Dimensions\": [{\n" +
                "    \"Name\": \"t2.2xlarge\",\n" +
                "    \"Description\": \"description\",\n" +
                "    \"Key\": \"t2.2xlarge\",\n" +
                "    \"Unit\": \"Hrs\",\n" +
                "    \"Types\": [\"Metered\"]\n" +
                "  }],\n" +
                "  \"SupportInformation\": {\n" +
                "    \"Description\": \"Product support information\"\n" +
                "  },\n" +
                "  \"RegionAvailability\": {\n" +
                "    \"FutureRegionSupport\": null,\n" +
                "    \"Restrict\": [],\n" +
                "    \"Regions\": [\"us-east-1\"]\n" +
                "  }\n" +
                "}";

        AmiProductEntityDetail actualDetail = mapper.readValue(json, AmiProductEntityDetail.class);

        AmiProductEntityDetail expectedDetail = new AmiProductEntityDetail()
                .versions(Collections.singletonList(new Version()
                        .id("123abc02-0480-43b2-910e-6903901b9abc")
                        .releaseNotes("Initial Release")
                        .upgradeInstructions("NA")
                        .versionTitle("1")
                        .creationDate("2023-03-12T00:00:00.000Z")
                        .deliveryOptions(Arrays.asList(
                                new DeliveryOption()
                                        .id("cf01e606-1c1b-3310-9315-a123456bcd99")
                                        .type("CloudFormationTemplate")
                                        .sourceId("cf012b3c-6dce-32dc-84f5-12z0d56b1239")
                                        .title("Cloud Formation Template")
                                        .shortDescription("CloudFormation delivery option example")
                                        .longDescription("CloudFormation delivery option example long description")
                                        .visibility("Public")
                                        .instructions(new Instructions().usage("Usage instructions")),
                                new DeliveryOption()
                                        .id("ami1e606-1c1b-3310-9315-a123456bcd99")
                                        .type("AmazonMachineImage")
                                        .sourceId("ami12b3c-6dce-32dc-84f5-12z0d56b1239")
                                        .title("(x86_64) Amazon Machine Image")
                                        .shortDescription("AMI delivery option example")
                                        .visibility("Public")
                                        .instructions(new Instructions()
                                                .usage("Usage instructions")
                                                .access(new Access()
                                                        .type("Endpoint")
                                                        .port(8443)
                                                        .protocol("https")
                                                        .relativePath("index.html")))
                                        .recommendations(new Recommendations()
                                                .securityGroups(Collections.singletonList(new SecurityGroup()
                                                        .protocol("tcp")
                                                        .fromPort(22)
                                                        .toPort(22)
                                                        .cidrIps(Collections.singletonList("0.0.0.0/0"))))
                                                .instanceType("t2.large"))
                                        .amiAlias("/aws/service/marketplace/prod-testid/2")))
                        .sources(Arrays.asList(
                                new Source()
                                        .id("cft85b1c-1c1b-3310-9315-a123456bcd99")
                                        .type("CloudFormationTemplate")
                                        .template("https://awsmp-ingestion-cf-templates.s3.amazonaws.com/Template")
                                        .nestedDocuments(Collections.singletonList("Document"))
                                        .consumedSources(Collections.singletonList("abcd123c-4aff-328b-85b3-0ccf1019c6e3"))
                                        .architectureDiagram("https://awsmp-ingestion-cf-templates.s3.amazonaws.com/ArchitectureDiagram")
                                        .awsDependentServices(Arrays.asList("Amazon EC2", "Amazon EBS")),
                                new Source()
                                        .id("ami85b1c-1c1b-3310-9315-a123456bcd99")
                                        .type("AmazonMachineImage")
                                        .image("ami-0123449f427774b03a")
                                        .architecture("x86_64")
                                        .virtualizationType("hvm")
                                        .compatibility(new Compatibility()
                                                .availableInstanceTypes(Collections.singletonList("t2.medium"))
                                                .restrictedInstanceTypes(Collections.singletonList("t2.large")))
                                        .operatingSystem(new OperatingSystem()
                                                .name("AMAZONLINUX")
                                                .version("2.0")
                                                .username("Administrator")
                                                .scanningPort(22))))))
                .description(new Description()
                        .productTitle("AMI Test Product")
                        .productCode("9abcdefg9bw4k0zssg7thx123")
                        .shortDescription("Product description")
                        .manufacturer("AWS-Tester")
                        .longDescription("Long product description")
                        .sku("SKU")
                        .highlights(Collections.singletonList("Test product"))
                        .searchKeywords(Collections.singletonList("AWS"))
                        .visibility("Limited")
                        .categories(Collections.singletonList("Operating Systems"))
                        .productState("Active"))
                .promotionalResources(new PromotionalResources()
                        .logoUrl("https://s3.amazonaws.com/awsmp-logos/logo.png")
                        .videos(new ArrayList<>())
                        .additionalResources(Collections.singletonList(new AdditionalResource()
                                .type("Link")
                                .text("Additional Resource")
                                .url("amazon.com"))))
                .regionAvailability(new RegionAvailability()
                        .restrict(new ArrayList<>())
                        .regions(Collections.singletonList("us-east-1")))
                .supportInformation(new SupportInformation()
                        .description("Product support information"))
                .dimensions(Collections.singletonList(new Dimension()
                        .name("t2.2xlarge")
                        .description("description")
                        .key("t2.2xlarge")
                        .unit("Hrs")
                        .types(Collections.singletonList("Metered"))))
                .targeting(new Targeting()
                        .positiveTargeting(new PositiveTargeting()
                                .buyerAccounts(Collections.singletonList("123456789123"))))
                .compatibility(new Compatibility()
                        .availableInstanceTypes(Collections.singletonList("t2.medium"))
                        .restrictedInstanceTypes(Collections.singletonList("t2.large")));

        assertEquals(expectedDetail, actualDetail);
    }

}
