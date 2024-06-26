/*
 * AmiProduct_1_0_EntityType
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.entitytype;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.entitytype.Instructions;
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.entitytype.Recommendations;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DeliveryOption
 */
@JsonPropertyOrder({
  DeliveryOption.JSON_PROPERTY_ID,
  DeliveryOption.JSON_PROPERTY_TYPE,
  DeliveryOption.JSON_PROPERTY_SOURCE_ID,
  DeliveryOption.JSON_PROPERTY_TITLE,
  DeliveryOption.JSON_PROPERTY_SHORT_DESCRIPTION,
  DeliveryOption.JSON_PROPERTY_LONG_DESCRIPTION,
  DeliveryOption.JSON_PROPERTY_INSTRUCTIONS,
  DeliveryOption.JSON_PROPERTY_VISIBILITY,
  DeliveryOption.JSON_PROPERTY_RECOMMENDATIONS,
  DeliveryOption.JSON_PROPERTY_AMI_ALIAS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryOption implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "Type";
  private String type;

  public static final String JSON_PROPERTY_SOURCE_ID = "SourceId";
  private String sourceId;

  public static final String JSON_PROPERTY_TITLE = "Title";
  private String title;

  public static final String JSON_PROPERTY_SHORT_DESCRIPTION = "ShortDescription";
  private String shortDescription;

  public static final String JSON_PROPERTY_LONG_DESCRIPTION = "LongDescription";
  private String longDescription;

  public static final String JSON_PROPERTY_INSTRUCTIONS = "Instructions";
  private Instructions instructions;

  public static final String JSON_PROPERTY_VISIBILITY = "Visibility";
  private String visibility;

  public static final String JSON_PROPERTY_RECOMMENDATIONS = "Recommendations";
  private Recommendations recommendations;

  public static final String JSON_PROPERTY_AMI_ALIAS = "AmiAlias";
  private String amiAlias;

  public DeliveryOption() {
  }

  public DeliveryOption id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public DeliveryOption type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public DeliveryOption sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceId() {
    return sourceId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public DeliveryOption title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public DeliveryOption shortDescription(String shortDescription) {
    
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * Get shortDescription
   * @return shortDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShortDescription() {
    return shortDescription;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }


  public DeliveryOption longDescription(String longDescription) {
    
    this.longDescription = longDescription;
    return this;
  }

   /**
   * Get longDescription
   * @return longDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LONG_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLongDescription() {
    return longDescription;
  }


  @JsonProperty(JSON_PROPERTY_LONG_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }


  public DeliveryOption instructions(Instructions instructions) {
    
    this.instructions = instructions;
    return this;
  }

   /**
   * Get instructions
   * @return instructions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Instructions getInstructions() {
    return instructions;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstructions(Instructions instructions) {
    this.instructions = instructions;
  }


  public DeliveryOption visibility(String visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisibility() {
    return visibility;
  }


  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }


  public DeliveryOption recommendations(Recommendations recommendations) {
    
    this.recommendations = recommendations;
    return this;
  }

   /**
   * Get recommendations
   * @return recommendations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECOMMENDATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Recommendations getRecommendations() {
    return recommendations;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendations(Recommendations recommendations) {
    this.recommendations = recommendations;
  }


  public DeliveryOption amiAlias(String amiAlias) {
    
    this.amiAlias = amiAlias;
    return this;
  }

   /**
   * Get amiAlias
   * @return amiAlias
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMI_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmiAlias() {
    return amiAlias;
  }


  @JsonProperty(JSON_PROPERTY_AMI_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmiAlias(String amiAlias) {
    this.amiAlias = amiAlias;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryOption deliveryOption = (DeliveryOption) o;
    return Objects.equals(this.id, deliveryOption.id) &&
        Objects.equals(this.type, deliveryOption.type) &&
        Objects.equals(this.sourceId, deliveryOption.sourceId) &&
        Objects.equals(this.title, deliveryOption.title) &&
        Objects.equals(this.shortDescription, deliveryOption.shortDescription) &&
        Objects.equals(this.longDescription, deliveryOption.longDescription) &&
        Objects.equals(this.instructions, deliveryOption.instructions) &&
        Objects.equals(this.visibility, deliveryOption.visibility) &&
        Objects.equals(this.recommendations, deliveryOption.recommendations) &&
        Objects.equals(this.amiAlias, deliveryOption.amiAlias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, sourceId, title, shortDescription, longDescription, instructions, visibility, recommendations, amiAlias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryOption {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
    sb.append("    amiAlias: ").append(toIndentedString(amiAlias)).append("\n");
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

