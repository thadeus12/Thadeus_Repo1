


@smoke-test12
  Feature: Manual booking

  Background: login to Tashh
    Given I am on "http://test2.tashh.com/login"
    And  I enter my username and password
    And I click on the login button
    #Then I should be logged in

  Scenario: Given i am smith TTC I should be able to add a manual booking
    When  I select "Smith" as Agent
    And I click on the search drop down and select "Members"
    And I enter the Member name as "Thadeus.Ssewanyana@smithhotels.com"
    And I click on the find members button
    And I click on the view link for searched member
    And I click on the create enquiry button
    Then I should see a popup for  booking contact media type
    And I select "Email"as booking contact media from dropdown
    And I click on the contact media submit button
    And I select "manual hotel" from otherlineitem dropdown
    Then I should see manual line item popup
    And I enter Hotel name As "The Opposite House"
    And I enter room name ase "Studio 45"
    And I select "Invoice" as contract type
    And I enter check-in date as "2016-03-21 14:04:46"
    And I enter "2" as number of nights
    And I "2" as number of Adults staying
    And I enter deposit policy as "50% deposite need to confirm booking"
    And I select "CNY" from curreny provide dropdown
    And I enter tax rate as "15"
    And I select "Gross minus commission" as cost type
    And I enter "8000" as gross
    #And I tick includes tax check box
    And I enter commission as "1200"
    And I select "Actual" from commission dropdown
    And I enter "4000" amount for the booking
    And I select "Actual" from deposit dropdown
    And I select "China" as hotel country
    And I click on add button
    Then I should see manual line item created successfully popup
    And I click back to enquiry link
    Then I should see equiry status as "New"
    Given I select "card" the way to pay
    Then payment popup appear with " To pay" amount
    And I select "GBP" as curreny from dropdown
    And I select billing country as "United Kingdom"
    And I enter billing "addressline one"
   And I enter postCode as "w4 5wp"
    And I select card type as "VISA"
    And I enter card number as "4111111111111111"
    And I enter on card as "Thomas"
    And I select card expiry month and year as "12" and year as "2017"
    And I enter card cvv number as "341"
    And I click on submit button
    Then I should see message appear "Payment processed successfully " on popup
    And click on the pop close button

