Feature: Hotels with Offers

Scenario: As a user I should be able to search hotels with offer

  Given I go "https://www.mrandmrssmith.com/hotel-offers"
  Given am on the smith hotel site "https://www.mrandmrssmith.com"
  When I enter my destination "London"
  And I enter my checkin date "20-07-2015"
  And I enter my checkout date "23-07-2015"
  And I click on the "search" button
  Then I should see hotels with offers in "London" city