/*
 * Seller_1_0
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.seller_1_0;

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
 * UpdateInformationChangeDetail
 */
@JsonPropertyOrder({
  UpdateInformationChangeDetail.JSON_PROPERTY_DISPLAY_NAME,
  UpdateInformationChangeDetail.JSON_PROPERTY_DESCRIPTION,
  UpdateInformationChangeDetail.JSON_PROPERTY_LOGO_URL,
  UpdateInformationChangeDetail.JSON_PROPERTY_WEBSITE_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateInformationChangeDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "DisplayName";
  private String displayName;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public static final String JSON_PROPERTY_LOGO_URL = "LogoUrl";
  private String logoUrl;

  public static final String JSON_PROPERTY_WEBSITE_URL = "WebsiteUrl";
  private String websiteUrl;

  public UpdateInformationChangeDetail() {
  }

  public UpdateInformationChangeDetail displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public UpdateInformationChangeDetail description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateInformationChangeDetail logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLogoUrl() {
    return logoUrl;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public UpdateInformationChangeDetail websiteUrl(String websiteUrl) {
    
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * Get websiteUrl
   * @return websiteUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWebsiteUrl() {
    return websiteUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInformationChangeDetail updateInformationChangeDetail = (UpdateInformationChangeDetail) o;
    return Objects.equals(this.displayName, updateInformationChangeDetail.displayName) &&
        Objects.equals(this.description, updateInformationChangeDetail.description) &&
        Objects.equals(this.logoUrl, updateInformationChangeDetail.logoUrl) &&
        Objects.equals(this.websiteUrl, updateInformationChangeDetail.websiteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, description, logoUrl, websiteUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInformationChangeDetail {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
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

