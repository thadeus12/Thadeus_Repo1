@feature @accountbalance
Feature: An Agency site user checks their Balance and Net Exposure
  As a user of the Agency site
  I want to be able to balance and net exposure

  Scenario: Setup test data for account balance
    When I insert data for account balance scenarios to database
    Then the test data should be available in the database

  Scenario Outline: Agency site user views their account balance and net exposure
    When a "<usertype>" user with username "<username>" and password "<password>" views their accounts
    Then they should see their net exposure "<netexposure>", cash balance "<cashbalance>", yesterday balance "<yesterdaybalance>", total balance "<totalbalance>", yesterday total balance "<yesterdaytotalbalance>",  sma credit "<smacredit>", total ma credit "<totalmacredit>", total agent credit "<totalagentcredit>", total member credit "<totalmembercredit>"
    Examples:
      | usertype | username | password | netexposure | cashbalance | yesterdaybalance | totalbalance | yesterdaytotalbalance | smacredit | totalmacredit | totalagentcredit | totalmembercredit |
      | SMA      | AA01     | pass1234 | 0.00        | 0.00        | 0.00             | 0.00         | 0.00                  | 600000    | 250000.00     | 170000.00        | 8481.00           |
      | MA       | AA0101   | pass1234 | 0.00        | 20000.00    | 0.00             | 0.00         | 20000.00              | 300000    |               | 170000.00        | 8481.00           |
      | Agent    | AA010101 | pass1234 | 0.00        | 20000.00    | 0.00             | 0.00         | 20000.00              | 200000    |               |                  | 8481.00           |

  Scenario Outline: Agency site user attempts to view account details of another user
    When an agency user "<user>" attempts to view the account details of another user "<targetuser>"
    Then they should be forbidden
    Examples:
      | user     | targetuser |
      | AA01     | AA02       |
      | AA01     | AA0101     |
      | AA01     | AA010101   |
      | AA0101   | AA01       |
      | AA0101   | AA0102     |
      | AA0101   | AA010101   |
      | AA010101 | AA010102   |

  Scenario Outline: Agent available balance is updated when new downline is created
    When "<usertype>" user with username "<username>" and password "<password>" creates a "<downline>" with the following "<creditlimit>"
    Then the "<usertype>" available balance should be updated to "<balance>"
    Examples:
      | usertype | username | password | downline    | creditlimit | balance  |
      | SMA      | AV01     | pass1234 | AV0101      | 150000      | 350000.0 |
      | SMA      | AV01     | pass1234 | AV0102      | 250000      | 100000.0 |
      | MA       | AV0101   | pass1234 | AV010101    | 50000       | 100000.0 |
      | MA       | AV0101   | pass1234 | AV010102    | 75000       | 25000.0  |
      | Agent    | AV010101 | pass1234 | AV010101M01 | 15000       | 35000.0  |
      | Agent    | AV010101 | pass1234 | AV010101M02 | 20000       | 15000.0  |


  Scenario Outline: Agent available balance is updated when credit limit of a downline is updated
    When "<usertype>" user with username "<username>" and password "<password>" updates the credit limit of a "<downline>" to "<creditlimit>"
    Then the "<usertype>" available balance should be updated to "<balance>"
    And downline balance should be "<downlinebalance>"
    Examples:
      | usertype | username | password | downline    | creditlimit | balance | downlinebalance |
      | SMA      | AV01     | pass1234 | AV0101      | 200000      | 50000.0 | 75000.0         |
      | SMA      | AV01     | pass1234 | AV0102      | 300000      | 0.0     | 300000.0        |
      | MA       | AV0101   | pass1234 | AV010101    | 60000       | 65000.0 | 25000.0         |
      | MA       | AV0101   | pass1234 | AV010102    | 90000       | 50000.0 | 90000.0         |
      | Agent    | AV010101 | pass1234 | AV010101M01 | 17500       | 22500.0 | 17500.0         |
      | Agent    | AV010101 | pass1234 | AV010101M02 | 25000       | 17500.0 | 25000.0         |

  Scenario: Tear down test data for account balance
    When I delete data for account balance scenarios from database
    Then the database should not contain the data that was deleted