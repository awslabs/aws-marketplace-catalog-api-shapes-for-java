/*
 * ContainerProduct_1_0
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.UpdateDeliveryOptionsTargetVisibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateDeliveryOptionVisibility
 */
@JsonPropertyOrder({
  UpdateDeliveryOptionVisibility.JSON_PROPERTY_ID,
  UpdateDeliveryOptionVisibility.JSON_PROPERTY_TARGET_VISIBILITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateDeliveryOptionVisibility implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_TARGET_VISIBILITY = "TargetVisibility";
  private UpdateDeliveryOptionsTargetVisibility targetVisibility;

  public UpdateDeliveryOptionVisibility() {
  }

  public UpdateDeliveryOptionVisibility id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public UpdateDeliveryOptionVisibility targetVisibility(UpdateDeliveryOptionsTargetVisibility targetVisibility) {
    
    this.targetVisibility = targetVisibility;
    return this;
  }

   /**
   * Get targetVisibility
   * @return targetVisibility
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TARGET_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UpdateDeliveryOptionsTargetVisibility getTargetVisibility() {
    return targetVisibility;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetVisibility(UpdateDeliveryOptionsTargetVisibility targetVisibility) {
    this.targetVisibility = targetVisibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDeliveryOptionVisibility updateDeliveryOptionVisibility = (UpdateDeliveryOptionVisibility) o;
    return Objects.equals(this.id, updateDeliveryOptionVisibility.id) &&
        Objects.equals(this.targetVisibility, updateDeliveryOptionVisibility.targetVisibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, targetVisibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDeliveryOptionVisibility {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targetVisibility: ").append(toIndentedString(targetVisibility)).append("\n");
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

