/*
 * AmiProduct_1_0_EntityType
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.entitytype;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.entitytype.Compatibility;
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.entitytype.Description;
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.entitytype.Dimension;
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.entitytype.PromotionalResources;
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.entitytype.RegionAvailability;
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.entitytype.SupportInformation;
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.entitytype.Targeting;
import com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.entitytype.Version;
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
 * AmiProductEntityDetail
 */
@JsonPropertyOrder({
  AmiProductEntityDetail.JSON_PROPERTY_VERSIONS,
  AmiProductEntityDetail.JSON_PROPERTY_DESCRIPTION,
  AmiProductEntityDetail.JSON_PROPERTY_PROMOTIONAL_RESOURCES,
  AmiProductEntityDetail.JSON_PROPERTY_REGION_AVAILABILITY,
  AmiProductEntityDetail.JSON_PROPERTY_SUPPORT_INFORMATION,
  AmiProductEntityDetail.JSON_PROPERTY_DIMENSIONS,
  AmiProductEntityDetail.JSON_PROPERTY_TARGETING,
  AmiProductEntityDetail.JSON_PROPERTY_COMPATIBILITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AmiProductEntityDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VERSIONS = "Versions";
  private List<Version> versions;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private Description description;

  public static final String JSON_PROPERTY_PROMOTIONAL_RESOURCES = "PromotionalResources";
  private PromotionalResources promotionalResources;

  public static final String JSON_PROPERTY_REGION_AVAILABILITY = "RegionAvailability";
  private RegionAvailability regionAvailability;

  public static final String JSON_PROPERTY_SUPPORT_INFORMATION = "SupportInformation";
  private SupportInformation supportInformation;

  public static final String JSON_PROPERTY_DIMENSIONS = "Dimensions";
  private List<Dimension> dimensions;

  public static final String JSON_PROPERTY_TARGETING = "Targeting";
  private Targeting targeting;

  public static final String JSON_PROPERTY_COMPATIBILITY = "Compatibility";
  private Compatibility compatibility;

  public AmiProductEntityDetail() {
  }

  public AmiProductEntityDetail versions(List<Version> versions) {
    
    this.versions = versions;
    return this;
  }

  public AmiProductEntityDetail addVersionsItem(Version versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Version> getVersions() {
    return versions;
  }


  @JsonProperty(JSON_PROPERTY_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersions(List<Version> versions) {
    this.versions = versions;
  }


  public AmiProductEntityDetail description(Description description) {
    
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

  public Description getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(Description description) {
    this.description = description;
  }


  public AmiProductEntityDetail promotionalResources(PromotionalResources promotionalResources) {
    
    this.promotionalResources = promotionalResources;
    return this;
  }

   /**
   * Get promotionalResources
   * @return promotionalResources
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROMOTIONAL_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PromotionalResources getPromotionalResources() {
    return promotionalResources;
  }


  @JsonProperty(JSON_PROPERTY_PROMOTIONAL_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPromotionalResources(PromotionalResources promotionalResources) {
    this.promotionalResources = promotionalResources;
  }


  public AmiProductEntityDetail regionAvailability(RegionAvailability regionAvailability) {
    
    this.regionAvailability = regionAvailability;
    return this;
  }

   /**
   * Get regionAvailability
   * @return regionAvailability
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RegionAvailability getRegionAvailability() {
    return regionAvailability;
  }


  @JsonProperty(JSON_PROPERTY_REGION_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionAvailability(RegionAvailability regionAvailability) {
    this.regionAvailability = regionAvailability;
  }


  public AmiProductEntityDetail supportInformation(SupportInformation supportInformation) {
    
    this.supportInformation = supportInformation;
    return this;
  }

   /**
   * Get supportInformation
   * @return supportInformation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SupportInformation getSupportInformation() {
    return supportInformation;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportInformation(SupportInformation supportInformation) {
    this.supportInformation = supportInformation;
  }


  public AmiProductEntityDetail dimensions(List<Dimension> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public AmiProductEntityDetail addDimensionsItem(Dimension dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Dimension> getDimensions() {
    return dimensions;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDimensions(List<Dimension> dimensions) {
    this.dimensions = dimensions;
  }


  public AmiProductEntityDetail targeting(Targeting targeting) {
    
    this.targeting = targeting;
    return this;
  }

   /**
   * Get targeting
   * @return targeting
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Targeting getTargeting() {
    return targeting;
  }


  @JsonProperty(JSON_PROPERTY_TARGETING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargeting(Targeting targeting) {
    this.targeting = targeting;
  }


  public AmiProductEntityDetail compatibility(Compatibility compatibility) {
    
    this.compatibility = compatibility;
    return this;
  }

   /**
   * Get compatibility
   * @return compatibility
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPATIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Compatibility getCompatibility() {
    return compatibility;
  }


  @JsonProperty(JSON_PROPERTY_COMPATIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompatibility(Compatibility compatibility) {
    this.compatibility = compatibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmiProductEntityDetail amiProductEntityDetail = (AmiProductEntityDetail) o;
    return Objects.equals(this.versions, amiProductEntityDetail.versions) &&
        Objects.equals(this.description, amiProductEntityDetail.description) &&
        Objects.equals(this.promotionalResources, amiProductEntityDetail.promotionalResources) &&
        Objects.equals(this.regionAvailability, amiProductEntityDetail.regionAvailability) &&
        Objects.equals(this.supportInformation, amiProductEntityDetail.supportInformation) &&
        Objects.equals(this.dimensions, amiProductEntityDetail.dimensions) &&
        Objects.equals(this.targeting, amiProductEntityDetail.targeting) &&
        Objects.equals(this.compatibility, amiProductEntityDetail.compatibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versions, description, promotionalResources, regionAvailability, supportInformation, dimensions, targeting, compatibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmiProductEntityDetail {\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    promotionalResources: ").append(toIndentedString(promotionalResources)).append("\n");
    sb.append("    regionAvailability: ").append(toIndentedString(regionAvailability)).append("\n");
    sb.append("    supportInformation: ").append(toIndentedString(supportInformation)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    targeting: ").append(toIndentedString(targeting)).append("\n");
    sb.append("    compatibility: ").append(toIndentedString(compatibility)).append("\n");
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
