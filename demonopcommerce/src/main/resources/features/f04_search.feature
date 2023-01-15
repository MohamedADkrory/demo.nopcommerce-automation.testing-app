@smoke
  Feature: f04_search | user will get up searched some products with different parameters

    Scenario Outline: user could search using product name
      When user click on search field
      And user must enter "<productname>"
      Then user could find "<productname>" relative results
      Examples:
        |productname|
         |apple|
         |laptop|
          |nike|

      Scenario Outline: usser could search using sku
        When user click on search field
        And user could enter "<sku>"
        Then user could find "<sku>" insid product details page
        Examples:
        |sku|
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|
