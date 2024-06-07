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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Access
 */
@JsonPropertyOrder({
  Access.JSON_PROPERTY_TYPE,
  Access.JSON_PROPERTY_PORT,
  Access.JSON_PROPERTY_PROTOCOL,
  Access.JSON_PROPERTY_RELATIVE_PATH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Access implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TYPE = "Type";
  private String type;

  public static final String JSON_PROPERTY_PORT = "Port";
  private Integer port;

  public static final String JSON_PROPERTY_PROTOCOL = "Protocol";
  private String protocol;

  public static final String JSON_PROPERTY_RELATIVE_PATH = "RelativePath";
  private String relativePath;

  public Access() {
  }

  public Access type(String type) {
    
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


  public Access port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPort() {
    return port;
  }


  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPort(Integer port) {
    this.port = port;
  }


  public Access protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public Access relativePath(String relativePath) {
    
    this.relativePath = relativePath;
    return this;
  }

   /**
   * Get relativePath
   * @return relativePath
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIVE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRelativePath() {
    return relativePath;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Access access = (Access) o;
    return Objects.equals(this.type, access.type) &&
        Objects.equals(this.port, access.port) &&
        Objects.equals(this.protocol, access.protocol) &&
        Objects.equals(this.relativePath, access.relativePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, port, protocol, relativePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Access {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
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
