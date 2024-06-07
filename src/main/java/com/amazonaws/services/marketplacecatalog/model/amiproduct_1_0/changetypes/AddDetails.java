/*
 * AmiProduct_1_0_ChangeTypes
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.changetypes;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.changetypes.AddAmiDeliveryOptionDetails;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AddDetails
 */
@JsonPropertyOrder({
  AddDetails.JSON_PROPERTY_AMI_DELIVERY_OPTION_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMI_DELIVERY_OPTION_DETAILS = "AmiDeliveryOptionDetails";
  private AddAmiDeliveryOptionDetails amiDeliveryOptionDetails;

  public AddDetails() {
  }

  public AddDetails amiDeliveryOptionDetails(AddAmiDeliveryOptionDetails amiDeliveryOptionDetails) {
    
    this.amiDeliveryOptionDetails = amiDeliveryOptionDetails;
    return this;
  }

   /**
   * Get amiDeliveryOptionDetails
   * @return amiDeliveryOptionDetails
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMI_DELIVERY_OPTION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AddAmiDeliveryOptionDetails getAmiDeliveryOptionDetails() {
    return amiDeliveryOptionDetails;
  }


  @JsonProperty(JSON_PROPERTY_AMI_DELIVERY_OPTION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmiDeliveryOptionDetails(AddAmiDeliveryOptionDetails amiDeliveryOptionDetails) {
    this.amiDeliveryOptionDetails = amiDeliveryOptionDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDetails addDetails = (AddDetails) o;
    return Objects.equals(this.amiDeliveryOptionDetails, addDetails.amiDeliveryOptionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amiDeliveryOptionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDetails {\n");
    sb.append("    amiDeliveryOptionDetails: ").append(toIndentedString(amiDeliveryOptionDetails)).append("\n");
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

