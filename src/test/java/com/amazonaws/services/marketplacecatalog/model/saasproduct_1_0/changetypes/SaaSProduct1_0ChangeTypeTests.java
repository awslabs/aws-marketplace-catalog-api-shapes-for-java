package com.amazonaws.services.marketplacecatalog.model.saasproduct_1_0.changetypes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.util.Arrays;
import java.util.Collections;

public class SaaSProduct1_0ChangeTypeTests {
    private static ObjectMapper mapper;

    @BeforeAll
    public static void setup() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
    }

    @Test
    public void testUpdateInformationChangeDetail() throws Exception {
        UpdateInformationChangeDetail detail = new UpdateInformationChangeDetail()
                .productTitle("MyProductTitle")
                .shortDescription("My Product")
                .longDescription("My Product long description")
                .sku("SKU")
                .videoUrls(Collections.singletonList("https://s3.amazonaws.com/awsmp-media/video.mp4"))
                .logoUrl("https://s3.amazonaws.com/awsmp-logos/logo.png")
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
    public void testAddDeliveryOptionsChangeDetail() throws Exception {
        AddDeliveryOptionsChangeDetail detail = new AddDeliveryOptionsChangeDetail()
                .deliveryOptions(Collections.singletonList(new AddDeliveryOption()
                        .details(new AddDeliveryOptionDetails()
                                .saaSUrlDeliveryOptionDetails(new AddSaaSUrlDeliveryOptionDetails()
                                        .fulfillmentUrl("https://amazon.com")
                                        .launchUrl("https://amazon.com")
                                        .deploymentTemplates(Collections.singletonList(new DeploymentTemplate()
                                                .title("title")
                                                .description("description")
                                                .iamPolicy("iam policy")
                                                .cloudFormationDetails(new CloudFormationDetails()
                                                        .defaultStackName("stack-name")
                                                        .templateUrl("https://www.example.s3.amazonaws.com/example.txt"))))
                                        .usageInstructions("instructions")
                                        .quickLaunchEnabled(Boolean.FALSE)))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptions\": [{\n" +
                "      \"Details\": {\n" +
                "          \"SaaSUrlDeliveryOptionDetails\":  {\n" +
                "            \"FulfillmentUrl\": \"https://amazon.com\",\n" +
                "            \"LaunchUrl\": \"https://amazon.com\",\n" +
                "            \"DeploymentTemplates\": [{\n" +
                "              \"Title\": \"title\",\n" +
                "              \"Description\": \"description\",\n" +
                "              \"IamPolicy\": \"iam policy\",\n" +
                "              \"CloudFormationDetails\": {\n" +
                "                \"DefaultStackName\": \"stack-name\",\n" +
                "                \"TemplateUrl\": \"https://www.example.s3.amazonaws.com/example.txt\"\n" +
                "              }\n" +
                "            }],\n" +
                "            \"UsageInstructions\": \"instructions\",\n" +
                "            \"QuickLaunchEnabled\": false\n" +
                "          }\n" +
                "      }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateDeliveryOptionsChangeDetail() throws Exception {
        UpdateDeliveryOptionsChangeDetail detail = new UpdateDeliveryOptionsChangeDetail()
                .deliveryOptions(Collections.singletonList(new UpdateDeliveryOption()
                        .id("do-1234567891234567891234")
                        .details(new UpdateDeliveryOptionDetails()
                                .saaSUrlDeliveryOptionDetails(new UpdateSaaSUrlDeliveryOptionDetails()
                                        .fulfillmentUrl("https://amazon.com")
                                        .launchUrl("https://amazon.com")
                                        .deploymentTemplates(Collections.singletonList(new DeploymentTemplate()
                                                .title("title")
                                                .description("description")
                                                .iamPolicy("iam policy")
                                                .cloudFormationDetails(new CloudFormationDetails()
                                                        .defaultStackName("stack-name")
                                                        .templateUrl("https://www.example.s3.amazonaws.com/example.txt"))))
                                        .usageInstructions("instructions")))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptions\": [{\n" +
                "      \"Id\": \"do-1234567891234567891234\",\n" +
                "      \"Details\": {\n" +
                "          \"SaaSUrlDeliveryOptionDetails\":  {\n" +
                "            \"FulfillmentUrl\": \"https://amazon.com\",\n" +
                "            \"LaunchUrl\": \"https://amazon.com\",\n" +
                "            \"DeploymentTemplates\": [{\n" +
                "              \"Title\": \"title\",\n" +
                "              \"Description\": \"description\",\n" +
                "              \"IamPolicy\": \"iam policy\",\n" +
                "              \"CloudFormationDetails\": {\n" +
                "                \"DefaultStackName\": \"stack-name\",\n" +
                "                \"TemplateUrl\": \"https://www.example.s3.amazonaws.com/example.txt\"\n" +
                "              }\n" +
                "            }],\n" +
                "            \"UsageInstructions\": \"instructions\"\n" +
                "          }\n" +
                "      }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateDeliveryOptionsVisibilityChangeDetail() throws Exception {
        UpdateDeliveryOptionsVisibilityChangeDetail detail = new UpdateDeliveryOptionsVisibilityChangeDetail()
                .deliveryOptions(Arrays.asList(
                        new UpdateDeliveryOptionVisibility()
                                .id("do-1234567891234567891234")
                                .targetVisibility(UpdateDeliveryOptionsTargetVisibility.PUBLIC),
                        new UpdateDeliveryOptionVisibility()
                                .id("do-43210987654321")
                                .targetVisibility(UpdateDeliveryOptionsTargetVisibility.LIMITED)
                                .targeting(new Targeting()
                                        .positiveTargeting(new PositiveTargeting()
                                                .buyerAccounts(Collections.singletonList("123456789012"))))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptions\": [{\n" +
                "      \"Id\": \"do-1234567891234567891234\",\n" +
                "      \"TargetVisibility\": \"Public\"\n" +
                "  }, {\n" +
                "      \"Id\": \"do-43210987654321\",\n" +
                "      \"TargetVisibility\": \"Limited\",\n" +
                "      \"Targeting\": {\n" +
                "        \"PositiveTargeting\": {\n" +
                "          \"BuyerAccounts\": [\"123456789012\"]\n" +
                "        }\n" +
                "      }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
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
    public void testRestrictDimensionChangeDetail() throws Exception {
        RestrictDimensionChangeDetail detail = new RestrictDimensionChangeDetail()
                .key("Basic")
                .types(Arrays.asList(DimensionType.EXTERNALLY_METERED, DimensionType.METERED));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"Key\": \"Basic\",\n" +
                "  \"Types\": [\"ExternallyMetered\", \"Metered\"]\n" +
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

    @Test
    public void testAddApiDeliveryOptionsChangeDetail() throws Exception {
        AddDeliveryOptionsChangeDetail detail = new AddDeliveryOptionsChangeDetail()
                .deliveryOptions(Collections.singletonList(new AddDeliveryOption()
                        .details(new AddDeliveryOptionDetails()
                                .apiDeliveryOptionDetails(new AddApiDeliveryOptionDetails()
                                        .apiType(ApiType.MCP_SERVER)
                                        .quickLaunchEnabled(Boolean.TRUE)
                                        .compatibleServices(Collections.singletonList(CompatibleService.BEDROCK_AGENT_CORE))
                                        .fulfillmentUrl("https://api.example.com/register")
                                        .usageInstructions("Connect to our MCP server endpoint")
                                        .endpoints(Collections.singletonList(new ApiEndpoint()
                                                .name("MainEndpoint")
                                                .endpointUrl("https://api.example.com/mcp")
                                                .description("Main MCP server endpoint")
                                                .authorizationTypes(Collections.singletonList(AuthorizationType.API_KEY))
                                                .schemas(Collections.emptyList())
                                                .integrationProtocols(Collections.singletonList(new IntegrationProtocol()
                                                        .type(ProtocolType.MCP)
                                                        .usageInstructions("Use MCP protocol for integration")))))))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptions\": [{\n" +
                "      \"Details\": {\n" +
                "          \"ApiDeliveryOptionDetails\":  {\n" +
                "            \"ApiType\": \"MCP_SERVER\",\n" +
                "            \"QuickLaunchEnabled\": true,\n" +
                "            \"CompatibleServices\": [\"Bedrock-AgentCore\"],\n" +
                "            \"FulfillmentUrl\": \"https://api.example.com/register\",\n" +
                "            \"UsageInstructions\": \"Connect to our MCP server endpoint\",\n" +
                "            \"Endpoints\": [{\n" +
                "              \"Name\": \"MainEndpoint\",\n" +
                "              \"EndpointUrl\": \"https://api.example.com/mcp\",\n" +
                "              \"Description\": \"Main MCP server endpoint\",\n" +
                "              \"AuthorizationTypes\": [\"API_KEY\"],\n" +
                "              \"IntegrationProtocols\": [{\n" +
                "                \"Type\": \"MCP\",\n" +
                "                \"UsageInstructions\": \"Use MCP protocol for integration\"\n" +
                "              }]\n" +
                "            }]\n" +
                "          }\n" +
                "      }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testUpdateApiDeliveryOptionsChangeDetail() throws Exception {
        UpdateDeliveryOptionsChangeDetail detail = new UpdateDeliveryOptionsChangeDetail()
                .deliveryOptions(Collections.singletonList(new UpdateDeliveryOption()
                        .id("do-api123456789")
                        .details(new UpdateDeliveryOptionDetails()
                                .apiDeliveryOptionDetails(new UpdateApiDeliveryOptionDetails()
                                        .usageInstructions("Updated MCP server instructions")
                                        .endpoints(Collections.singletonList(new ApiEndpoint()
                                                .endpointUrl("https://api.example.com/mcp/v2")
                                                .authorizationTypes(Collections.singletonList(AuthorizationType.OAUTH2))))))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptions\": [{\n" +
                "      \"Id\": \"do-api123456789\",\n" +
                "      \"Details\": {\n" +
                "          \"ApiDeliveryOptionDetails\":  {\n" +
                "            \"UsageInstructions\": \"Updated MCP server instructions\",\n" +
                "            \"Endpoints\": [{\n" +
                "              \"EndpointUrl\": \"https://api.example.com/mcp/v2\",\n" +
                "              \"AuthorizationTypes\": [\"OAUTH2\"]\n" +
                "            }]\n" +
                "          }\n" +
                "      }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAddApiDeliveryOptionsWithSchemasChangeDetail() throws Exception {
        AddDeliveryOptionsChangeDetail detail = new AddDeliveryOptionsChangeDetail()
                .deliveryOptions(Collections.singletonList(new AddDeliveryOption()
                        .details(new AddDeliveryOptionDetails()
                                .apiDeliveryOptionDetails(new AddApiDeliveryOptionDetails()
                                        .apiType(ApiType.MCP_SERVER)
                                        .quickLaunchEnabled(Boolean.TRUE)
                                        .compatibleServices(Collections.singletonList(CompatibleService.BEDROCK_AGENT_CORE))
                                        .fulfillmentUrl("https://api.example.com/register")
                                        .usageInstructions("Connect to our MCP server endpoint")
                                        .endpoints(Collections.singletonList(new ApiEndpoint()
                                                .name("MainEndpoint")
                                                .endpointUrl("https://api.example.com/mcp")
                                                .description("Main MCP server endpoint")
                                                .authorizationTypes(Collections.singletonList(AuthorizationType.API_KEY))
                                                .schemas(Collections.singletonList(new ApiSchema()
                                                        .type(SchemaType.OPEN_API)
                                                        .schemaUrl("https://api.example.com/schema.json")))
                                                .integrationProtocols(Collections.singletonList(new IntegrationProtocol()
                                                        .type(ProtocolType.MCP)
                                                        .usageInstructions("Use MCP protocol for integration")))))))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptions\": [{\n" +
                "      \"Details\": {\n" +
                "          \"ApiDeliveryOptionDetails\":  {\n" +
                "            \"ApiType\": \"MCP_SERVER\",\n" +
                "            \"QuickLaunchEnabled\": true,\n" +
                "            \"CompatibleServices\": [\"Bedrock-AgentCore\"],\n" +
                "            \"FulfillmentUrl\": \"https://api.example.com/register\",\n" +
                "            \"UsageInstructions\": \"Connect to our MCP server endpoint\",\n" +
                "            \"Endpoints\": [{\n" +
                "              \"Name\": \"MainEndpoint\",\n" +
                "              \"EndpointUrl\": \"https://api.example.com/mcp\",\n" +
                "              \"Description\": \"Main MCP server endpoint\",\n" +
                "              \"AuthorizationTypes\": [\"API_KEY\"],\n" +
                "              \"Schemas\": [{\n" +
                "                \"Type\": \"OPEN_API\",\n" +
                "                \"SchemaUrl\": \"https://api.example.com/schema.json\"\n" +
                "              }],\n" +
                "              \"IntegrationProtocols\": [{\n" +
                "                \"Type\": \"MCP\",\n" +
                "                \"UsageInstructions\": \"Use MCP protocol for integration\"\n" +
                "              }]\n" +
                "            }]\n" +
                "          }\n" +
                "      }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }

    @Test
    public void testAddApiDeliveryOptionsWithDynamicEndpointChangeDetail() throws Exception {
        AddDeliveryOptionsChangeDetail detail = new AddDeliveryOptionsChangeDetail()
                .deliveryOptions(Collections.singletonList(new AddDeliveryOption()
                        .details(new AddDeliveryOptionDetails()
                                .apiDeliveryOptionDetails(new AddApiDeliveryOptionDetails()
                                        .apiType(ApiType.MCP_SERVER)
                                        .quickLaunchEnabled(Boolean.TRUE)
                                        .compatibleServices(Collections.singletonList(CompatibleService.BEDROCK_AGENT_CORE))
                                        .fulfillmentUrl("https://api.example.com/register")
                                        .usageInstructions("Connect to our MCP server endpoint")
                                        .endpoints(Collections.singletonList(new ApiEndpoint()
                                                .name("DynamicEndpoint")
                                                .endpointType(EndpointType.DYNAMIC)
                                                .endpointUrl("https://api.example.com/v1/{tenantId}/agent")
                                                .description("Dynamic MCP server endpoint")
                                                .authorizationTypes(Collections.singletonList(AuthorizationType.API_KEY))
                                                .integrationProtocols(Collections.singletonList(new IntegrationProtocol()
                                                        .type(ProtocolType.MCP)
                                                        .usageInstructions("Use MCP protocol for integration")))
                                                .endpointUrlParameters(Collections.singletonList(new EndpointUrlParameter()
                                                        .name("tenantId")
                                                        .description("Buyer tenant identifier")
                                                        .defaultValue("default-tenant")))))))));

        String actualJson = mapper.writeValueAsString(detail);

        String expectedJson = "{\n" +
                "  \"DeliveryOptions\": [{\n" +
                "      \"Details\": {\n" +
                "          \"ApiDeliveryOptionDetails\":  {\n" +
                "            \"ApiType\": \"MCP_SERVER\",\n" +
                "            \"QuickLaunchEnabled\": true,\n" +
                "            \"CompatibleServices\": [\"Bedrock-AgentCore\"],\n" +
                "            \"FulfillmentUrl\": \"https://api.example.com/register\",\n" +
                "            \"UsageInstructions\": \"Connect to our MCP server endpoint\",\n" +
                "            \"Endpoints\": [{\n" +
                "              \"Name\": \"DynamicEndpoint\",\n" +
                "              \"EndpointType\": \"DYNAMIC\",\n" +
                "              \"EndpointUrl\": \"https://api.example.com/v1/{tenantId}/agent\",\n" +
                "              \"Description\": \"Dynamic MCP server endpoint\",\n" +
                "              \"AuthorizationTypes\": [\"API_KEY\"],\n" +
                "              \"IntegrationProtocols\": [{\n" +
                "                \"Type\": \"MCP\",\n" +
                "                \"UsageInstructions\": \"Use MCP protocol for integration\"\n" +
                "              }],\n" +
                "              \"EndpointUrlParameters\": [{\n" +
                "                \"Name\": \"tenantId\",\n" +
                "                \"Description\": \"Buyer tenant identifier\",\n" +
                "                \"DefaultValue\": \"default-tenant\"\n" +
                "              }]\n" +
                "            }]\n" +
                "          }\n" +
                "      }\n" +
                "  }]\n" +
                "}";

        JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.NON_EXTENSIBLE);
    }
}
