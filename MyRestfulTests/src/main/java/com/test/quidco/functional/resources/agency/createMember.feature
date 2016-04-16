@feature @createmember
Feature: Creating Member
  As COY User or Agent
  I would like to be able to create Member
  So I can setup their business structure

  Scenario: Setup test data for member management
    When I insert data for member management scenarios to database
    Then the test data should be available in the database

  Scenario Outline: Agent successfully creates a Member
    When an Agent with username "<agentusername>" and password "<agentpassword>" creates a Member with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then Member must be created and the user gets "<response>" message

    Examples:
      | agentusername | agentpassword | username    | password | status | firstname | lastname | contactnum | response |
      | ME010101      | pass1234      | ME010101M06 | pass1234 | ACTIVE | mark      | tomas    | 078787678  | Success  |
      | ME010101      | pass1234      | ME010101M07 | pass1234 | ACTIVE | mark      |          |            | Success  |
      | ME010101      | pass1234      | ME010101M08 | pass1234 | ACTIVE |           |          | 078787678  | Success  |
  Scenario Outline: Agent unsuccessfully tries to create Member
    When an Agent with username "<agentusername>" and password "<agentpassword>" attempts to create a Member with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then operation to create a Member should fail and error "<errorcode>" returned
    Examples:
      | agentusername | agentpassword | username    | password | status | firstname                           | lastname                            | contactnum              | errorcode |
      | ME010101      | pass1234      | ME010101M06 | test12   | ACTIVE | james2                              | bond                                | 0784545446              | AG2703    |
      | ME010101      | pass1234      | $#%?        | test12   | ACTIVE | james                               | bond                                | 0784545444              | AG2707    |
      | ME010101      | pass1234      | ME010101M09 | Test12   | REST   | james1                              | bond                                | 0784545445              | AG2712    |
      | ME010101      | pass1234      |             | test12   | ACTIVE | james5                              | bond                                | 0784545449              | AG2714    |
      | ME010101      | pass1234      | ME010101M09 | test@12  | ACTIVE | james3                              | bond                                | 0784545447              | AG2713    |
      | ME010101      | pass1234      | ME010101M09 |          | ACTIVE | james4                              | bond                                | 0784545448              | AG2716    |
      | ME010101      | pass1234      | ME010101M09 | test12   |        | james5                              | bond                                | 0784545449              | AG2715    |
      | ME010101      | pass1234      | ME010101M09 | test12   | ACTIVE | james5                              | bond                                | 07845454497845454491222 | AG2706    |
      | ME010101      | pass1234      | ME010101M09 | test12   | ACTIVE | james5james5<html=tags>james5james5 | bond                                | 0784545449              | AG2704    |
      | ME010101      | pass1234      | ME010101M09 | test12   | ACTIVE | james5                              | james5james5<html=tags>james5james5 | 9454491222              | AG2705    |

  Scenario: SMA unsuccessfully attempts to create a Member
    When an SMA with username "ME01" and password "pass1234" tries to create a Member
    Then they should not be authorised and error message thrown

  Scenario: MA unsuccessfully attempts to create a Member
    When an MA with username "ME0101" and password "pass1234" tries to create a Member
    Then they must not be authorised and error message thrown

  Scenario Outline: Agent user  successfully sets credit settings for a new Member
    When Agent user sets the following credit limits "<creditlimit>" for a new Member
    Then Member must be created and the user gets "<response>" message
    Examples:
      | creditlimit | response |
      | 5000       | Success  |

  Scenario Outline: Unsuccessful attempt by Agent to create a Member with invalid credit limits
    When Agent user attempts to set the following credit limits "<creditlimit>" for a new Member
    Then the operation to create a Member should fail and error "<errorcode>" returned
    Examples:
      | creditlimit | errorcode |
      |             | AG2401    |
      | 65.890      | AG2402    |
      | 7777777     | AG2410    |

  Scenario Outline: Agent user successfully sets bet settings for a new agent
    When Agent user sets the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a new Member
    Then Member must be created and the user gets "<response>" message
    Examples:
      | minbet | maxbet | maxpermatch | response |
      | 400    | 700    | 12000       | Success  |

  Scenario Outline: Unsuccessful attempt by Agent to create member with invalid bet settings
    When  Agent  attempts to set the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a new Member
    Then the operation to create a Member should fail and error "<errorcode>" returned
    Examples:
      | minbet | maxbet | maxpermatch | errorcode |
      |        | 700    | 12000       | AG2501    |
      | -100   | 700    | 12000       | AG2502    |
      | 400    |        | 12000       | AG2503    |
      | 400    | -100   | 12000       | AG2504    |
      | 400    | 299    | 12000       | AG2507    |
      | 400    | 10001  | 12000       | AG2510    |
  Scenario Outline: Agent user successfully sets position settings for a new agent
    When Agent user sets the following Member position takings "<agentposition>" for "<member>"
    Then Member must be created and the user gets "<response>" message
    Examples:
      | member      | agentposition | response |
      | ME010101M22 | 40            | Success  |
      | ME010101M23 | 30            | Success  |

  Scenario Outline: Unsuccessful attempt by Agent to create Member with invalid position settings
    When Agent user attempts to create Member with the following position settings "<agentposition>"
    Then the operation to create a Member should fail and error "<errorcode>" returned
    Examples:
      | agentposition | errorcode |
      |               | AG2101    |
      | 40.66         | AG2102    |
      | -40.66        | AG2102    |
      | 80            | AG2107    |

  Scenario: Tear down test data for member management
    When I delete data for member management scenarios from database
    Then the database should not contain the data that was deleted