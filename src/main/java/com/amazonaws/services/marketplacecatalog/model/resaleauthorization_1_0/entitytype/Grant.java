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
 * Grant
 */
@JsonPropertyOrder({
  Grant.JSON_PROPERTY_DIMENSION_KEY,
  Grant.JSON_PROPERTY_MAX_QUANTITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Grant implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DIMENSION_KEY = "DimensionKey";
  private String dimensionKey;

  public static final String JSON_PROPERTY_MAX_QUANTITY = "MaxQuantity";
  private Integer maxQuantity;

  public Grant() {
  }

  public Grant dimensionKey(String dimensionKey) {
    
    this.dimensionKey = dimensionKey;
    return this;
  }

   /**
   * Get dimensionKey
   * @return dimensionKey
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDimensionKey() {
    return dimensionKey;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensionKey(String dimensionKey) {
    this.dimensionKey = dimensionKey;
  }


  public Grant maxQuantity(Integer maxQuantity) {
    
    this.maxQuantity = maxQuantity;
    return this;
  }

   /**
   * Get maxQuantity
   * @return maxQuantity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxQuantity() {
    return maxQuantity;
  }


  @JsonProperty(JSON_PROPERTY_MAX_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grant grant = (Grant) o;
    return Objects.equals(this.dimensionKey, grant.dimensionKey) &&
        Objects.equals(this.maxQuantity, grant.maxQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensionKey, maxQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grant {\n");
    sb.append("    dimensionKey: ").append(toIndentedString(dimensionKey)).append("\n");
    sb.append("    maxQuantity: ").append(toIndentedString(maxQuantity)).append("\n");
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

