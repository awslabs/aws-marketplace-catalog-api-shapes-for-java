package com.amazonaws.services.marketplacecatalog.model.machinelearningproduct_1_0.entitytype;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MachineLearningProduct1_0EntityTypeTests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Test
    public void MachineLearningProductDetailModelPackage() throws Exception {
        String json = "{\n" +
                "        \"Versions\": [\n" +
                "            {\n" +
                "                \"Id\": \"00000000-0000-0000-0000-000000000000\",\n" +
                "                \"ReleaseNotes\": \"ML version test 1\",\n" +
                "                \"VersionTitle\": \"ML version test 1\",\n" +
                "                \"CreationDate\": \"2025-06-12T20:57:59.172Z\",\n" +
                "                \"Sources\": [\n" +
                "                    {\n" +
                "                        \"Type\": \"SageMakerModelPackage\",\n" +
                "                        \"Id\": \"00000000-0000-0000-0000-000000000000\",\n" +
                "                        \"ModelPackageArn\": \"arn:aws:sagemaker:us-east-2:123456789123:model-package/ml-test-model\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"DeliveryOptions\": [\n" +
                "                    {\n" +
                "                        \"Id\": \"00000000-0000-0000-0000-000000000000\",\n" +
                "                        \"Type\": \"SageMakerModelPackage\",\n" +
                "                        \"SourceId\": \"00000000-0000-0000-0000-000000000000\",\n" +
                "                        \"ShortDescription\": \"SageMaker ModelDelivery Option\",\n" +
                "                        \"Instructions\": {\n" +
                "                            \"Usage\": \"This is how you use your model package\",\n" +
                "                            \"SampleNotebookUrl\": \"https://www.amazon.com\",\n" +
                "                            \"RepositoryUrl\": \"https://www.amazon.com\",\n" +
                "                            \"InputProperties\": {\n" +
                "                                \"Description\": \"Input should have all columns in the train/test file except for 'is_fraud' column.\",\n" +
                "                                \"Parameters\": [\n" +
                "                                    {\n" +
                "                                        \"Name\": \"prompt1\",\n" +
                "                                        \"Description\": \"Represents the instruct-style prompt for the model.\",\n" +
                "                                        \"Constraints\": \"Max size=100\",\n" +
                "                                        \"Required\": true\n" +
                "                                    },\n" +
                "                                    {\n" +
                "                                        \"Name\": \"maxTokens1\",\n" +
                "                                        \"Description\": \"Denotes the number of tokens to predict per generation.\",\n" +
                "                                        \"Required\": false\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"Limitations\": \"Can predict on 1 input in the CSV only at a time\",\n" +
                "                                \"SageMakerCustomAttributes\": [\n" +
                "                                    {\n" +
                "                                        \"Name\": \"threshold1\",\n" +
                "                                        \"Description\": \"Threshold of the confidence score of the detected object\",\n" +
                "                                        \"Constraints\": \"MinValue : 0.0, MaxValue : 1.0, Required: true\",\n" +
                "                                        \"Required\": false\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"SampleInput\": {\n" +
                "                                    \"RealtimeInferenceText\": \"text\",\n" +
                "                                    \"BatchTransformUrl\": \"https://www.sampleData.com\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"OutputProperties\": {\n" +
                "                                \"Description\": \"The output is a JSON object that has the generated text along with likelihoods of tokens, if requested. See example json.\",\n" +
                "                                \"Parameters\": [\n" +
                "                                    {\n" +
                "                                        \"Name\": \"id\",\n" +
                "                                        \"Description\": \"An identifier for response\",\n" +
                "                                        \"AlwaysReturned\": false\n" +
                "                                    },\n" +
                "                                    {\n" +
                "                                        \"Name\": \"generations\",\n" +
                "                                        \"Description\": \"The generated text along with the likelihoods for tokens requested.\",\n" +
                "                                        \"AlwaysReturned\": false\n" +
                "                                    }\n" +
                "                                ],\n" +
                "                                \"SampleOutput\": {\n" +
                "                                    \"RealtimeInferenceUrl\": \"https://www.sampledata.com\",\n" +
                "                                    \"BatchTransformUrl\": \"https://www.amazon.com\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        },\n" +
                "                        \"RecommendedInstanceTypes\": {\n" +
                "                            \"BatchTransform\": \"ml.m5.large\",\n" +
                "                            \"RealtimeInference\": \"ml.m5.large\"\n" +
                "                        },\n" +
                "                        \"SupportedInstanceTypes\": {\n" +
                "                            \"BatchTransform\": [\n" +
                "                                \"ml.m5.large\"\n" +
                "                            ],\n" +
                "                            \"RealtimeInference\": [\n" +
                "                                \"ml.m5.large\"\n" +
                "                            ]\n" +
                "                        },\n" +
                "                        \"Visibility\": \"Public\",\n" +
                "                        \"Title\": \"SageMaker Model\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ],\n" +
                "        \"Description\": {\n" +
                "            \"ProductTitle\": \"ML test product\",\n" +
                "            \"ProductCode\": \"a1cl2qqbjvpp7xurfh7oebrl8\",\n" +
                "            \"ShortDescription\": \"Brief description\",\n" +
                "            \"LongDescription\": \"Detailed description\",\n" +
                "            \"Sku\": null,\n" +
                "            \"Highlights\": [\n" +
                "                \"Sample highlight\"\n" +
                "            ],\n" +
                "            \"AssociatedProducts\": null,\n" +
                "            \"SearchKeywords\": [\n" +
                "                \"Sample keyword\"\n" +
                "            ],\n" +
                "            \"Visibility\": \"Limited\",\n" +
                "            \"ProductState\": \"Active\",\n" +
                "            \"Categories\": [\n" +
                "                \"Operating Systems\"\n" +
                "            ]\n" +
                "        },\n" +
                "        \"Targeting\": {\n" +
                "            \"PositiveTargeting\": {\n" +
                "                \"BuyerAccounts\": [\n" +
                "                    \"123456789123\"\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        \"PromotionalResources\": {\n" +
                "            \"LogoUrl\": \"https://awsmp-logos.s3.amazonaws.com/0000000000000000\",\n" +
                "            \"Videos\": [],\n" +
                "            \"AdditionalResources\": []\n" +
                "        },\n" +
                "        \"Dimensions\": [\n" +
                "            {\n" +
                "                \"Name\": \"inference.count.m.i.c Inference Pricing\",\n" +
                "                \"Description\": \"inference.count.m.i.c Inference Pricing\",\n" +
                "                \"Key\": \"inference.count.m.i.c\",\n" +
                "                \"Unit\": \"Requests\",\n" +
                "                \"Types\": [\n" +
                "                    \"Metered\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"Name\": \"ml.m5.large Inference (Batch)\",\n" +
                "                \"Description\": \"Model inference on the ml.m5.large instance type, batch mode\",\n" +
                "                \"Key\": \"ml.m5.large.m.i.b\",\n" +
                "                \"Unit\": \"HostHrs\",\n" +
                "                \"Types\": [\n" +
                "                    \"Metered\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"Name\": \"ml.m5.large Inference (Real-Time)\",\n" +
                "                \"Description\": \"Model inference on the ml.m5.large instance type, real-time mode\",\n" +
                "                \"Key\": \"ml.m5.large.m.i.r\",\n" +
                "                \"Unit\": \"HostHrs\",\n" +
                "                \"Types\": [\n" +
                "                    \"Metered\"\n" +
                "                ]\n" +
                "            }\n" +
                "        ],\n" +
                "        \"SupportInformation\": {\n" +
                "            \"Description\": \"Need help? Contact our AWS security experts at aws.marketplace.com.\"\n" +
                "        },\n" +
                "        \"RegionAvailability\": {\n" +
                "            \"FutureRegionSupport\": null,\n" +
                "            \"Restrict\": [],\n" +
                "            \"Regions\": [\n" +
                "                \"ap-south-1\",\n" +
                "                \"eu-north-1\",\n" +
                "                \"eu-west-3\",\n" +
                "                \"eu-west-2\",\n" +
                "                \"eu-west-1\",\n" +
                "                \"ap-northeast-2\",\n" +
                "                \"ap-northeast-1\",\n" +
                "                \"ca-central-1\",\n" +
                "                \"sa-east-1\",\n" +
                "                \"ap-southeast-1\",\n" +
                "                \"ap-southeast-2\",\n" +
                "                \"eu-central-1\",\n" +
                "                \"us-east-1\",\n" +
                "                \"us-east-2\",\n" +
                "                \"us-west-1\",\n" +
                "                \"us-west-2\"\n" +
                "            ]\n" +
                "        }\n" +
                "    }";

        MachineLearningProductEntityDetail actualDetail = mapper.readValue(json,
                MachineLearningProductEntityDetail.class);

        MachineLearningProductEntityDetail expectedDetail = new MachineLearningProductEntityDetail()
                .versions(Arrays.asList(
                        new Version()
                                .id("00000000-0000-0000-0000-000000000000")
                                .releaseNotes("ML version test 1")
                                .versionTitle("ML version test 1")
                                .creationDate("2025-06-12T20:57:59.172Z")
                                .sources(Collections.singletonList(
                                        new Source()
                                                .type("SageMakerModelPackage")
                                                .id("00000000-0000-0000-0000-000000000000")
                                                .modelPackageArn("arn:aws:sagemaker:us-east-2:123456789123:model-package/ml-test-model")
                                ))
                                .deliveryOptions(Arrays.asList(
                                        new DeliveryOption()
                                                .id("00000000-0000-0000-0000-000000000000")
                                                .type("SageMakerModelPackage")
                                                .sourceId("00000000-0000-0000-0000-000000000000")
                                                .shortDescription("SageMaker ModelDelivery Option")
                                                .instructions(new Instructions()
                                                        .usage("This is how you use your model package")
                                                        .sampleNotebookUrl("https://www.amazon.com")
                                                        .repositoryUrl("https://www.amazon.com")
                                                        .inputProperties(new InputProperties()
                                                                .description("Input should have all columns in the train/test file except for 'is_fraud' column.")
                                                                .limitations("Can predict on 1 input in the CSV only at a time")
                                                                .sampleInput(new Sample()
                                                                        .realtimeInferenceText("text")
                                                                        .batchTransformUrl("https://www.sampleData.com"))
                                                                .parameters(Arrays.asList(new Parameter()
                                                                        .name("prompt1")
                                                                        .description("Represents the instruct-style prompt for the model.")
                                                                        .constraints("Max size=100")
                                                                        .required(true), new Parameter()
                                                                        .name("maxTokens1")
                                                                        .description("Denotes the number of tokens to predict per generation.")
                                                                        .required(false)))
                                                                .sageMakerCustomAttributes(Collections.singletonList(new Parameter()
                                                                        .name("threshold1")
                                                                        .description("Threshold of the confidence score of the detected object")
                                                                        .constraints("MinValue : 0.0, MaxValue : 1.0, Required: true")
                                                                        .required(false))))
                                                        .outputProperties(new OutputProperties()
                                                                .description("The output is a JSON object that has the generated text along with likelihoods of tokens, if requested. See example json.")
                                                                .sampleOutput(new Sample()
                                                                        .realtimeInferenceUrl("https://www.sampledata.com")
                                                                        .batchTransformUrl("https://www.amazon.com"))
                                                                .parameters(Arrays.asList(new OutputParameter()
                                                                        .name("id")
                                                                        .description("An identifier for response")
                                                                        .alwaysReturned(false), new OutputParameter()
                                                                        .name("generations")
                                                                        .description("The generated text along with the likelihoods for tokens requested.")
                                                                        .alwaysReturned(false)))))
                                                .recommendedInstanceTypes(new RecommendedInstanceTypes()
                                                        .batchTransform("ml.m5.large")
                                                        .realtimeInference("ml.m5.large"))
                                                .supportedInstanceTypes(new SupportedInstanceTypes()
                                                        .batchTransform(Collections.singletonList("ml.m5.large"))
                                                        .realtimeInference(Collections.singletonList("ml.m5.large")))
                                                .visibility("Public")
                                                .title("SageMaker Model")
                                ))
                ))
                .description(new Description()
                        .productTitle("ML test product")
                        .productCode("a1cl2qqbjvpp7xurfh7oebrl8")
                        .shortDescription("Brief description")
                        .longDescription("Detailed description")
                        .highlights(Collections.singletonList("Sample highlight"))
                        .searchKeywords(Collections.singletonList("Sample keyword"))
                        .visibility("Limited")
                        .productState("Active")
                        .categories(Collections.singletonList("Operating Systems"))
                        .associatedProducts(null))
                .targeting(new Targeting()
                        .positiveTargeting(
                                new PositiveTargeting()
                                        .buyerAccounts(Collections.singletonList("123456789123"))))
                .promotionalResources(new PromotionalResources()
                        .logoUrl("https://awsmp-logos.s3.amazonaws.com/0000000000000000"))
                .supportInformation(new SupportInformation()
                        .description("Need help? Contact our AWS security experts at aws.marketplace.com."))
                .dimensions(Arrays.asList(
                        new Dimension()
                            .name("inference.count.m.i.c Inference Pricing")
                            .description("inference.count.m.i.c Inference Pricing")
                            .key("inference.count.m.i.c")
                            .unit("Requests")
                            .types(Collections.singletonList("Metered")),
                        new Dimension()
                            .name("ml.m5.large Inference (Batch)")
                            .description("Model inference on the ml.m5.large instance type, batch mode")
                            .key("ml.m5.large.m.i.b")
                            .unit("HostHrs")
                            .types(Collections.singletonList("Metered")),
                        new Dimension()
                            .name("ml.m5.large Inference (Real-Time)")
                            .description("Model inference on the ml.m5.large instance type, real-time mode")
                            .key("ml.m5.large.m.i.r")
                            .unit("HostHrs")
                            .types(Collections.singletonList("Metered"))))
                  .regionAvailability(new RegionAvailability()
                          .regions(Arrays.asList(
                                  "ap-south-1",
                                  "eu-north-1",
                                  "eu-west-3",
                                  "eu-west-2",
                                  "eu-west-1",
                                  "ap-northeast-2",
                                  "ap-northeast-1",
                                  "ca-central-1",
                                  "sa-east-1",
                                  "ap-southeast-1",
                                  "ap-southeast-2",
                                  "eu-central-1",
                                  "us-east-1",
                                  "us-east-2",
                                  "us-west-1",
                                  "us-west-2"
                          )));

        assertEquals(expectedDetail, actualDetail);
    }

    @Test
    public void MachineLearningProductDetailAlgorithm() throws Exception {
        String json = "{\n" +
                "        \"Versions\": [\n" +
                "            {\n" +
                "                \"Id\": \"00000000-0000-0000-0000-000000000000\",\n" +
                "                \"ReleaseNotes\": \"ML version test 1\",\n" +
                "                \"VersionTitle\": \"ML version test 1\",\n" +
                "                \"CreationDate\": \"2025-06-12T20:57:59.172Z\",\n" +
                "                \"Sources\": [\n" +
                "                    {\n" +
                "                        \"Type\": \"SageMakerAlgorithm\",\n" +
                "                        \"Id\": \"00000000-0000-0000-0000-000000000000\",\n" +
                "                        \"AlgorithmArn\": \"arn:aws:sagemaker:us-east-2:123456789123:algorithm/ml-test-algorithm\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"DeliveryOptions\": [\n" +
                "                    {\n" +
                "                        \"Id\": \"00000000-0000-0000-0000-000000000000\",\n" +
                "                        \"Type\": \"SageMakerAlgorithm\",\n" +
                "                        \"SourceId\": \"00000000-0000-0000-0000-000000000000\",\n" +
                "                        \"ShortDescription\": \"SageMaker AlgorithmDelivery Option\",\n" +
                "                        \"Instructions\": {\n" +
                "                            \"Usage\": \"https://aws.amazon.com\",\n" +
                "                            \"SampleNotebookUrl\": \"https://aws.amazon.com\",\n" +
                "                            \"RepositoryUrl\": \"https://aws.amazon.com\",\n" +
                "                            \"InputProperties\": {\n" +
                "                                \"Description\": \"v11\",\n" +
                "                                \"SampleInput\": {\n" +
                "                                    \"RealtimeInferenceText\": \"v1\",\n" +
                "                                    \"BatchTransformText\": \"v1\"\n" +
                "                                }\n" +
                "                            },\n" +
                "                            \"OutputProperties\": {\n" +
                "                                \"Description\": \"v11\",\n" +
                "                                \"SampleOutput\": {\n" +
                "                                    \"RealtimeInferenceText\": \"v1\",\n" +
                "                                    \"BatchTransformText\": \"v1\"\n" +
                "                                }\n" +
                "                            }\n" +
                "                        },\n" +
                "                        \"RecommendedInstanceTypes\": {\n" +
                "                            \"BatchTransform\": \"ml.c5.4xlarge\",\n" +
                "                            \"RealtimeInference\": \"ml.c5.xlarge\",\n" +
                "                            \"Training\": \"ml.m4.xlarge\"\n" +
                "                        },\n" +
                "                        \"SupportedInstanceTypes\": {\n" +
                "                            \"BatchTransform\": [\n" +
                "                                \"ml.p3.2xlarge\"\n" +
                "                            ],\n" +
                "                            \"RealtimeInference\": [\n" +
                "                                \"ml.m5.large\",\n" +
                "                                \"ml.m4.xlarge\"\n" +
                "                            ],\n" +
                "                            \"Training\": [\n" +
                "                                \"ml.m4.xlarge\"\n" +
                "                            ]\n" +
                "                        },\n" +
                "                        \"Visibility\": \"Public\",\n" +
                "                        \"Title\": \"SageMaker Algorithm\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ],\n" +
                "        \"Description\": {\n" +
                "            \"ProductTitle\": \"ML test product\",\n" +
                "            \"ProductCode\": \"a1cl2qqbjvpp7xurfh7oebrl8\",\n" +
                "            \"ShortDescription\": \"Brief description\",\n" +
                "            \"LongDescription\": \"Detailed description\",\n" +
                "            \"Sku\": null,\n" +
                "            \"Highlights\": [\n" +
                "                \"Sample highlight\"\n" +
                "            ],\n" +
                "            \"AssociatedProducts\": null,\n" +
                "            \"SearchKeywords\": [\n" +
                "                \"Sample keyword\"\n" +
                "            ],\n" +
                "            \"Visibility\": \"Limited\",\n" +
                "            \"ProductState\": \"Active\",\n" +
                "            \"Categories\": [\n" +
                "                \"Operating Systems\"\n" +
                "            ]\n" +
                "        },\n" +
                "        \"Targeting\": {\n" +
                "            \"PositiveTargeting\": {\n" +
                "                \"BuyerAccounts\": [\n" +
                "                    \"123456789123\"\n" +
                "                ]\n" +
                "            }\n" +
                "        },\n" +
                "        \"PromotionalResources\": {\n" +
                "            \"LogoUrl\": \"https://awsmp-logos.s3.amazonaws.com/0000000000000000\",\n" +
                "            \"Videos\": [],\n" +
                "            \"AdditionalResources\": []\n" +
                "        },\n" +
                "        \"Dimensions\": [\n" +
                "            {\n" +
                "                \"Name\": \"inference.count.m.i.c Inference Pricing\",\n" +
                "                \"Description\": \"inference.count.m.i.c Inference Pricing\",\n" +
                "                \"Key\": \"inference.count.m.i.c\",\n" +
                "                \"Unit\": \"Requests\",\n" +
                "                \"Types\": [\n" +
                "                    \"Metered\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"Name\": \"ml.m5.large Inference (Batch)\",\n" +
                "                \"Description\": \"Model inference on the ml.m5.large instance type, batch mode\",\n" +
                "                \"Key\": \"ml.m5.large.m.i.b\",\n" +
                "                \"Unit\": \"HostHrs\",\n" +
                "                \"Types\": [\n" +
                "                    \"Metered\"\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"Name\": \"ml.m5.large Inference (Real-Time)\",\n" +
                "                \"Description\": \"Model inference on the ml.m5.large instance type, real-time mode\",\n" +
                "                \"Key\": \"ml.m5.large.m.i.r\",\n" +
                "                \"Unit\": \"HostHrs\",\n" +
                "                \"Types\": [\n" +
                "                    \"Metered\"\n" +
                "                ]\n" +
                "            }\n" +
                "        ],\n" +
                "        \"SupportInformation\": {\n" +
                "            \"Description\": \"Need help? Contact our AWS security experts at aws.marketplace.com.\"\n" +
                "        },\n" +
                "        \"RegionAvailability\": {\n" +
                "            \"FutureRegionSupport\": null,\n" +
                "            \"Restrict\": [],\n" +
                "            \"Regions\": [\n" +
                "                \"ap-south-1\",\n" +
                "                \"eu-north-1\",\n" +
                "                \"eu-west-3\",\n" +
                "                \"eu-west-2\",\n" +
                "                \"eu-west-1\",\n" +
                "                \"ap-northeast-2\",\n" +
                "                \"ap-northeast-1\",\n" +
                "                \"ca-central-1\",\n" +
                "                \"sa-east-1\",\n" +
                "                \"ap-southeast-1\",\n" +
                "                \"ap-southeast-2\",\n" +
                "                \"eu-central-1\",\n" +
                "                \"us-east-1\",\n" +
                "                \"us-east-2\",\n" +
                "                \"us-west-1\",\n" +
                "                \"us-west-2\"\n" +
                "            ]\n" +
                "        }\n" +
                "    }";

        MachineLearningProductEntityDetail actualDetail = mapper.readValue(json,
                MachineLearningProductEntityDetail.class);

        MachineLearningProductEntityDetail expectedDetail = new MachineLearningProductEntityDetail()
                .versions(Arrays.asList(
                        new Version()
                                .id("00000000-0000-0000-0000-000000000000")
                                .releaseNotes("ML version test 1")
                                .versionTitle("ML version test 1")
                                .creationDate("2025-06-12T20:57:59.172Z")
                                .sources(Collections.singletonList(
                                        new Source()
                                                .type("SageMakerAlgorithm")
                                                .id("00000000-0000-0000-0000-000000000000")
                                                .algorithmArn("arn:aws:sagemaker:us-east-2:123456789123:algorithm/ml-test-algorithm")
                                ))
                                .deliveryOptions(Arrays.asList(
                                        new DeliveryOption()
                                                .id("00000000-0000-0000-0000-000000000000")
                                                .type("SageMakerAlgorithm")
                                                .sourceId("00000000-0000-0000-0000-000000000000")
                                                .shortDescription("SageMaker AlgorithmDelivery Option")
                                                .instructions(new Instructions()
                                                        .usage("https://aws.amazon.com")
                                                        .sampleNotebookUrl("https://aws.amazon.com")
                                                        .repositoryUrl("https://aws.amazon.com")
                                                        .inputProperties(new InputProperties()
                                                                .description("v11")
                                                                .sampleInput(new Sample()
                                                                        .realtimeInferenceText("v1")
                                                                        .batchTransformText("v1")))
                                                        .outputProperties(new OutputProperties()
                                                                .description("v11")
                                                                .sampleOutput(new Sample()
                                                                        .realtimeInferenceText("v1")
                                                                        .batchTransformText("v1"))))
                                                .recommendedInstanceTypes(new RecommendedInstanceTypes()
                                                        .batchTransform("ml.c5.4xlarge")
                                                        .realtimeInference("ml.c5.xlarge")
                                                        .training("ml.m4.xlarge"))
                                                .supportedInstanceTypes(new SupportedInstanceTypes()
                                                        .batchTransform(Collections.singletonList("ml.p3.2xlarge"))
                                                        .realtimeInference(Arrays.asList("ml.m5.large", "ml.m4.xlarge"))
                                                        .training(Collections.singletonList("ml.m4.xlarge")))
                                                .visibility("Public")
                                                .title("SageMaker Algorithm")
                                ))
                ))
                .description(new Description()
                        .productTitle("ML test product")
                        .productCode("a1cl2qqbjvpp7xurfh7oebrl8")
                        .shortDescription("Brief description")
                        .longDescription("Detailed description")
                        .highlights(Collections.singletonList("Sample highlight"))
                        .searchKeywords(Collections.singletonList("Sample keyword"))
                        .visibility("Limited")
                        .productState("Active")
                        .categories(Collections.singletonList("Operating Systems"))
                        .associatedProducts(null))
                .targeting(new Targeting()
                        .positiveTargeting(
                                new PositiveTargeting()
                                        .buyerAccounts(Collections.singletonList("123456789123"))))
                .promotionalResources(new PromotionalResources()
                        .logoUrl("https://awsmp-logos.s3.amazonaws.com/0000000000000000"))
                .supportInformation(new SupportInformation()
                        .description("Need help? Contact our AWS security experts at aws.marketplace.com."))
                .dimensions(Arrays.asList(
                        new Dimension()
                                .name("inference.count.m.i.c Inference Pricing")
                                .description("inference.count.m.i.c Inference Pricing")
                                .key("inference.count.m.i.c")
                                .unit("Requests")
                                .types(Collections.singletonList("Metered")),
                        new Dimension()
                                .name("ml.m5.large Inference (Batch)")
                                .description("Model inference on the ml.m5.large instance type, batch mode")
                                .key("ml.m5.large.m.i.b")
                                .unit("HostHrs")
                                .types(Collections.singletonList("Metered")),
                        new Dimension()
                                .name("ml.m5.large Inference (Real-Time)")
                                .description("Model inference on the ml.m5.large instance type, real-time mode")
                                .key("ml.m5.large.m.i.r")
                                .unit("HostHrs")
                                .types(Collections.singletonList("Metered"))))
                .regionAvailability(new RegionAvailability()
                        .regions(Arrays.asList(
                                "ap-south-1",
                                "eu-north-1",
                                "eu-west-3",
                                "eu-west-2",
                                "eu-west-1",
                                "ap-northeast-2",
                                "ap-northeast-1",
                                "ca-central-1",
                                "sa-east-1",
                                "ap-southeast-1",
                                "ap-southeast-2",
                                "eu-central-1",
                                "us-east-1",
                                "us-east-2",
                                "us-west-1",
                                "us-west-2"
                        )));

        assertEquals(expectedDetail, actualDetail);
    }
}
