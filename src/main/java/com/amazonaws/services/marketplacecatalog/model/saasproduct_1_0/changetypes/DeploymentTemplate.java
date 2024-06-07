/*
 * SaaSProduct_1_0_ChangeTypes
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.saasproduct_1_0.changetypes;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.saasproduct_1_0.changetypes.CloudFormationDetails;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DeploymentTemplate
 */
@JsonPropertyOrder({
  DeploymentTemplate.JSON_PROPERTY_TITLE,
  DeploymentTemplate.JSON_PROPERTY_DESCRIPTION,
  DeploymentTemplate.JSON_PROPERTY_IAM_POLICY,
  DeploymentTemplate.JSON_PROPERTY_CLOUD_FORMATION_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeploymentTemplate implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TITLE = "Title";
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public static final String JSON_PROPERTY_IAM_POLICY = "IamPolicy";
  private String iamPolicy;

  public static final String JSON_PROPERTY_CLOUD_FORMATION_DETAILS = "CloudFormationDetails";
  private CloudFormationDetails cloudFormationDetails;

  public DeploymentTemplate() {
  }

  public DeploymentTemplate title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }


  public DeploymentTemplate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public DeploymentTemplate iamPolicy(String iamPolicy) {
    
    this.iamPolicy = iamPolicy;
    return this;
  }

   /**
   * Get iamPolicy
   * @return iamPolicy
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IAM_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIamPolicy() {
    return iamPolicy;
  }


  @JsonProperty(JSON_PROPERTY_IAM_POLICY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIamPolicy(String iamPolicy) {
    this.iamPolicy = iamPolicy;
  }


  public DeploymentTemplate cloudFormationDetails(CloudFormationDetails cloudFormationDetails) {
    
    this.cloudFormationDetails = cloudFormationDetails;
    return this;
  }

   /**
   * Get cloudFormationDetails
   * @return cloudFormationDetails
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLOUD_FORMATION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CloudFormationDetails getCloudFormationDetails() {
    return cloudFormationDetails;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_FORMATION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloudFormationDetails(CloudFormationDetails cloudFormationDetails) {
    this.cloudFormationDetails = cloudFormationDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentTemplate deploymentTemplate = (DeploymentTemplate) o;
    return Objects.equals(this.title, deploymentTemplate.title) &&
        Objects.equals(this.description, deploymentTemplate.description) &&
        Objects.equals(this.iamPolicy, deploymentTemplate.iamPolicy) &&
        Objects.equals(this.cloudFormationDetails, deploymentTemplate.cloudFormationDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, iamPolicy, cloudFormationDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentTemplate {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iamPolicy: ").append(toIndentedString(iamPolicy)).append("\n");
    sb.append("    cloudFormationDetails: ").append(toIndentedString(cloudFormationDetails)).append("\n");
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

