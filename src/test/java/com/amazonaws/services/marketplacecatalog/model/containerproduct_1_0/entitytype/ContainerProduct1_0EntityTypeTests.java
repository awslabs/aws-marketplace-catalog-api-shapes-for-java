package com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.entitytype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerProduct1_0EntityTypeTests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void ContainerProductEntityDetail() throws Exception {
        String json = "{\n" +
                "  \"Versions\": [{\n" +
                "    \"Id\": \"123abc02-0480-43b2-910e-6903901b9abc\",\n" +
                "    \"ReleaseNotes\": \"Initial Release\",\n" +
                "    \"UpgradeInstructions\": \"Upgrade instructions\",\n" +
                "    \"VersionTitle\": \"2.0.1\",\n" +
                "    \"CreationDate\": \"2023-03-12T00:00:00.000Z\",\n" +
                "    \"Sources\": [{\n" +
                "      \"Type\": \"DockerImages\",\n" +
                "      \"Id\": \"cft85b1c-1c1b-3310-9315-a123456bcd99\",\n" +
                "      \"Images\": [\"123456789123.dkr.ecr.us-east-1.amazonaws.com/placeholder:1.0\"],\n" +
                "      \"Compatibility\": {\n" +
                "        \"Platform\": \"Linux\"\n" +
                "      }\n" +
                "    }],\n" +
                "    \"DeliveryOptions\": [{\n" +
                "      \"Id\": \"e28f7813-1c1b-3310-9315-a123456bcd99\",\n" +
                "      \"Type\": \"ElasticContainerRegistry\",\n" +
                "      \"SourceId\": \"a5c84c81-1c1b-3310-9315-a123456bcd99\",\n" +
                "      \"Title\": \"DockerImageSet\",\n" +
                "      \"ShortDescription\": \"Short description of product\",\n" +
                "      \"isRecommended\": false,\n" +
                "      \"Compatibility\": {\n" +
                "        \"AWSServices\": [\"ECS\", \"EKS\"]\n" +
                "      },\n" +
                "      \"Instructions\": {\n" +
                "        \"Usage\": \"Try this product on AWS ECS and AWS EKS\"\n" +
                "      },\n" +
                "      \"Recommendations\": {\n" +
                "        \"DeploymentResources\": [{\n" +
                "          \"Text\": \"ECS\",\n" +
                "          \"Url\": \"https://amazon.com\"\n" +
                "        }]\n" +
                "      },\n" +
                "      \"Visibility\": \"Limited\"\n" +
                "    }]\n" +
                "  },{\n" +
                "    \"Id\": \"123abc02-0480-43b2-910e-6903901b9abc\",\n" +
                "    \"ReleaseNotes\": \"Initial Release\",\n" +
                "    \"UpgradeInstructions\": \"Upgrade instructions\",\n" +
                "    \"VersionTitle\": \"2.0.1\",\n" +
                "    \"CreationDate\": \"2023-03-12T00:00:00.000Z\",\n" +
                "    \"Sources\": [{\n" +
                "      \"Type\": \"DockerImages\",\n" +
                "      \"Id\": \"cft85b1c-1c1b-3310-9315-a123456bcd99\",\n" +
                "      \"Images\": [\"123456789123.dkr.ecr.us-east-1.amazonaws.com/placeholder:1.0\"],\n" +
                "      \"Compatibility\": {\n" +
                "        \"Platform\": \"Linux\"\n" +
                "      }\n" +
                "    },{\n" +
                "      \"Type\": \"HelmChart\",\n" +
                "      \"Id\": \"b01d60d7-1c1b-3310-9315-a123456bcd99\",\n" +
                "      \"HelmChartUri\": \"123456789123.dkr.ecr.us-east-1.amazonaws.com/container-seller/helm-test:my-helm\"\n" +
                "    }],\n" +
                "    \"DeliveryOptions\": [{\n" +
                "      \"Id\": \"9300f934-1c1b-3310-9315-a123456bcd99\",\n" +
                "      \"Type\": \"Helm\",\n" +
                "      \"SourceId\": \"a5c84c81-1c1b-3310-9315-331376cc34bc\",\n" +
                "      \"Title\": \"Helm delivery option title\",\n" +
                "      \"ShortDescription\": \"Short description of product\",\n" +
                "      \"isRecommended\": false,\n" +
                "      \"Compatibility\": {\n" +
                "        \"AWSServices\": [\"EKS\"]\n" +
                "      },\n" +
                "      \"Instructions\": {\n" +
                "        \"Usage\": \"Usage instructions\"\n" +
                "      },\n" +
                "      \"QuickLaunchEnabled\": false,\n" +
                "      \"ReleaseName\": \"Release Name\",\n" +
                "      \"MarketplaceServiceAccountName\": \"Service account name\",\n" +
                "      \"Namespace\": \"helm-namespace\",\n" +
                "      \"OverrideParameters\": [{\n" +
                "        \"Key\": \"global.aws-region\",\n" +
                "        \"Default\": \"us-east-1\",\n" +
                "        \"Metadata\": {\n" +
                "          \"Label\": \"test1\",\n" +
                "          \"Description\": \"test parameter\"\n" +
                "        }\n" +
                "      }],\n" +
                "      \"Visibility\": \"Limited\"\n" +
                "    }]\n" +
                "  },{\n" +
                "    \"Id\": \"123abc02-0480-43b2-910e-6903901b9abc\",\n" +
                "    \"ReleaseNotes\": \"Initial Release\",\n" +
                "    \"UpgradeInstructions\": \"Upgrade instructions\",\n" +
                "    \"VersionTitle\": \"2.0.1\",\n" +
                "    \"CreationDate\": \"2023-03-12T00:00:00.000Z\",\n" +
                "    \"Sources\": [{\n" +
                "      \"Type\": \"DockerImages\",\n" +
                "      \"Id\": \"2ad85b1c-1c1b-3310-9315-a123456bcd99\",\n" +
                "      \"Images\": [\"123456789123.dkr.ecr.us-east-1.amazonaws.com/placeholder:1.0\"],\n" +
                "      \"Compatibility\": {\n" +
                "        \"Platform\": \"Linux\"\n" +
                "      }\n" +
                "    },{\n" +
                "      \"Type\": \"HelmChart\",\n" +
                "      \"Id\": \"b01d60d7-1c1b-3310-9315-a123456bcd99\",\n" +
                "      \"HelmChartUri\": \"123456789123.dkr.ecr.us-east-1.amazonaws.com/container-seller/helm-test:my-helm\"\n" +
                "    }],\n" +
                "    \"DeliveryOptions\": [{\n" +
                "      \"Id\": \"16182cde-1c1b-3310-9315-a123456bcd99\",\n" +
                "      \"Type\": \"EksAddOn\",\n" +
                "      \"SourceId\": \"a5c84c81-1c1b-3310-9315-331376cc34bc\",\n" +
                "      \"Title\": \"EKS AddOn title\",\n" +
                "      \"ShortDescription\": \"Short description of product\",\n" +
                "      \"Compatibility\": {\n" +
                "        \"KubernetesVersions\": [\"1.22\", \"1.23\"],\n" +
                "        \"Architectures\":[\"amd64\", \"arm64\"]\n" +
                "      },\n" +
                "      \"Instructions\": {\n" +
                "        \"Usage\": \"Usage instructions\"\n" +
                "      },\n" +
                "      \"AddOnType\": \"gitops\",\n" +
                "      \"Visibility\": \"Limited\",\n" +
                "      \"Namespace\": \"eks-namespace\",\n" +
                "      \"EnvironmentOverrideParameters\": [{\n" +
                "        \"Key\": \"global.aws-region\",\n" +
                "        \"Value\": \"cluster_name\"\n" +
                "      }],\n" +
                "      \"DisplayAddOnName\": \"display-name\",\n" +
                "      \"AddOnName\": \"name\",\n" +
                "      \"DisplayAddOnVersion\": \"v1.2.1-eksbuild.1\",\n" +
                "      \"AddOnVersion\": \"1.2.1\"\n" +
                "    }]\n" +
                "  }],\n" +
                "  \"Description\": {\n" +
                "    \"ProductTitle\": \"Container Test Product\",\n" +
                "    \"ProductCode\": \"9abcdefg9bw4k0zssg7thx123\",\n" +
                "    \"ShortDescription\": \"Product description\",\n" +
                "    \"LongDescription\": \"Long product description\",\n" +
                "    \"Sku\": \"SKU\",\n" +
                "    \"Highlights\": [\"Test product\"],\n" +
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
                "  \"PromotionalResources\": {\n" +
                "    \"LogoUrl\": \"https://s3.amazonaws.com/awsmp-logos/logo.png\",\n" +
                "    \"Videos\": [{\n" +
                "      \"Type\": \"Link\",\n" +
                "      \"Title\": \"Product Video\",\n" +
                "      \"Url\": \"https://s3.amazonaws.com/media/video.mp4\"\n" +
                "    }],\n" +
                "    \"AdditionalResources\": [{\n" +
                "      \"Type\": \"Link\",\n" +
                "      \"Text\": \"Additional Resource\",\n" +
                "      \"Url\": \"amazon.com\"\n" +
                "    }]\n" +
                "  },\n" +
                "  \"SignatureVerificationKeys\": [{\n" +
                "    \"PublicKey\": \"-----BEGIN PUBLIC KEY-----\\nPublicKeyExample\\n-----END PUBLIC KEY-----\\n\",\n" +
                "    \"Status\": \"Active\",\n" +
                "    \"PublicKeyVersion\": 1\n" +
                "  }],\n" +
                "  \"SupportInformation\": {\n" +
                "    \"Description\": \"Product support information\"\n" +
                "  },\n" +
                "  \"Dimensions\": [{\n" +
                "    \"Name\": \"Dimension 1\",\n" +
                "    \"Description\": \"description\",\n" +
                "    \"Key\": \"dimension1\",\n" +
                "    \"Unit\": \"bit\",\n" +
                "    \"Types\": [\"Metered\"]\n" +
                "  }],\n" +
                "  \"Repositories\": [{\n" +
                "    \"Url\": \"123456789123.dkr.ecr.us-east-1.amazonaws.com/test-repository-1\",\n" +
                "    \"Type\": \"ECR\"\n" +
                "  },{\n" +
                "    \"Url\": \"123456789123.dkr.ecr.us-east-1.amazonaws.com/test-repository-2\",\n" +
                "    \"Type\": \"ECR\"\n" +
                "  }]\n" +
                "}";

        ContainerProductEntityDetail actualDetail = mapper.readValue(json, ContainerProductEntityDetail.class);

        ContainerProductEntityDetail expectedDetail = new ContainerProductEntityDetail()
                .versions(Arrays.asList(
                        new Version()
                                .id("123abc02-0480-43b2-910e-6903901b9abc")
                                .releaseNotes("Initial Release")
                                .upgradeInstructions("Upgrade instructions")
                                .versionTitle("2.0.1")
                                .creationDate("2023-03-12T00:00:00.000Z")
                                .sources(Collections.singletonList(
                                        new Source()
                                                .type("DockerImages")
                                                .id("cft85b1c-1c1b-3310-9315-a123456bcd99")
                                                .images(Collections.singletonList("123456789123.dkr.ecr.us-east-1.amazonaws.com/placeholder:1.0"))
                                                .compatibility(
                                                        new SourceCompatibility()
                                                                .platform("Linux"))))
                                .deliveryOptions(Collections.singletonList(
                                        new DeliveryOption()
                                                .id("e28f7813-1c1b-3310-9315-a123456bcd99")
                                                .type("ElasticContainerRegistry")
                                                .sourceId("a5c84c81-1c1b-3310-9315-a123456bcd99")
                                                .title("DockerImageSet")
                                                .shortDescription("Short description of product")
                                                .isRecommended(false)
                                                .compatibility(
                                                        new DeliveryOptionCompatibility()
                                                                .awSServices(Arrays.asList("ECS", "EKS")))
                                                .instructions(
                                                        new Instructions()
                                                                .usage("Try this product on AWS ECS and AWS EKS"))
                                                .recommendations(
                                                        new Recommendations()
                                                                .deploymentResources(Collections.singletonList(
                                                                        new DeploymentResource()
                                                                                .text("ECS")
                                                                                .url("https://amazon.com"))))
                                                .visibility("Limited"))),
                        new Version()
                                .id("123abc02-0480-43b2-910e-6903901b9abc")
                                .releaseNotes("Initial Release")
                                .upgradeInstructions("Upgrade instructions")
                                .versionTitle("2.0.1")
                                .creationDate("2023-03-12T00:00:00.000Z")
                                .sources(Arrays.asList(
                                        new Source()
                                                .type("DockerImages")
                                                .id("cft85b1c-1c1b-3310-9315-a123456bcd99")
                                                .images(Collections.singletonList("123456789123.dkr.ecr.us-east-1.amazonaws.com/placeholder:1.0"))
                                                .compatibility(
                                                        new SourceCompatibility()
                                                                .platform("Linux")),
                                        new Source()
                                                .type("HelmChart")
                                                .id("b01d60d7-1c1b-3310-9315-a123456bcd99")
                                                .helmChartUri("123456789123.dkr.ecr.us-east-1.amazonaws.com/container-seller/helm-test:my-helm")))
                                .deliveryOptions(Collections.singletonList(
                                        new DeliveryOption()
                                                .id("9300f934-1c1b-3310-9315-a123456bcd99")
                                                .type("Helm")
                                                .sourceId("a5c84c81-1c1b-3310-9315-331376cc34bc")
                                                .title("Helm delivery option title")
                                                .shortDescription("Short description of product")
                                                .isRecommended(false)
                                                .compatibility(
                                                        new DeliveryOptionCompatibility()
                                                                .awSServices(Collections.singletonList("EKS")))
                                                .instructions(
                                                        new Instructions()
                                                                .usage("Usage instructions"))
                                                .quickLaunchEnabled(false)
                                                .releaseName("Release Name")
                                                .marketplaceServiceAccountName("Service account name")
                                                .namespace("helm-namespace")
                                                .overrideParameters(Collections.singletonList(
                                                        new OverrideParameter()
                                                                .key("global.aws-region")
                                                                ._default("us-east-1")
                                                                .metadata(
                                                                        new Metadata()
                                                                                .label("test1")
                                                                                .description("test parameter"))))
                                                .visibility("Limited"))),
                        new Version()
                                .id("123abc02-0480-43b2-910e-6903901b9abc")
                                .releaseNotes("Initial Release")
                                .upgradeInstructions("Upgrade instructions")
                                .versionTitle("2.0.1")
                                .creationDate("2023-03-12T00:00:00.000Z")
                                .sources(Arrays.asList(
                                        new Source()
                                                .type("DockerImages")
                                                .id("2ad85b1c-1c1b-3310-9315-a123456bcd99")
                                                .images(Collections.singletonList("123456789123.dkr.ecr.us-east-1.amazonaws.com/placeholder:1.0"))
                                                .compatibility(
                                                        new SourceCompatibility()
                                                                .platform("Linux")),
                                        new Source()
                                                .type("HelmChart")
                                                .id("b01d60d7-1c1b-3310-9315-a123456bcd99")
                                                .helmChartUri("123456789123.dkr.ecr.us-east-1.amazonaws.com/container-seller/helm-test:my-helm")))
                                .deliveryOptions(Collections.singletonList(
                                        new DeliveryOption()
                                                .id("16182cde-1c1b-3310-9315-a123456bcd99")
                                                .type("EksAddOn")
                                                .sourceId("a5c84c81-1c1b-3310-9315-331376cc34bc")
                                                .title("EKS AddOn title")
                                                .shortDescription("Short description of product")
                                                .compatibility(
                                                        new DeliveryOptionCompatibility()
                                                                .kubernetesVersions(Arrays.asList("1.22", "1.23"))
                                                                .architectures(Arrays.asList("amd64", "arm64")))
                                                .instructions(
                                                        new Instructions()
                                                                .usage("Usage instructions"))
                                                .addOnType("gitops")
                                                .visibility("Limited")
                                                .namespace("eks-namespace")
                                                .environmentOverrideParameters(Collections.singletonList(
                                                        new EnvironmentOverrideParameter()
                                                                .key("global.aws-region")
                                                                .value("cluster_name")
                                                ))
                                                .displayAddOnName("display-name")
                                                .addOnName("name")
                                                .displayAddOnVersion("v1.2.1-eksbuild.1")
                                                .addOnVersion("1.2.1")))))
                .description(
                        new Description()
                                .productTitle("Container Test Product")
                                .productCode("9abcdefg9bw4k0zssg7thx123")
                                .shortDescription("Product description")
                                .longDescription("Long product description")
                                .sku("SKU")
                                .highlights(Collections.singletonList("Test product"))
                                .searchKeywords(Collections.singletonList("AWS"))
                                .visibility("Limited")
                                .productState("Active")
                                .categories(Collections.singletonList("Operating Systems")))
                .targeting(
                        new Targeting()
                                .positiveTargeting(
                                        new PositiveTargeting()
                                                .buyerAccounts(Collections.singletonList("123456789123"))))
                .promotionalResources(
                        new PromotionalResources()
                                .logoUrl("https://s3.amazonaws.com/awsmp-logos/logo.png")
                                .videos(Collections.singletonList(
                                        new Video()
                                                .type("Link")
                                                .title("Product Video")
                                                .url("https://s3.amazonaws.com/media/video.mp4")))
                                .additionalResources(Collections.singletonList(
                                        new AdditionalResource()
                                                .type("Link")
                                                .text("Additional Resource")
                                                .url("amazon.com"))))
                .signatureVerificationKeys(Collections.singletonList(
                        new SignatureVerificationKey()
                                .publicKey("-----BEGIN PUBLIC KEY-----\nPublicKeyExample\n-----END PUBLIC KEY-----\n")
                                .status("Active")
                                .publicKeyVersion(1)))
                .supportInformation(
                        new SupportInformation()
                                .description("Product support information"))
                .dimensions(Collections.singletonList(
                        new Dimension()
                                .name("Dimension 1")
                                .description("description")
                                .key("dimension1")
                                .unit("bit")
                                .types(Collections.singletonList("Metered"))))
                .repositories(Arrays.asList(
                        new Repository()
                                .url("123456789123.dkr.ecr.us-east-1.amazonaws.com/test-repository-1")
                                .type("ECR"),
                        new Repository()
                                .url("123456789123.dkr.ecr.us-east-1.amazonaws.com/test-repository-2")
                                .type("ECR")));

        assertEquals(expectedDetail, actualDetail);
    }

}
