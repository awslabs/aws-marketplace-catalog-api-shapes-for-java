/*
 * Offer_1_0
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.offer_1_0;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.Term;
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
 * UpdateValidityTermsChangeDetail
 */
@JsonPropertyOrder({
  UpdateValidityTermsChangeDetail.JSON_PROPERTY_TERMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateValidityTermsChangeDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TERMS = "Terms";
  private List<Term> terms = new ArrayList<>();

  public UpdateValidityTermsChangeDetail() {
  }

  public UpdateValidityTermsChangeDetail terms(List<Term> terms) {
    
    this.terms = terms;
    return this;
  }

  public UpdateValidityTermsChangeDetail addTermsItem(Term termsItem) {
    if (this.terms == null) {
      this.terms = new ArrayList<>();
    }
    this.terms.add(termsItem);
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TERMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Term> getTerms() {
    return terms;
  }


  @JsonProperty(JSON_PROPERTY_TERMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTerms(List<Term> terms) {
    this.terms = terms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateValidityTermsChangeDetail updateValidityTermsChangeDetail = (UpdateValidityTermsChangeDetail) o;
    return Objects.equals(this.terms, updateValidityTermsChangeDetail.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateValidityTermsChangeDetail {\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
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

