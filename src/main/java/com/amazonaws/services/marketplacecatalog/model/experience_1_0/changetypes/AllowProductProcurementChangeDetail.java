/*
 * Experience_1_0_ChangeTypes
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.experience_1_0.changetypes;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.experience_1_0.changetypes.Product;
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
 * AllowProductProcurementChangeDetail
 */
@JsonPropertyOrder({
  AllowProductProcurementChangeDetail.JSON_PROPERTY_PRODUCTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AllowProductProcurementChangeDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRODUCTS = "Products";
  private List<Product> products = new ArrayList<>();

  public AllowProductProcurementChangeDetail() {
  }

  public AllowProductProcurementChangeDetail products(List<Product> products) {
    
    this.products = products;
    return this;
  }

  public AllowProductProcurementChangeDetail addProductsItem(Product productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Product> getProducts() {
    return products;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProducts(List<Product> products) {
    this.products = products;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowProductProcurementChangeDetail allowProductProcurementChangeDetail = (AllowProductProcurementChangeDetail) o;
    return Objects.equals(this.products, allowProductProcurementChangeDetail.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowProductProcurementChangeDetail {\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

