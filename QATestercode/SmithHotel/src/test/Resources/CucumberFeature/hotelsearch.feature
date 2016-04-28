@ignore
Feature: Hotel search feature

  As a user i want to search for hotels

 Scenario Outline:
   Given I am on the smith hotel site "http://staging.mrandmrssmith.com"
   #And I deleted a "edward" to stay on Old site
   When I enter my destination "<Destination>"
   And I enter my checkin date "<CheckIn Date>"
   And I enter my checkout date "<CheckOut Date>"
   And I click on the "search" button
   Then I should see result for " <Country> " and " <Destination> "
   And I should see hotels Rates from price
   And I click on the book now button
   Then I should be on get a room tab
   And I should see rate per night and total cost of stay
   And I click on book it button
   Then I should see who is sleeping in the room Popup
   And I enter "1" as number of "adults staying in the room
  #And I enter "1" as number of children staying in the room
  # And I enter "1" as number of Infants staying in the room
  # And I select "8" as age of child staying from dropdown
  # And I select "2" as the age of Infant from dropdown
  # Then I should click on next  button for a room with extas
   And I click on confirm button
   Then I should see signin as  returning or continue as new customer Popup
   #And I click on continue as new customer
   And I sign in a returning customer
   Then I should be on smithcollections booking step two
   And I select currency type as "USD" from card type dropdown
   And I should see hotel address displayed
   And should see booking cancellation policy and additional charges
   And I check my booking summary detals
  # And I enter First name as "KAla" and last name as "Bule"
  #And I enter email address as "thadeus+bule@smithhotels.com" and phone number as "02097655552"
 # And I select my country as "United Kindgom" from dropdown
 # And I enter my Address line one as "Running waters" And line two address as "wicklow"
  #And I enter my postcode as "KA2 9DP" and town as "Kent"

  # And I enter gift card or voucher code as "ABgs12K"
  # And I enter my loyallty credit as "3"
   And I select card type as "VISA" from card type dropdown
   And I enter card number as "4111111111111111" and name on card as "Buke"
   And I select card expiry month as "08" and year "2018" from dropdown
   And I enter card CVV as "087" in cvv field
   And I checkbox to agree to booking terms and conditions
 #  Then I should see deposit to pay now displayed on page
   And I click on the make Payment button
   Then I should be on booking confirmation page
   And I should see print this page and view confirmation links
   And I should see confirmation page Total booking price
   And I should see confirmation page Total Deposite paid
   And I should see confirmation page Total Gift voucher paid
   #And I should see confirmation page Total Loyalty paid
   And I should see confirmation page Total Still amount paid
   And I should see confirmation page booking Terms and conditions
   And I should see confirmation page booking cancellation policy
   And I should see confirmation page booking check in check out times



 Examples:
 | CheckIn Date | CheckOut Date | Country | Destination |
 | 21-03-2016  | 23-03-2016    | France  | Paris       |