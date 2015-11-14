Feature: tashh booking

  Scenario: Given i am smit TTC Ishould be able to add a manual booking
    Given i am at tashh landing page
    And I select line Item from otherlineitem dropdown
    And I enter Hotel name As "The Opposite House";
    And I enter Studio 45
    And I select "Invoice" as contract type
    And I enter check in date as "2015-10-20 14:05:30"
    And I enter "3" as number of nights
    And I "2" as number of nights
    And I enter deposit policy as "50% deposite need to confirm booking"
    And I select "CNY" from curreny provide dropdown
    And I enter tax rate as "15%"
    And I select "gross minus commsion" as cost type
    And I enter "8000" as gross
    And I tick includes tax check box
    And I enter commission as "1200"
    And I select "Actual" from commission dropdown
    And I click on add button
    And I click on add tp equiry button