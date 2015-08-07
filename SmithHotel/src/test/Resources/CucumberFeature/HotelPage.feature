Feature: Verify hotel page content and add a room to the basket

  Scenario: Hotel content

    Given I am on the "hotelpage"
    And I click on the "photos" tab
    Then I should see all hotel pictures

      Scenario:
        Given I click on the "overview" tab
        Then I should see overviewcontent

  Scenario:
    Given  I click on the "Food&Drink" tab
    Then I should see Food&Drink  content

  Scenario:
    Given I Click on "localguide" tab
    Then I should see localguide content

  Scenario:
    Given I click on  "Location" link
    Then I should hotel Location

  Scenario:
    Given I click on "Reviews" tab
    Then I should see hotel reviews


Scenario:
  Given I click on the "getaroom" tab
    And I click on the view terms & conditions
    Then I should see hotel booking terms and conditions

  Scenario:
    Given I click on "Bookit"button
    And I enter number of "adults staying in the room" as "2"
    And I enter number of "children staying in the room" as "1"
    And I enter number of "Infants staying in the room" as "1"
    And I select "child age" from dropdown as "8"
    And I select "Infant age" from dropdown as "1"
    And I click on "confirm"button
    Scenario:
    Given I am logged in to smith hotels
    Then I should "continue booking" as existing customer


  Scenario: Login to Myaccount

    Then I should be logged in to my account


