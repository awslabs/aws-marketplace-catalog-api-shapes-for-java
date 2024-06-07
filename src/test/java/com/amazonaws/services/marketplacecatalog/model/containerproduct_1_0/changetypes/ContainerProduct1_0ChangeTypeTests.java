package com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.changetypes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.util.Arrays;
import java.util.Collections;

public class ContainerProduct1_0ChangeTypeTests {
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
                .version(new UpdateDeliveryOptionsVersion()
                        .versionTitle("1.1")
                        .releaseNotes("Release Notes"))
                .deliveryOptions(Arrays.asList(
                        new UpdateDeliveryOption()
                                .id("00000000-0000-0000-0000-000000000000")
                                .details(new UpdateDeliveryOptionsDetails()
                                        .ecrDeliveryOptionDetails(new UpdateDeliveryOptionsEcrDeliveryOptionDetails()
                                                .deliveryOptionTitle("EKS Container image only delivery option")
                                                .containerImages(Collections.singletonList(
                                                        "111122223333.dkr.ecr.us-east-1.amazonaws.com/some-seller-prefix/my-image:1.0"))
                                                .deploymentResources(Collections.singletonList(new DeploymentResource()
                                                        .name("HelmDeploymentTemplate")
                                                        .url("111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame2:mychart1.1")))
                                                .compatibleServices(Collections.singletonList("EKS"))
                                                .description("Sample Description")
                                                .usageInstructions("instructions"))),
                        new UpdateDeliveryOption()
                                .id("00000000-0000-0000-0000-000000000000")
                                .details(new UpdateDeliveryOptionsDetails()
                                        .helmDeliveryOptionDetails(new UpdateDeliveryOptionsHelmDeliveryOptionDetails()
                                                .deliveryOptionTitle("my eks fulfillment option")
                                                .containerImages(Collections.singletonList(
                                                        "111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame1:1.1"))
                                                .helmChartUri("111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame1:helmchart1.1")
                                                .compatibleServices(Arrays.asList("EKS", "EKS-Anywhere"))
                                                .description("Helm chart description")
                                                .usageInstructions("Usage instructions")
                                                .marketplaceServiceAccountName("service-account-name")
                                                .releaseName("release-name")
                                                .namespace("cluster-namespace")
                                                .quickLaunchEnabled(true)
                                                .overrideParameters(Collections.singletonList(
                                                        new OverrideParameter()
                                                                .key("global.aws.region")
                                                                .defaultValue("us-east-1")
                                                                .metadata(new Metadata()
                                                                        .label("AWS region")
                                                                        .description("Default region for launch")
                                                                        .obfuscate(false)))))),
                        new UpdateDeliveryOption()
                                .id("00000000-0000-0000-0000-000000000000")
                                .details(new UpdateDeliveryOptionsDetails()
                                        .eksAddOnDeliveryOptionDetails(new UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails()
                                                .deliveryOptionTitle("AWS Marketplace Test AddOn")
                                                .containerImages(Collections.singletonList(
                                                        "111122223333.dkr.ecr.us-east-1.amazonaws.com/test-seller/canary-test-repo-product-6:mongo"))
                                                .helmChartUri("111122223333.dkr.ecr.us-east-1.amazonaws.com/rocket/rocket-product-helm:1.0")
                                                .description("Description for delivery option provided by ISV")
                                                .usageInstructions("Usage instructions with launch instructions")
                                                .addOnName("aws-mp-test")
                                                .addOnVersion("1.2.1")
                                                .addOnType("networking")
                                                .compatibleKubernetesVersions(Arrays.asList("1.25", "1.26"))
                                                .supportedArchitectures(Arrays.asList("amd64", "arm64"))
                                                .namespace("my-test-namespace")
                                                .environmentOverrideParameters(Collections.singletonList(
                                                        new EnvironmentOverrideParameter()
                                                                .key("my-field")
                                                                .value("${AWS_EKS_CLUSTER_NAME}")))))));




        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Version\": {\n" +
                "    \"VersionTitle\":  \"1.1\",\n" +
                "    \"ReleaseNotes\":  \"Release Notes\"\n" +
                "  },\n" +
                "  \"DeliveryOptions\": [{\n" +
                "    \"Id\":  \"00000000-0000-0000-0000-000000000000\",\n" +
                "    \"Details\":  {\n" +
                "      \"EcrDeliveryOptionDetails\":  {\n" +
                "        \"DeliveryOptionTitle\":  \"EKS Container image only delivery option\",\n" +
                "        \"ContainerImages\": [\n" +
                "          \"111122223333.dkr.ecr.us-east-1.amazonaws.com/some-seller-prefix/my-image:1.0\"\n" +
                "        ],\n" +
                "        \"DeploymentResources\": [{\n" +
                "          \"Name\": \"HelmDeploymentTemplate\",\n" +
                "          \"Url\": \"111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame2:mychart1.1\"\n" +
                "        }],\n" +
                "        \"CompatibleServices\": [\"EKS\"],\n" +
                "        \"Description\": \"Sample Description\",\n" +
                "        \"UsageInstructions\": \"instructions\"\n" +
                "      }\n" +
                "    }\n" +
                "  }, {\n" +
                "    \"Id\":  \"00000000-0000-0000-0000-000000000000\",\n" +
                "    \"Details\":  {\n" +
                "      \"HelmDeliveryOptionDetails\":  {\n" +
                "        \"DeliveryOptionTitle\":  \"my eks fulfillment option\",\n" +
                "        \"CompatibleServices\": [\"EKS\", \"EKS-Anywhere\"],\n" +
                "        \"ContainerImages\": [\n" +
                "          \"111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame1:1.1\"\n" +
                "        ],\n" +
                "        \"HelmChartUri\": \"111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame1:helmchart1.1\",\n" +
                "        \"Description\": \"Helm chart description\",\n" +
                "        \"UsageInstructions\": \"Usage instructions\",\n" +
                "        \"QuickLaunchEnabled\": true,\n" +
                "        \"MarketplaceServiceAccountName\": \"service-account-name\",\n" +
                "        \"ReleaseName\": \"release-name\",\n" +
                "        \"Namespace\": \"cluster-namespace\",\n" +
                "        \"OverrideParameters\": [{\n" +
                "          \"Key\": \"global.aws.region\",\n" +
                "          \"DefaultValue\": \"us-east-1\",\n" +
                "          \"Metadata\": {\n" +
                "            \"Label\": \"AWS region\",\n" +
                "            \"Description\": \"Default region for launch\",\n" +
                "            \"Obfuscate\": false\n" +
                "          }\n" +
                "        }]\n" +
                "      }\n" +
                "    }\n" +
                "  }, {\n" +
                "    \"Id\":  \"00000000-0000-0000-0000-000000000000\",\n" +
                "    \"Details\":  {\n" +
                "      \"EksAddOnDeliveryOptionDetails\":  {\n" +
                "        \"DeliveryOptionTitle\":  \"AWS Marketplace Test AddOn\",\n" +
                "        \"ContainerImages\": [\n" +
                "          \"111122223333.dkr.ecr.us-east-1.amazonaws.com/test-seller/canary-test-repo-product-6:mongo\"\n" +
                "        ],\n" +
                "        \"HelmChartUri\": \"111122223333.dkr.ecr.us-east-1.amazonaws.com/rocket/rocket-product-helm:1.0\",\n" +
                "        \"Description\": \"Description for delivery option provided by ISV\",\n" +
                "        \"UsageInstructions\": \"Usage instructions with launch instructions\",\n" +
                "        \"AddOnName\": \"aws-mp-test\",\n" +
                "        \"AddOnVersion\": \"1.2.1\",\n" +
                "        \"AddOnType\": \"networking\",\n" +
                "        \"CompatibleKubernetesVersions\": [\"1.25\", \"1.26\"],\n" +
                "        \"SupportedArchitectures\": [\"amd64\", \"arm64\"],\n" +
                "        \"Namespace\": \"my-test-namespace\",\n" +
                "        \"EnvironmentOverrideParameters\": [{\n" +
                "          \"Key\": \"my-field\",\n" +
                "          \"Value\": \"${AWS_EKS_CLUSTER_NAME}\"\n" +
                "        }]\n" +
                "      }\n" +
                "    }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAddDeliveryOptionsEcrChangeDetail() throws Exception {
       AddDeliveryOptionsChangeDetail detail = new AddDeliveryOptionsChangeDetail()
               .version(new AddVersion()
                       .versionTitle("1.1")
                       .releaseNotes(("Release notes")))
               .deliveryOptions(Collections.singletonList(
                       new AddDeliveryOption()
                               .deliveryOptionTitle("EKS Container image only delivery option")
                               .details(new AddDeliveryOptionDetails()
                                       .ecrDeliveryOptionDetails(new AddDeliveryOptionsEcrDeliveryOptionDetails()
                                               .containerImages(Collections.singletonList(
                                                       "111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame1:1.1"))
                                               .deploymentResources(Collections.singletonList(
                                                       new DeploymentResource()
                                                               .name("HelmDeploymentTemplate")
                                                               .url("111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame2:mychart1.1")))
                                               .compatibleServices(Collections.singletonList("EKS"))
                                               .description("Sample Description")
                                               .usageInstructions("helm pull 111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame2:mychart1.1")
                                               .accessRoleArn("arn:aws:iam::123456789012:role/myRole")))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Version\": {\n" +
                "    \"VersionTitle\":  \"1.1\",\n" +
                "    \"ReleaseNotes\":  \"Release notes\"\n" +
                "  },\n" +
                "  \"DeliveryOptions\": [{\n" +
                "    \"DeliveryOptionTitle\":  \"EKS Container image only delivery option\",\n" +
                "    \"Details\":  {\n" +
                "      \"EcrDeliveryOptionDetails\":  {\n" +
                "        \"ContainerImages\": [\n" +
                "          \"111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame1:1.1\"\n" +
                "        ],\n" +
                "        \"DeploymentResources\": [{\n" +
                "          \"Name\": \"HelmDeploymentTemplate\",\n" +
                "          \"Url\": \"111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame2:mychart1.1\"\n" +
                "        }],\n" +
                "        \"CompatibleServices\": [\"EKS\"],\n" +
                "        \"Description\": \"Sample Description\",\n" +
                "        \"UsageInstructions\": \"helm pull 111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame2:mychart1.1\",\n" +
                "        \"AccessRoleArn\": \"arn:aws:iam::123456789012:role/myRole\"\n" +
                "      }\n" +
                "    }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAddDeliveryOptionsHelmChangeDetail() throws Exception {
        AddDeliveryOptionsChangeDetail detail = new AddDeliveryOptionsChangeDetail()
                .version(new AddVersion()
                        .versionTitle("1.1")
                        .releaseNotes(("Release notes")))
                .deliveryOptions(Collections.singletonList(
                        new AddDeliveryOption()
                                .deliveryOptionTitle("HelmChartDeliveryOption")
                                .details(new AddDeliveryOptionDetails()
                                        .helmDeliveryOptionDetails(new AddDeliveryOptionsHelmDeliveryOptionDetails()
                                                .compatibleServices(Arrays.asList("EKS", "EKS-Anywhere"))
                                                .containerImages(Collections.singletonList("111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame1:1.1"))
                                                .helmChartUri("111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame1:helmchart1.1")
                                                .description("Helm chart description")
                                                .usageInstructions("Usage instructions")
                                                .quickLaunchEnabled(true)
                                                .marketplaceServiceAccountName("Service account name")
                                                .releaseName("Optional release name")
                                                .namespace("Optional Kubernetes namespace")
                                                .overrideParameters(Arrays.asList(
                                                        new OverrideParameter()
                                                                .key("HelmKeyName1")
                                                                .defaultValue("${AWSMP_LICENSE_SECRET}")
                                                                .metadata(new Metadata()
                                                                        .label("AWS CloudFormation template field label")
                                                                        .description("AWS CloudFormation template field description")
                                                                        .obfuscate(false)),
                                                        new OverrideParameter()
                                                                .key("HelmKeyName2")
                                                                .defaultValue("${AWSMP_SERVICE_ACCOUNT}")
                                                                .metadata(new Metadata()
                                                                        .label("AWS CloudFormation template field label")
                                                                        .description("AWS CloudFormation template field description")
                                                                        .obfuscate(false))))))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Version\": {\n" +
                "    \"VersionTitle\":  \"1.1\",\n" +
                "    \"ReleaseNotes\":  \"Release notes\"\n" +
                "  },\n" +
                "  \"DeliveryOptions\": [{\n" +
                "    \"DeliveryOptionTitle\":  \"HelmChartDeliveryOption\",\n" +
                "    \"Details\":  {\n" +
                "      \"HelmDeliveryOptionDetails\":  {\n" +
                "        \"CompatibleServices\": [\"EKS\", \"EKS-Anywhere\"],\n" +
                "        \"ContainerImages\": [\n" +
                "          \"111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame1:1.1\"\n" +
                "        ],\n" +
                "        \"HelmChartUri\": \"111122223333.dkr.ecr.us-east-1.amazonaws.com/sellername/reponame1:helmchart1.1\",\n" +
                "        \"Description\": \"Helm chart description\",\n" +
                "        \"UsageInstructions\": \"Usage instructions\",\n" +
                "        \"QuickLaunchEnabled\": true,\n" +
                "        \"MarketplaceServiceAccountName\": \"Service account name\",\n" +
                "        \"ReleaseName\": \"Optional release name\",\n" +
                "        \"Namespace\": \"Optional Kubernetes namespace\",\n" +
                "        \"OverrideParameters\": [{\n" +
                "          \"Key\": \"HelmKeyName1\",\n" +
                "          \"DefaultValue\": \"${AWSMP_LICENSE_SECRET}\",\n" +
                "          \"Metadata\": {\n" +
                "            \"Label\": \"AWS CloudFormation template field label\",\n" +
                "            \"Description\": \"AWS CloudFormation template field description\",\n" +
                "            \"Obfuscate\": false\n" +
                "          }\n" +
                "        }, {\n" +
                "          \"Key\": \"HelmKeyName2\",\n" +
                "          \"DefaultValue\": \"${AWSMP_SERVICE_ACCOUNT}\",\n" +
                "          \"Metadata\": {\n" +
                "            \"Label\": \"AWS CloudFormation template field label\",\n" +
                "            \"Description\": \"AWS CloudFormation template field description\",\n" +
                "            \"Obfuscate\": false\n" +
                "          }\n" +
                "        }]\n" +
                "      }\n" +
                "    }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAddDeliveryOptionsEksChangeDetail() throws Exception {
        AddDeliveryOptionsChangeDetail detail = new AddDeliveryOptionsChangeDetail()
                .version(new AddVersion()
                        .versionTitle("1.1")
                        .releaseNotes(("Release notes")))
                .deliveryOptions(Collections.singletonList(
                        new AddDeliveryOption()
                                .deliveryOptionTitle("AWS Marketplace Test AddOn")
                                .release(false)
                                .visibility(AddDeliveryOptionVisibility.LIMITED)
                                .details(new AddDeliveryOptionDetails()
                                        .eksAddOnDeliveryOptionDetails(new AddDeliveryOptionsEksAddOnDeliveryOptionDetails()
                                                .containerImages(Collections.singletonList(
                                                        "111122223333.dkr.ecr.us-east-1.amazonaws.com/test-seller/canary-test-repo-product-6:mongo"))
                                                .helmChartUri("111122223333.dkr.ecr.us-east-1.amazonaws.com/rocket/rocket-product-helm:1.0")
                                                .description("Description for delivery option provided by ISV")
                                                .usageInstructions("Usage instructions with launch instructions")
                                                .addOnName("aws-mp-test")
                                                .addOnVersion("1.2.1")
                                                .addOnType("networking")
                                                .compatibleKubernetesVersions(Arrays.asList("1.25", "1.26"))
                                                .supportedArchitectures(Arrays.asList("amd64", "arm64"))
                                                .namespace("my-test-namespace")
                                                .environmentOverrideParameters(Collections.singletonList(
                                                        new EnvironmentOverrideParameter()
                                                                .key("my-field")
                                                                .value("${AWS_EKS_CLUSTER_NAME}")))))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Version\": {\n" +
                "    \"VersionTitle\":  \"1.1\",\n" +
                "    \"ReleaseNotes\":  \"Release notes\"\n" +
                "  },\n" +
                "  \"DeliveryOptions\": [{\n" +
                "    \"DeliveryOptionTitle\":  \"AWS Marketplace Test AddOn\",\n" +
                "    \"Release\":  false,\n" +
                "    \"Visibility\":  \"Limited\",\n" +
                "    \"Details\":  {\n" +
                "      \"EksAddOnDeliveryOptionDetails\":  {\n" +
                "        \"ContainerImages\": [\n" +
                "          \"111122223333.dkr.ecr.us-east-1.amazonaws.com/test-seller/canary-test-repo-product-6:mongo\"\n" +
                "        ],\n" +
                "        \"HelmChartUri\": \"111122223333.dkr.ecr.us-east-1.amazonaws.com/rocket/rocket-product-helm:1.0\",\n" +
                "        \"Description\": \"Description for delivery option provided by ISV\",\n" +
                "        \"UsageInstructions\": \"Usage instructions with launch instructions\",\n" +
                "        \"AddOnName\": \"aws-mp-test\",\n" +
                "        \"AddOnVersion\": \"1.2.1\",\n" +
                "        \"AddOnType\": \"networking\",\n" +
                "        \"CompatibleKubernetesVersions\": [\"1.25\", \"1.26\"],\n" +
                "        \"SupportedArchitectures\": [\"amd64\", \"arm64\"],\n" +
                "        \"Namespace\": \"my-test-namespace\",\n" +
                "        \"EnvironmentOverrideParameters\": [{\n" +
                "          \"Key\": \"my-field\",\n" +
                "          \"Value\": \"${AWS_EKS_CLUSTER_NAME}\"\n" +
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
