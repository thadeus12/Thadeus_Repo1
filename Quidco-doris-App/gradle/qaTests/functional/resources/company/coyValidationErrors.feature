@feature @coyvalidationerrors
Feature: Displaying multiple errors
  As a user of the company or agency site
  I would like to see all errors when creating a new agent
  So I can fix them all at once

  Scenario: Setup test data for validation errors
    When I insert data for validation error scenarios to database
    Then the test data should be available in the database

  Scenario Outline: COY user see multiple validation errors when creating new SMA
    When COY user creates an SMA with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>","<creditlimit>","<mamaxcredit>","<membermaxcredit>","<minbet>","<maxbet>","<maxpermatch>","<smamaxposition>","<membercommission>","<smacommission>"
    Then they should see the following multiple errors "<errors>"
    Examples:
      | username | password | firstname                         | lastname                          | contactnum                        | creditlimit | mamaxcredit | membermaxcredit | minbet | maxbet | maxpermatch | smamaxposition | membercommission | smacommission | errors                      |
      |          | pass1234 | Apollo                            | 57                                | 911                               | -2222       | 0           | 0               |        | 10     | 5           | 81             | 4                | 5             | AG2714,AG2402,AG2501,AG2104 |
      | SM20     |          | Apollo                            | 57b                               | 911                               | 0           | 555.55      | 0               | -100   | 10     | 5           | 81             | 12               | 10            | AG2716,AG2405,AG2502,AG2104 |
      | AA01     | pass1234 | Apollo                            | 57                                | 911                               | 5555        | 2222        | -666            | 1      |        | 5           | 81             | 5                |               | AG2703,AG2409,AG2503,AG2104 |
      | SM2001   | pass1234 | Apollo                            | 57                                | 911                               | 5555        | 7777        | 15999           | 10     | -100   | 5           | 81             | 5                | 10            | AG2707,AG2414,AG2504,AG2104 |
      | SM23     | pass1234 |                                   |                                   | 123456789012345678901234567890123 | 0           | 5555        | 15999           | 10     | 5      | 2           | 81             | 5                | -8            | AG2414,AG2507,AG2104,AG2706 |
  Scenario: Tear down test data for validation errors
    When I delete data for validation error scenarios from database
    Then the database should not contain the data that was deleted
