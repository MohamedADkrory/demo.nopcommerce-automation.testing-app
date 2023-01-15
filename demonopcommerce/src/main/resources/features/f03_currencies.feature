@smoke
  Feature: f03_currencies|user could switch between different currencies
    Scenario: user could move between currencies
      When user select euro currencies
      Then currencies is changed correctly