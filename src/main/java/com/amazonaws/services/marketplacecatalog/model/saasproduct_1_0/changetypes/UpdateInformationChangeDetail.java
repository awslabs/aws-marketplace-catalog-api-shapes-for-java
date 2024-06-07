/*
 * SaaSProduct_1_0_ChangeTypes
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.saasproduct_1_0.changetypes;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.saasproduct_1_0.changetypes.AdditionalResource;
import com.amazonaws.services.marketplacecatalog.model.saasproduct_1_0.changetypes.PromotionalMedia;
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
 * PromotionalMedia, AssociatedProducts, and SupportResources are not supported
 */
@JsonPropertyOrder({
  UpdateInformationChangeDetail.JSON_PROPERTY_PRODUCT_TITLE,
  UpdateInformationChangeDetail.JSON_PROPERTY_SHORT_DESCRIPTION,
  UpdateInformationChangeDetail.JSON_PROPERTY_LONG_DESCRIPTION,
  UpdateInformationChangeDetail.JSON_PROPERTY_SKU,
  UpdateInformationChangeDetail.JSON_PROPERTY_LOGO_URL,
  UpdateInformationChangeDetail.JSON_PROPERTY_VIDEO_URLS,
  UpdateInformationChangeDetail.JSON_PROPERTY_PROMOTIONAL_MEDIA,
  UpdateInformationChangeDetail.JSON_PROPERTY_HIGHLIGHTS,
  UpdateInformationChangeDetail.JSON_PROPERTY_ADDITIONAL_RESOURCES,
  UpdateInformationChangeDetail.JSON_PROPERTY_SUPPORT_DESCRIPTION,
  UpdateInformationChangeDetail.JSON_PROPERTY_SUPPORT_RESOURCES,
  UpdateInformationChangeDetail.JSON_PROPERTY_CATEGORIES,
  UpdateInformationChangeDetail.JSON_PROPERTY_ASSOCIATED_PRODUCTS,
  UpdateInformationChangeDetail.JSON_PROPERTY_SEARCH_KEYWORDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateInformationChangeDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRODUCT_TITLE = "ProductTitle";
  private String productTitle;

  public static final String JSON_PROPERTY_SHORT_DESCRIPTION = "ShortDescription";
  private String shortDescription;

  public static final String JSON_PROPERTY_LONG_DESCRIPTION = "LongDescription";
  private String longDescription;

  public static final String JSON_PROPERTY_SKU = "Sku";
  private String sku;

  public static final String JSON_PROPERTY_LOGO_URL = "LogoUrl";
  private String logoUrl;

  public static final String JSON_PROPERTY_VIDEO_URLS = "VideoUrls";
  private List<String> videoUrls;

  public static final String JSON_PROPERTY_PROMOTIONAL_MEDIA = "PromotionalMedia";
  private List<PromotionalMedia> promotionalMedia;

  public static final String JSON_PROPERTY_HIGHLIGHTS = "Highlights";
  private List<String> highlights;

  public static final String JSON_PROPERTY_ADDITIONAL_RESOURCES = "AdditionalResources";
  private List<AdditionalResource> additionalResources;

  public static final String JSON_PROPERTY_SUPPORT_DESCRIPTION = "SupportDescription";
  private String supportDescription;

  public static final String JSON_PROPERTY_SUPPORT_RESOURCES = "SupportResources";
  private List<String> supportResources;

  public static final String JSON_PROPERTY_CATEGORIES = "Categories";
  private List<String> categories;

  public static final String JSON_PROPERTY_ASSOCIATED_PRODUCTS = "AssociatedProducts";
  private List<String> associatedProducts;

  public static final String JSON_PROPERTY_SEARCH_KEYWORDS = "SearchKeywords";
  private List<String> searchKeywords;

  public UpdateInformationChangeDetail() {
  }

  public UpdateInformationChangeDetail productTitle(String productTitle) {
    
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


  public UpdateInformationChangeDetail shortDescription(String shortDescription) {
    
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


  public UpdateInformationChangeDetail longDescription(String longDescription) {
    
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


  public UpdateInformationChangeDetail sku(String sku) {
    
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


  public UpdateInformationChangeDetail logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogoUrl() {
    return logoUrl;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public UpdateInformationChangeDetail videoUrls(List<String> videoUrls) {
    
    this.videoUrls = videoUrls;
    return this;
  }

  public UpdateInformationChangeDetail addVideoUrlsItem(String videoUrlsItem) {
    if (this.videoUrls == null) {
      this.videoUrls = new ArrayList<>();
    }
    this.videoUrls.add(videoUrlsItem);
    return this;
  }

   /**
   * Get videoUrls
   * @return videoUrls
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIDEO_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getVideoUrls() {
    return videoUrls;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoUrls(List<String> videoUrls) {
    this.videoUrls = videoUrls;
  }


  public UpdateInformationChangeDetail promotionalMedia(List<PromotionalMedia> promotionalMedia) {
    
    this.promotionalMedia = promotionalMedia;
    return this;
  }

  public UpdateInformationChangeDetail addPromotionalMediaItem(PromotionalMedia promotionalMediaItem) {
    if (this.promotionalMedia == null) {
      this.promotionalMedia = new ArrayList<>();
    }
    this.promotionalMedia.add(promotionalMediaItem);
    return this;
  }

   /**
   * Get promotionalMedia
   * @return promotionalMedia
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROMOTIONAL_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PromotionalMedia> getPromotionalMedia() {
    return promotionalMedia;
  }


  @JsonProperty(JSON_PROPERTY_PROMOTIONAL_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPromotionalMedia(List<PromotionalMedia> promotionalMedia) {
    this.promotionalMedia = promotionalMedia;
  }


  public UpdateInformationChangeDetail highlights(List<String> highlights) {
    
    this.highlights = highlights;
    return this;
  }

  public UpdateInformationChangeDetail addHighlightsItem(String highlightsItem) {
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


  public UpdateInformationChangeDetail additionalResources(List<AdditionalResource> additionalResources) {
    
    this.additionalResources = additionalResources;
    return this;
  }

  public UpdateInformationChangeDetail addAdditionalResourcesItem(AdditionalResource additionalResourcesItem) {
    if (this.additionalResources == null) {
      this.additionalResources = new ArrayList<>();
    }
    this.additionalResources.add(additionalResourcesItem);
    return this;
  }

   /**
   * Get additionalResources
   * @return additionalResources
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdditionalResource> getAdditionalResources() {
    return additionalResources;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalResources(List<AdditionalResource> additionalResources) {
    this.additionalResources = additionalResources;
  }


  public UpdateInformationChangeDetail supportDescription(String supportDescription) {
    
    this.supportDescription = supportDescription;
    return this;
  }

   /**
   * Get supportDescription
   * @return supportDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSupportDescription() {
    return supportDescription;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportDescription(String supportDescription) {
    this.supportDescription = supportDescription;
  }


  public UpdateInformationChangeDetail supportResources(List<String> supportResources) {
    
    this.supportResources = supportResources;
    return this;
  }

  public UpdateInformationChangeDetail addSupportResourcesItem(String supportResourcesItem) {
    if (this.supportResources == null) {
      this.supportResources = new ArrayList<>();
    }
    this.supportResources.add(supportResourcesItem);
    return this;
  }

   /**
   * Get supportResources
   * @return supportResources
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORT_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSupportResources() {
    return supportResources;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORT_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportResources(List<String> supportResources) {
    this.supportResources = supportResources;
  }


  public UpdateInformationChangeDetail categories(List<String> categories) {
    
    this.categories = categories;
    return this;
  }

  public UpdateInformationChangeDetail addCategoriesItem(String categoriesItem) {
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


  public UpdateInformationChangeDetail associatedProducts(List<String> associatedProducts) {
    
    this.associatedProducts = associatedProducts;
    return this;
  }

  public UpdateInformationChangeDetail addAssociatedProductsItem(String associatedProductsItem) {
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


  public UpdateInformationChangeDetail searchKeywords(List<String> searchKeywords) {
    
    this.searchKeywords = searchKeywords;
    return this;
  }

  public UpdateInformationChangeDetail addSearchKeywordsItem(String searchKeywordsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInformationChangeDetail updateInformationChangeDetail = (UpdateInformationChangeDetail) o;
    return Objects.equals(this.productTitle, updateInformationChangeDetail.productTitle) &&
        Objects.equals(this.shortDescription, updateInformationChangeDetail.shortDescription) &&
        Objects.equals(this.longDescription, updateInformationChangeDetail.longDescription) &&
        Objects.equals(this.sku, updateInformationChangeDetail.sku) &&
        Objects.equals(this.logoUrl, updateInformationChangeDetail.logoUrl) &&
        Objects.equals(this.videoUrls, updateInformationChangeDetail.videoUrls) &&
        Objects.equals(this.promotionalMedia, updateInformationChangeDetail.promotionalMedia) &&
        Objects.equals(this.highlights, updateInformationChangeDetail.highlights) &&
        Objects.equals(this.additionalResources, updateInformationChangeDetail.additionalResources) &&
        Objects.equals(this.supportDescription, updateInformationChangeDetail.supportDescription) &&
        Objects.equals(this.supportResources, updateInformationChangeDetail.supportResources) &&
        Objects.equals(this.categories, updateInformationChangeDetail.categories) &&
        Objects.equals(this.associatedProducts, updateInformationChangeDetail.associatedProducts) &&
        Objects.equals(this.searchKeywords, updateInformationChangeDetail.searchKeywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productTitle, shortDescription, longDescription, sku, logoUrl, videoUrls, promotionalMedia, highlights, additionalResources, supportDescription, supportResources, categories, associatedProducts, searchKeywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInformationChangeDetail {\n");
    sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    videoUrls: ").append(toIndentedString(videoUrls)).append("\n");
    sb.append("    promotionalMedia: ").append(toIndentedString(promotionalMedia)).append("\n");
    sb.append("    highlights: ").append(toIndentedString(highlights)).append("\n");
    sb.append("    additionalResources: ").append(toIndentedString(additionalResources)).append("\n");
    sb.append("    supportDescription: ").append(toIndentedString(supportDescription)).append("\n");
    sb.append("    supportResources: ").append(toIndentedString(supportResources)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    associatedProducts: ").append(toIndentedString(associatedProducts)).append("\n");
    sb.append("    searchKeywords: ").append(toIndentedString(searchKeywords)).append("\n");
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

