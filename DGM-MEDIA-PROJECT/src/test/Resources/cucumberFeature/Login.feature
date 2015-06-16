@smoke-test
Feature: Testing the login to dailymailplus application

  As daily mail plus account holder I should be able to login with my email and password

  Background:Login to to User Account

    Given I am on the Media Plus page
    When I click on the Account tab
    And I enter my username
    And I enter my password
    And I click on the login button


  Scenario: Login to Myaccount

    Then I should be logged in to my account



  Scenario: Validate Login page tabs

    Then The tabs listed below should be displayed

      | Tabs             |
      | Personal Details |
      | Payment Details  |
      | Subscription     |
      | Order History    |
      | Help             |


 Scenario: Validate User Account Signout

   When I click on the signout link
   Then I should be logged out of my account






