@datatable
Feature: Login Feature
  In order to perform successful login
  As a user
  I have to enter correct username and password


  @staging
  Scenario: Login to website as valid user
    Given user navigate to the website
    When user user validates the homepage title
    And user enters "valid" username
    And user enters "valid" password
    And user enters firstname and lastname
      |Firstname  |Lastname|
      |John  |Hommower  |
      |Marry |Hommower |
    Then user click on the sign in button