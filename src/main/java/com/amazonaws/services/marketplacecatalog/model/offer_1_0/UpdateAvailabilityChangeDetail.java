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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateAvailabilityChangeDetail
 */
@JsonPropertyOrder({
  UpdateAvailabilityChangeDetail.JSON_PROPERTY_AVAILABILITY_END_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateAvailabilityChangeDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AVAILABILITY_END_DATE = "AvailabilityEndDate";
  private String availabilityEndDate;

  public UpdateAvailabilityChangeDetail() {
  }

  public UpdateAvailabilityChangeDetail availabilityEndDate(String availabilityEndDate) {
    
    this.availabilityEndDate = availabilityEndDate;
    return this;
  }

   /**
   * Get availabilityEndDate
   * @return availabilityEndDate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAvailabilityEndDate() {
    return availabilityEndDate;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvailabilityEndDate(String availabilityEndDate) {
    this.availabilityEndDate = availabilityEndDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAvailabilityChangeDetail updateAvailabilityChangeDetail = (UpdateAvailabilityChangeDetail) o;
    return Objects.equals(this.availabilityEndDate, updateAvailabilityChangeDetail.availabilityEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAvailabilityChangeDetail {\n");
    sb.append("    availabilityEndDate: ").append(toIndentedString(availabilityEndDate)).append("\n");
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

