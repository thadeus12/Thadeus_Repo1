@feature @transfer
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
      | usertype | username | password | downlines               |
      | SMA      | SM55     | pass1234 | SM5501,SM5502,SM5503    |
      | MA       | SM5503   | pass1234 | SM550301,SM550302       |
      | AGENT    | SM550301 | pass1234 | SM550301M01,SM550301M02 |


  Scenario Outline: Username views their downline transfer
    When a "<usertype>" user with username "<username>" and password "<password>" views their downline transfer
    Then they should see user "<expectedUser>" where balanceUp equals "<expectedBalanceUp>" balanceDown equals "<expectedBalanceDown>" and credit used equals "<expectedCreditUsed>"
    Examples:
      | usertype | username | password | expectedUser | expectedBalanceUp | expectedBalanceDown | expectedCreditUsed |
      | SMA      | SM55     | pass1234 | SM5501       | -500.00           | 0.0                 |                    |
      | MA       | SM5503   | pass1234 | SM550301     | -500.00           | 0.0                 |                    |
      | AGENT    | SM550301 | pass1234 | SM550301M01  | 1000.00           | 0.0                 | 0.0                |
      | AGENT    | SM550301 | pass1234 | SM550301M02  | -1000.00          | 0.0                 | 10000.00           |

  Scenario Outline: Agency site user attempts to view transfer details of downlines of another user
    When an agency user "<user>" attempts to view downline transfer details of another user "<targetuser>"
    Then they should get forbidden message and not allowed to see the transfer details
    Examples:
      | user     | targetuser |
      | SM55     | SM56       |
      | SM55     | SM5601     |
      | SM55     | SM560101   |
      | SM5601   | SM55       |
      | SM5601   | SM5602     |
      | SM5601   | SM550101   |
      | SM560101 | SM550102   |

  Scenario Outline: An agency or COY user performs a full and partial transfer of their downlines
    When an "<usertype>" user with username "<username>" and password "<password>" transfers the amount "<transferamount>" for downline "<downline>" balance of "<displayamount>" displayed
    Then the transfer operation should succeed with "<response>" response
    And the user cash balance should be "<userbalanceafter>" and downline balance should be "<downlinebalanceafter>"

    Examples:
      | usertype | username | password | downline    | transferamount | userbalanceafter | displayamount | downlinebalanceafter | response |
      | SMA      | SM56     | pass1234 | SM5601      | 200.0          | -500.0           | 200.0         | 0.0                  | Success  |
      | SMA      | SM56     | pass1234 | SM5602      | -500.0         | 0.0              | -500.0        | 0.0                  | Success  |
      | SMA      | SM55     | pass1234 | SM5501      | 500.0          | 1000.0           | 500.0         | 0.0                  | Success  |
      | SMA      | SM55     | pass1234 | SM5502      | 300.0          | 700.0            | 500.0         | -200.0               | Success  |
      | MA       | SM5503   | pass1234 | SM550301    | 250.0          | -750.0           | 500.0         | -250.0               | Success  |
      | MA       | SM5503   | pass1234 | SM550301    | 250.0          | -1000.0          | 250.0         | 0.0                  | Success  |
      | MA       | SM5503   | pass1234 | SM550302    | -500.0         | -500.0           | -1000.0       | 500.0                | Success  |
      | MA       | SM5503   | pass1234 | SM550302    | -500.0         | 0.0              | -500.0        | 0.0                  | Success  |
      | AGENT    | SM550301 | pass1234 | SM550301M01 | 200.0          | 200.0            | -1000.0       | 800.0                | Success  |
      | AGENT    | SM550301 | pass1234 | SM550301M02 | -200.0         | 0.0              | 1000.0        | -800.0               | Success  |
      | AGENT    | SM550301 | pass1234 | SM550301M01 | 800.0          | 800.0            | -800.0        | 0.0                  | Success  |
      | AGENT    | SM550301 | pass1234 | SM550301M02 | -800.0         | 0.0              | 800.0         | 0.0                  | Success  |

  Scenario Outline: An agency or COY should not be allowed to transfer more figure than balance
    When a "<usertype>" with "<username>", password "<password>", balance "<balance>" tries to transfer amount of "<transferamount>" for downline "<downline>" with balance "<downlinebalance>"
    Then the transfer operation should fail with error code "<errorcode>"
    Examples:
      | usertype | username   | password | balance | downline    | downlinebalance | transferamount | errorcode |
      | SMA      | BT01       | pass1234 | 1000    | BT0101      | -1000           | 2000           | AG2900    |
      | MA       | AA0101     | pass1234 | 1000    | AA010101    | -1000           | 2000           | AG2900    |
      | AGENT    | SM550301   | pass1234 | 1000    | SM550301M02 | -1000           | 2000           | AG2900    |

  Scenario: Tear down test data for Agent downlines
    When I delete data for balance transfer scenarios from database
    Then the database should not contain the data that was deleted
