@smoke
  Feature:f08_wishlist| add product to wishlist
    Scenario: add product "HTC One M8 Android L 5.0 Lollipop"
      When click on add wishlist button
      Then verify from add the product success

    Scenario: get Qty value and verify it's bigger than
      When click on add wishlist button
      And wait until disappear success message
      And click on wishlist button
      Then verify Qty value it's bigger than zero