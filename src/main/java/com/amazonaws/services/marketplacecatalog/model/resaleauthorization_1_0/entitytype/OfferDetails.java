/*
 * ResaleAuthorization_1_0_EntityType
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.entitytype;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OfferDetails
 */
@JsonPropertyOrder({
  OfferDetails.JSON_PROPERTY_OFFER_EXTENDED_STATUS,
  OfferDetails.JSON_PROPERTY_OFFER_CREATED_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OfferDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_OFFER_EXTENDED_STATUS = "OfferExtendedStatus";
  private String offerExtendedStatus;

  public static final String JSON_PROPERTY_OFFER_CREATED_COUNT = "OfferCreatedCount";
  private Integer offerCreatedCount;

  public OfferDetails() {
  }

  public OfferDetails offerExtendedStatus(String offerExtendedStatus) {
    
    this.offerExtendedStatus = offerExtendedStatus;
    return this;
  }

   /**
   * Get offerExtendedStatus
   * @return offerExtendedStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFER_EXTENDED_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOfferExtendedStatus() {
    return offerExtendedStatus;
  }


  @JsonProperty(JSON_PROPERTY_OFFER_EXTENDED_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfferExtendedStatus(String offerExtendedStatus) {
    this.offerExtendedStatus = offerExtendedStatus;
  }


  public OfferDetails offerCreatedCount(Integer offerCreatedCount) {
    
    this.offerCreatedCount = offerCreatedCount;
    return this;
  }

   /**
   * Get offerCreatedCount
   * @return offerCreatedCount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFER_CREATED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOfferCreatedCount() {
    return offerCreatedCount;
  }


  @JsonProperty(JSON_PROPERTY_OFFER_CREATED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfferCreatedCount(Integer offerCreatedCount) {
    this.offerCreatedCount = offerCreatedCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDetails offerDetails = (OfferDetails) o;
    return Objects.equals(this.offerExtendedStatus, offerDetails.offerExtendedStatus) &&
        Objects.equals(this.offerCreatedCount, offerDetails.offerCreatedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerExtendedStatus, offerCreatedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDetails {\n");
    sb.append("    offerExtendedStatus: ").append(toIndentedString(offerExtendedStatus)).append("\n");
    sb.append("    offerCreatedCount: ").append(toIndentedString(offerCreatedCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

