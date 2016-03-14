@feature @updatema
Feature: Updating agents
  As SMA or subuser
  I would like to be able to edit my downline
  So I can their account up to date

  Scenario: Setup test data for update MA
    When I insert data for update MA scenarios to database
    Then the test data should be available in the database

  Scenario Outline: SMA user or subuser successfully edits an MA
    When SMA with username "<smausername>" and password "<smapassword>" edits an MA and enters the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the MA details should be updated and the user gets "<response>" message
    And the MA should get success response when they login to agency site after the update
    Examples:
      | smausername | smapassword | username | password | status | firstname | lastname | contactnum | response |
      | MM02        | pass1234    | MM0201   | null     | ACTIVE | mark      | tomas    | 078787678  | Success  |
      | MM02        | pass1234    | MM0201   | pass1234 | ACTIVE |           | tomas    |            | Success  |

  Scenario Outline: SMA or subuser of SMA unsuccessfully tries to edit MA basic details
    When SMA with username "<smausername>" and password "<smapassword>" attempts to edit an MA with the following details "<uusername>","<upassword>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the operation to edit an MA should fail and error "<errorcode>" returned
    Examples:
      | smausername | smapassword | uusername | upassword | status | firstname                           | lastname                            | contactnum              | errorcode |
      | MM02        | pass1234    | MM0201    | null      | REST   | james1                              | bond                                | 0784545445              | AG2712    |
      | MM02        | pass1234    | MM0201    | test@12   | ACTIVE | james3                              | bond                                | 0784545447              | AG2713    |
      | MM02        | pass1234    | MM0201    | test12    |        | james5                              | bond                                | 0784545449              | AG2715    |
      | MM02        | pass1234    | MM0201    | test12    | ACTIVE | james5                              | bond                                | 07845454497845454491222 | AG2706    |
      | MM02        | pass1234    | MM0201    | test12    | ACTIVE | james5james5<html=tags>james5james5 | bond                                | 0784545449              | AG2704    |
      | MM02        | pass1234    | MM0201    | test12    | ACTIVE | james5                              | james5james5<html=tags>james5james5 | 9454491222              | AG2705    |


  Scenario Outline: SMA user or subuser successfully updates position settings for an MA
    When SMA user updates the following position limits smaxposition "<smaposition>", mamaxposition "<mamaxposition>" for an MA
    Then the MA details should be updated and the user gets "<response>" message

    Examples:
      | smaposition | mamaxposition | response |
      | 5           | 55            | Success  |
      | 0           | 50            | Success  |


  Scenario Outline: Unsuccessful attempt by SMA to edit MA with invalid position settings
    When SMA user attempts to update the following position settings "<smaposition>", "<mamaxposition>" for an MA
    Then the operation to edit an MA should fail and error "<errorcode>" returned

    Examples:
      | smaposition | mamaxposition | errorcode |
      | 10          | 51            | AG2105    |


  Scenario Outline: SMA user or subuser successfully updates bet settings for an MA
    When SMA user edits the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for an MA
    Then the MA details should be updated and the user gets "<response>" message

    Examples:
      | minbet | maxbet | maxpermatch | response |
      | 300    | 8000   | 12000       | Success  |


  Scenario Outline: Unsuccessful attempt by SMA to update MA with invalid bet settings
    When SMA user attempts to edit the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for an MA
    Then the operation to edit an MA should fail and error "<errorcode>" returned

    Examples:
      | minbet | maxbet | maxpermatch | errorcode |
      |        | 8000   | 13000       | AG2501    |
      | -100   | 8000   | 13000       | AG2502    |
      | 200    |        | 13000       | AG2503    |
      | 200    | -100   | 13000       | AG2504    |
      | 200    | 90     | 13000       | AG2507    |
      | 200    | 9000   | 13000       | AG2510    |



  Scenario Outline: SMA user or subuser successfully updates credit settings for a new MA
    When SMA user updates the following MA credit limits "<creditlimit>","<mamaxcredit>" and "<membermaxcredit>"
    Then the MA details should be updated and the user gets "<response>" message

    Examples:
      | creditlimit | mamaxcredit | membermaxcredit | response |
      | 130000      | 120000      | 110000          | Success  |

  Scenario Outline: Unsuccessful attempt by SMA to update MA with invalid credit limits
    When SMA user attempts to update the following MA credit limits "<creditlimit>","<mamaxcredit>" and "<membermaxcredit>"
    Then the operation to edit an MA should fail and error "<errorcode>" returned

    Examples:
      | creditlimit | mamaxcredit | membermaxcredit | errorcode |
      |             | 100         | 0               | AG2401    |
      | -2222       | 0           | 0               | AG2402    |
      | 89.8958     | 0           | 0               | AG2402    |
      | 39000       | 2984        |                 | AG2408    |
      | 9999        | 9999        | 999.8958        | AG2409    |
      | 9999        | 9999        | -6666           | AG2409    |
      | 39000       | 9999        | 10005           | AG2414    |
      | 459990      | 9999        | 5555            | AG2411    |
      | 19000       | 21000       | 5575            | AG2418    |

  Scenario Outline: Unsuccessful attempt by SMA to update MA with invalid credit limits
    When SMA user attempts to reduce MA credit limits as follows "<creditlimit>","<agentmaxcredit>" and "<membermaxcredit>"
    Then the operation to edit an MA should fail and error "<errorcode>" returned

    Examples:
      | creditlimit | agentmaxcredit | membermaxcredit | errorcode |
      | 90000       | 80000          | 70000           | AG2420    |

  Scenario Outline: Unsuccessful attempt by SMA to update MA with invalid bet settings
    When SMA user attempts reduce MA bet settings as follows "<minbet>","<maxbet>" and "<maxpermatch>"
    Then the operation to edit an MA should fail and error "<errorcode>" returned

    Examples:
      | minbet | maxbet | maxpermatch | errorcode |
      | 400    | 7000   | 12000       | AG2512    |
      | 200    | 5000   | 12000       | AG2513    |


  Scenario Outline: Unsuccessful attempt by SMA to edit MA with invalid position settings
    When SMA user attempts to reduce MA position settings as follows "<mamaxposition>", "<smaposition>"
    Then the operation to edit an MA should fail and error "<errorcode>" returned

    Examples:
      | smaposition | mamaxposition | errorcode |
      | 10          | 30            | AG2106    |

  Scenario: Tear down test data for update MA
    When I delete data for update MA scenarios from database
    Then the database should not contain the data that was deleted