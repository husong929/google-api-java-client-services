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

package com.google.api.services.adexchangebuyerii.v2beta1.model;

/**
 * Note: this resource requires whitelisting for access. Please contact your account manager for
 * access to Marketplace resources.
 *
 * Represents a publisher profile in Marketplace.
 *
 * All fields are read only. All string fields are free-form text entered by the publisher unless
 * noted otherwise.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PublisherProfile extends com.google.api.client.json.GenericJson {

  /**
   * Description on the publisher's audience.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audienceDescription;

  /**
   * Statement explaining what's unique about publisher's business, and why buyers should partner
   * with the publisher.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String buyerPitchStatement;

  /**
   * Contact information for direct reservation deals. This is free text entered by the publisher
   * and may include information like names, phone numbers and email addresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String directDealsContact;

  /**
   * Name of the publisher profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The list of domains represented in this publisher profile. Empty if this is a parent profile.
   * These are top private domains, meaning that these will not contain a string like
   * "photos.google.co.uk/123", but will instead contain "google.co.uk".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> domains;

  /**
   * URL to publisher's Google+ page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String googlePlusUrl;

  /**
   * A Google public URL to the logo for this publisher profile. The logo is stored as a PNG, JPG,
   * or GIF image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logoUrl;

  /**
   * URL to additional marketing and sales materials.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mediaKitUrl;

  /**
   * Overview of the publisher.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String overview;

  /**
   * Contact information for programmatic deals. This is free text entered by the publisher and may
   * include information like names, phone numbers and email addresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String programmaticDealsContact;

  /**
   * Unique ID for publisher profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publisherProfileId;

  /**
   * URL to a publisher rate card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rateCardInfoUrl;

  /**
   * URL to a sample content page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String samplePageUrl;

  /**
   * Seller of the publisher profile.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Seller seller;

  /**
   * Up to three key metrics and rankings. Max 100 characters each. For example "#1 Mobile News Site
   * for 20 Straight Months".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> topHeadlines;

  /**
   * Description on the publisher's audience.
   * @return value or {@code null} for none
   */
  public java.lang.String getAudienceDescription() {
    return audienceDescription;
  }

  /**
   * Description on the publisher's audience.
   * @param audienceDescription audienceDescription or {@code null} for none
   */
  public PublisherProfile setAudienceDescription(java.lang.String audienceDescription) {
    this.audienceDescription = audienceDescription;
    return this;
  }

  /**
   * Statement explaining what's unique about publisher's business, and why buyers should partner
   * with the publisher.
   * @return value or {@code null} for none
   */
  public java.lang.String getBuyerPitchStatement() {
    return buyerPitchStatement;
  }

  /**
   * Statement explaining what's unique about publisher's business, and why buyers should partner
   * with the publisher.
   * @param buyerPitchStatement buyerPitchStatement or {@code null} for none
   */
  public PublisherProfile setBuyerPitchStatement(java.lang.String buyerPitchStatement) {
    this.buyerPitchStatement = buyerPitchStatement;
    return this;
  }

  /**
   * Contact information for direct reservation deals. This is free text entered by the publisher
   * and may include information like names, phone numbers and email addresses.
   * @return value or {@code null} for none
   */
  public java.lang.String getDirectDealsContact() {
    return directDealsContact;
  }

  /**
   * Contact information for direct reservation deals. This is free text entered by the publisher
   * and may include information like names, phone numbers and email addresses.
   * @param directDealsContact directDealsContact or {@code null} for none
   */
  public PublisherProfile setDirectDealsContact(java.lang.String directDealsContact) {
    this.directDealsContact = directDealsContact;
    return this;
  }

  /**
   * Name of the publisher profile.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Name of the publisher profile.
   * @param displayName displayName or {@code null} for none
   */
  public PublisherProfile setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The list of domains represented in this publisher profile. Empty if this is a parent profile.
   * These are top private domains, meaning that these will not contain a string like
   * "photos.google.co.uk/123", but will instead contain "google.co.uk".
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDomains() {
    return domains;
  }

  /**
   * The list of domains represented in this publisher profile. Empty if this is a parent profile.
   * These are top private domains, meaning that these will not contain a string like
   * "photos.google.co.uk/123", but will instead contain "google.co.uk".
   * @param domains domains or {@code null} for none
   */
  public PublisherProfile setDomains(java.util.List<java.lang.String> domains) {
    this.domains = domains;
    return this;
  }

  /**
   * URL to publisher's Google+ page.
   * @return value or {@code null} for none
   */
  public java.lang.String getGooglePlusUrl() {
    return googlePlusUrl;
  }

  /**
   * URL to publisher's Google+ page.
   * @param googlePlusUrl googlePlusUrl or {@code null} for none
   */
  public PublisherProfile setGooglePlusUrl(java.lang.String googlePlusUrl) {
    this.googlePlusUrl = googlePlusUrl;
    return this;
  }

  /**
   * A Google public URL to the logo for this publisher profile. The logo is stored as a PNG, JPG,
   * or GIF image.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogoUrl() {
    return logoUrl;
  }

  /**
   * A Google public URL to the logo for this publisher profile. The logo is stored as a PNG, JPG,
   * or GIF image.
   * @param logoUrl logoUrl or {@code null} for none
   */
  public PublisherProfile setLogoUrl(java.lang.String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

  /**
   * URL to additional marketing and sales materials.
   * @return value or {@code null} for none
   */
  public java.lang.String getMediaKitUrl() {
    return mediaKitUrl;
  }

  /**
   * URL to additional marketing and sales materials.
   * @param mediaKitUrl mediaKitUrl or {@code null} for none
   */
  public PublisherProfile setMediaKitUrl(java.lang.String mediaKitUrl) {
    this.mediaKitUrl = mediaKitUrl;
    return this;
  }

  /**
   * Overview of the publisher.
   * @return value or {@code null} for none
   */
  public java.lang.String getOverview() {
    return overview;
  }

  /**
   * Overview of the publisher.
   * @param overview overview or {@code null} for none
   */
  public PublisherProfile setOverview(java.lang.String overview) {
    this.overview = overview;
    return this;
  }

  /**
   * Contact information for programmatic deals. This is free text entered by the publisher and may
   * include information like names, phone numbers and email addresses.
   * @return value or {@code null} for none
   */
  public java.lang.String getProgrammaticDealsContact() {
    return programmaticDealsContact;
  }

  /**
   * Contact information for programmatic deals. This is free text entered by the publisher and may
   * include information like names, phone numbers and email addresses.
   * @param programmaticDealsContact programmaticDealsContact or {@code null} for none
   */
  public PublisherProfile setProgrammaticDealsContact(java.lang.String programmaticDealsContact) {
    this.programmaticDealsContact = programmaticDealsContact;
    return this;
  }

  /**
   * Unique ID for publisher profile.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublisherProfileId() {
    return publisherProfileId;
  }

  /**
   * Unique ID for publisher profile.
   * @param publisherProfileId publisherProfileId or {@code null} for none
   */
  public PublisherProfile setPublisherProfileId(java.lang.String publisherProfileId) {
    this.publisherProfileId = publisherProfileId;
    return this;
  }

  /**
   * URL to a publisher rate card.
   * @return value or {@code null} for none
   */
  public java.lang.String getRateCardInfoUrl() {
    return rateCardInfoUrl;
  }

  /**
   * URL to a publisher rate card.
   * @param rateCardInfoUrl rateCardInfoUrl or {@code null} for none
   */
  public PublisherProfile setRateCardInfoUrl(java.lang.String rateCardInfoUrl) {
    this.rateCardInfoUrl = rateCardInfoUrl;
    return this;
  }

  /**
   * URL to a sample content page.
   * @return value or {@code null} for none
   */
  public java.lang.String getSamplePageUrl() {
    return samplePageUrl;
  }

  /**
   * URL to a sample content page.
   * @param samplePageUrl samplePageUrl or {@code null} for none
   */
  public PublisherProfile setSamplePageUrl(java.lang.String samplePageUrl) {
    this.samplePageUrl = samplePageUrl;
    return this;
  }

  /**
   * Seller of the publisher profile.
   * @return value or {@code null} for none
   */
  public Seller getSeller() {
    return seller;
  }

  /**
   * Seller of the publisher profile.
   * @param seller seller or {@code null} for none
   */
  public PublisherProfile setSeller(Seller seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Up to three key metrics and rankings. Max 100 characters each. For example "#1 Mobile News Site
   * for 20 Straight Months".
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTopHeadlines() {
    return topHeadlines;
  }

  /**
   * Up to three key metrics and rankings. Max 100 characters each. For example "#1 Mobile News Site
   * for 20 Straight Months".
   * @param topHeadlines topHeadlines or {@code null} for none
   */
  public PublisherProfile setTopHeadlines(java.util.List<java.lang.String> topHeadlines) {
    this.topHeadlines = topHeadlines;
    return this;
  }

  @Override
  public PublisherProfile set(String fieldName, Object value) {
    return (PublisherProfile) super.set(fieldName, value);
  }

  @Override
  public PublisherProfile clone() {
    return (PublisherProfile) super.clone();
  }

}