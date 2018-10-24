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

package com.google.api.services.people.v1;

/**
 * Available OAuth 2.0 scopes for use with the People API.
 *
 * @since 1.4
 */
public class PeopleServiceScopes {

  /** Manage your contacts. */
  public static final String CONTACTS = "https://www.googleapis.com/auth/contacts";

  /** View your contacts. */
  public static final String CONTACTS_READONLY = "https://www.googleapis.com/auth/contacts.readonly";

  /** Know the list of people in your circles, your age range, and language. */
  public static final String PLUS_LOGIN = "https://www.googleapis.com/auth/plus.login";

  /** View your street addresses. */
  public static final String USER_ADDRESSES_READ = "https://www.googleapis.com/auth/user.addresses.read";

  /** View your complete date of birth. */
  public static final String USER_BIRTHDAY_READ = "https://www.googleapis.com/auth/user.birthday.read";

  /** View your email addresses. */
  public static final String USER_EMAILS_READ = "https://www.googleapis.com/auth/user.emails.read";

  /** View your phone numbers. */
  public static final String USER_PHONENUMBERS_READ = "https://www.googleapis.com/auth/user.phonenumbers.read";

  /** View your email address. */
  public static final String USERINFO_EMAIL = "https://www.googleapis.com/auth/userinfo.email";

  /** View your basic profile info. */
  public static final String USERINFO_PROFILE = "https://www.googleapis.com/auth/userinfo.profile";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(CONTACTS);
    set.add(CONTACTS_READONLY);
    set.add(PLUS_LOGIN);
    set.add(USER_ADDRESSES_READ);
    set.add(USER_BIRTHDAY_READ);
    set.add(USER_EMAILS_READ);
    set.add(USER_PHONENUMBERS_READ);
    set.add(USERINFO_EMAIL);
    set.add(USERINFO_PROFILE);
    return java.util.Collections.unmodifiableSet(set);
  }

  private PeopleServiceScopes() {
  }
}