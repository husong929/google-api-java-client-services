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

package com.google.api.services.docs.v1.model;

/**
 * A mask that indicates which of the fields on the base EmbeddedDrawingProperties have been changed
 * in this suggestion. For any field set to true, there is a new suggested value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EmbeddedDrawingPropertiesSuggestionState extends com.google.api.client.json.GenericJson {

  @Override
  public EmbeddedDrawingPropertiesSuggestionState set(String fieldName, Object value) {
    return (EmbeddedDrawingPropertiesSuggestionState) super.set(fieldName, value);
  }

  @Override
  public EmbeddedDrawingPropertiesSuggestionState clone() {
    return (EmbeddedDrawingPropertiesSuggestionState) super.clone();
  }

}