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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UpdateDeliveryOptionsVersion
 */
@JsonPropertyOrder({
  UpdateDeliveryOptionsVersion.JSON_PROPERTY_VERSION_TITLE,
  UpdateDeliveryOptionsVersion.JSON_PROPERTY_RELEASE_NOTES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateDeliveryOptionsVersion implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VERSION_TITLE = "VersionTitle";
  private String versionTitle;

  public static final String JSON_PROPERTY_RELEASE_NOTES = "ReleaseNotes";
  private String releaseNotes;

  public UpdateDeliveryOptionsVersion() {
  }

  public UpdateDeliveryOptionsVersion versionTitle(String versionTitle) {
    
    this.versionTitle = versionTitle;
    return this;
  }

   /**
   * Get versionTitle
   * @return versionTitle
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersionTitle() {
    return versionTitle;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionTitle(String versionTitle) {
    this.versionTitle = versionTitle;
  }


  public UpdateDeliveryOptionsVersion releaseNotes(String releaseNotes) {
    
    this.releaseNotes = releaseNotes;
    return this;
  }

   /**
   * Get releaseNotes
   * @return releaseNotes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReleaseNotes() {
    return releaseNotes;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseNotes(String releaseNotes) {
    this.releaseNotes = releaseNotes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDeliveryOptionsVersion updateDeliveryOptionsVersion = (UpdateDeliveryOptionsVersion) o;
    return Objects.equals(this.versionTitle, updateDeliveryOptionsVersion.versionTitle) &&
        Objects.equals(this.releaseNotes, updateDeliveryOptionsVersion.releaseNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionTitle, releaseNotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDeliveryOptionsVersion {\n");
    sb.append("    versionTitle: ").append(toIndentedString(versionTitle)).append("\n");
    sb.append("    releaseNotes: ").append(toIndentedString(releaseNotes)).append("\n");
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
