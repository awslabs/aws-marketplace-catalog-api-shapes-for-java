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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EntityConstraints
 */
@JsonPropertyOrder({
  EntityConstraints.JSON_PROPERTY_MULTIPLE_DIMENSION_SELECTION,
  EntityConstraints.JSON_PROPERTY_QUANTITY_CONFIGURATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityConstraints implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MULTIPLE_DIMENSION_SELECTION = "MultipleDimensionSelection";
  private String multipleDimensionSelection;

  public static final String JSON_PROPERTY_QUANTITY_CONFIGURATION = "QuantityConfiguration";
  private String quantityConfiguration;

  public EntityConstraints() {
  }

  public EntityConstraints multipleDimensionSelection(String multipleDimensionSelection) {
    
    this.multipleDimensionSelection = multipleDimensionSelection;
    return this;
  }

   /**
   * Get multipleDimensionSelection
   * @return multipleDimensionSelection
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTIPLE_DIMENSION_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMultipleDimensionSelection() {
    return multipleDimensionSelection;
  }


  @JsonProperty(JSON_PROPERTY_MULTIPLE_DIMENSION_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultipleDimensionSelection(String multipleDimensionSelection) {
    this.multipleDimensionSelection = multipleDimensionSelection;
  }


  public EntityConstraints quantityConfiguration(String quantityConfiguration) {
    
    this.quantityConfiguration = quantityConfiguration;
    return this;
  }

   /**
   * Get quantityConfiguration
   * @return quantityConfiguration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUANTITY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuantityConfiguration() {
    return quantityConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuantityConfiguration(String quantityConfiguration) {
    this.quantityConfiguration = quantityConfiguration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityConstraints entityConstraints = (EntityConstraints) o;
    return Objects.equals(this.multipleDimensionSelection, entityConstraints.multipleDimensionSelection) &&
        Objects.equals(this.quantityConfiguration, entityConstraints.quantityConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleDimensionSelection, quantityConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityConstraints {\n");
    sb.append("    multipleDimensionSelection: ").append(toIndentedString(multipleDimensionSelection)).append("\n");
    sb.append("    quantityConfiguration: ").append(toIndentedString(quantityConfiguration)).append("\n");
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

