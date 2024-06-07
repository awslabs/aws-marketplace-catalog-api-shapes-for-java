/*
 * Offer_1_0_Appendix
 *     Copyright 2024 Amazon.com, Inc. or its affiliates. All Rights Reserved. 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix;

import java.util.Objects;
import java.util.Arrays;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.ByolPricingTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.ConfigurableUpfrontPricingTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.CustomerVerificationTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.FixedUpfrontPricingTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.FreeTrialPricingTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.LegalTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.PaymentScheduleTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.RecurringPaymentTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.RenewalTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.SupportTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.UpdateInformationChangeDetail;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.UpdateTargetingChangeDetail;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.UsageBasedPricingTerm;
import com.amazonaws.services.marketplacecatalog.model.offer_1_0.appendix.ValidityTerm;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ExportAppendixInput
 */
@JsonPropertyOrder({
  ExportAppendixInput.JSON_PROPERTY_CUSTOMER_VERIFICATION_TERM,
  ExportAppendixInput.JSON_PROPERTY_LEGAL_TERM,
  ExportAppendixInput.JSON_PROPERTY_PAYMENT_SCHEDULE_TERM,
  ExportAppendixInput.JSON_PROPERTY_BYOL_PRICING_TERM,
  ExportAppendixInput.JSON_PROPERTY_FREE_TRIAL_PRICING_TERM,
  ExportAppendixInput.JSON_PROPERTY_USAGE_BASED_PRICING_TERM,
  ExportAppendixInput.JSON_PROPERTY_CONFIGURABLE_UPFRONT_PRICING_TERM,
  ExportAppendixInput.JSON_PROPERTY_RECURRING_PAYMENT_TERM,
  ExportAppendixInput.JSON_PROPERTY_FIXED_UPFRONT_PRICING_TERM,
  ExportAppendixInput.JSON_PROPERTY_SUPPORT_TERM,
  ExportAppendixInput.JSON_PROPERTY_RENEWAL_TERM,
  ExportAppendixInput.JSON_PROPERTY_VALIDITY_TERM,
  ExportAppendixInput.JSON_PROPERTY_UPDATE_INFORMATION_CHANGE_DETAIL,
  ExportAppendixInput.JSON_PROPERTY_UPDATE_TARGETING_CHANGE_DETAIL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExportAppendixInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CUSTOMER_VERIFICATION_TERM = "CustomerVerificationTerm";
  private CustomerVerificationTerm customerVerificationTerm;

  public static final String JSON_PROPERTY_LEGAL_TERM = "LegalTerm";
  private LegalTerm legalTerm;

  public static final String JSON_PROPERTY_PAYMENT_SCHEDULE_TERM = "PaymentScheduleTerm";
  private PaymentScheduleTerm paymentScheduleTerm;

  public static final String JSON_PROPERTY_BYOL_PRICING_TERM = "ByolPricingTerm";
  private ByolPricingTerm byolPricingTerm;

  public static final String JSON_PROPERTY_FREE_TRIAL_PRICING_TERM = "FreeTrialPricingTerm";
  private FreeTrialPricingTerm freeTrialPricingTerm;

  public static final String JSON_PROPERTY_USAGE_BASED_PRICING_TERM = "UsageBasedPricingTerm";
  private UsageBasedPricingTerm usageBasedPricingTerm;

  public static final String JSON_PROPERTY_CONFIGURABLE_UPFRONT_PRICING_TERM = "ConfigurableUpfrontPricingTerm";
  private ConfigurableUpfrontPricingTerm configurableUpfrontPricingTerm;

  public static final String JSON_PROPERTY_RECURRING_PAYMENT_TERM = "RecurringPaymentTerm";
  private RecurringPaymentTerm recurringPaymentTerm;

  public static final String JSON_PROPERTY_FIXED_UPFRONT_PRICING_TERM = "FixedUpfrontPricingTerm";
  private FixedUpfrontPricingTerm fixedUpfrontPricingTerm;

  public static final String JSON_PROPERTY_SUPPORT_TERM = "SupportTerm";
  private SupportTerm supportTerm;

  public static final String JSON_PROPERTY_RENEWAL_TERM = "RenewalTerm";
  private RenewalTerm renewalTerm;

  public static final String JSON_PROPERTY_VALIDITY_TERM = "ValidityTerm";
  private ValidityTerm validityTerm;

  public static final String JSON_PROPERTY_UPDATE_INFORMATION_CHANGE_DETAIL = "UpdateInformationChangeDetail";
  private UpdateInformationChangeDetail updateInformationChangeDetail;

  public static final String JSON_PROPERTY_UPDATE_TARGETING_CHANGE_DETAIL = "UpdateTargetingChangeDetail";
  private UpdateTargetingChangeDetail updateTargetingChangeDetail;

  public ExportAppendixInput() {
  }

  public ExportAppendixInput customerVerificationTerm(CustomerVerificationTerm customerVerificationTerm) {
    
    this.customerVerificationTerm = customerVerificationTerm;
    return this;
  }

   /**
   * Get customerVerificationTerm
   * @return customerVerificationTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_VERIFICATION_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerVerificationTerm getCustomerVerificationTerm() {
    return customerVerificationTerm;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_VERIFICATION_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerVerificationTerm(CustomerVerificationTerm customerVerificationTerm) {
    this.customerVerificationTerm = customerVerificationTerm;
  }


  public ExportAppendixInput legalTerm(LegalTerm legalTerm) {
    
    this.legalTerm = legalTerm;
    return this;
  }

   /**
   * Get legalTerm
   * @return legalTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGAL_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LegalTerm getLegalTerm() {
    return legalTerm;
  }


  @JsonProperty(JSON_PROPERTY_LEGAL_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegalTerm(LegalTerm legalTerm) {
    this.legalTerm = legalTerm;
  }


  public ExportAppendixInput paymentScheduleTerm(PaymentScheduleTerm paymentScheduleTerm) {
    
    this.paymentScheduleTerm = paymentScheduleTerm;
    return this;
  }

   /**
   * Get paymentScheduleTerm
   * @return paymentScheduleTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_SCHEDULE_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentScheduleTerm getPaymentScheduleTerm() {
    return paymentScheduleTerm;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_SCHEDULE_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentScheduleTerm(PaymentScheduleTerm paymentScheduleTerm) {
    this.paymentScheduleTerm = paymentScheduleTerm;
  }


  public ExportAppendixInput byolPricingTerm(ByolPricingTerm byolPricingTerm) {
    
    this.byolPricingTerm = byolPricingTerm;
    return this;
  }

   /**
   * Get byolPricingTerm
   * @return byolPricingTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BYOL_PRICING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ByolPricingTerm getByolPricingTerm() {
    return byolPricingTerm;
  }


  @JsonProperty(JSON_PROPERTY_BYOL_PRICING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setByolPricingTerm(ByolPricingTerm byolPricingTerm) {
    this.byolPricingTerm = byolPricingTerm;
  }


  public ExportAppendixInput freeTrialPricingTerm(FreeTrialPricingTerm freeTrialPricingTerm) {
    
    this.freeTrialPricingTerm = freeTrialPricingTerm;
    return this;
  }

   /**
   * Get freeTrialPricingTerm
   * @return freeTrialPricingTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREE_TRIAL_PRICING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FreeTrialPricingTerm getFreeTrialPricingTerm() {
    return freeTrialPricingTerm;
  }


  @JsonProperty(JSON_PROPERTY_FREE_TRIAL_PRICING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreeTrialPricingTerm(FreeTrialPricingTerm freeTrialPricingTerm) {
    this.freeTrialPricingTerm = freeTrialPricingTerm;
  }


  public ExportAppendixInput usageBasedPricingTerm(UsageBasedPricingTerm usageBasedPricingTerm) {
    
    this.usageBasedPricingTerm = usageBasedPricingTerm;
    return this;
  }

   /**
   * Get usageBasedPricingTerm
   * @return usageBasedPricingTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE_BASED_PRICING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageBasedPricingTerm getUsageBasedPricingTerm() {
    return usageBasedPricingTerm;
  }


  @JsonProperty(JSON_PROPERTY_USAGE_BASED_PRICING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsageBasedPricingTerm(UsageBasedPricingTerm usageBasedPricingTerm) {
    this.usageBasedPricingTerm = usageBasedPricingTerm;
  }


  public ExportAppendixInput configurableUpfrontPricingTerm(ConfigurableUpfrontPricingTerm configurableUpfrontPricingTerm) {
    
    this.configurableUpfrontPricingTerm = configurableUpfrontPricingTerm;
    return this;
  }

   /**
   * Get configurableUpfrontPricingTerm
   * @return configurableUpfrontPricingTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURABLE_UPFRONT_PRICING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfigurableUpfrontPricingTerm getConfigurableUpfrontPricingTerm() {
    return configurableUpfrontPricingTerm;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURABLE_UPFRONT_PRICING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurableUpfrontPricingTerm(ConfigurableUpfrontPricingTerm configurableUpfrontPricingTerm) {
    this.configurableUpfrontPricingTerm = configurableUpfrontPricingTerm;
  }


  public ExportAppendixInput recurringPaymentTerm(RecurringPaymentTerm recurringPaymentTerm) {
    
    this.recurringPaymentTerm = recurringPaymentTerm;
    return this;
  }

   /**
   * Get recurringPaymentTerm
   * @return recurringPaymentTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecurringPaymentTerm getRecurringPaymentTerm() {
    return recurringPaymentTerm;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringPaymentTerm(RecurringPaymentTerm recurringPaymentTerm) {
    this.recurringPaymentTerm = recurringPaymentTerm;
  }


  public ExportAppendixInput fixedUpfrontPricingTerm(FixedUpfrontPricingTerm fixedUpfrontPricingTerm) {
    
    this.fixedUpfrontPricingTerm = fixedUpfrontPricingTerm;
    return this;
  }

   /**
   * Get fixedUpfrontPricingTerm
   * @return fixedUpfrontPricingTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_UPFRONT_PRICING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FixedUpfrontPricingTerm getFixedUpfrontPricingTerm() {
    return fixedUpfrontPricingTerm;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_UPFRONT_PRICING_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedUpfrontPricingTerm(FixedUpfrontPricingTerm fixedUpfrontPricingTerm) {
    this.fixedUpfrontPricingTerm = fixedUpfrontPricingTerm;
  }


  public ExportAppendixInput supportTerm(SupportTerm supportTerm) {
    
    this.supportTerm = supportTerm;
    return this;
  }

   /**
   * Get supportTerm
   * @return supportTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPORT_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SupportTerm getSupportTerm() {
    return supportTerm;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORT_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportTerm(SupportTerm supportTerm) {
    this.supportTerm = supportTerm;
  }


  public ExportAppendixInput renewalTerm(RenewalTerm renewalTerm) {
    
    this.renewalTerm = renewalTerm;
    return this;
  }

   /**
   * Get renewalTerm
   * @return renewalTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENEWAL_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RenewalTerm getRenewalTerm() {
    return renewalTerm;
  }


  @JsonProperty(JSON_PROPERTY_RENEWAL_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRenewalTerm(RenewalTerm renewalTerm) {
    this.renewalTerm = renewalTerm;
  }


  public ExportAppendixInput validityTerm(ValidityTerm validityTerm) {
    
    this.validityTerm = validityTerm;
    return this;
  }

   /**
   * Get validityTerm
   * @return validityTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDITY_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ValidityTerm getValidityTerm() {
    return validityTerm;
  }


  @JsonProperty(JSON_PROPERTY_VALIDITY_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidityTerm(ValidityTerm validityTerm) {
    this.validityTerm = validityTerm;
  }


  public ExportAppendixInput updateInformationChangeDetail(UpdateInformationChangeDetail updateInformationChangeDetail) {
    
    this.updateInformationChangeDetail = updateInformationChangeDetail;
    return this;
  }

   /**
   * Get updateInformationChangeDetail
   * @return updateInformationChangeDetail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_INFORMATION_CHANGE_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateInformationChangeDetail getUpdateInformationChangeDetail() {
    return updateInformationChangeDetail;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_INFORMATION_CHANGE_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateInformationChangeDetail(UpdateInformationChangeDetail updateInformationChangeDetail) {
    this.updateInformationChangeDetail = updateInformationChangeDetail;
  }


  public ExportAppendixInput updateTargetingChangeDetail(UpdateTargetingChangeDetail updateTargetingChangeDetail) {
    
    this.updateTargetingChangeDetail = updateTargetingChangeDetail;
    return this;
  }

   /**
   * Get updateTargetingChangeDetail
   * @return updateTargetingChangeDetail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_TARGETING_CHANGE_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateTargetingChangeDetail getUpdateTargetingChangeDetail() {
    return updateTargetingChangeDetail;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_TARGETING_CHANGE_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateTargetingChangeDetail(UpdateTargetingChangeDetail updateTargetingChangeDetail) {
    this.updateTargetingChangeDetail = updateTargetingChangeDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportAppendixInput exportAppendixInput = (ExportAppendixInput) o;
    return Objects.equals(this.customerVerificationTerm, exportAppendixInput.customerVerificationTerm) &&
        Objects.equals(this.legalTerm, exportAppendixInput.legalTerm) &&
        Objects.equals(this.paymentScheduleTerm, exportAppendixInput.paymentScheduleTerm) &&
        Objects.equals(this.byolPricingTerm, exportAppendixInput.byolPricingTerm) &&
        Objects.equals(this.freeTrialPricingTerm, exportAppendixInput.freeTrialPricingTerm) &&
        Objects.equals(this.usageBasedPricingTerm, exportAppendixInput.usageBasedPricingTerm) &&
        Objects.equals(this.configurableUpfrontPricingTerm, exportAppendixInput.configurableUpfrontPricingTerm) &&
        Objects.equals(this.recurringPaymentTerm, exportAppendixInput.recurringPaymentTerm) &&
        Objects.equals(this.fixedUpfrontPricingTerm, exportAppendixInput.fixedUpfrontPricingTerm) &&
        Objects.equals(this.supportTerm, exportAppendixInput.supportTerm) &&
        Objects.equals(this.renewalTerm, exportAppendixInput.renewalTerm) &&
        Objects.equals(this.validityTerm, exportAppendixInput.validityTerm) &&
        Objects.equals(this.updateInformationChangeDetail, exportAppendixInput.updateInformationChangeDetail) &&
        Objects.equals(this.updateTargetingChangeDetail, exportAppendixInput.updateTargetingChangeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerVerificationTerm, legalTerm, paymentScheduleTerm, byolPricingTerm, freeTrialPricingTerm, usageBasedPricingTerm, configurableUpfrontPricingTerm, recurringPaymentTerm, fixedUpfrontPricingTerm, supportTerm, renewalTerm, validityTerm, updateInformationChangeDetail, updateTargetingChangeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportAppendixInput {\n");
    sb.append("    customerVerificationTerm: ").append(toIndentedString(customerVerificationTerm)).append("\n");
    sb.append("    legalTerm: ").append(toIndentedString(legalTerm)).append("\n");
    sb.append("    paymentScheduleTerm: ").append(toIndentedString(paymentScheduleTerm)).append("\n");
    sb.append("    byolPricingTerm: ").append(toIndentedString(byolPricingTerm)).append("\n");
    sb.append("    freeTrialPricingTerm: ").append(toIndentedString(freeTrialPricingTerm)).append("\n");
    sb.append("    usageBasedPricingTerm: ").append(toIndentedString(usageBasedPricingTerm)).append("\n");
    sb.append("    configurableUpfrontPricingTerm: ").append(toIndentedString(configurableUpfrontPricingTerm)).append("\n");
    sb.append("    recurringPaymentTerm: ").append(toIndentedString(recurringPaymentTerm)).append("\n");
    sb.append("    fixedUpfrontPricingTerm: ").append(toIndentedString(fixedUpfrontPricingTerm)).append("\n");
    sb.append("    supportTerm: ").append(toIndentedString(supportTerm)).append("\n");
    sb.append("    renewalTerm: ").append(toIndentedString(renewalTerm)).append("\n");
    sb.append("    validityTerm: ").append(toIndentedString(validityTerm)).append("\n");
    sb.append("    updateInformationChangeDetail: ").append(toIndentedString(updateInformationChangeDetail)).append("\n");
    sb.append("    updateTargetingChangeDetail: ").append(toIndentedString(updateTargetingChangeDetail)).append("\n");
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

