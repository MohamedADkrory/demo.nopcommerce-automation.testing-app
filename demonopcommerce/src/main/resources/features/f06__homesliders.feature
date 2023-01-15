@smoke
  Feature:f06_homesliders| click on the sliders using explicit wait

    Scenario: user waiting first slider

      When first slider is clickable
      And click on first slider
      Then user go direct to another url nokia


    Scenario: user waiting second slider
        When second slider is clickable
        And click on second slider
      Then user go direct to another url iphone