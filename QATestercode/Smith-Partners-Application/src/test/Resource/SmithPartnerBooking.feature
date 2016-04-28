
#@smoke-test
Feature: Hotel search feature

  Searching and booking as an existing customer
  Scenario Outline:
    Given I am on the smith hotel site "http://test2.smithcollections.com/uk/conde-nast/search"
    When I enter my destination "<Destination>"
    And I enter my checkin date "<CheckIn Date>"
    And I enter my checkout date "<CheckOut Date>"
    And I click on the "search" button
    Then I should see result for " <Country> " and " <Destination> "
   # And I should see hotels Rates from price
    And I click on the book now button
    Then I should "Select a room" on the hotel page
    And I click on book it button
    Then I should see who is sleeping in the room Popup
    And I enter "1" as number of "adults staying in the room
    And I click confirm button to add room to the basket
    And I click on confirm booking button
    Then I should be on Enter details payment page
    And I select currency type as "USD" from card type dropdown
    And I should see hotel address displayed
    And should see booking cancellation policy and additional charges
    #And I check my booking summary details
    And I enter First name as "Thadeus" and last name as "Bule"
    And I enter email address as "thadeus@smithhotels.com" and phone number as "02097655552"
    And I select my country as "United Kindgom" from dropdown
    And I enter my Address line one as "Running waters" And line two address as "Wicklow"
    And I enter my postcode as "KA2 9DP" and town as "Kent"
    And I enter gift card or voucher code as "ABgs12K"
    And I select card type as "VISA" from card type dropdown
    And I enter card number as "4111111111111111" and name on card as "Buke"
    And I select card expiry month as "08" and year "2018" from dropdown
    And I enter card CVV as "087" in cvv field
    And I checkbox to agree to booking terms and conditions
    Then I should see deposit to pay now displayed on page
    And I click on the make Payment button



    Examples:
      | CheckIn Date | CheckOut Date | Country        | Destination       |
      | 20-03-2016   | 23-03-2016    | United States  | New York City     |
