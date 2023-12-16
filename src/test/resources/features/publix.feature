
Feature: As a user I should be able to Login with valid credentials and see to see cupcakes
  Background:
    Given user is on the home page
 @wip1
  Scenario: Verify that the user can log in with valid credentials
    When user clicks on login button on the upper right side of the page
   And user  logs in "piroska.papsdet@gmail.com" and "publix1234$"

  # And user  enters "piroska.papsdet@gmail.com" and "publix1234$"
   # And user clicks on login button
    Then user should be able to login


  Scenario: Verify that the user can not log in with invalid credentials
    When user clicks on login button on the upper right side of the page
    And user  logs in "invalid@gmail.com" and "invalid"
 #   And user  enters "invalid@gmail.com " and "invalid"
  #  And user clicks on login button
    Then user should not be able to login



  Scenario: Verify that the user can see cupcakes
    When user clicks on login button on the upper right side of the page
    And user  enters "piroska.papsdet@gmail.com " and "publix1234$"
    And user clicks on login button
    And user clicks on "Order ahead"  tab and click "Bakery" module
    Then user should see cupcakes



