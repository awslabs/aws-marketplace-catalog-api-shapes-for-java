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
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.changetypes.TargetVisibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateVisibilityChangeDetail
 */
@JsonPropertyOrder({
  UpdateVisibilityChangeDetail.JSON_PROPERTY_TARGET_VISIBILITY,
  UpdateVisibilityChangeDetail.JSON_PROPERTY_REPLACEMENT_PRODUCT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateVisibilityChangeDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TARGET_VISIBILITY = "TargetVisibility";
  private TargetVisibility targetVisibility;

  public static final String JSON_PROPERTY_REPLACEMENT_PRODUCT_ID = "ReplacementProductId";
  private String replacementProductId;

  public UpdateVisibilityChangeDetail() {
  }

  public UpdateVisibilityChangeDetail targetVisibility(TargetVisibility targetVisibility) {
    
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

  public TargetVisibility getTargetVisibility() {
    return targetVisibility;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetVisibility(TargetVisibility targetVisibility) {
    this.targetVisibility = targetVisibility;
  }


  public UpdateVisibilityChangeDetail replacementProductId(String replacementProductId) {
    
    this.replacementProductId = replacementProductId;
    return this;
  }

   /**
   * Get replacementProductId
   * @return replacementProductId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLACEMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplacementProductId() {
    return replacementProductId;
  }


  @JsonProperty(JSON_PROPERTY_REPLACEMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplacementProductId(String replacementProductId) {
    this.replacementProductId = replacementProductId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVisibilityChangeDetail updateVisibilityChangeDetail = (UpdateVisibilityChangeDetail) o;
    return Objects.equals(this.targetVisibility, updateVisibilityChangeDetail.targetVisibility) &&
        Objects.equals(this.replacementProductId, updateVisibilityChangeDetail.replacementProductId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetVisibility, replacementProductId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVisibilityChangeDetail {\n");
    sb.append("    targetVisibility: ").append(toIndentedString(targetVisibility)).append("\n");
    sb.append("    replacementProductId: ").append(toIndentedString(replacementProductId)).append("\n");
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

