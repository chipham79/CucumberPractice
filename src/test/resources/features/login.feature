@prod
Feature: Login Feature
  In order to perform successful login
  As a user
  I have to enter correct username and password

  Scenario Outline: Login to website as valid user
    Given user navigate to the website
    When user user validates the homepage title
    And user enters "<username>" username
    And user enters "<password>" password
    Then user click on the sign in button
    Examples:
      |username  |password|
      |valid     |valid   |
      |invalid   |invalid |
      |valid     |valid   |
      |invalid   |invalid |

