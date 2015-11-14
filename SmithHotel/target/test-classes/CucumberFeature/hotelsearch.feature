@smoke-test12
Feature: Hotel search feature

  As a user i want to search for hotels

 Scenario Outline:
    Given I am on the smith hotel site "https://www.mrandmrssmith.com/beta"
   And I click on opt out link
    When I enter my destination "<Destination>"
    And I enter my checkin date "<CheckIn Date>"
    And I enter my checkout date "<CheckOut Date>"
    And I click on the "search" button
    Then I should see result for "<Country>" and "<Destination>"

    Examples:
      | CheckIn Date | CheckOut Date | Country | Destination |
      | 20-11-2015   | 23-11-2015    | France  | Paris       |
      | 20-11-2015   | 23-11-2015    | United Kingdom | London      |

 @complete
 Scenario Outline:
   Given I am on the smith hotel site "https://www.mrandmrssmith.com/beta"
   And I click on opt out link
   When I enter my destination "<Destination>"
   And I enter my checkin date "<CheckIn Date>"
   And I enter my checkout date "<CheckOut Date>"
   And I click on the "search" button
   Then I should see result for "<Country>" and "<Destination>"
   And I should see hotels Rates from price
   And I click on the book now button
   Then I should be on get a room tab
   And I should see rate per night and total cost of stay
   And I click on book it button
   Then I should see who is sleeping in the room Popup
   And I enter "1" as number of "adults staying in the room
  # And I enter "1" as number of children staying in the room
  # And I enter "1" as number of Infants staying in the room
  # And I select "8" as age of child staying from dropdown
  # And I select "2" as the age of Infant from dropdown
  # Then I should click on next  button for a room with extas
   And I click on confirm button
   Then I should see signin as  returning or continue as new customer Popup
  # And I click on continue as new customer
   And I sign in a returning customer
   Then I should be on smithcollections booking step two


 Examples:
 | CheckIn Date | CheckOut Date | Country | Destination |
 | 20-11-2015   | 23-11-2015    | France  | Paris       |