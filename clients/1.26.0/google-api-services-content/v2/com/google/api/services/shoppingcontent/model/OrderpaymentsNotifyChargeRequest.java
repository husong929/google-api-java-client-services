/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.shoppingcontent.model;

/**
 * Model definition for OrderpaymentsNotifyChargeRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderpaymentsNotifyChargeRequest extends com.google.api.client.json.GenericJson {

  /**
   * Whether charge was successful.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String chargeState;

  /**
   * Deprecated. Please use invoiceIds instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String invoiceId;

  /**
   * Invoice IDs from the orderinvoices service that correspond to the charge.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> invoiceIds;

  /**
   * Whether charge was successful.
   * @return value or {@code null} for none
   */
  public java.lang.String getChargeState() {
    return chargeState;
  }

  /**
   * Whether charge was successful.
   * @param chargeState chargeState or {@code null} for none
   */
  public OrderpaymentsNotifyChargeRequest setChargeState(java.lang.String chargeState) {
    this.chargeState = chargeState;
    return this;
  }

  /**
   * Deprecated. Please use invoiceIds instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getInvoiceId() {
    return invoiceId;
  }

  /**
   * Deprecated. Please use invoiceIds instead.
   * @param invoiceId invoiceId or {@code null} for none
   */
  public OrderpaymentsNotifyChargeRequest setInvoiceId(java.lang.String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * Invoice IDs from the orderinvoices service that correspond to the charge.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInvoiceIds() {
    return invoiceIds;
  }

  /**
   * Invoice IDs from the orderinvoices service that correspond to the charge.
   * @param invoiceIds invoiceIds or {@code null} for none
   */
  public OrderpaymentsNotifyChargeRequest setInvoiceIds(java.util.List<java.lang.String> invoiceIds) {
    this.invoiceIds = invoiceIds;
    return this;
  }

  @Override
  public OrderpaymentsNotifyChargeRequest set(String fieldName, Object value) {
    return (OrderpaymentsNotifyChargeRequest) super.set(fieldName, value);
  }

  @Override
  public OrderpaymentsNotifyChargeRequest clone() {
    return (OrderpaymentsNotifyChargeRequest) super.clone();
  }

}