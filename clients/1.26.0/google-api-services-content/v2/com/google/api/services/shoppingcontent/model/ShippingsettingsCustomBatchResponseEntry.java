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
 * A batch entry encoding a single non-batch shipping settings response.
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
public final class ShippingsettingsCustomBatchResponseEntry extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the request entry to which this entry responds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long batchId;

  /**
   * A list of errors defined if, and only if, the request failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Errors errors;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#shippingsettingsCustomBatchResponseEntry".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The retrieved or updated account shipping settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShippingSettings shippingSettings;

  /**
   * The ID of the request entry to which this entry responds.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBatchId() {
    return batchId;
  }

  /**
   * The ID of the request entry to which this entry responds.
   * @param batchId batchId or {@code null} for none
   */
  public ShippingsettingsCustomBatchResponseEntry setBatchId(java.lang.Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * A list of errors defined if, and only if, the request failed.
   * @return value or {@code null} for none
   */
  public Errors getErrors() {
    return errors;
  }

  /**
   * A list of errors defined if, and only if, the request failed.
   * @param errors errors or {@code null} for none
   */
  public ShippingsettingsCustomBatchResponseEntry setErrors(Errors errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#shippingsettingsCustomBatchResponseEntry".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#shippingsettingsCustomBatchResponseEntry".
   * @param kind kind or {@code null} for none
   */
  public ShippingsettingsCustomBatchResponseEntry setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The retrieved or updated account shipping settings.
   * @return value or {@code null} for none
   */
  public ShippingSettings getShippingSettings() {
    return shippingSettings;
  }

  /**
   * The retrieved or updated account shipping settings.
   * @param shippingSettings shippingSettings or {@code null} for none
   */
  public ShippingsettingsCustomBatchResponseEntry setShippingSettings(ShippingSettings shippingSettings) {
    this.shippingSettings = shippingSettings;
    return this;
  }

  @Override
  public ShippingsettingsCustomBatchResponseEntry set(String fieldName, Object value) {
    return (ShippingsettingsCustomBatchResponseEntry) super.set(fieldName, value);
  }

  @Override
  public ShippingsettingsCustomBatchResponseEntry clone() {
    return (ShippingsettingsCustomBatchResponseEntry) super.clone();
  }

}