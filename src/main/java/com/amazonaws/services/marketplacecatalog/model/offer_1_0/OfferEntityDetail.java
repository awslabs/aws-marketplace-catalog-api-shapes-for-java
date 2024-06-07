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
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.PreExistingAgreement;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.Rule;
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
 * OfferEntityDetail
 */
@JsonPropertyOrder({
  OfferEntityDetail.JSON_PROPERTY_DESCRIPTION,
  OfferEntityDetail.JSON_PROPERTY_ID,
  OfferEntityDetail.JSON_PROPERTY_STATE,
  OfferEntityDetail.JSON_PROPERTY_MARKUP_PERCENTAGE,
  OfferEntityDetail.JSON_PROPERTY_NAME,
  OfferEntityDetail.JSON_PROPERTY_PRE_EXISTING_AGREEMENT,
  OfferEntityDetail.JSON_PROPERTY_PRODUCT_ID,
  OfferEntityDetail.JSON_PROPERTY_RULES,
  OfferEntityDetail.JSON_PROPERTY_TERMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OfferEntityDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public static final String JSON_PROPERTY_ID = "Id";
  private String id;

  public static final String JSON_PROPERTY_STATE = "State";
  private String state;

  public static final String JSON_PROPERTY_MARKUP_PERCENTAGE = "MarkupPercentage";
  private String markupPercentage;

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_PRE_EXISTING_AGREEMENT = "PreExistingAgreement";
  private PreExistingAgreement preExistingAgreement;

  public static final String JSON_PROPERTY_PRODUCT_ID = "ProductId";
  private String productId;

  public static final String JSON_PROPERTY_RULES = "Rules";
  private List<Rule> rules;

  public static final String JSON_PROPERTY_TERMS = "Terms";
  private List<Term> terms;

  public OfferEntityDetail() {
  }

  public OfferEntityDetail description(String description) {
    
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

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public OfferEntityDetail id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public OfferEntityDetail state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public OfferEntityDetail markupPercentage(String markupPercentage) {
    
    this.markupPercentage = markupPercentage;
    return this;
  }

   /**
   * Get markupPercentage
   * @return markupPercentage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MARKUP_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarkupPercentage() {
    return markupPercentage;
  }


  @JsonProperty(JSON_PROPERTY_MARKUP_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkupPercentage(String markupPercentage) {
    this.markupPercentage = markupPercentage;
  }


  public OfferEntityDetail name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public OfferEntityDetail preExistingAgreement(PreExistingAgreement preExistingAgreement) {
    
    this.preExistingAgreement = preExistingAgreement;
    return this;
  }

   /**
   * Get preExistingAgreement
   * @return preExistingAgreement
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRE_EXISTING_AGREEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PreExistingAgreement getPreExistingAgreement() {
    return preExistingAgreement;
  }


  @JsonProperty(JSON_PROPERTY_PRE_EXISTING_AGREEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreExistingAgreement(PreExistingAgreement preExistingAgreement) {
    this.preExistingAgreement = preExistingAgreement;
  }


  public OfferEntityDetail productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductId() {
    return productId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductId(String productId) {
    this.productId = productId;
  }


  public OfferEntityDetail rules(List<Rule> rules) {
    
    this.rules = rules;
    return this;
  }

  public OfferEntityDetail addRulesItem(Rule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Rule> getRules() {
    return rules;
  }


  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRules(List<Rule> rules) {
    this.rules = rules;
  }


  public OfferEntityDetail terms(List<Term> terms) {
    
    this.terms = terms;
    return this;
  }

  public OfferEntityDetail addTermsItem(Term termsItem) {
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Term> getTerms() {
    return terms;
  }


  @JsonProperty(JSON_PROPERTY_TERMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    OfferEntityDetail offerEntityDetail = (OfferEntityDetail) o;
    return Objects.equals(this.description, offerEntityDetail.description) &&
        Objects.equals(this.id, offerEntityDetail.id) &&
        Objects.equals(this.state, offerEntityDetail.state) &&
        Objects.equals(this.markupPercentage, offerEntityDetail.markupPercentage) &&
        Objects.equals(this.name, offerEntityDetail.name) &&
        Objects.equals(this.preExistingAgreement, offerEntityDetail.preExistingAgreement) &&
        Objects.equals(this.productId, offerEntityDetail.productId) &&
        Objects.equals(this.rules, offerEntityDetail.rules) &&
        Objects.equals(this.terms, offerEntityDetail.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, state, markupPercentage, name, preExistingAgreement, productId, rules, terms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferEntityDetail {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    markupPercentage: ").append(toIndentedString(markupPercentage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    preExistingAgreement: ").append(toIndentedString(preExistingAgreement)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

