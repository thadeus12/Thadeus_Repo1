@feature @coylogin
Feature: Login to back office
  As a user of the back office
  I want to be able to login to the system
  So that I can perform my responsibilities

  Scenario Outline: Successful back office user login
    When I login with username "<username>" and password "<password>"
    Then  I should succeed

    Examples:
      | username   | password |
      | admin.user | pass1234 |
      | user.01    | pass1234 |

  Scenario Outline: Unsuccessful back office user login
    When I try to login with username "<username>" and password "<password>"
    Then  I should receive "<error>"

    Examples:
      | username   | password | error   |
      | admin.user | pass4321 | AUTH004 |
      | user.50    | pass1234 | AUTH004 |
      | user.01    | pass4321 | AUTH004 |
      |            |          | AUTH004 |

  Scenario Outline: Unsuccessful inactive back office user login
    When I login with inactive username "<username>" and password "<password>"
    Then  I should receive "<error>"

    Examples:
      | username | password | error   |
      | user.04  | pass1234 | AUTH007 |
      | user.05  | pass1234 | AUTH007 |


  Scenario: Unsuccessful agent user login to backoffice
    When I login to bo with agent username "AA01" and password "pass1234"
    Then  I should not be authorised and receive "AUTH004"
