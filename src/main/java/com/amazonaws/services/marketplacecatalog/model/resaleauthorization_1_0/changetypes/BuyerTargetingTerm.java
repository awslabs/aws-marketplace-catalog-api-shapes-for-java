/*
 * ResaleAuthorization_1_0_ChangeTypes
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.changetypes;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.changetypes.BuyerTargetingTermType;
import com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.changetypes.PositiveTargeting;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BuyerTargetingTerm
 */
@JsonPropertyOrder({
  BuyerTargetingTerm.JSON_PROPERTY_TYPE,
  BuyerTargetingTerm.JSON_PROPERTY_POSITIVE_TARGETING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BuyerTargetingTerm implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TYPE = "Type";
  private BuyerTargetingTermType type;

  public static final String JSON_PROPERTY_POSITIVE_TARGETING = "PositiveTargeting";
  private PositiveTargeting positiveTargeting;

  public BuyerTargetingTerm() {
  }

  public BuyerTargetingTerm type(BuyerTargetingTermType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BuyerTargetingTermType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(BuyerTargetingTermType type) {
    this.type = type;
  }


  public BuyerTargetingTerm positiveTargeting(PositiveTargeting positiveTargeting) {
    
    this.positiveTargeting = positiveTargeting;
    return this;
  }

   /**
   * Get positiveTargeting
   * @return positiveTargeting
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POSITIVE_TARGETING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PositiveTargeting getPositiveTargeting() {
    return positiveTargeting;
  }


  @JsonProperty(JSON_PROPERTY_POSITIVE_TARGETING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPositiveTargeting(PositiveTargeting positiveTargeting) {
    this.positiveTargeting = positiveTargeting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerTargetingTerm buyerTargetingTerm = (BuyerTargetingTerm) o;
    return Objects.equals(this.type, buyerTargetingTerm.type) &&
        Objects.equals(this.positiveTargeting, buyerTargetingTerm.positiveTargeting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, positiveTargeting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerTargetingTerm {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    positiveTargeting: ").append(toIndentedString(positiveTargeting)).append("\n");
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

