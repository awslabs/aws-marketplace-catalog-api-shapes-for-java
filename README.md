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

## Overview
You may need to reference [AWS Marketplace Catalog API](https://docs.aws.amazon.com/marketplace-catalog/latest/api-reference/welcome.html)
documentation for the terminologies used for this section.  
AWS Marketplace Catalog API utilizes freeform JSONs as part of the StartChangeSet request and DescribeEntity response
structures.  
AWS Marketplace entities are containers of data which serve different business purposes. 
Entities are categorized by types. Each entity type encapsulates data related to a specific business domain 
(for example, a product or a seller account).  
When you call DescribeEntity, the operation returns the metadata and the content of the entity as a JSON payload under 
the `DetailsDocument` field. This library contains POJO that represents the various entity types available in AWS 
Marketplace Catalog API.
JSON payloads are similarly used in StartChangeSet to define the changes you want to make to an entity. Each entity 
type may contain several types of changes available, and each accepts JSON payload that is specific to each change type.
This library contains POJO that represents the various change types available in AWS Marketplace Catalog API. When 
constructing a StartChangeSet request, you would put your JSON payload under the `DetailsDocument` field.

## Conventions
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
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.changetypes.*;
import com.amazonaws.services.marketplacecatalog.model.saasproduct_1_0.entitytype.SaaSProductEntityDetail;
import com.amazonaws.services.marketplacecatalog.utils.DocumentConverter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.core.document.Document;
import software.amazon.awssdk.services.marketplacecatalog.model.*;
import software.amazon.awssdk.services.marketplacecatalog.MarketplaceCatalogClient;
import java.util.Arrays;
import java.util.Collections;

public class Capi {
    
    private final ObjectMapper mapper;
    private final MarketplaceCatalogClient marketplaceCatalogClient;
    
    public Capi() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        marketplaceCatalogClient = setupClient(); // See SDK guide on how to set up a client
    }
    
    public void AmiAddDeliveryOptions() {
        AddDeliveryOptionsChangeDetail detail = new AddDeliveryOptionsChangeDetail()
                .version(new AddVersion()
                        .versionTitle("Version title")
                        .releaseNotes("Release notes"))
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
                                                        .relativePath("index.html"))
                                                .securityGroups(Collections.singletonList(new SecurityGroup()
                                                        .ipProtocol("tcp")
                                                        .fromPort(443)
                                                        .toPort(443)
                                                        .ipRanges(Collections.singletonList("0.0.0.0/0"))))))));

        Document details = DocumentConverter.jsonToDocument(mapper.writeValueAsString(detail));

        Entity inputEntity = Entity.builder()
                .identifier("example1-abcd-1234-5ef6-7890abcdef12")
                .type("AmiProduct@1.0")
                .build();

        Change inputChangeRequest = Change.builder()
                .changeType("AddDeliveryOptions")
                .entity(inputEntity)
                .detailsDocument(details)
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

        String detailsDocument = describeEntityResponse.detailsDocument().toString();

        SaaSProductEntityDetail entityDetail = mapper.readValue(detailsDocument, SaaSProductEntityDetail.class);

        System.out.println(entityDetail);
    }
}
```

You may additionally reference the tests in the test directory on how to construct all change types available with this library.

## Working with Offers
The intended process for making updates through Offer change types is to call DescribeEntity and use relevant field instances 
directly from the deserialized results. Below is some sample code demonstrating how to deserialize a DescribeEntity
response and use it to construct the details for a change where we update the currency code for
ConfigurableUpfrontPricingTerm.

```java
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.OfferEntityDetail;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.PricingModel;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.UpdatePricingTermsChangeDetail;
import com.amazonaws.services.marketplacecatalog.utils.DocumentConverter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.core.document.Document;
import software.amazon.awssdk.services.marketplacecatalog.model.*;
import software.amazon.awssdk.services.marketplacecatalog.MarketplaceCatalogClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Capi {

    private final ObjectMapper mapper;
    private final MarketplaceCatalogClient marketplaceCatalogClient;

    public Capi() {
        mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        marketplaceCatalogClient = setupClient(); // See SDK guide on how to set up a client
    }

    public void UpdateOfferTermsExample() {
        DescribeEntityRequest describeEntityRequest = DescribeEntityRequest.builder()
                .catalog("AWSMarketplace")
                .entityId("example1-abcd-1234-5ef6-7890abcdef12")
                .build();

        DescribeEntityResponse describeEntityResponse = marketplaceCatalogClient.describeEntity(describeEntityRequest);

        String detailsDocument = describeEntityResponse.detailsDocument().toString();

        OfferEntityDetail entityDetail = mapper.readValue(detailsDocument, OfferEntityDetail.class);

        List<Term> updateTerms = entityDetail.getTerms();
        if (updateTerms != null) {
            updateTerms.stream()
                    .filter(term -> term.getType() != null && term.equals("ConfigurableUpfrontPricingTerm"))
                    .forEach(term -> term.setCurrencyCode("AUD"));
        }

        UpdatePricingTermsChangeDetail updatePricingTermsChangeDetail = new UpdatePricingTermsChangeDetail()
                .terms(updateTerms);

        Document details = DocumentConverter.jsonToDocument(mapper.writeValueAsString(updatePricingTermsChangeDetail));

        Entity inputEntity = Entity.builder()
                .identifier("example1-abcd-1234-5ef6-7890abcdef12")
                .type("OfferProduct@1.0")
                .build();

        Change inputChangeRequest = Change.builder()
                .changeType("UpdatePricingTerms")
                .entity(inputEntity)
                .detailsDocument(details)
                .build();

        StartChangeSetRequest startChangeSetRequest = StartChangeSetRequest.builder()
                .catalog("AWSMarketplace")
                .changeSet(inputChangeRequest)
                .build();

        System.out.println(marketplaceCatalogClient.startChangeSet(startChangeSetRequest));
    }
}
```

You may notice that Offer has an additional appendix with specific Term types (e.g. LegalTerm, FreeTrialPricingTerm, etc.). 
These shapes are included to help construct the corresponding change type details (e.g. UpdateLegalTerms, UpdatePricingTerms, 
etc.) with the proper fields and values if you choose to do so freehand (instead of copying from DescribeEntity results). 
There is an OfferConverter class which will allow you to convert between a specific term (such as ConfigurableUpfrontPricingTerm) 
to the general Term that is used in the change type. Please see the unit test suite for examples on how to use the converters. 

There is also a converter for the UpdateInformationChangeDetail change type to allow you to leverage the AcquisitionChannel
and PricingModel enums and ensure that the values are correct.

## License
AWS Marketplace Catalog API Shape Library for Java is licensed under the Apache 2.0 License. See LICENSE and NOTICE
for more information.
