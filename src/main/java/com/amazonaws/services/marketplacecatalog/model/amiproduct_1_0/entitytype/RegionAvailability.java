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
 * RegionAvailability
 */
@JsonPropertyOrder({
  RegionAvailability.JSON_PROPERTY_REGIONS,
  RegionAvailability.JSON_PROPERTY_FUTURE_REGION_SUPPORT,
  RegionAvailability.JSON_PROPERTY_RESTRICT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RegionAvailability implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REGIONS = "Regions";
  private List<String> regions;

  public static final String JSON_PROPERTY_FUTURE_REGION_SUPPORT = "FutureRegionSupport";
  private String futureRegionSupport;

  public static final String JSON_PROPERTY_RESTRICT = "Restrict";
  private List<String> restrict;

  public RegionAvailability() {
  }

  public RegionAvailability regions(List<String> regions) {
    
    this.regions = regions;
    return this;
  }

  public RegionAvailability addRegionsItem(String regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRegions() {
    return regions;
  }


  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegions(List<String> regions) {
    this.regions = regions;
  }


  public RegionAvailability futureRegionSupport(String futureRegionSupport) {
    
    this.futureRegionSupport = futureRegionSupport;
    return this;
  }

   /**
   * Get futureRegionSupport
   * @return futureRegionSupport
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUTURE_REGION_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFutureRegionSupport() {
    return futureRegionSupport;
  }


  @JsonProperty(JSON_PROPERTY_FUTURE_REGION_SUPPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFutureRegionSupport(String futureRegionSupport) {
    this.futureRegionSupport = futureRegionSupport;
  }


  public RegionAvailability restrict(List<String> restrict) {
    
    this.restrict = restrict;
    return this;
  }

  public RegionAvailability addRestrictItem(String restrictItem) {
    if (this.restrict == null) {
      this.restrict = new ArrayList<>();
    }
    this.restrict.add(restrictItem);
    return this;
  }

   /**
   * Get restrict
   * @return restrict
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRestrict() {
    return restrict;
  }


  @JsonProperty(JSON_PROPERTY_RESTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestrict(List<String> restrict) {
    this.restrict = restrict;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionAvailability regionAvailability = (RegionAvailability) o;
    return Objects.equals(this.regions, regionAvailability.regions) &&
        Objects.equals(this.futureRegionSupport, regionAvailability.futureRegionSupport) &&
        Objects.equals(this.restrict, regionAvailability.restrict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regions, futureRegionSupport, restrict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionAvailability {\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    futureRegionSupport: ").append(toIndentedString(futureRegionSupport)).append("\n");
    sb.append("    restrict: ").append(toIndentedString(restrict)).append("\n");
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

