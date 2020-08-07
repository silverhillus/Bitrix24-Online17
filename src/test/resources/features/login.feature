Feature: Login
  As a user , I should be able to access to login with valid credentials and activity stream should be displayed.

  # given, then, but, and, when ... ---> Gherkin terms

  Background: Backstory is that user is on the Login Page
    Given User is on the login page

  @PositiveLogin
  Scenario: Marketing Login Scenario
    When  User enters correct "username" and "password"
    And   User clicks to Log In button
    Then  User should be able to verify Activity Stream text is displayed

  @NegativeLogin
  Scenario: Error Message should be displayed with incorrect credentials
    When  User enters incorrect "username" or incorrect "password" or both incorrect
    And   User clicks to Log In button
    Then  User should be able to verify Error message text is displayed on the Login Page








