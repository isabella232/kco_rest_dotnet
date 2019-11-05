/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.payments.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.klarna.rest.api.payments.model.PaymentsAssetUrls;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentsPaymentMethodCategory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-05T12:55:42.744Z")
public class PaymentsPaymentMethodCategory {
  @JsonProperty("asset_urls")
  private PaymentsAssetUrls assetUrls = null;

  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("name")
  private String name = null;

  public PaymentsPaymentMethodCategory assetUrls(PaymentsAssetUrls assetUrls) {
    this.assetUrls = assetUrls;
    return this;
  }

   /**
   * Asset URLs
   * @return assetUrls
  **/
  @ApiModelProperty(value = "Asset URLs")
  public PaymentsAssetUrls getAssetUrls() {
    return assetUrls;
  }

  public void setAssetUrls(PaymentsAssetUrls assetUrls) {
    this.assetUrls = assetUrls;
  }

  public PaymentsPaymentMethodCategory identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Id for the category
   * @return identifier
  **/
  @ApiModelProperty(example = "pay_later", value = "Id for the category")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public PaymentsPaymentMethodCategory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the category
   * @return name
  **/
  @ApiModelProperty(example = "Pay Later", value = "Name of the category")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsPaymentMethodCategory paymentMethodCategory = (PaymentsPaymentMethodCategory) o;
    return Objects.equals(this.assetUrls, paymentMethodCategory.assetUrls) &&
        Objects.equals(this.identifier, paymentMethodCategory.identifier) &&
        Objects.equals(this.name, paymentMethodCategory.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUrls, identifier, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsPaymentMethodCategory {\n");
    
    sb.append("    assetUrls: ").append(toIndentedString(assetUrls)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

