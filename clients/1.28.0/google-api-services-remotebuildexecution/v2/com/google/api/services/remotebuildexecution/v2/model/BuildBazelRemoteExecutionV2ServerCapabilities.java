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

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * A response message for Capabilities.GetCapabilities.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildBazelRemoteExecutionV2ServerCapabilities extends com.google.api.client.json.GenericJson {

  /**
   * Capabilities of the remote cache system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelRemoteExecutionV2CacheCapabilities cacheCapabilities;

  /**
   * Earliest RE API version supported, including deprecated versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelSemverSemVer deprecatedApiVersion;

  /**
   * Capabilities of the remote execution system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelRemoteExecutionV2ExecutionCapabilities executionCapabilities;

  /**
   * Latest RE API version supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelSemverSemVer highApiVersion;

  /**
   * Earliest non-deprecated RE API version supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelSemverSemVer lowApiVersion;

  /**
   * Capabilities of the remote cache system.
   * @return value or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2CacheCapabilities getCacheCapabilities() {
    return cacheCapabilities;
  }

  /**
   * Capabilities of the remote cache system.
   * @param cacheCapabilities cacheCapabilities or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ServerCapabilities setCacheCapabilities(BuildBazelRemoteExecutionV2CacheCapabilities cacheCapabilities) {
    this.cacheCapabilities = cacheCapabilities;
    return this;
  }

  /**
   * Earliest RE API version supported, including deprecated versions.
   * @return value or {@code null} for none
   */
  public BuildBazelSemverSemVer getDeprecatedApiVersion() {
    return deprecatedApiVersion;
  }

  /**
   * Earliest RE API version supported, including deprecated versions.
   * @param deprecatedApiVersion deprecatedApiVersion or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ServerCapabilities setDeprecatedApiVersion(BuildBazelSemverSemVer deprecatedApiVersion) {
    this.deprecatedApiVersion = deprecatedApiVersion;
    return this;
  }

  /**
   * Capabilities of the remote execution system.
   * @return value or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutionCapabilities getExecutionCapabilities() {
    return executionCapabilities;
  }

  /**
   * Capabilities of the remote execution system.
   * @param executionCapabilities executionCapabilities or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ServerCapabilities setExecutionCapabilities(BuildBazelRemoteExecutionV2ExecutionCapabilities executionCapabilities) {
    this.executionCapabilities = executionCapabilities;
    return this;
  }

  /**
   * Latest RE API version supported.
   * @return value or {@code null} for none
   */
  public BuildBazelSemverSemVer getHighApiVersion() {
    return highApiVersion;
  }

  /**
   * Latest RE API version supported.
   * @param highApiVersion highApiVersion or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ServerCapabilities setHighApiVersion(BuildBazelSemverSemVer highApiVersion) {
    this.highApiVersion = highApiVersion;
    return this;
  }

  /**
   * Earliest non-deprecated RE API version supported.
   * @return value or {@code null} for none
   */
  public BuildBazelSemverSemVer getLowApiVersion() {
    return lowApiVersion;
  }

  /**
   * Earliest non-deprecated RE API version supported.
   * @param lowApiVersion lowApiVersion or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ServerCapabilities setLowApiVersion(BuildBazelSemverSemVer lowApiVersion) {
    this.lowApiVersion = lowApiVersion;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2ServerCapabilities set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2ServerCapabilities) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2ServerCapabilities clone() {
    return (BuildBazelRemoteExecutionV2ServerCapabilities) super.clone();
  }

}