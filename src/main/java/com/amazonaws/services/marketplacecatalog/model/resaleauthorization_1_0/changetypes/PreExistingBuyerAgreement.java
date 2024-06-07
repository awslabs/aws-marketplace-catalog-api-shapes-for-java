/*
 * ResaleAuthorization_1_0_ChangeTypes
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.changetypes;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.changetypes.AcquisitionChannel;
import com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.changetypes.PricingModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PreExistingBuyerAgreement
 */
@JsonPropertyOrder({
  PreExistingBuyerAgreement.JSON_PROPERTY_ACQUISITION_CHANNEL,
  PreExistingBuyerAgreement.JSON_PROPERTY_PRICING_MODEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PreExistingBuyerAgreement implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACQUISITION_CHANNEL = "AcquisitionChannel";
  private AcquisitionChannel acquisitionChannel;

  public static final String JSON_PROPERTY_PRICING_MODEL = "PricingModel";
  private PricingModel pricingModel;

  public PreExistingBuyerAgreement() {
  }

  public PreExistingBuyerAgreement acquisitionChannel(AcquisitionChannel acquisitionChannel) {
    
    this.acquisitionChannel = acquisitionChannel;
    return this;
  }

   /**
   * Get acquisitionChannel
   * @return acquisitionChannel
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACQUISITION_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AcquisitionChannel getAcquisitionChannel() {
    return acquisitionChannel;
  }


  @JsonProperty(JSON_PROPERTY_ACQUISITION_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAcquisitionChannel(AcquisitionChannel acquisitionChannel) {
    this.acquisitionChannel = acquisitionChannel;
  }


  public PreExistingBuyerAgreement pricingModel(PricingModel pricingModel) {
    
    this.pricingModel = pricingModel;
    return this;
  }

   /**
   * Get pricingModel
   * @return pricingModel
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRICING_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PricingModel getPricingModel() {
    return pricingModel;
  }


  @JsonProperty(JSON_PROPERTY_PRICING_MODEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPricingModel(PricingModel pricingModel) {
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
    PreExistingBuyerAgreement preExistingBuyerAgreement = (PreExistingBuyerAgreement) o;
    return Objects.equals(this.acquisitionChannel, preExistingBuyerAgreement.acquisitionChannel) &&
        Objects.equals(this.pricingModel, preExistingBuyerAgreement.pricingModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquisitionChannel, pricingModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreExistingBuyerAgreement {\n");
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

