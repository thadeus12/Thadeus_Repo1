@smoke-test
Feature: search smartfocus on google

  Background: Google search
    Given I go to "http://www.google.com"
    When I enter "smartfocus"in the google search field
    And I click on the SmartFocus company link

    Scenario: select personalisation from message cloud menu
      Given I am on the smartfocus website
      When I Select 'Smart Personalisation Email'from the the Message Cloud menu item
      Then I should see the "Personalize based on Weather" and "Personalize based on Gender" displayed on the page



