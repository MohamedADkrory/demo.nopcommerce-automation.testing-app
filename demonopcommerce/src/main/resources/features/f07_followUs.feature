@smoke
  Feature: f07_followus | users could open followus links

    Scenario:user opens facebook link
      When user opens facebook link
      Then  open in new facebook tab

    Scenario: user opens twitter link
      When  user opens twitter link
      Then open in new twitter tab

      Scenario: user opens rss link
        When user opens rss link
        Then open in new rss tab

        Scenario: : user opens youtube link
        When user opens youtube link
       Then open in new youtube tab