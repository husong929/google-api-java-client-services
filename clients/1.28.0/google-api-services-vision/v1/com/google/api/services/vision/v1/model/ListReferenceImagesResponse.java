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

package com.google.api.services.vision.v1.model;

/**
 * Response message for the `ListReferenceImages` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListReferenceImagesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The next_page_token returned from a previous List request, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The maximum number of items to return. Default 10, maximum 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * The list of reference images.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReferenceImage> referenceImages;

  /**
   * The next_page_token returned from a previous List request, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The next_page_token returned from a previous List request, if any.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListReferenceImagesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The maximum number of items to return. Default 10, maximum 100.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * The maximum number of items to return. Default 10, maximum 100.
   * @param pageSize pageSize or {@code null} for none
   */
  public ListReferenceImagesResponse setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The list of reference images.
   * @return value or {@code null} for none
   */
  public java.util.List<ReferenceImage> getReferenceImages() {
    return referenceImages;
  }

  /**
   * The list of reference images.
   * @param referenceImages referenceImages or {@code null} for none
   */
  public ListReferenceImagesResponse setReferenceImages(java.util.List<ReferenceImage> referenceImages) {
    this.referenceImages = referenceImages;
    return this;
  }

  @Override
  public ListReferenceImagesResponse set(String fieldName, Object value) {
    return (ListReferenceImagesResponse) super.set(fieldName, value);
  }

  @Override
  public ListReferenceImagesResponse clone() {
    return (ListReferenceImagesResponse) super.clone();
  }

}