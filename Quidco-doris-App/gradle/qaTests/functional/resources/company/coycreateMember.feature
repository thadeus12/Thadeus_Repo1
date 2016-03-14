@feature @coycreatemember
Feature: Creating Member
  As COY User or Agent
  I would like to be able to create Member
  So I can setup their business structure

  Scenario: Setup test data for member management
    When I insert data for member management scenarios to database
    Then the test data should be available in the database

  Scenario Outline: COY user successfully creates a Member
    When COY with username "<coyusername>" and password "<coypassword>" creates a Member with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then Member should be created and the user gets "<response>" message
    Examples:
      | coyusername | coypassword | username    | password | status | firstname | lastname | contactnum | response |
      | admin.user  | pass1234    | ME010101M02 | pass1234 | ACTIVE | mark      | tomas    | 078787678  | Success  |
      | admin.user  | pass1234    | ME010101M03 | pass1234 | ACTIVE | mark      |          |            | Success  |
      | admin.user  | pass1234    | ME010101M04 | pass1234 | ACTIVE |           |          | 078787678  | Success  |

  Scenario Outline: COY unsuccessfully tries to create Member
    When COY with username "<coyusername>" and password "<coypassword>" attempts to create a Member with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the operation to create a Member should fail and error "<errorcode>" returned
    Examples:
      | coyusername | coypassword | username    | password | status | firstname                           | lastname                            | contactnum              | errorcode |
      | admin.user  | pass1234    | ME010101M02 | test12   | ACTIVE | james2                              | bond                                | 0784545446              | AG2703    |
      | admin.user  | pass1234    | $#%?        | test12   | ACTIVE | james                               | bond                                | 0784545444              | AG2707    |
      | admin.user  | pass1234    | ME010101M09 | Test12   | REST   | james1                              | bond                                | 0784545445              | AG2712    |
      | admin.user  | pass1234    |             | test12   | ACTIVE | james5                              | bond                                | 0784545449              | AG2714    |
      | admin.user  | pass1234    | ME010101M09 | test@12  | ACTIVE | james3                              | bond                                | 0784545447              | AG2713    |
      | admin.user  | pass1234    | ME010101M09 |          | ACTIVE | james4                              | bond                                | 0784545448              | AG2716    |
      | admin.user  | pass1234    | ME010101M09 | test12   |        | james5                              | bond                                | 0784545449              | AG2715    |
      | admin.user  | pass1234    | ME010101M09 | test12   | ACTIVE | james5                              | bond                                | 07845454497845454491222 | AG2706    |
      | admin.user  | pass1234    | ME010101M09 | test12   | ACTIVE | james5james5<html=tags>james5james5 | bond                                | 0784545449              | AG2704    |
      | admin.user  | pass1234    | ME010101M09 | test12   | ACTIVE | james5                              | james5james5<html=tags>james5james5 | 9454491222              | AG2705    |


  Scenario Outline: COY user successfully sets credit settings for a new Member
    When COY user sets the following credit limits "<creditlimit>" for a new Member
    Then Member must be created and the user gets "<response>" message
    Examples:
      | creditlimit | response |
      | 75000       | Success  |

  Scenario Outline: Unsuccessful attempt by Coy to create a Member with invalid credit limits
    When COY user attempts to set the following credit limits "<creditlimit>" for a new Member
    Then the operation to create a Member should fail and error "<errorcode>" returned
    Examples:
      | creditlimit | errorcode |
      |             | AG2401    |
      | 65.890      | AG2402    |
      | 9999999     | AG2410    |

  Scenario Outline: COY user successfully sets bet settings for a new Member
    When COY user sets following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a new Member
    Then Member must be created and the user gets "<response>" message
    Examples:
      | minbet | maxbet | maxpermatch | response |
      | 400    | 700    | 12000       | Success  |

  Scenario Outline: Unsuccessful attempt by Coy to create agent with invalid bet settings
    When COY user attempts to set the invalid bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a new Member
    Then the operation to create a Member should fail and error "<errorcode>" returned
    Examples:
      | minbet | maxbet | maxpermatch | errorcode |
      |        | 700    | 12000       | AG2501    |
      | -100   | 700    | 12000       | AG2502    |
      | 400    |        | 12000       | AG2503    |
      | 400    | -100   | 12000       | AG2504    |
      | 400    | 299    | 12000       | AG2507    |
      | 99     | 7000   | 12000       | AG2509    |
      | 400    | 10001  | 12000       | AG2510    |

  Scenario Outline: COY user successfully sets position settings for a new Member
    When COY user sets the following Member position takings "<agentposition>" for "<member>"
    Then Member must be created and the user gets "<response>" message
    Examples:
      | member      | agentposition | response |
      | ME010101M20 | 10            | Success  |
      | ME010101M21 | 40            | Success  |

  Scenario Outline: Unsuccessful attempt by Coy to create agent with invalid position settings
    When COY user attempts to create Member with the following position settings "<agentposition>"
    Then the operation to create a Member should fail and error "<errorcode>" returned
    Examples:
      | agentposition | errorcode |
      |               | AG2101    |
      | 40.66         | AG2102    |
      | -40.66        | AG2102    |
      | 51            | AG2107    |

  Scenario: Tear down test data for member management
    When I delete data for member management scenarios from database
    Then the database should not contain the data that was deleted