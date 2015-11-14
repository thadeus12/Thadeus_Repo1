
@smoke-test12
Feature: search by Smith inspired hotels feature

  As a user i want to serach for hotels using the inspiration link


  Scenario Outline:
    Given I go "https://www.mrandmrssmith.com/collections"
    When  I click on the "<Links>" link
    And I select "<Country>" from dropdown
    And  I select destination "<Destination>" from dropdown
    And I enter my checkin date "<CheckIn Date>"
    And I enter my checkout date "<CheckOut Date>"
    And I click to "Check availability" button
    Then I should see result for "<Country>" and "<Destination>"

  Examples:
  |Links| CheckIn Date | CheckOut Date | Country | Destination |
  |Child-friendly | 20-11-2015   | 23-11-2015    | France         | Paris       |
  |Go swimming    | 20-11-2015   | 23-11-2015    | United Kingdom | London      |