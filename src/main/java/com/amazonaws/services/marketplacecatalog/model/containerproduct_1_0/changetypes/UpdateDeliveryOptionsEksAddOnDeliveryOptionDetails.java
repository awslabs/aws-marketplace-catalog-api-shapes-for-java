/*
 * ContainerProduct_1_0_ChangeTypes
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.changetypes;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.changetypes.EnvironmentOverrideParameter;
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
 * UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails
 */
@JsonPropertyOrder({
  UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails.JSON_PROPERTY_DESCRIPTION,
  UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails.JSON_PROPERTY_USAGE_INSTRUCTIONS,
  UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails.JSON_PROPERTY_CONTAINER_IMAGES,
  UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails.JSON_PROPERTY_HELM_CHART_URI,
  UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails.JSON_PROPERTY_ADD_ON_NAME,
  UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails.JSON_PROPERTY_ADD_ON_VERSION,
  UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails.JSON_PROPERTY_ADD_ON_TYPE,
  UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails.JSON_PROPERTY_COMPATIBLE_KUBERNETES_VERSIONS,
  UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails.JSON_PROPERTY_SUPPORTED_ARCHITECTURES,
  UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails.JSON_PROPERTY_NAMESPACE,
  UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails.JSON_PROPERTY_ENVIRONMENT_OVERRIDE_PARAMETERS,
  UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails.JSON_PROPERTY_DELIVERY_OPTION_TITLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public static final String JSON_PROPERTY_USAGE_INSTRUCTIONS = "UsageInstructions";
  private String usageInstructions;

  public static final String JSON_PROPERTY_CONTAINER_IMAGES = "ContainerImages";
  private List<String> containerImages;

  public static final String JSON_PROPERTY_HELM_CHART_URI = "HelmChartUri";
  private String helmChartUri;

  public static final String JSON_PROPERTY_ADD_ON_NAME = "AddOnName";
  private String addOnName;

  public static final String JSON_PROPERTY_ADD_ON_VERSION = "AddOnVersion";
  private String addOnVersion;

  public static final String JSON_PROPERTY_ADD_ON_TYPE = "AddOnType";
  private String addOnType;

  public static final String JSON_PROPERTY_COMPATIBLE_KUBERNETES_VERSIONS = "CompatibleKubernetesVersions";
  private List<String> compatibleKubernetesVersions;

  public static final String JSON_PROPERTY_SUPPORTED_ARCHITECTURES = "SupportedArchitectures";
  private List<String> supportedArchitectures;

  public static final String JSON_PROPERTY_NAMESPACE = "Namespace";
  private String namespace;

  public static final String JSON_PROPERTY_ENVIRONMENT_OVERRIDE_PARAMETERS = "EnvironmentOverrideParameters";
  private List<EnvironmentOverrideParameter> environmentOverrideParameters;

  public static final String JSON_PROPERTY_DELIVERY_OPTION_TITLE = "DeliveryOptionTitle";
  private String deliveryOptionTitle;

  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails() {
  }

  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails description(String description) {
    
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


  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails usageInstructions(String usageInstructions) {
    
    this.usageInstructions = usageInstructions;
    return this;
  }

   /**
   * Get usageInstructions
   * @return usageInstructions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsageInstructions() {
    return usageInstructions;
  }


  @JsonProperty(JSON_PROPERTY_USAGE_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsageInstructions(String usageInstructions) {
    this.usageInstructions = usageInstructions;
  }


  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails containerImages(List<String> containerImages) {
    
    this.containerImages = containerImages;
    return this;
  }

  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails addContainerImagesItem(String containerImagesItem) {
    if (this.containerImages == null) {
      this.containerImages = new ArrayList<>();
    }
    this.containerImages.add(containerImagesItem);
    return this;
  }

   /**
   * Get containerImages
   * @return containerImages
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINER_IMAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getContainerImages() {
    return containerImages;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINER_IMAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainerImages(List<String> containerImages) {
    this.containerImages = containerImages;
  }


  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails helmChartUri(String helmChartUri) {
    
    this.helmChartUri = helmChartUri;
    return this;
  }

   /**
   * Get helmChartUri
   * @return helmChartUri
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HELM_CHART_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHelmChartUri() {
    return helmChartUri;
  }


  @JsonProperty(JSON_PROPERTY_HELM_CHART_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHelmChartUri(String helmChartUri) {
    this.helmChartUri = helmChartUri;
  }


  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails addOnName(String addOnName) {
    
    this.addOnName = addOnName;
    return this;
  }

   /**
   * Get addOnName
   * @return addOnName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADD_ON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddOnName() {
    return addOnName;
  }


  @JsonProperty(JSON_PROPERTY_ADD_ON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOnName(String addOnName) {
    this.addOnName = addOnName;
  }


  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails addOnVersion(String addOnVersion) {
    
    this.addOnVersion = addOnVersion;
    return this;
  }

   /**
   * Get addOnVersion
   * @return addOnVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADD_ON_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddOnVersion() {
    return addOnVersion;
  }


  @JsonProperty(JSON_PROPERTY_ADD_ON_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOnVersion(String addOnVersion) {
    this.addOnVersion = addOnVersion;
  }


  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails addOnType(String addOnType) {
    
    this.addOnType = addOnType;
    return this;
  }

   /**
   * Get addOnType
   * @return addOnType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADD_ON_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddOnType() {
    return addOnType;
  }


  @JsonProperty(JSON_PROPERTY_ADD_ON_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddOnType(String addOnType) {
    this.addOnType = addOnType;
  }


  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails compatibleKubernetesVersions(List<String> compatibleKubernetesVersions) {
    
    this.compatibleKubernetesVersions = compatibleKubernetesVersions;
    return this;
  }

  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails addCompatibleKubernetesVersionsItem(String compatibleKubernetesVersionsItem) {
    if (this.compatibleKubernetesVersions == null) {
      this.compatibleKubernetesVersions = new ArrayList<>();
    }
    this.compatibleKubernetesVersions.add(compatibleKubernetesVersionsItem);
    return this;
  }

   /**
   * Get compatibleKubernetesVersions
   * @return compatibleKubernetesVersions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPATIBLE_KUBERNETES_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCompatibleKubernetesVersions() {
    return compatibleKubernetesVersions;
  }


  @JsonProperty(JSON_PROPERTY_COMPATIBLE_KUBERNETES_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompatibleKubernetesVersions(List<String> compatibleKubernetesVersions) {
    this.compatibleKubernetesVersions = compatibleKubernetesVersions;
  }


  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails supportedArchitectures(List<String> supportedArchitectures) {
    
    this.supportedArchitectures = supportedArchitectures;
    return this;
  }

  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails addSupportedArchitecturesItem(String supportedArchitecturesItem) {
    if (this.supportedArchitectures == null) {
      this.supportedArchitectures = new ArrayList<>();
    }
    this.supportedArchitectures.add(supportedArchitecturesItem);
    return this;
  }

   /**
   * Get supportedArchitectures
   * @return supportedArchitectures
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORTED_ARCHITECTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSupportedArchitectures() {
    return supportedArchitectures;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORTED_ARCHITECTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportedArchitectures(List<String> supportedArchitectures) {
    this.supportedArchitectures = supportedArchitectures;
  }


  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNamespace() {
    return namespace;
  }


  @JsonProperty(JSON_PROPERTY_NAMESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails environmentOverrideParameters(List<EnvironmentOverrideParameter> environmentOverrideParameters) {
    
    this.environmentOverrideParameters = environmentOverrideParameters;
    return this;
  }

  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails addEnvironmentOverrideParametersItem(EnvironmentOverrideParameter environmentOverrideParametersItem) {
    if (this.environmentOverrideParameters == null) {
      this.environmentOverrideParameters = new ArrayList<>();
    }
    this.environmentOverrideParameters.add(environmentOverrideParametersItem);
    return this;
  }

   /**
   * Get environmentOverrideParameters
   * @return environmentOverrideParameters
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_OVERRIDE_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EnvironmentOverrideParameter> getEnvironmentOverrideParameters() {
    return environmentOverrideParameters;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_OVERRIDE_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironmentOverrideParameters(List<EnvironmentOverrideParameter> environmentOverrideParameters) {
    this.environmentOverrideParameters = environmentOverrideParameters;
  }


  public UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails deliveryOptionTitle(String deliveryOptionTitle) {
    
    this.deliveryOptionTitle = deliveryOptionTitle;
    return this;
  }

   /**
   * Get deliveryOptionTitle
   * @return deliveryOptionTitle
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_OPTION_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeliveryOptionTitle() {
    return deliveryOptionTitle;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_OPTION_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryOptionTitle(String deliveryOptionTitle) {
    this.deliveryOptionTitle = deliveryOptionTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails updateDeliveryOptionsEksAddOnDeliveryOptionDetails = (UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails) o;
    return Objects.equals(this.description, updateDeliveryOptionsEksAddOnDeliveryOptionDetails.description) &&
        Objects.equals(this.usageInstructions, updateDeliveryOptionsEksAddOnDeliveryOptionDetails.usageInstructions) &&
        Objects.equals(this.containerImages, updateDeliveryOptionsEksAddOnDeliveryOptionDetails.containerImages) &&
        Objects.equals(this.helmChartUri, updateDeliveryOptionsEksAddOnDeliveryOptionDetails.helmChartUri) &&
        Objects.equals(this.addOnName, updateDeliveryOptionsEksAddOnDeliveryOptionDetails.addOnName) &&
        Objects.equals(this.addOnVersion, updateDeliveryOptionsEksAddOnDeliveryOptionDetails.addOnVersion) &&
        Objects.equals(this.addOnType, updateDeliveryOptionsEksAddOnDeliveryOptionDetails.addOnType) &&
        Objects.equals(this.compatibleKubernetesVersions, updateDeliveryOptionsEksAddOnDeliveryOptionDetails.compatibleKubernetesVersions) &&
        Objects.equals(this.supportedArchitectures, updateDeliveryOptionsEksAddOnDeliveryOptionDetails.supportedArchitectures) &&
        Objects.equals(this.namespace, updateDeliveryOptionsEksAddOnDeliveryOptionDetails.namespace) &&
        Objects.equals(this.environmentOverrideParameters, updateDeliveryOptionsEksAddOnDeliveryOptionDetails.environmentOverrideParameters) &&
        Objects.equals(this.deliveryOptionTitle, updateDeliveryOptionsEksAddOnDeliveryOptionDetails.deliveryOptionTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, usageInstructions, containerImages, helmChartUri, addOnName, addOnVersion, addOnType, compatibleKubernetesVersions, supportedArchitectures, namespace, environmentOverrideParameters, deliveryOptionTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDeliveryOptionsEksAddOnDeliveryOptionDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    usageInstructions: ").append(toIndentedString(usageInstructions)).append("\n");
    sb.append("    containerImages: ").append(toIndentedString(containerImages)).append("\n");
    sb.append("    helmChartUri: ").append(toIndentedString(helmChartUri)).append("\n");
    sb.append("    addOnName: ").append(toIndentedString(addOnName)).append("\n");
    sb.append("    addOnVersion: ").append(toIndentedString(addOnVersion)).append("\n");
    sb.append("    addOnType: ").append(toIndentedString(addOnType)).append("\n");
    sb.append("    compatibleKubernetesVersions: ").append(toIndentedString(compatibleKubernetesVersions)).append("\n");
    sb.append("    supportedArchitectures: ").append(toIndentedString(supportedArchitectures)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    environmentOverrideParameters: ").append(toIndentedString(environmentOverrideParameters)).append("\n");
    sb.append("    deliveryOptionTitle: ").append(toIndentedString(deliveryOptionTitle)).append("\n");
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

