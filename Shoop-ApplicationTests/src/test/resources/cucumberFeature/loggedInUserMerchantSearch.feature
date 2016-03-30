
@ignore
Feature: Search

  Background: Login user

    Given I go to "http://www.shoop.fr/"
    When  I click on the login button
    And I enter my username and password

    Scenario: confirm user is Logged
    Then I should be logged in
    When I click on hot offer
    Then I should be taken to the merchant's Shoop page

  #Scenario: User finds merchant through hot offers on main page




