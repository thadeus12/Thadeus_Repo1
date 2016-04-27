
  Feature: Search micro service


    Scenario Outline:

      Given I go to "http://beta5.quidco.com"
      When I get access using username and password
      And I search for "<searchTerm>"
      Then I should responce "<responce>"
      Examples:
        | searchTerm | responce|Status|
        |  Arg       |Argos  |!