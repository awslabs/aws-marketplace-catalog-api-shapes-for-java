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
 * EntityPreExistingBuyerAgreement
 */
@JsonPropertyOrder({
  EntityPreExistingBuyerAgreement.JSON_PROPERTY_ACQUISITION_CHANNEL,
  EntityPreExistingBuyerAgreement.JSON_PROPERTY_PRICING_MODEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityPreExistingBuyerAgreement implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACQUISITION_CHANNEL = "AcquisitionChannel";
  private String acquisitionChannel;

  public static final String JSON_PROPERTY_PRICING_MODEL = "PricingModel";
  private String pricingModel;

  public EntityPreExistingBuyerAgreement() {
  }

  public EntityPreExistingBuyerAgreement acquisitionChannel(String acquisitionChannel) {
    
    this.acquisitionChannel = acquisitionChannel;
    return this;
  }

   /**
   * Get acquisitionChannel
   * @return acquisitionChannel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACQUISITION_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcquisitionChannel() {
    return acquisitionChannel;
  }


  @JsonProperty(JSON_PROPERTY_ACQUISITION_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcquisitionChannel(String acquisitionChannel) {
    this.acquisitionChannel = acquisitionChannel;
  }


  public EntityPreExistingBuyerAgreement pricingModel(String pricingModel) {
    
    this.pricingModel = pricingModel;
    return this;
  }

   /**
   * Get pricingModel
   * @return pricingModel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICING_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPricingModel() {
    return pricingModel;
  }


  @JsonProperty(JSON_PROPERTY_PRICING_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricingModel(String pricingModel) {
    this.pricingModel = pricingModel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityPreExistingBuyerAgreement entityPreExistingBuyerAgreement = (EntityPreExistingBuyerAgreement) o;
    return Objects.equals(this.acquisitionChannel, entityPreExistingBuyerAgreement.acquisitionChannel) &&
        Objects.equals(this.pricingModel, entityPreExistingBuyerAgreement.pricingModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquisitionChannel, pricingModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityPreExistingBuyerAgreement {\n");
    sb.append("    acquisitionChannel: ").append(toIndentedString(acquisitionChannel)).append("\n");
    sb.append("    pricingModel: ").append(toIndentedString(pricingModel)).append("\n");
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

