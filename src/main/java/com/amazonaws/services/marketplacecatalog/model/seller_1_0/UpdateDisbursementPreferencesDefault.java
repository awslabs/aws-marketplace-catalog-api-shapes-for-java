/*
 * Seller_1_0
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.seller_1_0;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.seller_1_0.Schedule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateDisbursementPreferencesDefault
 */
@JsonPropertyOrder({
  UpdateDisbursementPreferencesDefault.JSON_PROPERTY_PAYMENT_INSTRUMENT_ARN,
  UpdateDisbursementPreferencesDefault.JSON_PROPERTY_SCHEDULE,
  UpdateDisbursementPreferencesDefault.JSON_PROPERTY_SCHEDULE_DAY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateDisbursementPreferencesDefault implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_INSTRUMENT_ARN = "PaymentInstrumentArn";
  private String paymentInstrumentArn;

  public static final String JSON_PROPERTY_SCHEDULE = "Schedule";
  private Schedule schedule;

  public static final String JSON_PROPERTY_SCHEDULE_DAY = "ScheduleDay";
  private Integer scheduleDay;

  public UpdateDisbursementPreferencesDefault() {
  }

  public UpdateDisbursementPreferencesDefault paymentInstrumentArn(String paymentInstrumentArn) {
    
    this.paymentInstrumentArn = paymentInstrumentArn;
    return this;
  }

   /**
   * Get paymentInstrumentArn
   * @return paymentInstrumentArn
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_ARN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPaymentInstrumentArn() {
    return paymentInstrumentArn;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUMENT_ARN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentInstrumentArn(String paymentInstrumentArn) {
    this.paymentInstrumentArn = paymentInstrumentArn;
  }


  public UpdateDisbursementPreferencesDefault schedule(Schedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Schedule getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }


  public UpdateDisbursementPreferencesDefault scheduleDay(Integer scheduleDay) {
    
    this.scheduleDay = scheduleDay;
    return this;
  }

   /**
   * Get scheduleDay
   * minimum: 1
   * maximum: 28
   * @return scheduleDay
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScheduleDay() {
    return scheduleDay;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleDay(Integer scheduleDay) {
    this.scheduleDay = scheduleDay;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDisbursementPreferencesDefault updateDisbursementPreferencesDefault = (UpdateDisbursementPreferencesDefault) o;
    return Objects.equals(this.paymentInstrumentArn, updateDisbursementPreferencesDefault.paymentInstrumentArn) &&
        Objects.equals(this.schedule, updateDisbursementPreferencesDefault.schedule) &&
        Objects.equals(this.scheduleDay, updateDisbursementPreferencesDefault.scheduleDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInstrumentArn, schedule, scheduleDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDisbursementPreferencesDefault {\n");
    sb.append("    paymentInstrumentArn: ").append(toIndentedString(paymentInstrumentArn)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    scheduleDay: ").append(toIndentedString(scheduleDay)).append("\n");
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

