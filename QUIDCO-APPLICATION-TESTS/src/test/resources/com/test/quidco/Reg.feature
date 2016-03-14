
@smoke-test
Feature: As a new user i should be able to join Quidco

  Scenario: a few cukes
    Given I go to "http://www.quidco.com/"
    When I click on the joine for free button
    Then I should see registration form
