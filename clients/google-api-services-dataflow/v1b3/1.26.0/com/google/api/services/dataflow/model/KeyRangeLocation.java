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

package com.google.api.services.dataflow.model;

/**
 * Location information for a specific key-range of a sharded computation. Currently we only support
 * UTF-8 character splits to simplify encoding into JSON.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KeyRangeLocation extends com.google.api.client.json.GenericJson {

  /**
   * The name of the data disk where data for this range is stored. This name is local to the Google
   * Cloud Platform project and uniquely identifies the disk within that project, for example
   * "myproject-1014-104817-4c2-harness-0-disk-1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataDisk;

  /**
   * The physical location of this range assignment to be used for streaming computation cross-
   * worker message delivery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deliveryEndpoint;

  /**
   * DEPRECATED. The location of the persistent state for this range, as a persistent directory in
   * the worker local filesystem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deprecatedPersistentDirectory;

  /**
   * The end (exclusive) of the key range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String end;

  /**
   * The start (inclusive) of the key range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String start;

  /**
   * The name of the data disk where data for this range is stored. This name is local to the Google
   * Cloud Platform project and uniquely identifies the disk within that project, for example
   * "myproject-1014-104817-4c2-harness-0-disk-1".
   * @return value or {@code null} for none
   */
  public java.lang.String getDataDisk() {
    return dataDisk;
  }

  /**
   * The name of the data disk where data for this range is stored. This name is local to the Google
   * Cloud Platform project and uniquely identifies the disk within that project, for example
   * "myproject-1014-104817-4c2-harness-0-disk-1".
   * @param dataDisk dataDisk or {@code null} for none
   */
  public KeyRangeLocation setDataDisk(java.lang.String dataDisk) {
    this.dataDisk = dataDisk;
    return this;
  }

  /**
   * The physical location of this range assignment to be used for streaming computation cross-
   * worker message delivery.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeliveryEndpoint() {
    return deliveryEndpoint;
  }

  /**
   * The physical location of this range assignment to be used for streaming computation cross-
   * worker message delivery.
   * @param deliveryEndpoint deliveryEndpoint or {@code null} for none
   */
  public KeyRangeLocation setDeliveryEndpoint(java.lang.String deliveryEndpoint) {
    this.deliveryEndpoint = deliveryEndpoint;
    return this;
  }

  /**
   * DEPRECATED. The location of the persistent state for this range, as a persistent directory in
   * the worker local filesystem.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeprecatedPersistentDirectory() {
    return deprecatedPersistentDirectory;
  }

  /**
   * DEPRECATED. The location of the persistent state for this range, as a persistent directory in
   * the worker local filesystem.
   * @param deprecatedPersistentDirectory deprecatedPersistentDirectory or {@code null} for none
   */
  public KeyRangeLocation setDeprecatedPersistentDirectory(java.lang.String deprecatedPersistentDirectory) {
    this.deprecatedPersistentDirectory = deprecatedPersistentDirectory;
    return this;
  }

  /**
   * The end (exclusive) of the key range.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnd() {
    return end;
  }

  /**
   * The end (exclusive) of the key range.
   * @param end end or {@code null} for none
   */
  public KeyRangeLocation setEnd(java.lang.String end) {
    this.end = end;
    return this;
  }

  /**
   * The start (inclusive) of the key range.
   * @return value or {@code null} for none
   */
  public java.lang.String getStart() {
    return start;
  }

  /**
   * The start (inclusive) of the key range.
   * @param start start or {@code null} for none
   */
  public KeyRangeLocation setStart(java.lang.String start) {
    this.start = start;
    return this;
  }

  @Override
  public KeyRangeLocation set(String fieldName, Object value) {
    return (KeyRangeLocation) super.set(fieldName, value);
  }

  @Override
  public KeyRangeLocation clone() {
    return (KeyRangeLocation) super.clone();
  }

}
