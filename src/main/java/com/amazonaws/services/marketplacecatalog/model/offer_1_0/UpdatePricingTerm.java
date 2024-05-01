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
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.BillingPeriod;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.CurrencyCode;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.Grant;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.RateCardsMember;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.UpdatePricingType;
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
 * UpdatePricingTerm
 */
@JsonPropertyOrder({
  UpdatePricingTerm.JSON_PROPERTY_TYPE,
  UpdatePricingTerm.JSON_PROPERTY_DURATION,
  UpdatePricingTerm.JSON_PROPERTY_GRANTS,
  UpdatePricingTerm.JSON_PROPERTY_CURRENCY_CODE,
  UpdatePricingTerm.JSON_PROPERTY_RATE_CARDS,
  UpdatePricingTerm.JSON_PROPERTY_BILLING_PERIOD,
  UpdatePricingTerm.JSON_PROPERTY_PRICE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdatePricingTerm implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TYPE = "Type";
  private UpdatePricingType type;

  public static final String JSON_PROPERTY_DURATION = "Duration";
  private String duration;

  public static final String JSON_PROPERTY_GRANTS = "Grants";
  private List<Grant> grants;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "CurrencyCode";
  private CurrencyCode currencyCode;

  public static final String JSON_PROPERTY_RATE_CARDS = "RateCards";
  private List<RateCardsMember> rateCards;

  public static final String JSON_PROPERTY_BILLING_PERIOD = "BillingPeriod";
  private BillingPeriod billingPeriod;

  public static final String JSON_PROPERTY_PRICE = "Price";
  private String price;

  public UpdatePricingTerm() {
  }

  public UpdatePricingTerm type(UpdatePricingType type) {
    
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

  public UpdatePricingType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(UpdatePricingType type) {
    this.type = type;
  }


  public UpdatePricingTerm duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(String duration) {
    this.duration = duration;
  }


  public UpdatePricingTerm grants(List<Grant> grants) {
    
    this.grants = grants;
    return this;
  }

  public UpdatePricingTerm addGrantsItem(Grant grantsItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Grant> getGrants() {
    return grants;
  }


  @JsonProperty(JSON_PROPERTY_GRANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrants(List<Grant> grants) {
    this.grants = grants;
  }


  public UpdatePricingTerm currencyCode(CurrencyCode currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }


  public UpdatePricingTerm rateCards(List<RateCardsMember> rateCards) {
    
    this.rateCards = rateCards;
    return this;
  }

  public UpdatePricingTerm addRateCardsItem(RateCardsMember rateCardsItem) {
    if (this.rateCards == null) {
      this.rateCards = new ArrayList<>();
    }
    this.rateCards.add(rateCardsItem);
    return this;
  }

   /**
   * Get rateCards
   * @return rateCards
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATE_CARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RateCardsMember> getRateCards() {
    return rateCards;
  }


  @JsonProperty(JSON_PROPERTY_RATE_CARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRateCards(List<RateCardsMember> rateCards) {
    this.rateCards = rateCards;
  }


  public UpdatePricingTerm billingPeriod(BillingPeriod billingPeriod) {
    
    this.billingPeriod = billingPeriod;
    return this;
  }

   /**
   * Get billingPeriod
   * @return billingPeriod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BillingPeriod getBillingPeriod() {
    return billingPeriod;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingPeriod(BillingPeriod billingPeriod) {
    this.billingPeriod = billingPeriod;
  }


  public UpdatePricingTerm price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(String price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePricingTerm updatePricingTerm = (UpdatePricingTerm) o;
    return Objects.equals(this.type, updatePricingTerm.type) &&
        Objects.equals(this.duration, updatePricingTerm.duration) &&
        Objects.equals(this.grants, updatePricingTerm.grants) &&
        Objects.equals(this.currencyCode, updatePricingTerm.currencyCode) &&
        Objects.equals(this.rateCards, updatePricingTerm.rateCards) &&
        Objects.equals(this.billingPeriod, updatePricingTerm.billingPeriod) &&
        Objects.equals(this.price, updatePricingTerm.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, duration, grants, currencyCode, rateCards, billingPeriod, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePricingTerm {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    rateCards: ").append(toIndentedString(rateCards)).append("\n");
    sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

