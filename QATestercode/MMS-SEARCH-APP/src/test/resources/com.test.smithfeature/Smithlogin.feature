
  @smoke-test
  Feature: Testing login As smith member application

  As Smith hotels Member holder I should be able to login with my email and password

  Background:Login to to User Account

    Given I am on the "http://test2.mrandmrssmith.com/"
    When I click on the login tab
    And I enter my username and password
    And I click on the login button


  Scenario: Login to Myaccount

    Then I should be logged in to my account

  Scenario: Validate Password Reset
    When I click on the login button
    And I click on the Forgotten password link
    And I enter my email address
    Then I should see message to confirm password reset link sent