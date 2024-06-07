/*
 * Offer_1_0_Appendix
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.FreeTrialPricingTermType;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.GrantItem;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FreeTrialPricingTerm
 */
@JsonPropertyOrder({
  FreeTrialPricingTerm.JSON_PROPERTY_TYPE,
  FreeTrialPricingTerm.JSON_PROPERTY_DURATION,
  FreeTrialPricingTerm.JSON_PROPERTY_GRANTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FreeTrialPricingTerm implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TYPE = "Type";
  private FreeTrialPricingTermType type;

  public static final String JSON_PROPERTY_DURATION = "Duration";
  private String duration;

  public static final String JSON_PROPERTY_GRANTS = "Grants";
  private List<GrantItem> grants = new ArrayList<>();

  public FreeTrialPricingTerm() {
  }

  public FreeTrialPricingTerm type(FreeTrialPricingTermType type) {
    
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

  public FreeTrialPricingTermType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(FreeTrialPricingTermType type) {
    this.type = type;
  }


  public FreeTrialPricingTerm duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDuration(String duration) {
    this.duration = duration;
  }


  public FreeTrialPricingTerm grants(List<GrantItem> grants) {
    
    this.grants = grants;
    return this;
  }

  public FreeTrialPricingTerm addGrantsItem(GrantItem grantsItem) {
    if (this.grants == null) {
      this.grants = new ArrayList<>();
    }
    this.grants.add(grantsItem);
    return this;
  }

   /**
   * Get grants
   * @return grants
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GRANTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<GrantItem> getGrants() {
    return grants;
  }


  @JsonProperty(JSON_PROPERTY_GRANTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGrants(List<GrantItem> grants) {
    this.grants = grants;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeTrialPricingTerm freeTrialPricingTerm = (FreeTrialPricingTerm) o;
    return Objects.equals(this.type, freeTrialPricingTerm.type) &&
        Objects.equals(this.duration, freeTrialPricingTerm.duration) &&
        Objects.equals(this.grants, freeTrialPricingTerm.grants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, duration, grants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeTrialPricingTerm {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
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

