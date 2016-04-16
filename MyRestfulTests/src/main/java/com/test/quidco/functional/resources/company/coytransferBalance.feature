@feature @coytransfer
Feature: COY or agent views downline listing with their transfer info details
  As a user of the Agency or Company site
  I want to be able to view the transfer details of downlines

  Scenario: Setup test data for balance transfer
    When I insert data for transfer balance scenarios to database
    Then the test data should be available in the database

  Scenario Outline: COY or Agent views list of their downlines on transfer page
    When a "<usertype>" user with username "<username>" and password "<password>" views their transfer page
    Then they should see the following "<downlines>" downlines listed with transfer details
    Examples:
      | usertype | username | password | downlines                |
      | COY      | coy.sm   | pass1234 | BT01,SM07,SM08,SM55,SM56 |

  Scenario Outline: Username views their downline transfer
    When a "<usertype>" user with username "<username>" and password "<password>" views their downline transfer
    Then they should see user "<expectedUser>" where balanceUp equals "<expectedBalanceUp>" balanceDown equals "<expectedBalanceDown>" and credit used equals "<expectedCreditUsed>"
    Examples:
      | usertype | username | password | expectedUser | expectedBalanceUp | expectedBalanceDown | expectedCreditUsed |
      | COY      | coy.sm   | pass1234 | SM07         | 2000.00           | 0.0                 |                    |


  Scenario Outline: An agency or COY user performs a full and partial transfer of their downlines
    When an "<usertype>" user with username "<username>" and password "<password>" transfers the amount "<transferamount>" for downline "<downline>" balance of "<displayamount>" displayed
    Then the transfer operation should succeed with "<response>" response
    And the user cash balance should be "<userbalanceafter>" and downline balance should be "<downlinebalanceafter>"

    Examples:
      | usertype | username | password | downline | transferamount | userbalanceafter | displayamount | downlinebalanceafter | response |
      | COY      | coy.sm   | pass1234 | SM07     | -1000.0        | -1500.0          | -2000.0       | 1000.0               | Success  |
      | COY      | coy.sm   | pass1234 | SM07     | -1000.0        | -500.0           | -1000.0       | 0.0                  | Success  |
      | COY      | coy.sm   | pass1234 | SM08     | 500.0          | -1000.0          | 1500.0        | -1000.0              | Success  |
      | COY      | coy.sm   | pass1234 | SM08     | 1000.0         | -2000.0          | 1000.0        | 0.0                  | Success  |

  Scenario Outline: An agency or COY should not be allowed to transfer more figure than balance
    When a "<usertype>" with "<username>", password "<password>", balance "<balance>" tries to transfer amount of "<transferamount>" for downline "<downline>" with balance "<downlinebalance>"
    Then the transfer operation should fail with error code "<errorcode>"
    Examples:
      | usertype | username   | password | balance | downline | downlinebalance | transferamount | errorcode |
      | COY      | admin.user | pass1234 | 1000    | AA01     | -1000           | 2000           | AG2900    |

  Scenario: Tear down test data for Agent downlines
    When I delete data for balance transfer scenarios from database
    Then the database should not contain the data that was deleted
