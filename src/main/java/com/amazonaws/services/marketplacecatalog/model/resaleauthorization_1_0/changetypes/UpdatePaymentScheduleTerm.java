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
import com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.changetypes.ResalePaymentScheduleTermType;
import com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.changetypes.Schedule;
import com.amazonaws.services.marketplacecatalog.model.resaleauthorization_1_0.changetypes.UpdatePaymentScheduleTermCurrencyCode;
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
 * UpdatePaymentScheduleTerm
 */
@JsonPropertyOrder({
  UpdatePaymentScheduleTerm.JSON_PROPERTY_TYPE,
  UpdatePaymentScheduleTerm.JSON_PROPERTY_CURRENCY_CODE,
  UpdatePaymentScheduleTerm.JSON_PROPERTY_SCHEDULE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdatePaymentScheduleTerm implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TYPE = "Type";
  private ResalePaymentScheduleTermType type;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "CurrencyCode";
  private UpdatePaymentScheduleTermCurrencyCode currencyCode;

  public static final String JSON_PROPERTY_SCHEDULE = "Schedule";
  private List<Schedule> schedule = new ArrayList<>();

  public UpdatePaymentScheduleTerm() {
  }

  public UpdatePaymentScheduleTerm type(ResalePaymentScheduleTermType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResalePaymentScheduleTermType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(ResalePaymentScheduleTermType type) {
    this.type = type;
  }


  public UpdatePaymentScheduleTerm currencyCode(UpdatePaymentScheduleTermCurrencyCode currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UpdatePaymentScheduleTermCurrencyCode getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrencyCode(UpdatePaymentScheduleTermCurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }


  public UpdatePaymentScheduleTerm schedule(List<Schedule> schedule) {
    
    this.schedule = schedule;
    return this;
  }

  public UpdatePaymentScheduleTerm addScheduleItem(Schedule scheduleItem) {
    if (this.schedule == null) {
      this.schedule = new ArrayList<>();
    }
    this.schedule.add(scheduleItem);
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Schedule> getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSchedule(List<Schedule> schedule) {
    this.schedule = schedule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePaymentScheduleTerm updatePaymentScheduleTerm = (UpdatePaymentScheduleTerm) o;
    return Objects.equals(this.type, updatePaymentScheduleTerm.type) &&
        Objects.equals(this.currencyCode, updatePaymentScheduleTerm.currencyCode) &&
        Objects.equals(this.schedule, updatePaymentScheduleTerm.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, currencyCode, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePaymentScheduleTerm {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

