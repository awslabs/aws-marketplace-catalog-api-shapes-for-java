package com.amazonaws.services.marketplacecatalog.model.machinelearningproduct_1_0.changetypes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MachineLearningProduct1_0ChangeTypeTests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    }

    @Test
    public void testCreateProductChangeDetail() throws Exception {
        CreateProductChangeDetail detail = new CreateProductChangeDetail()
                .productTitle("ProductTitle");
        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"ProductTitle\": \"ProductTitle\"\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testModelPackageAddDeliveryOptionsChangeDetail() throws Exception {
        AddDeliveryOptionsChangeDetail detail = new AddDeliveryOptionsChangeDetail()
                .version(new AddVersion()
                        .versionTitle("Version title")
                        .releaseNotes(("Release notes")))
                .deliveryOptions(Arrays.asList(
                        new AddDeliveryOption()
                                .details(new AddDeliveryOptionsDetails()
                                        .sageMakerModelPackageDeliveryOptionDetails(
                                                new AddDeliveryOptionsSageMakerModelPackageDeliveryOptionDetails()
                                                        .sageMakerModelPackageArn("arn:aws:sagemaker:us-east-2:123456789123:model-package/ml-test-model")
                                                        .accessRoleArn("arn:aws:iam::123456789012:role/myRole")
                                                        .usageInstructions("instructions")
                                                        .sampleNotebookUrl("https://www.amazon.com")
                                                        .repositoryUrl("https://www.amazon.com")
                                                        .inputProperties(new InputProperties()
                                                                .description("Input should have all columns in the train/test file except for 'is_fraud' column.")
                                                                .limitations("Can predict on 1 input in the CSV only at a time")
                                                                .sampleInput(new Sample()
                                                                        .realtimeInferenceText("text")
                                                                        .batchTransformUrl("https://www.sampleData.com")))
                                                        .outputProperties(new OutputProperties()
                                                                .description("The output is a JSON object that has the generated text along with likelihoods of tokens, if requested. See example json.")
                                                                .sampleOutput(new Sample()
                                                                        .realtimeInferenceUrl("https://www.sampledata.com")
                                                                        .batchTransformUrl("https://www.amazon.com")))
                                                .recommendedInstanceTypes(new SageMakerModelPackageRecommendedInstanceTypes()
                                                        .batchTransform("ml.m5.large")
                                                        .realtimeInference("ml.m5.large"))
                                        ))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Version\": {\n" +
                "    \"VersionTitle\":  \"Version title\",\n" +
                "    \"ReleaseNotes\":  \"Release notes\"\n" +
                "  },\n" +
                "  \"DeliveryOptions\": [{\n" +
                "    \"Details\":  {\n" +
                "      \"SageMakerModelPackageDeliveryOptionDetails\":  {\n" +
                "        \"SageMakerModelPackageArn\": \"arn:aws:sagemaker:us-east-2:123456789123:model-package/ml-test-model\",\n" +
                "        \"AccessRoleArn\": \"arn:aws:iam::123456789012:role/myRole\",\n" +
                "        \"UsageInstructions\": \"instructions\",\n" +
                "        \"SampleNotebookUrl\": \"https://www.amazon.com\",\n" +
                "        \"RepositoryUrl\": \"https://www.amazon.com\",\n" +
                "        \"InputProperties\": {\n" +
                "          \"Description\": \"Input should have all columns in the train/test file except for 'is_fraud' column.\",\n" +
                "          \"Limitations\": \"Can predict on 1 input in the CSV only at a time\",\n" +
                "          \"SampleInput\":  {\n" +
                "               \"RealtimeInferenceText\": \"text\",\n" +
                "               \"BatchTransformUrl\": \"https://www.sampleData.com\"\n" +
                "           }\n" +
                "        },\n" +
                "        \"OutputProperties\": {\n" +
                "          \"Description\": \"The output is a JSON object that has the generated text along with likelihoods of tokens, if requested. See example json.\",\n" +
                "          \"SampleOutput\":  {\n" +
                "               \"RealtimeInferenceUrl\": \"https://www.sampledata.com\",\n" +
                "               \"BatchTransformUrl\": \"https://www.amazon.com\"\n" +
                "           }\n" +
                "        },\n" +
                "        \"RecommendedInstanceTypes\": {\n" +
                "           \"BatchTransform\": \"ml.m5.large\",\n" +
                "           \"RealtimeInference\": \"ml.m5.large\"\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAlgorithmAddDeliveryOptionsChangeDetail() throws Exception {
        AddDeliveryOptionsChangeDetail detail = new AddDeliveryOptionsChangeDetail()
                .version(new AddVersion()
                        .versionTitle("Version title")
                        .releaseNotes(("Release notes")))
                .deliveryOptions(Arrays.asList(
                        new AddDeliveryOption()
                                .details(new AddDeliveryOptionsDetails()
                                        .sageMakerAlgorithmDeliveryOptionDetails(
                                                new AddDeliveryOptionsSageMakerAlgorithmDeliveryOptionDetails()
                                                        .sageMakerAlgorithmArn("arn:aws:sagemaker:us-east-2:123456789123:algorithm/ml-test-algo")
                                                        .accessRoleArn("arn:aws:iam::123456789012:role/myRole")
                                                        .usageInstructions("instructions")
                                                        .sampleNotebookUrl("https://www.amazon.com")
                                                        .repositoryUrl("https://www.amazon.com")
                                                        .inputProperties(new InputProperties()
                                                                .description("Input should have all columns in the train/test file except for 'is_fraud' column.")
                                                                .limitations("Can predict on 1 input in the CSV only at a time")
                                                                .sampleInput(new Sample()
                                                                        .realtimeInferenceText("text")
                                                                        .batchTransformUrl("https://www.sampleData.com")))
                                                        .outputProperties(new OutputProperties()
                                                                .description("The output is a JSON object that has the generated text along with likelihoods of tokens, if requested. See example json.")
                                                                .sampleOutput(new Sample()
                                                                        .realtimeInferenceUrl("https://www.sampledata.com")
                                                                        .batchTransformUrl("https://www.amazon.com")))
                                                        .recommendedInstanceTypes(new SageMakerAlgorithmRecommendedInstanceTypes()
                                                                .batchTransform("ml.m5.large")
                                                                .realtimeInference("ml.m5.large")
                                                                .training("ml.m5.large"))
                                        ))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Version\": {\n" +
                "    \"VersionTitle\":  \"Version title\",\n" +
                "    \"ReleaseNotes\":  \"Release notes\"\n" +
                "  },\n" +
                "  \"DeliveryOptions\": [{\n" +
                "    \"Details\":  {\n" +
                "      \"SageMakerAlgorithmDeliveryOptionDetails\":  {\n" +
                "        \"SageMakerAlgorithmArn\": \"arn:aws:sagemaker:us-east-2:123456789123:algorithm/ml-test-algo\",\n" +
                "        \"AccessRoleArn\": \"arn:aws:iam::123456789012:role/myRole\",\n" +
                "        \"UsageInstructions\": \"instructions\",\n" +
                "        \"SampleNotebookUrl\": \"https://www.amazon.com\",\n" +
                "        \"RepositoryUrl\": \"https://www.amazon.com\",\n" +
                "        \"InputProperties\": {\n" +
                "          \"Description\": \"Input should have all columns in the train/test file except for 'is_fraud' column.\",\n" +
                "          \"Limitations\": \"Can predict on 1 input in the CSV only at a time\",\n" +
                "          \"SampleInput\":  {\n" +
                "               \"RealtimeInferenceText\": \"text\",\n" +
                "               \"BatchTransformUrl\": \"https://www.sampleData.com\"\n" +
                "           }\n" +
                "        },\n" +
                "        \"OutputProperties\": {\n" +
                "          \"Description\": \"The output is a JSON object that has the generated text along with likelihoods of tokens, if requested. See example json.\",\n" +
                "          \"SampleOutput\":  {\n" +
                "               \"RealtimeInferenceUrl\": \"https://www.sampledata.com\",\n" +
                "               \"BatchTransformUrl\": \"https://www.amazon.com\"\n" +
                "           }\n" +
                "        },\n" +
                "        \"RecommendedInstanceTypes\": {\n" +
                "           \"BatchTransform\": \"ml.m5.large\",\n" +
                "           \"RealtimeInference\": \"ml.m5.large\",\n" +
                "           \"Training\": \"ml.m5.large\"\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateDeliveryOptionsChangeDetail() throws Exception {
        UpdateDeliveryOptionsChangeDetail detail = new UpdateDeliveryOptionsChangeDetail()
                .version(new UpdateDeliveryOptionsVersion().releaseNotes("Release notes"))
                .deliveryOptions(Collections.singletonList(new UpdateDeliveryOption()
                        .id("00000000-0000-0000-0000-000000000000")
                        .details(new UpdateDeliveryOptionsDetails()
                                .sageMakerModelPackageDeliveryOptionDetails(new UpdateDeliveryOptionsSageMakerModelPackageDeliveryOptionDetails()
                                        .usageInstructions("instructions")
                                        .recommendedInstanceTypes(new SageMakerModelPackageRecommendedInstanceTypes()
                                                .batchTransform("m4.2xlarge"))
                                ))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Version\": {\n" +
                "    \"ReleaseNotes\":  \"Release notes\"\n" +
                "  },\n" +
                "  \"DeliveryOptions\": [{\n" +
                "    \"Id\":  \"00000000-0000-0000-0000-000000000000\",\n" +
                "    \"Details\":  {\n" +
                "      \"SageMakerModelPackageDeliveryOptionDetails\":  {\n" +
                "        \"UsageInstructions\": \"instructions\",\n" +
                "        \"RecommendedInstanceTypes\": {\n" +
                "          \"BatchTransform\": \"m4.2xlarge\"\n" +
                "        }\n" +
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
