@ignore
Feature: Manual booking

  Background: login to Tashh
    Given I am on "http://staging.tashh.com/login"
    And  I enter my username and password
    And I click on the login button
  #Then I should be logged in


  Scenario: Given I am smith TTC I should be able book Smith Villas

    When  I select "Smith" as Agent
    And I click on the search drop down and select "Members"
    And I enter the Member name as "Thadeus.Ssewanyana@smithhotels.com"
    And I click on the find members button
    And I click on the view link for searched member
    And I click on the create enquiry button
    Then I should see a popup for  booking contact media type
    And I select what I am interested in as "Villas"
    And I select "Email"as booking contact media from dropdown
    And I click on the contact media submit button
    And I click on the searchbutton
    #And I click on the "Search for a hotel" link
    Then I should see booking trip type Popup
     And I select "Family short break" as booking trip type from dropdown
    And I click submit button trip type
    And I click on villa button
   # And I enter property name as "can Ananja"
   # And I select location as "Ibiza"
    And enter stay start date as "2016-03-12"
    And enter number of nights as "7"
    And enter "6" as number of people staying
    And click on the Villa search button
    Then I should see results for my property search
    And I click on property name
    And I click on "request room" link
    Then I should see create a room line item pop up
    And I click on back to enquiry link
    Then I should see equiry status as "New"
    Given I select "card" the way to pay
    Then payment popup appear with " To pay" amount
    And I select "GBP" as curreny from dropdown
    And I enter split amount as "1500"
    And I select billing country as "United Kingdom"
    And I enter billing "addressline one"
    And I enter postCode as "w4 5wp"
    And I select card type as "VISA"
    And I enter card number as "4111111111111111"
    And I enter on card as "Thomas"
    And I select card expiry month and year as "12" and year as "2017"
    And I enter card cvv number as "341"
    And I click on submit button
   # Then I should see message appear "Payment processed successfully " on popup
    And click on the pop close button