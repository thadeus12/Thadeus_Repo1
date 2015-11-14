Feature: Adding  payment to the booking

  Background: : card payment
    Given I click on add payment
    And I select card payment
    Then payment popup appear with " To pay" amount
    And I select "GBP" as curreny from dropdown
    And I select billing country as "United Kindow"
    And I enter postCode as "w4 5wp"
    And I select card type as "visa"
    And I enter card number as "41111111111111"
    And I enter on card as "Thomas"
    And I select card expiry month as "12"
    And I select card expiry year as "2017"
    And I enter card cvv number as "341"
    And I click on submit button
    Then I should see message appear "payment successfull" on popup

  Scenario: Loyalty payment

    Given I have loyalty credit
    And  I select loyalty money from add payment dropdown
    And I enter GBP "100"
    And I click apply button
    Then amount due should be less by GBP "100"



