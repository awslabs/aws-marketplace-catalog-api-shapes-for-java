# AWS Marketplace Catalog API Shape Library for Java
AWS Marketplace Catalog API Shape Library for Java contains a collection of change type and entity type shapes used in
[AWS Marketplace Catalog API](https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html),
modeled using Java objects. You can use this library to serialize to, and deserialize from the JSON payloads needed to
programmatically call Catalog API.

## How to build
* Download the source locally.
* `./gradlew build` or `gradlew.bat build`. You may need to grant proper permissions in order to run the Gradle Wrapper.
* Include the generated `.jar` under `build/lib` file in your classpath or IDE to begin development.
* You will additionally need to grab the implementation dependencies defined in `build.gradle.kts` in your classpath.
* Alternatively, you can include this repo as a [Gradle source dependency](https://blog.gradle.org/introducing-source-dependencies).

## Conventions
You may need to reference [AWS Marketplace Catalog API](https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html) 
documentation for the terminologies used for this section.  
This library separates entity types in individual Java packages with its entity name and version as part of the package name.
For example, `amiproduct_1_0` and `offer_1_0`.
Within each package contains all shapes associated with the entity type.  
Classes with suffix `EntityDetail` indicate it is the root shape of an entity type.
For example, `AmiProductEntityDetail` is the root shape of `AmiProduct` entity type.
This POJO represents the JSON payload you would receive when you call DescribeEntity on an Ami product.  
Classes with suffix `ChangeDetail` indicate it is the root shape of a change type.
For example, `AddDeliveryOptionsChangeDetail` is the root shape of `AddDeliveryOptions` change type.
This POJO represents the JSON payload you would need to construct in order to call StartChangeSet with an Ami product 
AddDeliveryOptions change type.


## Usage with AWS SDK for Java
This library is intended to be used with [AWS SDK for Java](https://aws.amazon.com/sdk-for-java/). See the link for
documentations on how to download and use the SDK.  
To work with AWS Marketplace Catalog API, ensure you have the 
[marketplacecatalog](https://mvnrepository.com/artifact/software.amazon.awssdk/marketplacecatalog) SDK module.  

Below is some sample code to make an StartChangeSet call with AddDeliveryOptions change on an Ami product
and to deserialize the results of a DescribeEntity call into an object:
```java
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.services.marketplacecatalog.model.*;
import software.amazon.awssdk.services.marketplacecatalog.MarketplaceCatalogClient;

public class Capi {
    
    private final ObjectMapper mapper;
    private final MarketplaceCatalogClient marketplaceCatalogClient;
    
    public Capi() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        marketplaceCatalogClient = setupClient(); // See SDK guide on how to set up a client
    }
    
    public void AmiAddDeliveryOptions() {
        AddDeliveryOptionsChangeDetail detail = new AddDeliveryOptionsChangeDetail()
                .version(new AddVersion()
                        .versionTitle("Version title")
                        .releaseNotes(("Release notes")))
                .deliveryOptions(Arrays.asList(
                        new AddDeliveryOption()
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

        String details = mapper.writeValueAsString(detail);

        Entity inputEntity = Entity.builder()
                .identifier("example1-abcd-1234-5ef6-7890abcdef12")
                .type("AmiProduct@1.0")
                .build();

        Change inputChangeRequest = Change.builder()
                .changeType("AddDeliveryOptions")
                .entity(inputEntity)
                .details(details)
                .build();

        StartChangeSetRequest startChangeSetRequest = StartChangeSetRequest.builder()
                .catalog("AWSMarketplace")
                .changeSet(inputChangeRequest)
                .build();

        System.out.println(marketplaceCatalogClient.startChangeSet(startChangeSetRequest));
    }
    
    public void SaaSDescribeEntityCall() {
        DescribeEntityRequest describeEntityRequest = DescribeEntityRequest.builder()
                .catalog("AWSMarketplace")
                .entityId("example1-abcd-1234-5ef6-7890abcdef12")
                .build();

        DescribeEntityResponse describeEntityResponse = marketplaceCatalogClient.describeEntity(describeEntityRequest);

        String detailsDocument = describeEntityResponse.getDetailsDocument().asString();

        SaaSProductEntityDetail entityDetail = mapper.readValue(detailsDocument, SaaSProductEntityDetail.class);

        System.out.println(entityDetail);
    }
}
```

You may additionally reference the tests in the test directory on how to construct all change types available with this library.

## 🚧 Preview Release Warning 🚧

This codebase is currently a preview release.
While we've done our best to ensure its functionality, there may still be unforeseen bugs and issues.
As such, we advise against using this version in production environments or critical systems.  

Please note that future changes to this codebase may not be backwards compatible.
We're actively working on improvements and updates, and while we strive to maintain compatibility where possible,
there may be instances where changes are necessary for the overall usability of the software.  

We appreciate your understanding and patience as we continue to refine and enhance this project.
If you encounter any issues or have feedback, please don't hesitate to open an issue on GitHub.
Thank you for your interest and support!

## License
AWS Marketplace Catalog API Shape Library for Java is licensed under the Apache 2.0 License. See LICENSE and NOTICE
for more information.
