/*
 * Offer_1_0
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.offer_1_0;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.NegativeTargeting;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.PositiveTargeting;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateTargetingChangeDetail
 */
@JsonPropertyOrder({
  UpdateTargetingChangeDetail.JSON_PROPERTY_POSITIVE_TARGETING,
  UpdateTargetingChangeDetail.JSON_PROPERTY_NEGATIVE_TARGETING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateTargetingChangeDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_POSITIVE_TARGETING = "PositiveTargeting";
  private PositiveTargeting positiveTargeting;

  public static final String JSON_PROPERTY_NEGATIVE_TARGETING = "NegativeTargeting";
  private NegativeTargeting negativeTargeting;

  public UpdateTargetingChangeDetail() {
  }

  public UpdateTargetingChangeDetail positiveTargeting(PositiveTargeting positiveTargeting) {
    
    this.positiveTargeting = positiveTargeting;
    return this;
  }

   /**
   * Get positiveTargeting
   * @return positiveTargeting
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSITIVE_TARGETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PositiveTargeting getPositiveTargeting() {
    return positiveTargeting;
  }


  @JsonProperty(JSON_PROPERTY_POSITIVE_TARGETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPositiveTargeting(PositiveTargeting positiveTargeting) {
    this.positiveTargeting = positiveTargeting;
  }


  public UpdateTargetingChangeDetail negativeTargeting(NegativeTargeting negativeTargeting) {
    
    this.negativeTargeting = negativeTargeting;
    return this;
  }

   /**
   * Get negativeTargeting
   * @return negativeTargeting
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEGATIVE_TARGETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NegativeTargeting getNegativeTargeting() {
    return negativeTargeting;
  }


  @JsonProperty(JSON_PROPERTY_NEGATIVE_TARGETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegativeTargeting(NegativeTargeting negativeTargeting) {
    this.negativeTargeting = negativeTargeting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTargetingChangeDetail updateTargetingChangeDetail = (UpdateTargetingChangeDetail) o;
    return Objects.equals(this.positiveTargeting, updateTargetingChangeDetail.positiveTargeting) &&
        Objects.equals(this.negativeTargeting, updateTargetingChangeDetail.negativeTargeting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positiveTargeting, negativeTargeting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTargetingChangeDetail {\n");
    sb.append("    positiveTargeting: ").append(toIndentedString(positiveTargeting)).append("\n");
    sb.append("    negativeTargeting: ").append(toIndentedString(negativeTargeting)).append("\n");
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

