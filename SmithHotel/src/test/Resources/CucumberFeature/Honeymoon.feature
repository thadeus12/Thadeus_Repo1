Feature: Honey moon page

  As a user i want to search honeymoon hotels

  @Askexperts
  Scenario:
    Given I navigate to "honeymoons page"
    Then I should see honeymoon page

  @create-wedding-list
  Scenario:
    Given I click on the  "create a wedding list"
    And I signin with "myemail" and "password"
    And I click on the "signin" button
    And I select Event type as "wedding"
    And I enter first list holder as "Jeff"
    And I enter my  date as "2015-09-23"
    And I enter welcome message as "Thadeus wedding gift"
    And I select number of list cards as "10"
    And click on the "save" button
    Then I should see a successful message and code