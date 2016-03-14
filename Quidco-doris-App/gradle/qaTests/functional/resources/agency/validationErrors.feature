@feature @validationerrors
Feature: Displaying multiple errors
  As a user of the company or agency site
  I would like to see all errors when creating a new agent
  So I can fix them all at once

  Scenario: Setup test data for validation errors
    When I insert data for validation error scenarios to database
    Then the test data should be available in the database

  Scenario Outline: COY or SMA sees multiple validation errors
    When COY user or SMA creates an MA with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>","<creditlimit>","<agentmaxcredit>","<membermaxcredit>","<minbet>","<maxbet>","<maxpermatch>","<smamaxposition>","<mamaxposition>"
    Then they should see the following multiple errors "<errors>"
    Examples:
      | username | password | firstname                           | lastname                            | contactnum              | creditlimit | agentmaxcredit | membermaxcredit | minbet | maxbet | maxpermatch | smamaxposition | mamaxposition | errors                      |
      | YY       | test12   | james                               | bond                                | 784545444               |             | 100            | 0               |        | 10     | 5           |                | 50            | AG2707,AG2401,AG2501,AG2101 |
      | VE0199   | Test12   | james1                              | bond                                | 784545445               | -2222       | 0              | 0               | 10.44  | 12     | 5           | 50.55          | 20            | AG2402,AG2502               |
      | VE0101   | test12   | james2                              | bond                                | 784545446               | 89.8958     | 0              | 0               | 1      | 10     | 15          | -50            | 20            | AG2703,AG2402,AG2509        |
      | VE0199   | test@12  | james3                              | bond                                | 784545447               | 39000       | 29844          |                 | 10     |        | 5           | 50             |               | AG2713,AG2408,AG2503        |
      | VE0199   |          | james4                              | bond                                | 784545448               | 9999        | 1999           | 999.8958        | 10     | 12.44  | 5           | 50             | -50           | AG2716,AG2409,AG2504        |
      | VE0199   | test12   | james5                              | bond                                | 784545449               | 39000       | 9999           | 10005           | 100    | 11000  | 11000       | 50             | 70            | AG2414,AG2510               |
      |          | test12   | james5                              | bond                                | 784545449               | 5555        | 9999           | 5555            | 10     | 7      | 15          | 50             | 70            | AG2714,AG2418,AG2507        |



  Scenario Outline: COY user see multiple validation errors when creating new Agent
    When COY user or MA creates an Agent with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>","<creditlimit>","<membermaxcredit>","<minbet>","<maxbet>","<maxpermatch>","<maposition>","<agentposition>"
    Then they should see the following multiple errors "<errors>"
    Examples:
      | username | password | firstname                           | lastname                            | contactnum              | creditlimit | membermaxcredit | minbet | maxbet | maxpermatch | maposition | agentposition | errors                      |
      | AA010101 | test12   | james2                              | bond                                | 784545446               |             | 110000          |        | 7000   | 12000       |            | 40            | AG2703,AG2401,AG2501,AG2101 |
      | ZZZC0108 | test12   | james                               | bond                                | 784545444               | 89.8958     | 110000          | -100   | 7000   | 12000       | -50        | 40            | AG2707,AG2402,AG2502        |
      | VE010199 | Test12   | james1                              | bond                                | 784545445               | 130000      |                 | 300    |        | 12000       | 10         |               | AG2408,AG2503               |
      |          | test12   | james5                              | bond                                | 784545449               | 130000      | 1100.34         | 300    | -100   | 12000       | 10         | -50           | AG2714,AG2409,AG2504        |
      | VE010199 | test@12  | james3                              | bond                                | 784545447               | 130000      | 140000          | 300    | 7000   |   0         | 10         | 60            | AG2713,AG2416               |
      | VE010199 |          | james4                              | bond                                | 784545448               | 130000      | 140000          | 300    | 7000   |   0         | 10         | 60            | AG2716,AG2416               |
      | VE010199 | test12   | james5james5<html=tags>james5james5 | bond                                | 784545449               | 130000      | 140000          | 90     | 7000   | 12000       | 10         | 60            | AG2704,AG2416,AG2509        |
      | VE010199 | test12   | james5                              | james5james5<html=tags>james5james5 | 9454491222              | 130000      | 140000          | 300    | 0      | 0           | 10         | 60            | AG2705,AG2416,AG2510        |
      | VE010199 | test12   | james5                              | james5james5<html=tags>james5james5 | 9454491222              | 130000      | 140000          | 300    | 7000   | 0           | 10         | 60            | AG2705,AG2416               |

  Scenario: Tear down test data for validation errors
    When I delete data for validation error scenarios from database
    Then the database should not contain the data that was deleted
