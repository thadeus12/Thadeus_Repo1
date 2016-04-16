@feature @agentdownline
Feature: MA, Agent & Member listing
  As SMA, MA or Agent User or SubUser
  Given the proper access rights
  I would like to be able to list all my downlines
  So I can view/manage them

  Scenario: Setup test data for Agent downlines
    When I insert data for Agent downline scenarios to database
    Then the test data should be available in the database

  Scenario Outline: Agent views list of their downlines
    When "<usertype>" user with username "<username>" and password "<password>" views their downlines
    Then they should see these "<downlines>" downlines listed
    Examples:
      | usertype | username | password | downlines                             |
      | SMA      | AD01     | pass1234 | [AD0101,AD0103,AD0102]                |
      | MA       | AD0101   | pass1234 | [AD010101,AD010103,AD010102]          |
      | Agent    | AD010101 | pass1234 | [AD010101M01,AD010101M03,AD010101M02] |

  Scenario Outline: Agent views list of downlines of their downlines
    When "<usertype>" user with username "<username>" and password "<password>" views the downlines of their downline "<ownerid>"
    Then they should see these "<downlines>" downlines listed
    Examples:
      | usertype | username | password | ownerid  | downlines                             |
      | SMA      | AD01     | pass1234 | AD0101   | [AD010101,AD010103,AD010102]          |
      | SMA      | AD01     | pass1234 | AD010101 | [AD010101M01,AD010101M03,AD010101M02] |
      | MA       | AD0101   | pass1234 | AD010101 | [AD010101M01,AD010101M03,AD010101M02] |

  Scenario Outline: Verify basic details of an agent or a member
    When "<usertype>" user with username "<username>" and password "<password>" views the details of a downline
    Then they should see the following details "<name>","<status>","<settledbalance>","<netexposure>","<credilimit>","<createdDate>"
    Examples:
      | usertype | username | password | name        | status | settledbalance | netexposure | credilimit |
      | SMA      | AD01     | pass1234 | AD0101      | ACTIVE | 0.0            | 10000.0      | 500000.0   |
      | MA       | AD0101   | pass1234 | AD010101    | ACTIVE | 0.0            | 10000.0      | 400000.0   |
      | Agent    | AD010101 | pass1234 | AD010101M01 | ACTIVE | 0.0            | 10000.0      | 200000.0   |

  Scenario Outline: Reject unauthorized request by Agent user or subuser to view downlines
    When Agent with username "<username>" and password "<password>" makes unauthorised query to list downlines
    Then The request to list downlines of "<usercode>" will fail
    Examples:
      | username | password | usercode   |
      | AA01     | pass1234 | admin.user |
      | AA0101   | pass1234 | AA1101     |


  Scenario Outline:Search downlines
    When Agent with username "<username>" and password "<password>" searches for downlines with usercode "<code>" and status "<status>"
    Then the Agent should see the downlines "<downlines>"
    Examples:
      | username | password | code        | status | downlines                 |
      | AD01     | pass1234 | AD0101      | 0      | [AD0101]                  |
      | AD01     | pass1234 |             | 1      | [AD0101,AD0103]           |
      | AD01     | pass1234 | AD0102      | 4      | [AD0102]                  |
      | AD0101   | pass1234 | AD010101    | 0      | [AD010101]                |
      | AD0101   | pass1234 |             | 1      | [AD010101,AD010103]       |
      | AD0101   | pass1234 | AD010102    | 4      | [AD010102]                |
      | AD010101 | pass1234 | AD010101M01 | 0      | [AD010101M01]             |
      | AD010101 | pass1234 |             | 1      | [AD010101M01,AD010101M03] |
      | AD010101 | pass1234 | AD010101M02 | 4      | [AD010101M02]             |


  Scenario: Tear down test data for Agent downlines
    When I delete data for Agent downline scenarios from database
    Then the database should not contain the data that was deleted