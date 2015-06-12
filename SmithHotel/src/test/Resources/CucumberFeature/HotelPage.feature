Feature: Hotel page

  Scenario: Get a room Page

    Given I am on the get a room page
    And click on the view terms & conditions
    And  I click on the "Book it" button
    And I enter number of "adults staying in the room" as "2"
    And I enter number of "children staying in the room" as "1"
    And I enter number of "Infants staying in the room" as "1"
    And I select "child age" from dropdown as "8"
    And I select "Infant age" from dropdown as "1"
    And I click on the "confirmbooking" button
    Given I am logged in to smith hotels
    Then I should "continue booking" as existing customer

    Scenario: Click to view hotel pictures
      Given I click on the "photo" link
      And I click on the "forwardArrow" button
      Then I should see several hotel pictures

  Scenario: Hotel details
    Given I click on the "Oview" link
    Given I click on the "Food&drink" link
    And I click on the "forwardArrow" link
    And I click on the "Local guide" link
    And I click on the "Lation" link
    And I click on the "Reviews" link
    Then I should see several hotel pictures



