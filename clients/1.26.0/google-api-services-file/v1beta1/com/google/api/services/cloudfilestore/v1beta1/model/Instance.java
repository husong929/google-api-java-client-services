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

package com.google.api.services.cloudfilestore.v1beta1.model;

/**
 * A Cloud Filestore instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Filestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time when the instance was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. A description of the instance (2048 characters or less).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Server-specified ETag for the instance resource to prevent simultaneous updates from
   * overwriting each other.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * File system shares on the instance. For this version, only a single file share is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FileShareConfig> fileShares;

  static {
    // hack to force ProGuard to consider FileShareConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FileShareConfig.class);
  }

  /**
   * Resource labels to represent user provided metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The resource name of the instance, in the format
   * projects/{project_id}/locations/{location_id}/instances/{instance_id}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * VPC networks to which the instance is connected. For this version, only a single network is
   * supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NetworkConfig> networks;

  static {
    // hack to force ProGuard to consider NetworkConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(NetworkConfig.class);
  }

  /**
   * Output only. The instance state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Additional information about the instance state, if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * The service tier of the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tier;

  /**
   * Output only. The time when the instance was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the instance was created.
   * @param createTime createTime or {@code null} for none
   */
  public Instance setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. A description of the instance (2048 characters or less).
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A description of the instance (2048 characters or less).
   * @param description description or {@code null} for none
   */
  public Instance setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Server-specified ETag for the instance resource to prevent simultaneous updates from
   * overwriting each other.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Server-specified ETag for the instance resource to prevent simultaneous updates from
   * overwriting each other.
   * @param etag etag or {@code null} for none
   */
  public Instance setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * File system shares on the instance. For this version, only a single file share is supported.
   * @return value or {@code null} for none
   */
  public java.util.List<FileShareConfig> getFileShares() {
    return fileShares;
  }

  /**
   * File system shares on the instance. For this version, only a single file share is supported.
   * @param fileShares fileShares or {@code null} for none
   */
  public Instance setFileShares(java.util.List<FileShareConfig> fileShares) {
    this.fileShares = fileShares;
    return this;
  }

  /**
   * Resource labels to represent user provided metadata.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Resource labels to represent user provided metadata.
   * @param labels labels or {@code null} for none
   */
  public Instance setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The resource name of the instance, in the format
   * projects/{project_id}/locations/{location_id}/instances/{instance_id}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the instance, in the format
   * projects/{project_id}/locations/{location_id}/instances/{instance_id}.
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * VPC networks to which the instance is connected. For this version, only a single network is
   * supported.
   * @return value or {@code null} for none
   */
  public java.util.List<NetworkConfig> getNetworks() {
    return networks;
  }

  /**
   * VPC networks to which the instance is connected. For this version, only a single network is
   * supported.
   * @param networks networks or {@code null} for none
   */
  public Instance setNetworks(java.util.List<NetworkConfig> networks) {
    this.networks = networks;
    return this;
  }

  /**
   * Output only. The instance state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The instance state.
   * @param state state or {@code null} for none
   */
  public Instance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Additional information about the instance state, if available.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * Output only. Additional information about the instance state, if available.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public Instance setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * The service tier of the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getTier() {
    return tier;
  }

  /**
   * The service tier of the instance.
   * @param tier tier or {@code null} for none
   */
  public Instance setTier(java.lang.String tier) {
    this.tier = tier;
    return this;
  }

  @Override
  public Instance set(String fieldName, Object value) {
    return (Instance) super.set(fieldName, value);
  }

  @Override
  public Instance clone() {
    return (Instance) super.clone();
  }

}