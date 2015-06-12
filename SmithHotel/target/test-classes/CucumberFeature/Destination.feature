Feature: Search hotels by destination feature




  Scenario: Search by destination
    Given I go "https://www.mrandmrssmith.com/destinations"
    When  I click on the "Europe" tag map
    And I click on country  "United Kingdom"
    And  I click on "England" link
    And  I click on "London" city link
    And I enter my checkin date "20-07-2015"
    And I enter my checkout date "23-07-2015"
    And I click to "Check availability" button
    Then I should see result for "bookable london hotelsParis"