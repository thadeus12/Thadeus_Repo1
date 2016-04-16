@feature @closure
Feature: Update credit limit of an upper level when closing the account
  As SMA, MA, A
  I would like close an downline
  So that his credit is transferred back to me

  Scenario: Setup test data for closing an Agent
    When I insert data for update credit on closure scenarios to database
    Then the test data should be available in the database

  Scenario Outline:  The users balance gets updated when he closes his downline
    When An agent with username"<username>", password"<password>" and available balance"<availableBalance>" logs into site "<site>" and tries close a downline with downlineUsername"<downlineUsername>" , downlineLevel"<downlineLevel>" and downlineCreditLimit"<downlineCreditLimit>"
    Then User gets "<response>"
    And Agent should be able to get back the credit limits "<downlineCreditLimit>" of the downline to his new available balance"<newAvailableBalance>"
    And downline user new credit Limit "<newDownlineCreditLimit>" and new available balance "<newDownlineAvailableBalance>" should be zero

  Examples:
  |site   |username |password   |availableBalance   |newAvailableBalance  |downlineUsername   |downlineLevel  |downlineCreditLimit |newDownlineCreditLimit |newDownlineAvailableBalance |response |
  |agency |CC010101 |pass1234   |1000.00            |2000.00              |CC010101M01        |Member         |1000                |0                      |0.0                         |success  |

  Scenario Outline:  The agent cannot close a downline having open_bets
    When An agent with username"<username>", password"<password>" and available balance"<availableBalance>" logs into site "<site>" and tries close a downline with downlineUsername"<downlineUsername>" , downlineLevel"<downlineLevel>", downlineCreditLimit"<downlineCreditLimit>" and open bets
    Then User gets error"<response>"
    And Agent new available balance"<newAvailableBalance>" should not change

    Examples:
      |site   |username |password   |availableBalance    |newAvailableBalance  |downlineUsername   |downlineLevel  |downlineCreditLimit  |response |
      |agency |CC010102 |pass1234   |1000.00             |1000.00              |CC010102M01        |Member         |1000                 |AG2717   |

  Scenario: Tear down test data for member management
    When I delete data for update delete on close scenarios from database
    Then the database should not contain the data that was deleted