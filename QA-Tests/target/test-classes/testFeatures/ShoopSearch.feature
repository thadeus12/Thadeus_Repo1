@smoke-test
Feature: As shoop customer I should be able to Login

 Scenario: : login to Tashh
    Given I go to "http://www.shoop.fr/"
    And  I enter my username and password
    And I click on the login button
    #Then I should be logged in

  Scenario Outline: As shoop customer I should be able to Search for Merchants
   Given I go to "http://www.shoop.fr/"
    When I enter merchant name as "<MerchantName>"into search
    Then I should see name of "<MerchantName>" and own  best rates displayed

   Examples:
   | MerchantName       |
   |My Jolie candle     |
   | 1-2-3              |
   | Access Moto        |
   | M M&MS             |


