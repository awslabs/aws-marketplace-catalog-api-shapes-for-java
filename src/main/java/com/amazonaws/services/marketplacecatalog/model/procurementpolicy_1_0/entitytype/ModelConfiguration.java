/*
 * ProcurementPolicy_1_0_EntityType
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.procurementpolicy_1_0.entitytype;

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
 * ModelConfiguration
 */
@JsonPropertyOrder({
  ModelConfiguration.JSON_PROPERTY_POLICY_RESOURCE_REQUESTS
})
@JsonTypeName("Configuration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelConfiguration implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_POLICY_RESOURCE_REQUESTS = "PolicyResourceRequests";
  private String policyResourceRequests;

  public ModelConfiguration() {
  }

  public ModelConfiguration policyResourceRequests(String policyResourceRequests) {
    
    this.policyResourceRequests = policyResourceRequests;
    return this;
  }

   /**
   * Get policyResourceRequests
   * @return policyResourceRequests
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLICY_RESOURCE_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPolicyResourceRequests() {
    return policyResourceRequests;
  }


  @JsonProperty(JSON_PROPERTY_POLICY_RESOURCE_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolicyResourceRequests(String policyResourceRequests) {
    this.policyResourceRequests = policyResourceRequests;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConfiguration _configuration = (ModelConfiguration) o;
    return Objects.equals(this.policyResourceRequests, _configuration.policyResourceRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyResourceRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConfiguration {\n");
    sb.append("    policyResourceRequests: ").append(toIndentedString(policyResourceRequests)).append("\n");
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

