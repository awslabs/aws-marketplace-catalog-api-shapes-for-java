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
import com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.entitytype.Description;
import com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.entitytype.Dimension;
import com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.entitytype.PromotionalResources;
import com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.entitytype.Repository;
import com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.entitytype.SignatureVerificationKey;
import com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.entitytype.SupportInformation;
import com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.entitytype.Targeting;
import com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0.entitytype.Version;
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
 * ContainerProductEntityDetail
 */
@JsonPropertyOrder({
  ContainerProductEntityDetail.JSON_PROPERTY_VERSIONS,
  ContainerProductEntityDetail.JSON_PROPERTY_REPOSITORIES,
  ContainerProductEntityDetail.JSON_PROPERTY_DESCRIPTION,
  ContainerProductEntityDetail.JSON_PROPERTY_PROMOTIONAL_RESOURCES,
  ContainerProductEntityDetail.JSON_PROPERTY_SUPPORT_INFORMATION,
  ContainerProductEntityDetail.JSON_PROPERTY_DIMENSIONS,
  ContainerProductEntityDetail.JSON_PROPERTY_TARGETING,
  ContainerProductEntityDetail.JSON_PROPERTY_SIGNATURE_VERIFICATION_KEYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContainerProductEntityDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VERSIONS = "Versions";
  private List<Version> versions;

  public static final String JSON_PROPERTY_REPOSITORIES = "Repositories";
  private List<Repository> repositories;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private Description description;

  public static final String JSON_PROPERTY_PROMOTIONAL_RESOURCES = "PromotionalResources";
  private PromotionalResources promotionalResources;

  public static final String JSON_PROPERTY_SUPPORT_INFORMATION = "SupportInformation";
  private SupportInformation supportInformation;

  public static final String JSON_PROPERTY_DIMENSIONS = "Dimensions";
  private List<Dimension> dimensions;

  public static final String JSON_PROPERTY_TARGETING = "Targeting";
  private Targeting targeting;

  public static final String JSON_PROPERTY_SIGNATURE_VERIFICATION_KEYS = "SignatureVerificationKeys";
  private List<SignatureVerificationKey> signatureVerificationKeys;

  public ContainerProductEntityDetail() {
  }

  public ContainerProductEntityDetail versions(List<Version> versions) {
    
    this.versions = versions;
    return this;
  }

  public ContainerProductEntityDetail addVersionsItem(Version versionsItem) {
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


  public ContainerProductEntityDetail repositories(List<Repository> repositories) {
    
    this.repositories = repositories;
    return this;
  }

  public ContainerProductEntityDetail addRepositoriesItem(Repository repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

   /**
   * Get repositories
   * @return repositories
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPOSITORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Repository> getRepositories() {
    return repositories;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepositories(List<Repository> repositories) {
    this.repositories = repositories;
  }


  public ContainerProductEntityDetail description(Description description) {
    
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


  public ContainerProductEntityDetail promotionalResources(PromotionalResources promotionalResources) {
    
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


  public ContainerProductEntityDetail supportInformation(SupportInformation supportInformation) {
    
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


  public ContainerProductEntityDetail dimensions(List<Dimension> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public ContainerProductEntityDetail addDimensionsItem(Dimension dimensionsItem) {
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


  public ContainerProductEntityDetail targeting(Targeting targeting) {
    
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


  public ContainerProductEntityDetail signatureVerificationKeys(List<SignatureVerificationKey> signatureVerificationKeys) {
    
    this.signatureVerificationKeys = signatureVerificationKeys;
    return this;
  }

  public ContainerProductEntityDetail addSignatureVerificationKeysItem(SignatureVerificationKey signatureVerificationKeysItem) {
    if (this.signatureVerificationKeys == null) {
      this.signatureVerificationKeys = new ArrayList<>();
    }
    this.signatureVerificationKeys.add(signatureVerificationKeysItem);
    return this;
  }

   /**
   * Get signatureVerificationKeys
   * @return signatureVerificationKeys
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIGNATURE_VERIFICATION_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SignatureVerificationKey> getSignatureVerificationKeys() {
    return signatureVerificationKeys;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_VERIFICATION_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignatureVerificationKeys(List<SignatureVerificationKey> signatureVerificationKeys) {
    this.signatureVerificationKeys = signatureVerificationKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerProductEntityDetail containerProductEntityDetail = (ContainerProductEntityDetail) o;
    return Objects.equals(this.versions, containerProductEntityDetail.versions) &&
        Objects.equals(this.repositories, containerProductEntityDetail.repositories) &&
        Objects.equals(this.description, containerProductEntityDetail.description) &&
        Objects.equals(this.promotionalResources, containerProductEntityDetail.promotionalResources) &&
        Objects.equals(this.supportInformation, containerProductEntityDetail.supportInformation) &&
        Objects.equals(this.dimensions, containerProductEntityDetail.dimensions) &&
        Objects.equals(this.targeting, containerProductEntityDetail.targeting) &&
        Objects.equals(this.signatureVerificationKeys, containerProductEntityDetail.signatureVerificationKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versions, repositories, description, promotionalResources, supportInformation, dimensions, targeting, signatureVerificationKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerProductEntityDetail {\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    promotionalResources: ").append(toIndentedString(promotionalResources)).append("\n");
    sb.append("    supportInformation: ").append(toIndentedString(supportInformation)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    targeting: ").append(toIndentedString(targeting)).append("\n");
    sb.append("    signatureVerificationKeys: ").append(toIndentedString(signatureVerificationKeys)).append("\n");
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

