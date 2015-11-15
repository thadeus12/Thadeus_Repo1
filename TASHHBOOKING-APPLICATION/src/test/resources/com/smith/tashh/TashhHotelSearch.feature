@smoke-test12
Feature: Belly

  Background: login to Tashh
    Given I am on "https://tashh.smithbookings.com/login"
    And  I enter my username and password
    And I click on the login button
    Then I should be logged in

  Scenario:
    Given I select "Smith" as Agent
    And I click on the search drop down and select "Members"
    And I enter the Member name as "Thadeus"
    When I click on the search button






