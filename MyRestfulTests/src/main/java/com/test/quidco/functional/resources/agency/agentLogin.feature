@feature @agentlogin
Feature: Agent user login to agency site
  As a user of the agency site
  I want to be able to login to the system
  So that I can perform my responsibilities


  Scenario: Setup test data for agent login
    When I insert data for agent login scenarios to database
    Then the test data should be available in the database

  Scenario Outline: Successful login to agency site
    When I login to agency site with username "<username>" and password "<password>"
    Then I should get valid authentication token

    Examples:
      | username      | password |
      | AA01          | pass1234 |
      | AA0101        | pass1234 |
      | AA010101      | pass1234 |
      | AA01SUB01     | pass1234 |
      | AA0101SUB01   | pass1234 |
      | AA010101SUB01 | pass1234 |

  Scenario Outline: Unsuccessful login to agency site with wrong credentials
    When I attempt login to agency site as "<usertype>" with wrong username "<username>" or password "<password>"
    Then I should not succeed to login to agency site and receive error

    Examples:
      | username      | password | usertype             |
      | AA01          | pass4321 | active SMA           |
      | AA0101        | pass4321 | active MA            |
      | AA010101      | pass4321 | active Agent         |
      | AA01SUB01     | pass4321 | active SMA subuser   |
      | AA0101SUB01   | pass4321 | active MA subuser    |
      | AA010101SUB01 | pass4321 | active Agent subuser |
      | AA50          | pass1234 | non-existing user    |

  Scenario Outline: Unsuccessful login to agency site when account is inactive or closed
    When I login to agency site with inactive or closed account status "<usertype>", username "<username>" and password "<password>"
    Then I should fail and receive AUTH003 error

    Examples:

      | username | password | usertype       |
      | AA16     | pass1234 | inactive SMA   |
      | AA1601   | pass1234 | inactive MA    |
      | AA160101 | pass1234 | inactive Agent |
      | AA15     | pass1234 | closed SMA     |
      | AA1501   | pass1234 | closed MA      |
      | AA150101 | pass1234 | closed Agent   |

  Scenario Outline: Unsuccessful login to agency site when up line agent is inactive
    When I try to login to agency site as "<usertype>" with username "<username>" and password "<password>"
    Then I should not succeed and receive contact your upline error

    Examples:
      | username | password | usertype                    |
      | AA1602   | pass1234 | MA with inactive up line    |
      | AA160102 | pass1234 | Agent with inactive up line |
      | AA1502   | pass1234 | MA with closed up line      |
      | AA150102 | pass1234 | Agent with closed up line   |


  Scenario Outline: The agent is kicked out when upline is inactive or closed and the user tries to do post, put, delete
    When I login to agency site with username "<username>" and password "<password>"
    When an upline agent status updates to "<status>" for username "<uplineusername>"
    Then an agent with "<username>" and password "<password>" update fails
    Examples:
      | username | password | status   | uplineusername |
      | AA170101 | pass1234 | closed   | AA17           |
      | AA170101 | pass1234 | inactive | AA17           |
      | AA170101 | pass1234 | closed   | AA1701         |
      | AA170101 | pass1234 | inactive | AA1701         |
      | AA170101 | pass1234 | inactive | AA170101       |

  Scenario: Tear down test data for agent login
    When I delete data for agent login scenarios from database
    Then the database should not contain the data that was deleted



