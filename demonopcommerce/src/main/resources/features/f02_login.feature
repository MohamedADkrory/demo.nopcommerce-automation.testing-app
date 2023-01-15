@smoke
Feature: f02_logen | users could use login functionality use their accounts
Scenario: user could login with valid data
  Given user go to login page
  When user entar "test@examble.com" and "123456"
  And user press on login button
  Then user login to the system successfully

  Scenario: user could login with invaled data
    Given user go to login page
    When user entar "dsd@examble.com" and "112233"
    And user press on login button
    Then user could not login to the system

