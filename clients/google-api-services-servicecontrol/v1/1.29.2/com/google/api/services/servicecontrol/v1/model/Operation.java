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

package com.google.api.services.servicecontrol.v1.model;

/**
 * Represents information regarding an operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Operation extends com.google.api.client.json.GenericJson {

  /**
   * Identity of the consumer who is using the service. This field should be filled in for the
   * operations initiated by a consumer, but not for service-initiated operations that are not
   * related to a specific consumer.
   *
   * - This can be in one of the following formats:     - project:PROJECT_ID,     -
   * project`_`number:PROJECT_NUMBER,     - projects/PROJECT_ID or PROJECT_NUMBER,     -
   * folders/FOLDER_NUMBER,     - organizations/ORGANIZATION_NUMBER,     - api`_`key:API_KEY.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerId;

  /**
   * End time of the operation. Required when the operation is used in ServiceController.Report, but
   * optional when the operation is used in ServiceController.Check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * DO NOT USE. This is an experimental field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String importance;

  /**
   * Labels describing the operation. Only the following labels are allowed:
   *
   * - Labels describing monitored resources as defined in   the service configuration. - Default
   * labels of metric values. When specified, labels defined in the   metric value override these
   * default. - The following labels defined by Google Cloud Platform:     -
   * `cloud.googleapis.com/location` describing the location where the        operation happened,
   * - `servicecontrol.googleapis.com/user_agent` describing the user agent        of the API
   * request,     - `servicecontrol.googleapis.com/service_agent` describing the service        used
   * to handle the API request (e.g. ESP),     - `servicecontrol.googleapis.com/platform` describing
   * the platform        where the API is served, such as App Engine, Compute Engine, or
   * Kubernetes Engine.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Represents information to be logged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LogEntry> logEntries;

  static {
    // hack to force ProGuard to consider LogEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LogEntry.class);
  }

  /**
   * Represents information about this operation. Each MetricValueSet corresponds to a metric
   * defined in the service configuration. The data type used in the MetricValueSet must agree with
   * the data type specified in the metric definition.
   *
   * Within a single operation, it is not allowed to have more than one MetricValue instances that
   * have the same metric names and identical label value combinations. If a request has such
   * duplicated MetricValue instances, the entire request is rejected with an invalid argument
   * error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricValueSet> metricValueSets;

  static {
    // hack to force ProGuard to consider MetricValueSet used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MetricValueSet.class);
  }

  /**
   * Identity of the operation. This must be unique within the scope of the service that generated
   * the operation. If the service calls Check() and Report() on the same operation, the two calls
   * should carry the same id.
   *
   * UUID version 4 is recommended, though not required. In scenarios where an operation is computed
   * from existing information and an idempotent id is desirable for deduplication purpose, UUID
   * version 5 is recommended. See RFC 4122 for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationId;

  /**
   * Fully qualified name of the operation. Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationName;

  /**
   * Represents the properties needed for quota check. Applicable only if this operation is for a
   * quota check request. If this is not specified, no quota check will be performed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QuotaProperties quotaProperties;

  /**
   * The resources that are involved in the operation. The maximum supported number of entries in
   * this field is 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceInfo> resources;

  /**
   * Required. Start time of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * User defined labels for the resource that this operation is associated with. Only a combination
   * of 1000 user labels per consumer project are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> userLabels;

  /**
   * Identity of the consumer who is using the service. This field should be filled in for the
   * operations initiated by a consumer, but not for service-initiated operations that are not
   * related to a specific consumer.
   *
   * - This can be in one of the following formats:     - project:PROJECT_ID,     -
   * project`_`number:PROJECT_NUMBER,     - projects/PROJECT_ID or PROJECT_NUMBER,     -
   * folders/FOLDER_NUMBER,     - organizations/ORGANIZATION_NUMBER,     - api`_`key:API_KEY.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerId() {
    return consumerId;
  }

  /**
   * Identity of the consumer who is using the service. This field should be filled in for the
   * operations initiated by a consumer, but not for service-initiated operations that are not
   * related to a specific consumer.
   *
   * - This can be in one of the following formats:     - project:PROJECT_ID,     -
   * project`_`number:PROJECT_NUMBER,     - projects/PROJECT_ID or PROJECT_NUMBER,     -
   * folders/FOLDER_NUMBER,     - organizations/ORGANIZATION_NUMBER,     - api`_`key:API_KEY.
   * @param consumerId consumerId or {@code null} for none
   */
  public Operation setConsumerId(java.lang.String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * End time of the operation. Required when the operation is used in ServiceController.Report, but
   * optional when the operation is used in ServiceController.Check.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * End time of the operation. Required when the operation is used in ServiceController.Report, but
   * optional when the operation is used in ServiceController.Check.
   * @param endTime endTime or {@code null} for none
   */
  public Operation setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * DO NOT USE. This is an experimental field.
   * @return value or {@code null} for none
   */
  public java.lang.String getImportance() {
    return importance;
  }

  /**
   * DO NOT USE. This is an experimental field.
   * @param importance importance or {@code null} for none
   */
  public Operation setImportance(java.lang.String importance) {
    this.importance = importance;
    return this;
  }

  /**
   * Labels describing the operation. Only the following labels are allowed:
   *
   * - Labels describing monitored resources as defined in   the service configuration. - Default
   * labels of metric values. When specified, labels defined in the   metric value override these
   * default. - The following labels defined by Google Cloud Platform:     -
   * `cloud.googleapis.com/location` describing the location where the        operation happened,
   * - `servicecontrol.googleapis.com/user_agent` describing the user agent        of the API
   * request,     - `servicecontrol.googleapis.com/service_agent` describing the service        used
   * to handle the API request (e.g. ESP),     - `servicecontrol.googleapis.com/platform` describing
   * the platform        where the API is served, such as App Engine, Compute Engine, or
   * Kubernetes Engine.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels describing the operation. Only the following labels are allowed:
   *
   * - Labels describing monitored resources as defined in   the service configuration. - Default
   * labels of metric values. When specified, labels defined in the   metric value override these
   * default. - The following labels defined by Google Cloud Platform:     -
   * `cloud.googleapis.com/location` describing the location where the        operation happened,
   * - `servicecontrol.googleapis.com/user_agent` describing the user agent        of the API
   * request,     - `servicecontrol.googleapis.com/service_agent` describing the service        used
   * to handle the API request (e.g. ESP),     - `servicecontrol.googleapis.com/platform` describing
   * the platform        where the API is served, such as App Engine, Compute Engine, or
   * Kubernetes Engine.
   * @param labels labels or {@code null} for none
   */
  public Operation setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Represents information to be logged.
   * @return value or {@code null} for none
   */
  public java.util.List<LogEntry> getLogEntries() {
    return logEntries;
  }

  /**
   * Represents information to be logged.
   * @param logEntries logEntries or {@code null} for none
   */
  public Operation setLogEntries(java.util.List<LogEntry> logEntries) {
    this.logEntries = logEntries;
    return this;
  }

  /**
   * Represents information about this operation. Each MetricValueSet corresponds to a metric
   * defined in the service configuration. The data type used in the MetricValueSet must agree with
   * the data type specified in the metric definition.
   *
   * Within a single operation, it is not allowed to have more than one MetricValue instances that
   * have the same metric names and identical label value combinations. If a request has such
   * duplicated MetricValue instances, the entire request is rejected with an invalid argument
   * error.
   * @return value or {@code null} for none
   */
  public java.util.List<MetricValueSet> getMetricValueSets() {
    return metricValueSets;
  }

  /**
   * Represents information about this operation. Each MetricValueSet corresponds to a metric
   * defined in the service configuration. The data type used in the MetricValueSet must agree with
   * the data type specified in the metric definition.
   *
   * Within a single operation, it is not allowed to have more than one MetricValue instances that
   * have the same metric names and identical label value combinations. If a request has such
   * duplicated MetricValue instances, the entire request is rejected with an invalid argument
   * error.
   * @param metricValueSets metricValueSets or {@code null} for none
   */
  public Operation setMetricValueSets(java.util.List<MetricValueSet> metricValueSets) {
    this.metricValueSets = metricValueSets;
    return this;
  }

  /**
   * Identity of the operation. This must be unique within the scope of the service that generated
   * the operation. If the service calls Check() and Report() on the same operation, the two calls
   * should carry the same id.
   *
   * UUID version 4 is recommended, though not required. In scenarios where an operation is computed
   * from existing information and an idempotent id is desirable for deduplication purpose, UUID
   * version 5 is recommended. See RFC 4122 for details.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationId() {
    return operationId;
  }

  /**
   * Identity of the operation. This must be unique within the scope of the service that generated
   * the operation. If the service calls Check() and Report() on the same operation, the two calls
   * should carry the same id.
   *
   * UUID version 4 is recommended, though not required. In scenarios where an operation is computed
   * from existing information and an idempotent id is desirable for deduplication purpose, UUID
   * version 5 is recommended. See RFC 4122 for details.
   * @param operationId operationId or {@code null} for none
   */
  public Operation setOperationId(java.lang.String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Fully qualified name of the operation. Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationName() {
    return operationName;
  }

  /**
   * Fully qualified name of the operation. Reserved for future use.
   * @param operationName operationName or {@code null} for none
   */
  public Operation setOperationName(java.lang.String operationName) {
    this.operationName = operationName;
    return this;
  }

  /**
   * Represents the properties needed for quota check. Applicable only if this operation is for a
   * quota check request. If this is not specified, no quota check will be performed.
   * @return value or {@code null} for none
   */
  public QuotaProperties getQuotaProperties() {
    return quotaProperties;
  }

  /**
   * Represents the properties needed for quota check. Applicable only if this operation is for a
   * quota check request. If this is not specified, no quota check will be performed.
   * @param quotaProperties quotaProperties or {@code null} for none
   */
  public Operation setQuotaProperties(QuotaProperties quotaProperties) {
    this.quotaProperties = quotaProperties;
    return this;
  }

  /**
   * The resources that are involved in the operation. The maximum supported number of entries in
   * this field is 100.
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceInfo> getResources() {
    return resources;
  }

  /**
   * The resources that are involved in the operation. The maximum supported number of entries in
   * this field is 100.
   * @param resources resources or {@code null} for none
   */
  public Operation setResources(java.util.List<ResourceInfo> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Required. Start time of the operation.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Required. Start time of the operation.
   * @param startTime startTime or {@code null} for none
   */
  public Operation setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * User defined labels for the resource that this operation is associated with. Only a combination
   * of 1000 user labels per consumer project are allowed.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getUserLabels() {
    return userLabels;
  }

  /**
   * User defined labels for the resource that this operation is associated with. Only a combination
   * of 1000 user labels per consumer project are allowed.
   * @param userLabels userLabels or {@code null} for none
   */
  public Operation setUserLabels(java.util.Map<String, java.lang.String> userLabels) {
    this.userLabels = userLabels;
    return this;
  }

  @Override
  public Operation set(String fieldName, Object value) {
    return (Operation) super.set(fieldName, value);
  }

  @Override
  public Operation clone() {
    return (Operation) super.clone();
  }

}
