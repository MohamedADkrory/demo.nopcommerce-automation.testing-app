@smoke
  Feature: F01_register | users could register with new accounts
    Scenario: guest user could register with valid data successfully
      Given user go to register page
      When user select gender type
      And user enter "mohamed" & "dkrory"
      And user enter date of birth
      And user enter "test@examble.com"
      And  user enter Company name "testo"
      And user click newsletter
      And user enter password feilds "123456" "123456"
      And user click on register button
      Then success message is displayed

