@smoke-test12
Feature: Hotel search feature

  As a user i want to search for hotels

  Scenario Outline:
    Given am on the smith hotel site "https://www.mrandmrssmith.com"
    When I enter my destination "<Destination>"
    And I enter my checkin date "<CheckIn Date>"
    And I enter my checkout date "<CheckOut Date>"
    And I click on the "search" button
    Then I should see result for "<Country>" and "<Destination>"

    Examples:
      | CheckIn Date | CheckOut Date | Country | Destination |
      | 20-06-2015   | 23-06-2015    | France  | Paris       |
      | 20-06-2015   | 23-06-2015    | United Kingdom | London      |