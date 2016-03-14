@feature @coydownline
Feature: Listing COY downlines
  As COY User or SubUser
  Given the proper access rights
  I would like to be able to list my downlines
  So I can view/manage them


  Scenario: Setup test data for Agent downlines
    When I insert data for Agent downline scenarios to database
    Then the test data should be available in the database

  Scenario Outline: View SMA downlines by COY user or subuser
    When COY user with username "<username>" and password "<password>"
    Then they should see the SMAs for the coyid "<masterUsername>"
    Examples:
      | username   | password | masterUsername |
      | admin.user | pass1234 | admin.user     |
      | user.01    | pass1234 | admin.user     |

  Scenario Outline: COY views list of downlines of their downlines
    When COY user views the downlines of their downline "<ownerid>"
    Then COY should see these "<downlines>" downlines
    Examples:
      | ownerid  | downlines                             |
      | AD01     | [AD0101,AD0103,AD0102]                |
      | AD0101   | [AD010101,AD010103,AD010102]          |
      | AD010101 | [AD010101M01,AD010101M03,AD010101M02] |

  Scenario Outline: Verify basic details of an agent or a member
    When COY user views the details of a downline "<name>" owned by "<parent>"
    Then COY should see the following details "<name>","<status>","<settledbalance>","<netexposure>","<credilimit>","<createdDate>"
    Examples:
      | parent     | name        | status | settledbalance | netexposure | credilimit |
      | admin.user | AD01        | ACTIVE | 0.0            | 10000.0     | 600000.0   |
      | AD01       | AD0101      | ACTIVE | 0.0            | 10000.0     | 500000.0   |
      | AD0101     | AD010101    | ACTIVE | 0.0            | 10000.0     | 400000.0   |
      | AD010101   | AD010101M01 | ACTIVE | 0.0            | 10000.0     | 200000.0   |


  Scenario Outline: Attempt to view SMA downlines with invalid token
    When Unauthorized COY user attempts to view SMA downlines with invalid or missing token "<token>"
    Then they should receive error "403"
    Examples:
      | token              |
      | xyxyxyxyyxyxyyxyxy |
      |                    |


  Scenario Outline:Search downlines
    When COY user searches for downlines with usercode "<code>" and status "<status>" for agent "<parent>"
    Then COY should see these "<downlines>" downlines
    Examples:
      | parent   | code        | status | downlines                 |
      | AD01     | AD0101      | 0      | [AD0101]                  |
      | AD01     |             | 1      | [AD0101,AD0103]           |
      | AD01     | AD0102      | 4      | [AD0102]                  |
      | AD0101   | AD010101    | 0      | [AD010101]                |
      | AD0101   |             | 1      | [AD010101,AD010103]       |
      | AD0101   | AD010102    | 4      | [AD010102]                |
      | AD010101 | AD010101M01 | 0      | [AD010101M01]             |
      | AD010101 |             | 1      | [AD010101M01,AD010101M03] |
      | AD010101 | AD010101M02 | 4      | [AD010101M02]             |


  Scenario: Tear down test data for Agent downlines
    When I delete data for Agent downline scenarios from database
    Then the database should not contain the data that was deleted

