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
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.RateCardItem;
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
 * UsageBasedRateCardItem
 */
@JsonPropertyOrder({
  UsageBasedRateCardItem.JSON_PROPERTY_RATE_CARD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UsageBasedRateCardItem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RATE_CARD = "RateCard";
  private List<RateCardItem> rateCard;

  public UsageBasedRateCardItem() {
  }

  public UsageBasedRateCardItem rateCard(List<RateCardItem> rateCard) {
    
    this.rateCard = rateCard;
    return this;
  }

  public UsageBasedRateCardItem addRateCardItem(RateCardItem rateCardItem) {
    if (this.rateCard == null) {
      this.rateCard = new ArrayList<>();
    }
    this.rateCard.add(rateCardItem);
    return this;
  }

   /**
   * Get rateCard
   * @return rateCard
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATE_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RateCardItem> getRateCard() {
    return rateCard;
  }


  @JsonProperty(JSON_PROPERTY_RATE_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRateCard(List<RateCardItem> rateCard) {
    this.rateCard = rateCard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageBasedRateCardItem usageBasedRateCardItem = (UsageBasedRateCardItem) o;
    return Objects.equals(this.rateCard, usageBasedRateCardItem.rateCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageBasedRateCardItem {\n");
    sb.append("    rateCard: ").append(toIndentedString(rateCard)).append("\n");
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

