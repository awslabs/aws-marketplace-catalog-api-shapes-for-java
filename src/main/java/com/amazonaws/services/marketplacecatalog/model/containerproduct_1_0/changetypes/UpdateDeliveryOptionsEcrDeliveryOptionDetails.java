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
import com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.changetypes.DeploymentResource;
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
 * UpdateDeliveryOptionsEcrDeliveryOptionDetails
 */
@JsonPropertyOrder({
  UpdateDeliveryOptionsEcrDeliveryOptionDetails.JSON_PROPERTY_DESCRIPTION,
  UpdateDeliveryOptionsEcrDeliveryOptionDetails.JSON_PROPERTY_USAGE_INSTRUCTIONS,
  UpdateDeliveryOptionsEcrDeliveryOptionDetails.JSON_PROPERTY_CONTAINER_IMAGES,
  UpdateDeliveryOptionsEcrDeliveryOptionDetails.JSON_PROPERTY_COMPATIBLE_SERVICES,
  UpdateDeliveryOptionsEcrDeliveryOptionDetails.JSON_PROPERTY_DEPLOYMENT_RESOURCES,
  UpdateDeliveryOptionsEcrDeliveryOptionDetails.JSON_PROPERTY_DELIVERY_OPTION_TITLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateDeliveryOptionsEcrDeliveryOptionDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public static final String JSON_PROPERTY_USAGE_INSTRUCTIONS = "UsageInstructions";
  private String usageInstructions;

  public static final String JSON_PROPERTY_CONTAINER_IMAGES = "ContainerImages";
  private List<String> containerImages;

  public static final String JSON_PROPERTY_COMPATIBLE_SERVICES = "CompatibleServices";
  private List<String> compatibleServices;

  public static final String JSON_PROPERTY_DEPLOYMENT_RESOURCES = "DeploymentResources";
  private List<DeploymentResource> deploymentResources;

  public static final String JSON_PROPERTY_DELIVERY_OPTION_TITLE = "DeliveryOptionTitle";
  private String deliveryOptionTitle;

  public UpdateDeliveryOptionsEcrDeliveryOptionDetails() {
  }

  public UpdateDeliveryOptionsEcrDeliveryOptionDetails description(String description) {
    
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


  public UpdateDeliveryOptionsEcrDeliveryOptionDetails usageInstructions(String usageInstructions) {
    
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


  public UpdateDeliveryOptionsEcrDeliveryOptionDetails containerImages(List<String> containerImages) {
    
    this.containerImages = containerImages;
    return this;
  }

  public UpdateDeliveryOptionsEcrDeliveryOptionDetails addContainerImagesItem(String containerImagesItem) {
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


  public UpdateDeliveryOptionsEcrDeliveryOptionDetails compatibleServices(List<String> compatibleServices) {
    
    this.compatibleServices = compatibleServices;
    return this;
  }

  public UpdateDeliveryOptionsEcrDeliveryOptionDetails addCompatibleServicesItem(String compatibleServicesItem) {
    if (this.compatibleServices == null) {
      this.compatibleServices = new ArrayList<>();
    }
    this.compatibleServices.add(compatibleServicesItem);
    return this;
  }

   /**
   * Get compatibleServices
   * @return compatibleServices
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPATIBLE_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCompatibleServices() {
    return compatibleServices;
  }


  @JsonProperty(JSON_PROPERTY_COMPATIBLE_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompatibleServices(List<String> compatibleServices) {
    this.compatibleServices = compatibleServices;
  }


  public UpdateDeliveryOptionsEcrDeliveryOptionDetails deploymentResources(List<DeploymentResource> deploymentResources) {
    
    this.deploymentResources = deploymentResources;
    return this;
  }

  public UpdateDeliveryOptionsEcrDeliveryOptionDetails addDeploymentResourcesItem(DeploymentResource deploymentResourcesItem) {
    if (this.deploymentResources == null) {
      this.deploymentResources = new ArrayList<>();
    }
    this.deploymentResources.add(deploymentResourcesItem);
    return this;
  }

   /**
   * Get deploymentResources
   * @return deploymentResources
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DeploymentResource> getDeploymentResources() {
    return deploymentResources;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentResources(List<DeploymentResource> deploymentResources) {
    this.deploymentResources = deploymentResources;
  }


  public UpdateDeliveryOptionsEcrDeliveryOptionDetails deliveryOptionTitle(String deliveryOptionTitle) {
    
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
    UpdateDeliveryOptionsEcrDeliveryOptionDetails updateDeliveryOptionsEcrDeliveryOptionDetails = (UpdateDeliveryOptionsEcrDeliveryOptionDetails) o;
    return Objects.equals(this.description, updateDeliveryOptionsEcrDeliveryOptionDetails.description) &&
        Objects.equals(this.usageInstructions, updateDeliveryOptionsEcrDeliveryOptionDetails.usageInstructions) &&
        Objects.equals(this.containerImages, updateDeliveryOptionsEcrDeliveryOptionDetails.containerImages) &&
        Objects.equals(this.compatibleServices, updateDeliveryOptionsEcrDeliveryOptionDetails.compatibleServices) &&
        Objects.equals(this.deploymentResources, updateDeliveryOptionsEcrDeliveryOptionDetails.deploymentResources) &&
        Objects.equals(this.deliveryOptionTitle, updateDeliveryOptionsEcrDeliveryOptionDetails.deliveryOptionTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, usageInstructions, containerImages, compatibleServices, deploymentResources, deliveryOptionTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDeliveryOptionsEcrDeliveryOptionDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    usageInstructions: ").append(toIndentedString(usageInstructions)).append("\n");
    sb.append("    containerImages: ").append(toIndentedString(containerImages)).append("\n");
    sb.append("    compatibleServices: ").append(toIndentedString(compatibleServices)).append("\n");
    sb.append("    deploymentResources: ").append(toIndentedString(deploymentResources)).append("\n");
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

