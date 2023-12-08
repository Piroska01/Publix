
Feature: As a user I should be able to Login with valid credentials and see to see cupcakes
  @wip
  Scenario Outline: Verify that the user can log in with valid credentials by clicking on the Login button
    Given user is on the home page and click on login button on the upper right side of the page
    When user on the Login page and enters "<Email Address>" and "<Password>"
    And user clicks on login button
    And user is on the home page and should see "order ahead" navigation tab and clicks on it
    And user clicks "bakery" tab
    Then user should see cupcakes

    Examples:
      | Email Address              | Password
      | piroska.papsdet@gmail.com | publix1234$


