/*
 * AmiProduct_1_0_ChangeTypes
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.amiproduct_1_0.changetypes;

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
 * AmiSource
 */
@JsonPropertyOrder({
  AmiSource.JSON_PROPERTY_AMI_ID,
  AmiSource.JSON_PROPERTY_ACCESS_ROLE_ARN,
  AmiSource.JSON_PROPERTY_USER_NAME,
  AmiSource.JSON_PROPERTY_SCANNING_PORT,
  AmiSource.JSON_PROPERTY_OPERATING_SYSTEM_NAME,
  AmiSource.JSON_PROPERTY_OPERATING_SYSTEM_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AmiSource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMI_ID = "AmiId";
  private String amiId;

  public static final String JSON_PROPERTY_ACCESS_ROLE_ARN = "AccessRoleArn";
  private String accessRoleArn;

  public static final String JSON_PROPERTY_USER_NAME = "UserName";
  private String userName;

  public static final String JSON_PROPERTY_SCANNING_PORT = "ScanningPort";
  private Integer scanningPort;

  public static final String JSON_PROPERTY_OPERATING_SYSTEM_NAME = "OperatingSystemName";
  private String operatingSystemName;

  public static final String JSON_PROPERTY_OPERATING_SYSTEM_VERSION = "OperatingSystemVersion";
  private String operatingSystemVersion;

  public AmiSource() {
  }

  public AmiSource amiId(String amiId) {
    
    this.amiId = amiId;
    return this;
  }

   /**
   * Get amiId
   * @return amiId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMI_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmiId() {
    return amiId;
  }


  @JsonProperty(JSON_PROPERTY_AMI_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmiId(String amiId) {
    this.amiId = amiId;
  }


  public AmiSource accessRoleArn(String accessRoleArn) {
    
    this.accessRoleArn = accessRoleArn;
    return this;
  }

   /**
   * Get accessRoleArn
   * @return accessRoleArn
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCESS_ROLE_ARN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccessRoleArn() {
    return accessRoleArn;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_ROLE_ARN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccessRoleArn(String accessRoleArn) {
    this.accessRoleArn = accessRoleArn;
  }


  public AmiSource userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  public AmiSource scanningPort(Integer scanningPort) {
    
    this.scanningPort = scanningPort;
    return this;
  }

   /**
   * Get scanningPort
   * minimum: 1
   * maximum: 65535
   * @return scanningPort
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCANNING_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScanningPort() {
    return scanningPort;
  }


  @JsonProperty(JSON_PROPERTY_SCANNING_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScanningPort(Integer scanningPort) {
    this.scanningPort = scanningPort;
  }


  public AmiSource operatingSystemName(String operatingSystemName) {
    
    this.operatingSystemName = operatingSystemName;
    return this;
  }

   /**
   * Get operatingSystemName
   * @return operatingSystemName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPERATING_SYSTEM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOperatingSystemName() {
    return operatingSystemName;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_SYSTEM_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperatingSystemName(String operatingSystemName) {
    this.operatingSystemName = operatingSystemName;
  }


  public AmiSource operatingSystemVersion(String operatingSystemVersion) {
    
    this.operatingSystemVersion = operatingSystemVersion;
    return this;
  }

   /**
   * Get operatingSystemVersion
   * @return operatingSystemVersion
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPERATING_SYSTEM_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOperatingSystemVersion() {
    return operatingSystemVersion;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_SYSTEM_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperatingSystemVersion(String operatingSystemVersion) {
    this.operatingSystemVersion = operatingSystemVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmiSource amiSource = (AmiSource) o;
    return Objects.equals(this.amiId, amiSource.amiId) &&
        Objects.equals(this.accessRoleArn, amiSource.accessRoleArn) &&
        Objects.equals(this.userName, amiSource.userName) &&
        Objects.equals(this.scanningPort, amiSource.scanningPort) &&
        Objects.equals(this.operatingSystemName, amiSource.operatingSystemName) &&
        Objects.equals(this.operatingSystemVersion, amiSource.operatingSystemVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amiId, accessRoleArn, userName, scanningPort, operatingSystemName, operatingSystemVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmiSource {\n");
    sb.append("    amiId: ").append(toIndentedString(amiId)).append("\n");
    sb.append("    accessRoleArn: ").append(toIndentedString(accessRoleArn)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    scanningPort: ").append(toIndentedString(scanningPort)).append("\n");
    sb.append("    operatingSystemName: ").append(toIndentedString(operatingSystemName)).append("\n");
    sb.append("    operatingSystemVersion: ").append(toIndentedString(operatingSystemVersion)).append("\n");
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

