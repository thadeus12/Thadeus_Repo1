
@ignore
Feature: search by Smith inspired hotels feature

  As a user i want to serach for hotels using the inspiration link


  Scenario Outline:
    Given I go "http://test2.mrandmrssmith.com/"
    When  I click on the "<Links>" link
    And I select "<Country>" from dropdown
    And  I select destination "<Destination>" from dropdown
    And I enter my checkin date "<CheckIn Date>"
    And I enter my checkout date "<CheckOut Date>"
    And I click to "Check availability" button
    Then I should see result for "<Country>" and "<Destination>"

  Examples:
  |Links| CheckIn Date | CheckOut Date | Country | Destination |
  |Child-friendly | 21-03-2016   | 23-03-2016    | France         | Paris       |
  |Go swimming    | 21-03-2016   | 23-03-2016    | United Kingdom | London      |