@ignore
Feature: Tashh booking

  Background: login to Tashh
    Given I am on "http://test2.tashh.com/login"
    And  I enter my username and password
    And I click on the login button
    Then I should be logged in

  Scenario:
    Given I select "Smith" as Agent
    And I click on the search drop down and select "Members"
    And I enter the Member name as "Thadeus.ssewanyana@smithhotels.com"
    And I click on the find members button
    And I click on the view link for searched member
    Then tabs below should be visible on member details popup
      | Tabs               |
      | Overview           |
      |Bookings            |
      |Reminders           |
      |Loyalty             |
      |AutoComms           |
      |Purchases           |
      |Gift Lists          |
      |Wish lists          |
      |Interests           |
      |Tab2                |
      |Create enquiry      |
      |Reset password      |
      |Log in as member    |
      |Renew Member        |
      |View in CP          |
      |View in Member hub  |

    And I click on the create enquiry button
    Then I should see a popup for  booking contact media type
    And I select "Email"as booking contact media from dropdown
    And I click on the contact media submit button
     Then I should see booking trip type Popup
    And I click on the searchbutton
   # And I click on the "Search for a hotel" link
    And I select "Family short break" as booking trip type from dropdown
    And I click submit button trip type
    And I enter "3 Nagas" the search field
    And I select the "21-04-2016 " as start date
    And I enter "2 " Adults and "1" child to stay
    And I click on the hotel provide search button






