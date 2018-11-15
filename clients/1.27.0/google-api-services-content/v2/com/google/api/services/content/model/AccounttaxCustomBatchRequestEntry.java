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

package com.google.api.services.content.model;

/**
 * A batch entry encoding a single non-batch accounttax request.
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
public final class AccounttaxCustomBatchRequestEntry extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the account for which to get/update account tax settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger accountId;

  /**
   * The account tax settings to update. Only defined if the method is update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AccountTax accountTax;

  /**
   * An entry ID, unique within the batch request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long batchId;

  /**
   * The ID of the managing account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger merchantId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String method;

  /**
   * The ID of the account for which to get/update account tax settings.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getAccountId() {
    return accountId;
  }

  /**
   * The ID of the account for which to get/update account tax settings.
   * @param accountId accountId or {@code null} for none
   */
  public AccounttaxCustomBatchRequestEntry setAccountId(java.math.BigInteger accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account tax settings to update. Only defined if the method is update.
   * @return value or {@code null} for none
   */
  public AccountTax getAccountTax() {
    return accountTax;
  }

  /**
   * The account tax settings to update. Only defined if the method is update.
   * @param accountTax accountTax or {@code null} for none
   */
  public AccounttaxCustomBatchRequestEntry setAccountTax(AccountTax accountTax) {
    this.accountTax = accountTax;
    return this;
  }

  /**
   * An entry ID, unique within the batch request.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBatchId() {
    return batchId;
  }

  /**
   * An entry ID, unique within the batch request.
   * @param batchId batchId or {@code null} for none
   */
  public AccounttaxCustomBatchRequestEntry setBatchId(java.lang.Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * The ID of the managing account.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getMerchantId() {
    return merchantId;
  }

  /**
   * The ID of the managing account.
   * @param merchantId merchantId or {@code null} for none
   */
  public AccounttaxCustomBatchRequestEntry setMerchantId(java.math.BigInteger merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMethod() {
    return method;
  }

  /**
   * @param method method or {@code null} for none
   */
  public AccounttaxCustomBatchRequestEntry setMethod(java.lang.String method) {
    this.method = method;
    return this;
  }

  @Override
  public AccounttaxCustomBatchRequestEntry set(String fieldName, Object value) {
    return (AccounttaxCustomBatchRequestEntry) super.set(fieldName, value);
  }

  @Override
  public AccounttaxCustomBatchRequestEntry clone() {
    return (AccounttaxCustomBatchRequestEntry) super.clone();
  }

}