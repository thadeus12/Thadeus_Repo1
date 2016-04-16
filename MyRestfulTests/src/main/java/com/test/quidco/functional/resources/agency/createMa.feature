@feature @createma
Feature: Creating Master Agent
  As COY User or SMA or their SubUser
  I would like to be able to create MA
  So I can setup their business structure

  Scenario: Setup test data for create MA
    When I insert data for create MA scenarios to database
    Then the test data should be available in the database

  Scenario Outline: SMA user or subuser Successfully creates an MA
    When a "<site>" user with username "<sma>" and password "<smapassword>" creates an MA with the following details "<ma>","<mapassword>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the MA should be created and the user gets "<response>" message
    And the new MA should get "<response>" response when they login to managersite
    Examples:
      | sma | smapassword | ma | mapassword | status | firstname | lastname | contactnum | response |site|
      | MM01  | pass1234    | MM0101   | pass1234 | ACTIVE | mark      | tomas    | 078787678  | Success  |agency|

  Scenario Outline: SMA or subuser of SMA unsuccessfully tries to create MA
    When an SMA attempts to an MA with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the operation to create an MA should fail and error "<errorcode>" returned
    Examples:
      | username | password | status | firstname                           | lastname                            | contactnum              | errorcode |
      | $#%?     | test12   | ACTIVE | james                               | bond                                | 0784545444              | AG2707    |
      | MM0199   | Test12   | REST   | james1                              | bond                                | 0784545445              | AG2712    |
      | MM0101   | test12   | ACTIVE | james2                              | bond                                | 0784545446              | AG2703    |
      | MM0199   | test@12  | ACTIVE | james3                              | bond                                | 0784545447              | AG2713    |
      | MM0199   |          | ACTIVE | james4                              | bond                                | 0784545448              | AG2716    |
      | MM0199   | test12   |        | james5                              | bond                                | 0784545449              | AG2715    |
      |          | test12   | ACTIVE | james5                              | bond                                | 0784545449              | AG2714    |
      | MM0199   | test12   | ACTIVE | james5                              | bond                                | 07845454497845454491222 | AG2706    |
      | MM0199   | test12   | ACTIVE | james5james5<html=tags>james5james5 | bond                                | 0784545449              | AG2704    |
      | MM0199   | test12   | ACTIVE | james5                              | james5james5<html=tags>james5james5 | 845454491222            | AG2705    |

  Scenario Outline: SMA user successfully sets credit settings for a new MA
    When SMA user creates an MA "<ma>" with the following credit settings "<creditlimit>","<agentmaxcredit>" and "<membermaxcredit>"
    Then the MA should be created and the user gets "<errorcode>" message

    Examples:
      | ma     | creditlimit | agentmaxcredit | membermaxcredit | errorcode |
      | MM0105 | 39000       | 29000          | 19000           | Success   |

  Scenario Outline: Unsuccessful attempt by SMA to create MA with invalid credit limits
    When SMA attempts to create an MA with the following credit settings "<creditlimit>","<agentmaxcredit>" and "<membermaxcredit>"
    Then the operation to create an MA should fail and error "<errorcode>" returned

    Examples:
      | creditlimit | agentmaxcredit | membermaxcredit | errorcode |
      |             | 100            | 0               | AG2401    |
      | -2222       | 0              | 0               | AG2402    |
      | 89.8958     | 0              | 0               | AG2402    |
      | 39000       | 2984           |                 | AG2408    |
      | 9999        | 9999           | 999.8958        | AG2409    |
      | 9999        | 9999           | -6666           | AG2409    |
      | 39000       | 9000           | 9500            | AG2414    |
      | 700000      | 9999           | 5555            | AG2411    |
      | 9000        | 9500           | 5575            | AG2418    |
      | 600000      | 600000         | 600000          | AG2419    |

  Scenario Outline: SMA user successfully sets bet settings for a new MA
    When SMA creates an MA "<ma>" with the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>"
    Then the MA should be created and the user gets "<errorcode>" message
    Examples:
      | ma     | minbet | maxbet | maxpermatch | errorcode |
      | MM0108 | 200    | 8000   |             | Success   |
      | MM0109 | 300    | 7000   | 0           | Success   |

  Scenario Outline: Unsuccessful attempt by SMA to create MA with invalid bet settings
    When SMA user attempts to create an MA with the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>"
    Then the operation to create an MA should fail and error "<errorcode>" returned
    Examples:
      | minbet | maxbet | maxpermatch | errorcode |
      |        | 10     | 5           | AG2501    |
      | 10.44  | 12     | 5           | AG2502    |
      | 1      | 10     | 15          | AG2509    |
      | 10     |        | 5           | AG2503    |
      | 10     | 12.44  | 5           | AG2504    |
      | 100    | 11000  | 11000       | AG2510    |
      | 10     | 7      | 15          | AG2507    |
      | 10     | 100    | 0           | AG2509    |

  Scenario Outline: SMA user successfully sets position settings for a new MA
    When SMA user creates an MA "<ma>" with the following position settings "<smamaxposition>" and "<mamaxposition>"
    Then the position settings must be set successfully and SMA user gets "<errorcode>" message
    Examples:
      | ma     | smamaxposition | mamaxposition | errorcode |
      | MM0113 | 20             | 40            | Success   |
      | MM0114 | 0              | 50            | Success   |
      | MM0115 | 10             | 50            | Success   |


  Scenario Outline: Unsuccessful attempt by SMA to create MA with invalid position settings
    When SMA user attempts to set the following position settings "<smamaxposition>" and "<mamaxposition>"
    Then the operation must fail and error "<errorcode>" returned
    Examples:
      | smamaxposition | mamaxposition | errorcode |
      |                | 50            | AG2101    |
      | 50.55          | 20            | AG2102    |
      | -50            | 20            | AG2102    |
      | 50             |               | AG2103    |
      | 40             | 50.55         | AG2104    |
      | 50             | -50           | AG2104    |
      | 50             | 70            | AG2105    |

  Scenario: Tear down test data for create MA
    When I delete data for create MA scenarios from database
    Then the database should not contain the data that was deleted