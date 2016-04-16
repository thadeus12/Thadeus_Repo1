@feature @coycreateagent
Feature: Creating Master Agent
  As COY User
  I would like to be able to create Agent
  So I can setup their business structure

  Scenario: Setup test data for create Agent
    When I insert data for agent management scenarios to database
    Then the test data should be available in the database

  Scenario Outline: COY user successfully creates an Agent
    When a "<site>" user with username "<coyusername>" and password "<coypassword>" creates an Agent with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the Agent should be created and the user gets "<response>" message
    Examples:
      | site    | coyusername | coypassword | username | password | status | firstname | lastname | contactnum | response |
      | company | admin.user  | pass1234    | AM010118 | pass1234 | ACTIVE | mark      | tomas    | 078787678  | Success  |
      | company | admin.user  | pass1234    | AM010102 | pass1234 | ACTIVE | mark      |          |            | Success  |
      | company | admin.user  | pass1234    | AM010103 | pass1234 | ACTIVE |           |          | 078787678  | Success  |

  Scenario Outline: COY unsuccessfully tries to create Agent
    When a COY with username "<coyusername>" and password "<coypassword>" attempts to create an Agent with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the operation to create an Agent should fail and error "<errorcode>" returned
    Examples:
      | coyusername | coypassword | username | password | status | firstname                           | lastname                            | contactnum              | errorcode |
      | admin.user  | pass1234    | AM010101 | test12   | ACTIVE | james2                              | bond                                | 0784545446              | AG2703    |
      | admin.user  | pass1234    | $#%?     | test12   | ACTIVE | james                               | bond                                | 0784545444              | AG2707    |
      | admin.user  | pass1234    | AM01155  | test12   | ACTIVE | james                               | bond                                | 0784545444              | AG2707    |
      | admin.user  | pass1234    | ZZZC0101 | test12   | ACTIVE | james                               | bond                                | 0784545444              | AG2707    |
      | admin.user  | pass1234    | AM010108 | Test12   | REST   | james1                              | bond                                | 0784545445              | AG2712    |
      | admin.user  | pass1234    |          | test12   | ACTIVE | james5                              | bond                                | 0784545449              | AG2714    |
      | admin.user  | pass1234    | AM010108 | test@12  | ACTIVE | james3                              | bond                                | 0784545447              | AG2713    |
      | admin.user  | pass1234    | AM010108 |          | ACTIVE | james4                              | bond                                | 0784545448              | AG2716    |
      | admin.user  | pass1234    | AM010108 | test12   |        | james5                              | bond                                | 0784545449              | AG2715    |
      | admin.user  | pass1234    |          | test12   | ACTIVE | james5                              | bond                                | 0784545449              | AG2714    |
      | admin.user  | pass1234    | AM010108 | test12   | ACTIVE | james5                              | bond                                | 07845454497845454491222 | AG2706    |
      | admin.user  | pass1234    | AM010108 | test12   | ACTIVE | james5james5<html=tags>james5james5 | bond                                | 0784545449              | AG2704    |
      | admin.user  | pass1234    | AM010108 | test12   | ACTIVE | james5                              | james5james5<html=tags>james5james5 | 9454491222              | AG2705    |

  Scenario Outline: COY user successfully sets credit settings for a new Agent
    When COY user sets the following credit limits "<creditlimit>","<membermaxcredit>" for a new Agent
    Then the Agent should be created and the user gets "<response>" message
    Examples:
      | creditlimit | membermaxcredit | response |
      | 130000      | 110000          | Success  |

  Scenario Outline: Unsuccessful attempt by Coy to create an agent with invalid credit limits
    When COY user attempts to set the following credit limits "<creditlimit>","<membermaxcredit>" for a new agent
    Then the operation to create an Agent should fail and error "<errorcode>" returned
    Examples:
      | creditlimit | membermaxcredit | errorcode |
      |             | 110000          | AG2401    |
      | 89.8958     | 110000          | AG2402    |
      | 130000      |                 | AG2408    |
      | 130000      | 1100.34         | AG2409    |
      | 130000      | 140000          | AG2416    |

  Scenario Outline: COY user successfully sets bet settings for a new agent
    When COY user sets the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a new agent
    Then the Agent should be created and the user gets "<response>" message
    Examples:
      | minbet | maxbet | maxpermatch | response |
      | 300    | 7000   | 0           | Success  |

  Scenario Outline: Unsuccessful attempt by Coy to create agent with invalid bet settings
    When COY user attempts to set the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a new agent
    Then the operation to create an Agent should fail and error "<errorcode>" returned
    Examples:
      | minbet | maxbet | maxpermatch | errorcode |
      |        | 7000   | 12000       | AG2501    |
      | -100   | 7000   | 12000       | AG2502    |
      | 300    |        | 12000       | AG2503    |
      | 300    | -100   | 12000       | AG2504    |
      | 99     | 7000   | 12000       | AG2509    |
      | 300    | 10001  | 12000       | AG2510    |
      | 300    | 0      | 0           | AG2510    |

  Scenario Outline: COY user successfully sets position settings for a new agent
    When COY user sets the following Agent position takings "<maposition>" and "<agentmaxposition>" for "<agent>"
    Then the Agent should be created and the user gets "<response>" message
    Examples:
      | agent    | maposition | agentmaxposition | response |
      | AM010114 | 10         | 40               | Success  |
      | AM010115 | 0          | 50               | Success  |

  Scenario Outline: Unsuccessful attempt by Coy to create agent with invalid position settings
    When COY user attempts to create an agent with the following position settings "<maposition>" and "<agentmaxposition>"
    Then the operation to create an Agent should fail and error "<errorcode>" returned
    Examples:
      | maposition | agentmaxposition | errorcode |
      |            | 40               | AG2101    |
      | 10.11      | 40               | AG2102    |
      | -50        | 40               | AG2102    |
      | 10         |                  | AG2103    |
      | 10         | 50.55            | AG2104    |
      | 10         | -50              | AG2104    |
      | 10         | 60               | AG2105    |

  @819
  Scenario: Tear down test data for create Agent
    When I delete data for agent management scenarios from database
    Then the database should not contain the data that was deleted