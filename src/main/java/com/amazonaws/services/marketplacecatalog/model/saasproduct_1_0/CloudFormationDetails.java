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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CloudFormationDetails
 */
@JsonPropertyOrder({
  CloudFormationDetails.JSON_PROPERTY_DEFAULT_STACK_NAME,
  CloudFormationDetails.JSON_PROPERTY_TEMPLATE_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudFormationDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DEFAULT_STACK_NAME = "DefaultStackName";
  private String defaultStackName;

  public static final String JSON_PROPERTY_TEMPLATE_URL = "TemplateUrl";
  private String templateUrl;

  public CloudFormationDetails() {
  }

  public CloudFormationDetails defaultStackName(String defaultStackName) {
    
    this.defaultStackName = defaultStackName;
    return this;
  }

   /**
   * Get defaultStackName
   * @return defaultStackName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEFAULT_STACK_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDefaultStackName() {
    return defaultStackName;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_STACK_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDefaultStackName(String defaultStackName) {
    this.defaultStackName = defaultStackName;
  }


  public CloudFormationDetails templateUrl(String templateUrl) {
    
    this.templateUrl = templateUrl;
    return this;
  }

   /**
   * Get templateUrl
   * @return templateUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEMPLATE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTemplateUrl() {
    return templateUrl;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateUrl(String templateUrl) {
    this.templateUrl = templateUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudFormationDetails cloudFormationDetails = (CloudFormationDetails) o;
    return Objects.equals(this.defaultStackName, cloudFormationDetails.defaultStackName) &&
        Objects.equals(this.templateUrl, cloudFormationDetails.templateUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultStackName, templateUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudFormationDetails {\n");
    sb.append("    defaultStackName: ").append(toIndentedString(defaultStackName)).append("\n");
    sb.append("    templateUrl: ").append(toIndentedString(templateUrl)).append("\n");
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

