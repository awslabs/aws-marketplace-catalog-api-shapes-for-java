/*
 * ResaleAuthorization_1_0
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.Constraints;
import com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.RateCardMember;
import com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.Selector;
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
 * ResaleConfigurableUpfrontPricingTerm uses Selector, and Constraints.
 */
@JsonPropertyOrder({
  RateCardsMember.JSON_PROPERTY_SELECTOR,
  RateCardsMember.JSON_PROPERTY_CONSTRAINTS,
  RateCardsMember.JSON_PROPERTY_RATE_CARD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RateCardsMember implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SELECTOR = "Selector";
  private Selector selector;

  public static final String JSON_PROPERTY_CONSTRAINTS = "Constraints";
  private Constraints constraints;

  public static final String JSON_PROPERTY_RATE_CARD = "RateCard";
  private List<RateCardMember> rateCard = new ArrayList<>();

  public RateCardsMember() {
  }

  public RateCardsMember selector(Selector selector) {
    
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Selector getSelector() {
    return selector;
  }


  @JsonProperty(JSON_PROPERTY_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelector(Selector selector) {
    this.selector = selector;
  }


  public RateCardsMember constraints(Constraints constraints) {
    
    this.constraints = constraints;
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Constraints getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraints(Constraints constraints) {
    this.constraints = constraints;
  }


  public RateCardsMember rateCard(List<RateCardMember> rateCard) {
    
    this.rateCard = rateCard;
    return this;
  }

  public RateCardsMember addRateCardItem(RateCardMember rateCardItem) {
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
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RATE_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RateCardMember> getRateCard() {
    return rateCard;
  }


  @JsonProperty(JSON_PROPERTY_RATE_CARD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRateCard(List<RateCardMember> rateCard) {
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
    RateCardsMember rateCardsMember = (RateCardsMember) o;
    return Objects.equals(this.selector, rateCardsMember.selector) &&
        Objects.equals(this.constraints, rateCardsMember.constraints) &&
        Objects.equals(this.rateCard, rateCardsMember.rateCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selector, constraints, rateCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateCardsMember {\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

