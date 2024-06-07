/*
 * Experience_1_0_ChangeTypes
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.experience_1_0.changetypes;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.experience_1_0.changetypes.PolicyResourceRequests;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ProcurementPolicyConfiguration
 */
@JsonPropertyOrder({
  ProcurementPolicyConfiguration.JSON_PROPERTY_POLICY_RESOURCE_REQUESTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcurementPolicyConfiguration implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_POLICY_RESOURCE_REQUESTS = "PolicyResourceRequests";
  private PolicyResourceRequests policyResourceRequests;

  public ProcurementPolicyConfiguration() {
  }

  public ProcurementPolicyConfiguration policyResourceRequests(PolicyResourceRequests policyResourceRequests) {
    
    this.policyResourceRequests = policyResourceRequests;
    return this;
  }

   /**
   * Get policyResourceRequests
   * @return policyResourceRequests
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POLICY_RESOURCE_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PolicyResourceRequests getPolicyResourceRequests() {
    return policyResourceRequests;
  }


  @JsonProperty(JSON_PROPERTY_POLICY_RESOURCE_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPolicyResourceRequests(PolicyResourceRequests policyResourceRequests) {
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
    ProcurementPolicyConfiguration procurementPolicyConfiguration = (ProcurementPolicyConfiguration) o;
    return Objects.equals(this.policyResourceRequests, procurementPolicyConfiguration.policyResourceRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyResourceRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcurementPolicyConfiguration {\n");
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

