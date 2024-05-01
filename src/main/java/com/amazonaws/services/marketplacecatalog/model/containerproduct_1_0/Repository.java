/*
 * ContainerProduct_1_0
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.containerproduct_1_0;

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
 * Repository
 */
@JsonPropertyOrder({
  Repository.JSON_PROPERTY_REPOSITORY_NAME,
  Repository.JSON_PROPERTY_REPOSITORY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Repository implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REPOSITORY_NAME = "RepositoryName";
  private String repositoryName;

  public static final String JSON_PROPERTY_REPOSITORY_TYPE = "RepositoryType";
  private String repositoryType;

  public Repository() {
  }

  public Repository repositoryName(String repositoryName) {
    
    this.repositoryName = repositoryName;
    return this;
  }

   /**
   * Get repositoryName
   * @return repositoryName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPOSITORY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRepositoryName() {
    return repositoryName;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRepositoryName(String repositoryName) {
    this.repositoryName = repositoryName;
  }


  public Repository repositoryType(String repositoryType) {
    
    this.repositoryType = repositoryType;
    return this;
  }

   /**
   * Get repositoryType
   * @return repositoryType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPOSITORY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRepositoryType() {
    return repositoryType;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRepositoryType(String repositoryType) {
    this.repositoryType = repositoryType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repository repository = (Repository) o;
    return Objects.equals(this.repositoryName, repository.repositoryName) &&
        Objects.equals(this.repositoryType, repository.repositoryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repositoryName, repositoryType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repository {\n");
    sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
    sb.append("    repositoryType: ").append(toIndentedString(repositoryType)).append("\n");
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

