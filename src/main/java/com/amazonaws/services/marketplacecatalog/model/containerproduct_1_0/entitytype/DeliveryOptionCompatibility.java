/*
 * ContainerProduct_1_0_EntityType
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.entitytype;

import java.util.Objects;
import java.util.Arrays;
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
 * DeliveryOptionCompatibility
 */
@JsonPropertyOrder({
  DeliveryOptionCompatibility.JSON_PROPERTY_AW_S_SERVICES,
  DeliveryOptionCompatibility.JSON_PROPERTY_KUBERNETES_VERSIONS,
  DeliveryOptionCompatibility.JSON_PROPERTY_ARCHITECTURES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryOptionCompatibility implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AW_S_SERVICES = "AWSServices";
  private List<String> awSServices;

  public static final String JSON_PROPERTY_KUBERNETES_VERSIONS = "KubernetesVersions";
  private List<String> kubernetesVersions;

  public static final String JSON_PROPERTY_ARCHITECTURES = "Architectures";
  private List<String> architectures;

  public DeliveryOptionCompatibility() {
  }

  public DeliveryOptionCompatibility awSServices(List<String> awSServices) {
    
    this.awSServices = awSServices;
    return this;
  }

  public DeliveryOptionCompatibility addAwSServicesItem(String awSServicesItem) {
    if (this.awSServices == null) {
      this.awSServices = new ArrayList<>();
    }
    this.awSServices.add(awSServicesItem);
    return this;
  }

   /**
   * Get awSServices
   * @return awSServices
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AW_S_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAwSServices() {
    return awSServices;
  }


  @JsonProperty(JSON_PROPERTY_AW_S_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAwSServices(List<String> awSServices) {
    this.awSServices = awSServices;
  }


  public DeliveryOptionCompatibility kubernetesVersions(List<String> kubernetesVersions) {
    
    this.kubernetesVersions = kubernetesVersions;
    return this;
  }

  public DeliveryOptionCompatibility addKubernetesVersionsItem(String kubernetesVersionsItem) {
    if (this.kubernetesVersions == null) {
      this.kubernetesVersions = new ArrayList<>();
    }
    this.kubernetesVersions.add(kubernetesVersionsItem);
    return this;
  }

   /**
   * Get kubernetesVersions
   * @return kubernetesVersions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KUBERNETES_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getKubernetesVersions() {
    return kubernetesVersions;
  }


  @JsonProperty(JSON_PROPERTY_KUBERNETES_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKubernetesVersions(List<String> kubernetesVersions) {
    this.kubernetesVersions = kubernetesVersions;
  }


  public DeliveryOptionCompatibility architectures(List<String> architectures) {
    
    this.architectures = architectures;
    return this;
  }

  public DeliveryOptionCompatibility addArchitecturesItem(String architecturesItem) {
    if (this.architectures == null) {
      this.architectures = new ArrayList<>();
    }
    this.architectures.add(architecturesItem);
    return this;
  }

   /**
   * Get architectures
   * @return architectures
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ARCHITECTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getArchitectures() {
    return architectures;
  }


  @JsonProperty(JSON_PROPERTY_ARCHITECTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArchitectures(List<String> architectures) {
    this.architectures = architectures;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryOptionCompatibility deliveryOptionCompatibility = (DeliveryOptionCompatibility) o;
    return Objects.equals(this.awSServices, deliveryOptionCompatibility.awSServices) &&
        Objects.equals(this.kubernetesVersions, deliveryOptionCompatibility.kubernetesVersions) &&
        Objects.equals(this.architectures, deliveryOptionCompatibility.architectures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awSServices, kubernetesVersions, architectures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryOptionCompatibility {\n");
    sb.append("    awSServices: ").append(toIndentedString(awSServices)).append("\n");
    sb.append("    kubernetesVersions: ").append(toIndentedString(kubernetesVersions)).append("\n");
    sb.append("    architectures: ").append(toIndentedString(architectures)).append("\n");
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
