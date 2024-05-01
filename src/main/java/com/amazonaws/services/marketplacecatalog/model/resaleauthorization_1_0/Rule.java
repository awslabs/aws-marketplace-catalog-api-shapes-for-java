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
 * Rule
 */
@JsonPropertyOrder({
  Rule.JSON_PROPERTY_TYPE,
  Rule.JSON_PROPERTY_ID,
  Rule.JSON_PROPERTY_USAGE,
  Rule.JSON_PROPERTY_AVAILABILITY_END_DATE,
  Rule.JSON_PROPERTY_OFFERS_MAX_QUANTITY,
  Rule.JSON_PROPERTY_RESELLER_ACCOUNT_ID,
  Rule.JSON_PROPERTY_RESELLER_LEGAL_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Rule implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TYPE = "Type";
  private String type;

  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_USAGE = "Usage";
  private String usage;

  public static final String JSON_PROPERTY_AVAILABILITY_END_DATE = "AvailabilityEndDate";
  private String availabilityEndDate;

  public static final String JSON_PROPERTY_OFFERS_MAX_QUANTITY = "OffersMaxQuantity";
  private Integer offersMaxQuantity;

  public static final String JSON_PROPERTY_RESELLER_ACCOUNT_ID = "ResellerAccountId";
  private String resellerAccountId;

  public static final String JSON_PROPERTY_RESELLER_LEGAL_NAME = "ResellerLegalName";
  private String resellerLegalName;

  public Rule() {
  }

  public Rule type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public Rule id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Rule usage(String usage) {
    
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsage() {
    return usage;
  }


  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsage(String usage) {
    this.usage = usage;
  }


  public Rule availabilityEndDate(String availabilityEndDate) {
    
    this.availabilityEndDate = availabilityEndDate;
    return this;
  }

   /**
   * Get availabilityEndDate
   * @return availabilityEndDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvailabilityEndDate() {
    return availabilityEndDate;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityEndDate(String availabilityEndDate) {
    this.availabilityEndDate = availabilityEndDate;
  }


  public Rule offersMaxQuantity(Integer offersMaxQuantity) {
    
    this.offersMaxQuantity = offersMaxQuantity;
    return this;
  }

   /**
   * Get offersMaxQuantity
   * @return offersMaxQuantity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFERS_MAX_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffersMaxQuantity() {
    return offersMaxQuantity;
  }


  @JsonProperty(JSON_PROPERTY_OFFERS_MAX_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffersMaxQuantity(Integer offersMaxQuantity) {
    this.offersMaxQuantity = offersMaxQuantity;
  }


  public Rule resellerAccountId(String resellerAccountId) {
    
    this.resellerAccountId = resellerAccountId;
    return this;
  }

   /**
   * Get resellerAccountId
   * @return resellerAccountId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESELLER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResellerAccountId() {
    return resellerAccountId;
  }


  @JsonProperty(JSON_PROPERTY_RESELLER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResellerAccountId(String resellerAccountId) {
    this.resellerAccountId = resellerAccountId;
  }


  public Rule resellerLegalName(String resellerLegalName) {
    
    this.resellerLegalName = resellerLegalName;
    return this;
  }

   /**
   * Get resellerLegalName
   * @return resellerLegalName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESELLER_LEGAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResellerLegalName() {
    return resellerLegalName;
  }


  @JsonProperty(JSON_PROPERTY_RESELLER_LEGAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResellerLegalName(String resellerLegalName) {
    this.resellerLegalName = resellerLegalName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.type, rule.type) &&
        Objects.equals(this.id, rule.id) &&
        Objects.equals(this.usage, rule.usage) &&
        Objects.equals(this.availabilityEndDate, rule.availabilityEndDate) &&
        Objects.equals(this.offersMaxQuantity, rule.offersMaxQuantity) &&
        Objects.equals(this.resellerAccountId, rule.resellerAccountId) &&
        Objects.equals(this.resellerLegalName, rule.resellerLegalName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, usage, availabilityEndDate, offersMaxQuantity, resellerAccountId, resellerLegalName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    availabilityEndDate: ").append(toIndentedString(availabilityEndDate)).append("\n");
    sb.append("    offersMaxQuantity: ").append(toIndentedString(offersMaxQuantity)).append("\n");
    sb.append("    resellerAccountId: ").append(toIndentedString(resellerAccountId)).append("\n");
    sb.append("    resellerLegalName: ").append(toIndentedString(resellerLegalName)).append("\n");
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
