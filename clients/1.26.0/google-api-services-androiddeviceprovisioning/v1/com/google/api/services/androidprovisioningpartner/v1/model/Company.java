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

package com.google.api.services.androidprovisioningpartner.v1.model;

/**
 * A reseller, vendor, or customer in the zero-touch reseller and customer APIs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Device Provisioning Partner API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Company extends com.google.api.client.json.GenericJson {

  /**
   * Input only. Optional. Email address of customer's users in the admin role. Each email address
   * must be associated with a Google Account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> adminEmails;

  /**
   * Output only. The ID of the company. Assigned by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long companyId;

  /**
   * Required. The name of the company. For example _XYZ Corp_. Displayed to the company's employees
   * in the zero-touch enrollment portal.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String companyName;

  /**
   * Output only. The API resource name of the company. The resource name is one of the following
   * formats:
   *
   * * `partners/[PARTNER_ID]/customers/[CUSTOMER_ID]` * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]`
   * * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]/customers/[CUSTOMER_ID]`
   *
   * Assigned by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Input only. Email address of customer's users in the owner role. At least one `owner_email` is
   * required. Each email address must be associated with a Google Account. Owners share the same
   * access as admins but can also add, delete, and edit your organization's portal users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ownerEmails;

  /**
   * Output only. Whether any user from the company has accepted the latest Terms of Service (ToS).
   * See TermsStatus.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String termsStatus;

  /**
   * Input only. Optional. Email address of customer's users in the admin role. Each email address
   * must be associated with a Google Account.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAdminEmails() {
    return adminEmails;
  }

  /**
   * Input only. Optional. Email address of customer's users in the admin role. Each email address
   * must be associated with a Google Account.
   * @param adminEmails adminEmails or {@code null} for none
   */
  public Company setAdminEmails(java.util.List<java.lang.String> adminEmails) {
    this.adminEmails = adminEmails;
    return this;
  }

  /**
   * Output only. The ID of the company. Assigned by the server.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCompanyId() {
    return companyId;
  }

  /**
   * Output only. The ID of the company. Assigned by the server.
   * @param companyId companyId or {@code null} for none
   */
  public Company setCompanyId(java.lang.Long companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Required. The name of the company. For example _XYZ Corp_. Displayed to the company's employees
   * in the zero-touch enrollment portal.
   * @return value or {@code null} for none
   */
  public java.lang.String getCompanyName() {
    return companyName;
  }

  /**
   * Required. The name of the company. For example _XYZ Corp_. Displayed to the company's employees
   * in the zero-touch enrollment portal.
   * @param companyName companyName or {@code null} for none
   */
  public Company setCompanyName(java.lang.String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Output only. The API resource name of the company. The resource name is one of the following
   * formats:
   *
   * * `partners/[PARTNER_ID]/customers/[CUSTOMER_ID]` * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]`
   * * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]/customers/[CUSTOMER_ID]`
   *
   * Assigned by the server.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The API resource name of the company. The resource name is one of the following
   * formats:
   *
   * * `partners/[PARTNER_ID]/customers/[CUSTOMER_ID]` * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]`
   * * `partners/[PARTNER_ID]/vendors/[VENDOR_ID]/customers/[CUSTOMER_ID]`
   *
   * Assigned by the server.
   * @param name name or {@code null} for none
   */
  public Company setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Input only. Email address of customer's users in the owner role. At least one `owner_email` is
   * required. Each email address must be associated with a Google Account. Owners share the same
   * access as admins but can also add, delete, and edit your organization's portal users.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOwnerEmails() {
    return ownerEmails;
  }

  /**
   * Input only. Email address of customer's users in the owner role. At least one `owner_email` is
   * required. Each email address must be associated with a Google Account. Owners share the same
   * access as admins but can also add, delete, and edit your organization's portal users.
   * @param ownerEmails ownerEmails or {@code null} for none
   */
  public Company setOwnerEmails(java.util.List<java.lang.String> ownerEmails) {
    this.ownerEmails = ownerEmails;
    return this;
  }

  /**
   * Output only. Whether any user from the company has accepted the latest Terms of Service (ToS).
   * See TermsStatus.
   * @return value or {@code null} for none
   */
  public java.lang.String getTermsStatus() {
    return termsStatus;
  }

  /**
   * Output only. Whether any user from the company has accepted the latest Terms of Service (ToS).
   * See TermsStatus.
   * @param termsStatus termsStatus or {@code null} for none
   */
  public Company setTermsStatus(java.lang.String termsStatus) {
    this.termsStatus = termsStatus;
    return this;
  }

  @Override
  public Company set(String fieldName, Object value) {
    return (Company) super.set(fieldName, value);
  }

  @Override
  public Company clone() {
    return (Company) super.clone();
  }

}