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
import com.amazonaws.services.marketplacecatalog.model.saasproduct_1_0.UpdateDeliveryOption;
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
 * UpdateDeliveryOptionsChangeDetail
 */
@JsonPropertyOrder({
  UpdateDeliveryOptionsChangeDetail.JSON_PROPERTY_DELIVERY_OPTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateDeliveryOptionsChangeDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DELIVERY_OPTIONS = "DeliveryOptions";
  private List<UpdateDeliveryOption> deliveryOptions = new ArrayList<>();

  public UpdateDeliveryOptionsChangeDetail() {
  }

  public UpdateDeliveryOptionsChangeDetail deliveryOptions(List<UpdateDeliveryOption> deliveryOptions) {
    
    this.deliveryOptions = deliveryOptions;
    return this;
  }

  public UpdateDeliveryOptionsChangeDetail addDeliveryOptionsItem(UpdateDeliveryOption deliveryOptionsItem) {
    if (this.deliveryOptions == null) {
      this.deliveryOptions = new ArrayList<>();
    }
    this.deliveryOptions.add(deliveryOptionsItem);
    return this;
  }

   /**
   * Get deliveryOptions
   * @return deliveryOptions
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELIVERY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UpdateDeliveryOption> getDeliveryOptions() {
    return deliveryOptions;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeliveryOptions(List<UpdateDeliveryOption> deliveryOptions) {
    this.deliveryOptions = deliveryOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDeliveryOptionsChangeDetail updateDeliveryOptionsChangeDetail = (UpdateDeliveryOptionsChangeDetail) o;
    return Objects.equals(this.deliveryOptions, updateDeliveryOptionsChangeDetail.deliveryOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDeliveryOptionsChangeDetail {\n");
    sb.append("    deliveryOptions: ").append(toIndentedString(deliveryOptions)).append("\n");
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

