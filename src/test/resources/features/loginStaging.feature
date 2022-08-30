Feature: Login Feature
  In order to perform successful login
  As a user
  I have to enter correct username and password

  Background:
    Given user navigate to the website
    When user user validates the homepage title

  Scenario: Login to website as valid user
    And user enters "valid" username
    And user enters "valid" password
    Then user click on the sign in button

  Scenario: Login to website as invalid user
    And user enters "invalid" username
    And user enters "invalid" password
    Then user click on the sign in button