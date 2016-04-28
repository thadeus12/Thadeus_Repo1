Feature: Shop

Feature: MMS booking

  Background: login to Tashh
    Given I am on "https://staging.mrandmrssmith.com/"
    And  I log in a smith member
    Then I should be logged to my membersarea

  Scenario:
    Given I click on gift vouchers
    When I click on Gift vouchers

