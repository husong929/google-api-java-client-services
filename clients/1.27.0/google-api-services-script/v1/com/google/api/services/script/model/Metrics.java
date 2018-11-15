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

package com.google.api.services.script.model;

/**
 * Resource containing usage stats for a given script, based on the supplied filter and mask present
 * in the request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apps Script API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Metrics extends com.google.api.client.json.GenericJson {

  /**
   * Number of active users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricsValue> activeUsers;

  static {
    // hack to force ProGuard to consider MetricsValue used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MetricsValue.class);
  }

  /**
   * Number of failed executions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricsValue> failedExecutions;

  static {
    // hack to force ProGuard to consider MetricsValue used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MetricsValue.class);
  }

  /**
   * Number of total executions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricsValue> totalExecutions;

  static {
    // hack to force ProGuard to consider MetricsValue used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MetricsValue.class);
  }

  /**
   * Number of active users.
   * @return value or {@code null} for none
   */
  public java.util.List<MetricsValue> getActiveUsers() {
    return activeUsers;
  }

  /**
   * Number of active users.
   * @param activeUsers activeUsers or {@code null} for none
   */
  public Metrics setActiveUsers(java.util.List<MetricsValue> activeUsers) {
    this.activeUsers = activeUsers;
    return this;
  }

  /**
   * Number of failed executions.
   * @return value or {@code null} for none
   */
  public java.util.List<MetricsValue> getFailedExecutions() {
    return failedExecutions;
  }

  /**
   * Number of failed executions.
   * @param failedExecutions failedExecutions or {@code null} for none
   */
  public Metrics setFailedExecutions(java.util.List<MetricsValue> failedExecutions) {
    this.failedExecutions = failedExecutions;
    return this;
  }

  /**
   * Number of total executions.
   * @return value or {@code null} for none
   */
  public java.util.List<MetricsValue> getTotalExecutions() {
    return totalExecutions;
  }

  /**
   * Number of total executions.
   * @param totalExecutions totalExecutions or {@code null} for none
   */
  public Metrics setTotalExecutions(java.util.List<MetricsValue> totalExecutions) {
    this.totalExecutions = totalExecutions;
    return this;
  }

  @Override
  public Metrics set(String fieldName, Object value) {
    return (Metrics) super.set(fieldName, value);
  }

  @Override
  public Metrics clone() {
    return (Metrics) super.clone();
  }

}