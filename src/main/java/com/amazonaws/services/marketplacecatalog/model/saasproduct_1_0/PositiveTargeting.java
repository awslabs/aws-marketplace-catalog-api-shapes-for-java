/*
 * SaaSProduct_1_0
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.saasproduct_1_0;

import java.util.Objects;
import java.util.Arrays;
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
 * PositiveTargeting
 */
@JsonPropertyOrder({
  PositiveTargeting.JSON_PROPERTY_BUYER_ACCOUNTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PositiveTargeting implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BUYER_ACCOUNTS = "BuyerAccounts";
  private List<String> buyerAccounts = new ArrayList<>();

  public PositiveTargeting() {
  }

  public PositiveTargeting buyerAccounts(List<String> buyerAccounts) {
    
    this.buyerAccounts = buyerAccounts;
    return this;
  }

  public PositiveTargeting addBuyerAccountsItem(String buyerAccountsItem) {
    if (this.buyerAccounts == null) {
      this.buyerAccounts = new ArrayList<>();
    }
    this.buyerAccounts.add(buyerAccountsItem);
    return this;
  }

   /**
   * Get buyerAccounts
   * @return buyerAccounts
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BUYER_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getBuyerAccounts() {
    return buyerAccounts;
  }


  @JsonProperty(JSON_PROPERTY_BUYER_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBuyerAccounts(List<String> buyerAccounts) {
    this.buyerAccounts = buyerAccounts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositiveTargeting positiveTargeting = (PositiveTargeting) o;
    return Objects.equals(this.buyerAccounts, positiveTargeting.buyerAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositiveTargeting {\n");
    sb.append("    buyerAccounts: ").append(toIndentedString(buyerAccounts)).append("\n");
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

