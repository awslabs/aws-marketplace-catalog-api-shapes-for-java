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
 * Description
 */
@JsonPropertyOrder({
  Description.JSON_PROPERTY_PRODUCT_TITLE,
  Description.JSON_PROPERTY_PRODUCT_CODE,
  Description.JSON_PROPERTY_SHORT_DESCRIPTION,
  Description.JSON_PROPERTY_MANUFACTURER,
  Description.JSON_PROPERTY_LONG_DESCRIPTION,
  Description.JSON_PROPERTY_SKU,
  Description.JSON_PROPERTY_HIGHLIGHTS,
  Description.JSON_PROPERTY_ASSOCIATED_PRODUCTS,
  Description.JSON_PROPERTY_SEARCH_KEYWORDS,
  Description.JSON_PROPERTY_VISIBILITY,
  Description.JSON_PROPERTY_CATEGORIES,
  Description.JSON_PROPERTY_PRODUCT_STATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Description implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRODUCT_TITLE = "ProductTitle";
  private String productTitle;

  public static final String JSON_PROPERTY_PRODUCT_CODE = "ProductCode";
  private String productCode;

  public static final String JSON_PROPERTY_SHORT_DESCRIPTION = "ShortDescription";
  private String shortDescription;

  public static final String JSON_PROPERTY_MANUFACTURER = "Manufacturer";
  private String manufacturer;

  public static final String JSON_PROPERTY_LONG_DESCRIPTION = "LongDescription";
  private String longDescription;

  public static final String JSON_PROPERTY_SKU = "Sku";
  private String sku;

  public static final String JSON_PROPERTY_HIGHLIGHTS = "Highlights";
  private List<String> highlights;

  public static final String JSON_PROPERTY_ASSOCIATED_PRODUCTS = "AssociatedProducts";
  private List<String> associatedProducts;

  public static final String JSON_PROPERTY_SEARCH_KEYWORDS = "SearchKeywords";
  private List<String> searchKeywords;

  public static final String JSON_PROPERTY_VISIBILITY = "Visibility";
  private String visibility;

  public static final String JSON_PROPERTY_CATEGORIES = "Categories";
  private List<String> categories;

  public static final String JSON_PROPERTY_PRODUCT_STATE = "ProductState";
  private String productState;

  public Description() {
  }

  public Description productTitle(String productTitle) {
    
    this.productTitle = productTitle;
    return this;
  }

   /**
   * Get productTitle
   * @return productTitle
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductTitle() {
    return productTitle;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }


  public Description productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductCode() {
    return productCode;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public Description shortDescription(String shortDescription) {
    
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * Get shortDescription
   * @return shortDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShortDescription() {
    return shortDescription;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }


  public Description manufacturer(String manufacturer) {
    
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManufacturer() {
    return manufacturer;
  }


  @JsonProperty(JSON_PROPERTY_MANUFACTURER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public Description longDescription(String longDescription) {
    
    this.longDescription = longDescription;
    return this;
  }

   /**
   * Get longDescription
   * @return longDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LONG_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLongDescription() {
    return longDescription;
  }


  @JsonProperty(JSON_PROPERTY_LONG_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }


  public Description sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSku() {
    return sku;
  }


  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSku(String sku) {
    this.sku = sku;
  }


  public Description highlights(List<String> highlights) {
    
    this.highlights = highlights;
    return this;
  }

  public Description addHighlightsItem(String highlightsItem) {
    if (this.highlights == null) {
      this.highlights = new ArrayList<>();
    }
    this.highlights.add(highlightsItem);
    return this;
  }

   /**
   * Get highlights
   * @return highlights
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIGHLIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getHighlights() {
    return highlights;
  }


  @JsonProperty(JSON_PROPERTY_HIGHLIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHighlights(List<String> highlights) {
    this.highlights = highlights;
  }


  public Description associatedProducts(List<String> associatedProducts) {
    
    this.associatedProducts = associatedProducts;
    return this;
  }

  public Description addAssociatedProductsItem(String associatedProductsItem) {
    if (this.associatedProducts == null) {
      this.associatedProducts = new ArrayList<>();
    }
    this.associatedProducts.add(associatedProductsItem);
    return this;
  }

   /**
   * Get associatedProducts
   * @return associatedProducts
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAssociatedProducts() {
    return associatedProducts;
  }


  @JsonProperty(JSON_PROPERTY_ASSOCIATED_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssociatedProducts(List<String> associatedProducts) {
    this.associatedProducts = associatedProducts;
  }


  public Description searchKeywords(List<String> searchKeywords) {
    
    this.searchKeywords = searchKeywords;
    return this;
  }

  public Description addSearchKeywordsItem(String searchKeywordsItem) {
    if (this.searchKeywords == null) {
      this.searchKeywords = new ArrayList<>();
    }
    this.searchKeywords.add(searchKeywordsItem);
    return this;
  }

   /**
   * Get searchKeywords
   * @return searchKeywords
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSearchKeywords() {
    return searchKeywords;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchKeywords(List<String> searchKeywords) {
    this.searchKeywords = searchKeywords;
  }


  public Description visibility(String visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisibility() {
    return visibility;
  }


  @JsonProperty(JSON_PROPERTY_VISIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }


  public Description categories(List<String> categories) {
    
    this.categories = categories;
    return this;
  }

  public Description addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public Description productState(String productState) {
    
    this.productState = productState;
    return this;
  }

   /**
   * Get productState
   * @return productState
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductState() {
    return productState;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductState(String productState) {
    this.productState = productState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Description description = (Description) o;
    return Objects.equals(this.productTitle, description.productTitle) &&
        Objects.equals(this.productCode, description.productCode) &&
        Objects.equals(this.shortDescription, description.shortDescription) &&
        Objects.equals(this.manufacturer, description.manufacturer) &&
        Objects.equals(this.longDescription, description.longDescription) &&
        Objects.equals(this.sku, description.sku) &&
        Objects.equals(this.highlights, description.highlights) &&
        Objects.equals(this.associatedProducts, description.associatedProducts) &&
        Objects.equals(this.searchKeywords, description.searchKeywords) &&
        Objects.equals(this.visibility, description.visibility) &&
        Objects.equals(this.categories, description.categories) &&
        Objects.equals(this.productState, description.productState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTitle, productCode, shortDescription, manufacturer, longDescription, sku, highlights, associatedProducts, searchKeywords, visibility, categories, productState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Description {\n");
    sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    highlights: ").append(toIndentedString(highlights)).append("\n");
    sb.append("    associatedProducts: ").append(toIndentedString(associatedProducts)).append("\n");
    sb.append("    searchKeywords: ").append(toIndentedString(searchKeywords)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    productState: ").append(toIndentedString(productState)).append("\n");
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

