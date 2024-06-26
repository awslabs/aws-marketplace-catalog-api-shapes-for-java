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
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.PreExistingAgreement;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateInformationChangeDetail
 */
@JsonPropertyOrder({
  UpdateInformationChangeDetail.JSON_PROPERTY_NAME,
  UpdateInformationChangeDetail.JSON_PROPERTY_DESCRIPTION,
  UpdateInformationChangeDetail.JSON_PROPERTY_PRE_EXISTING_AGREEMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateInformationChangeDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public static final String JSON_PROPERTY_PRE_EXISTING_AGREEMENT = "PreExistingAgreement";
  private PreExistingAgreement preExistingAgreement;

  public UpdateInformationChangeDetail() {
  }

  public UpdateInformationChangeDetail name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UpdateInformationChangeDetail description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateInformationChangeDetail preExistingAgreement(PreExistingAgreement preExistingAgreement) {
    
    this.preExistingAgreement = preExistingAgreement;
    return this;
  }

   /**
   * Get preExistingAgreement
   * @return preExistingAgreement
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRE_EXISTING_AGREEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PreExistingAgreement getPreExistingAgreement() {
    return preExistingAgreement;
  }


  @JsonProperty(JSON_PROPERTY_PRE_EXISTING_AGREEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreExistingAgreement(PreExistingAgreement preExistingAgreement) {
    this.preExistingAgreement = preExistingAgreement;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInformationChangeDetail updateInformationChangeDetail = (UpdateInformationChangeDetail) o;
    return Objects.equals(this.name, updateInformationChangeDetail.name) &&
        Objects.equals(this.description, updateInformationChangeDetail.description) &&
        Objects.equals(this.preExistingAgreement, updateInformationChangeDetail.preExistingAgreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, preExistingAgreement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInformationChangeDetail {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    preExistingAgreement: ").append(toIndentedString(preExistingAgreement)).append("\n");
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

