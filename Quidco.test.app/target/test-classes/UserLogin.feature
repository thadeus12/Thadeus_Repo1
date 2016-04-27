
  Feature: Search micro service


    Scenario Outline:

      Given I go to "http://beta5.quidco.com"
      And I sign in username and password
      And I search for "<searchTerm>"
      Then I should responce "<responce>"
      Examples:
        | searchTerm | responce|
        |  Arg       |Argos  |