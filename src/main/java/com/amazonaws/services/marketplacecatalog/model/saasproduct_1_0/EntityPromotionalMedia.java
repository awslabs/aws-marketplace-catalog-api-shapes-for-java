/*
 * SaaSProduct_1_0
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.saasproduct_1_0;

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
 * EntityPromotionalMedia
 */
@JsonPropertyOrder({
  EntityPromotionalMedia.JSON_PROPERTY_TYPE,
  EntityPromotionalMedia.JSON_PROPERTY_URL,
  EntityPromotionalMedia.JSON_PROPERTY_SHA256_BASE64,
  EntityPromotionalMedia.JSON_PROPERTY_TITLE,
  EntityPromotionalMedia.JSON_PROPERTY_PREVIEW,
  EntityPromotionalMedia.JSON_PROPERTY_THUMBNAIL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityPromotionalMedia implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TYPE = "Type";
  private String type;

  public static final String JSON_PROPERTY_URL = "Url";
  private String url;

  public static final String JSON_PROPERTY_SHA256_BASE64 = "Sha256Base64";
  private String sha256Base64;

  public static final String JSON_PROPERTY_TITLE = "Title";
  private String title;

  public static final String JSON_PROPERTY_PREVIEW = "Preview";
  private String preview;

  public static final String JSON_PROPERTY_THUMBNAIL = "Thumbnail";
  private String thumbnail;

  public EntityPromotionalMedia() {
  }

  public EntityPromotionalMedia type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public EntityPromotionalMedia url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public EntityPromotionalMedia sha256Base64(String sha256Base64) {
    
    this.sha256Base64 = sha256Base64;
    return this;
  }

   /**
   * Get sha256Base64
   * @return sha256Base64
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHA256_BASE64)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSha256Base64() {
    return sha256Base64;
  }


  @JsonProperty(JSON_PROPERTY_SHA256_BASE64)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSha256Base64(String sha256Base64) {
    this.sha256Base64 = sha256Base64;
  }


  public EntityPromotionalMedia title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public EntityPromotionalMedia preview(String preview) {
    
    this.preview = preview;
    return this;
  }

   /**
   * Get preview
   * @return preview
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreview() {
    return preview;
  }


  @JsonProperty(JSON_PROPERTY_PREVIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreview(String preview) {
    this.preview = preview;
  }


  public EntityPromotionalMedia thumbnail(String thumbnail) {
    
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Get thumbnail
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THUMBNAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThumbnail() {
    return thumbnail;
  }


  @JsonProperty(JSON_PROPERTY_THUMBNAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityPromotionalMedia entityPromotionalMedia = (EntityPromotionalMedia) o;
    return Objects.equals(this.type, entityPromotionalMedia.type) &&
        Objects.equals(this.url, entityPromotionalMedia.url) &&
        Objects.equals(this.sha256Base64, entityPromotionalMedia.sha256Base64) &&
        Objects.equals(this.title, entityPromotionalMedia.title) &&
        Objects.equals(this.preview, entityPromotionalMedia.preview) &&
        Objects.equals(this.thumbnail, entityPromotionalMedia.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url, sha256Base64, title, preview, thumbnail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityPromotionalMedia {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    sha256Base64: ").append(toIndentedString(sha256Base64)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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

