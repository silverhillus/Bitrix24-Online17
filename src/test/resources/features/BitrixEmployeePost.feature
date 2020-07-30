@employeepost
Feature: Login feature
  As a user, I should be able to interact with employees on the posts that I have access to


  @login
  Scenario: login
    Given User is on the login page
    When User enter valid credential
    And User click the login button
    Then User should access main page

    @like
 Scenario: like button functionality verification
   Given User is on the main page
   When User click Like button
   Then appear a sign and the word you

      @comment
  Scenario: comment button functionality verification
    Given User2 is on the main page
    When User click Comment button
    Then User should be able to write a comment

@unfollow
  Scenario: unfollow button functionality verification
    Given User3 is on the main page
    When User click on unfollow button
    Then user should see follow button




