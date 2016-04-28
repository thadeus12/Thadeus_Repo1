
@ignore

Feature: Hotel search on

  Scenario Outline:
    Given I am on the smith hotel site "http://staging.smithhotels.com/"
    When I enter my destination "<Destination>"
    And I enter my checkin date "<CheckIn Date>"
    And I enter my checkout date "<CheckOut Date>"
    And I click on the "search" button
    Then I should see result for "<Country>" and "<Destination>"

    Examples:
      | CheckIn Date | CheckOut Date | Country        | Destination       |
      | 21-03-2016   | 23-03-2016    | United States  | New York City     |
      | 21-03-2016   | 23-03-2016    | Australia      | Melbourne         |



