@feature @updateagent
Feature: Editing Agent
  As COY or MA
  I would like to be able to edit an Agent
  So that I can setup their account up to date

   Scenario: Setup test data for update Agent
    When I insert data for agent management scenarios to database
    Then the test data should be available in the database

  Scenario: MA successfully edits an Agent's basic details
    When an MA with username "AM0101" and password "pass1234" updates an Agent with the following details "AM010101","pass1234","mark","tomas","078787678A" and "ACTIVE"
    Then the Agent details should be updated and the user gets "Success" message


  Scenario Outline: MA unsuccessfully tries to edit an Agent's basic details
    When an MA username "<mausername>" and password "<mapassword>" attempts to upudate an Agent with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the operation to edit an Agent should fail and error "<errorcode>" returned
    Examples:
      | mausername | mapassword | username | password | status | firstname                           | lastname                            | contactnum              | errorcode |
      | AM0101     | pass1234   | AM010101 | Test12   | REST   | james1                              | bond                                | 0784545445              | AG2712    |
      | AM0101     | pass1234   | AM010101 | test@12  | ACTIVE | james3                              | bond                                | 0784545447              | AG2713    |
      | AM0101     | pass1234   | AM010101 | test12   |        | james5                              | bond                                | 0784545449              | AG2715    |
      | AM0101     | pass1234   | AM010101 | test12   | ACTIVE | james5                              | bond                                | 07845454497845454491222 | AG2706    |
      | AM0101     | pass1234   | AM010101 | test12   | ACTIVE | james5james5<html=tags>james5james5 | bond                                | 0784545449              | AG2704    |
      | AM0101     | pass1234   | AM010101 | test12   | ACTIVE | james5                              | james5james5<html=tags>james5james5 | 9454491222              | AG2705    |

  Scenario: SMA unsuccessfully attempts to edit an Agent
    When SMA with username "AM01" and password "pass1234" tries to edit an Agent
    Then they should be not be authorised and error message thrown

  Scenario: MA successfully edits credit settings for an Agent
    When MA user edit the following credit limits "95000","85000" for an Agent
    Then the Agent details should be updated and the user gets "Success" message

  Scenario Outline: Unsuccessful attempt by MA to edit an agent with invalid credit limits
    When MA user attempts to edit the following credit limits "<creditlimit>","<membermaxcredit>" for an agent
    Then the operation to edit an Agent should fail and error "<errorcode>" returned
    Examples:
      | creditlimit | membermaxcredit | errorcode |
      |             | 555555          | AG2401    |
      | 66666.66    | 555555          | AG2402    |
      | 666666      |                 | AG2408    |
      | 666666      | 55555.55        | AG2409    |
      | 444444      | 555555          | AG2416    |

  Scenario: MA user successfully edits bet settings for a  agent
    When MA user edits the following bet settings "300","800" and "13000" for an agent
    Then the Agent details should be updated and the user gets "Success" message

  Scenario Outline: Unsuccessful attempt by MA to edit agent with invalid bet settings
    When  MA  attempts to edit the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for an agent
    Then the operation to edit an Agent should fail and error "<errorcode>" returned
    Examples:
      | minbet | maxbet | maxpermatch | errorcode |
      |        | 800    | 13000       | AG2501    |
      | -100   | 800    | 13000       | AG2502    |
      | 300    |        | 13000       | AG2503    |
      | 300    | -100   | 13000       | AG2504    |
      | 300    | 299    | 13000       | AG2507    |
      | 99     | 800    | 13000       | AG2509    |
      | 300    | 10001  | 13000       | AG2510    |
      | 300    | 0      | 0           | AG2510    |

  Scenario Outline: MA user successfully edits position settings for an agent
    When MA user edits the following Agent position takings "<maposition>" and "<agentmaxposition>" for "<agent>"
    Then the Agent details should be updated and the user gets "<response>" message
    Examples:
      | agent    | maposition | agentmaxposition | response |
      | AM010101 | 10         | 30               | Success  |
      | AM010101 | 0          | 40               | Success  |

  Scenario Outline: Unsuccessful attempt by MA to edit an agent with invalid position settings
    When MA user attempts to edit an agent with the following position settings "<maposition>" and "<agentmaxposition>"
    Then the operation to edit an Agent should fail and error "<errorcode>" returned
    Examples:
      | maposition | agentmaxposition | errorcode |
      |            | 40               | AG2101    |
      | 10.11      | 40               | AG2102    |
      | -50        | 40               | AG2102    |
      | 10         |                  | AG2103    |
      | 10         | 50.55            | AG2104    |
      | 10         | -50              | AG2104    |
      | 10         | 60               | AG2105    |

  Scenario: Tear down test data for create Agent
    When I delete data for agent management scenarios from database
    Then the database should not contain the data that was deleted