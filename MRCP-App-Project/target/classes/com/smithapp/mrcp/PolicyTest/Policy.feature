Feature: Policy sentence on mms 

Scenario: check policy sentence on mms website

Given I go to "baseurl" on "browserType"
And I enter "hotel" name as "3 nagas"
And I enter "checkin" date as "15-06-2015"
And I enter "checkout" date "18-06-2015"
And I click the "search" to find avaialbe hotel
Then I should "SearchResults" for the hotel
And I click the "booknow" to go on hotelpage
And click on "terms&conditions" of the room
Then I should see "cancellation" policy sentence
And I click on the "bookit" button
And I enter "people" sleeping in the room as "2"
And I click the "next" button to add extras
And I click "confirm" button to login
And I click "continue" as new customer
And I enter "Fname" as "KAla"
And I enter "Sname" as "Bule" in the surname field
And I enter "emailaddress" as "thadeus+bule@smithhotels.com"
And I enter "Phone" as "02097655552" in contact field
And I "selectcountry" as "United Kindgom" from dropdown
And I enter "line1 Address" as "15 Running waters" in the line1 field
And I enter my "town" as "Kent" in the town field
And I enter "postcode" as "KA2 9DP" in the postcode field
And I select "cardtype" as "VISA" from card type dropdown
And I enter my "cardtype" as "4111111111111111" in the card field
And I enter "Nameoncard" as "Buke" in name on card field
And I select card "expirymonth" as "08" from month dropdown
And I select card "expiryyear" as "2017" from year dropdown
And I enter card "CVV" as "087" in cvv field
And I click to "confirmterms" checkbox
And I click on the "makePayment" button
And I click on the "view confirmation" link 
Then I should the see "cancellation" 