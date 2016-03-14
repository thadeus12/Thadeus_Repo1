@feature @coyupdateagent
Feature: Editing Agent
  As COY or MA
  I would like to be able to edit an Agent
  So that I can setup their account up to date

   Scenario: Setup test data for update Agent
    When I insert data for agent management scenarios to database
    Then the test data should be available in the database

  Scenario: Coy successfully edits an Agent's basic details
    When COY with username "admin.user" and password "pass1234" edits an Agent and enters the following details "AM010101","pass1234","JAM","Tomas","089787767" and "ACTIVE"
    Then the Agent details should be updated and the user gets "Success" message

  Scenario Outline: Coy unsuccessfully tries to edit an Agent's basic details
    When Coy with username "<coyusername>" and password "<coypassword>" attempts to edit an Agent with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the operation to edit an Agent should fail and error "<errorcode>" returned
    Examples:
      | coyusername | coypassword | username | password | status | firstname                           | lastname                            | contactnum              | errorcode |
      | admin.user  | pass1234    | AM010101 | null     | REST   | james1                              | bond                                | 0784545445              | AG2712    |
      | admin.user  | pass1234    | AM010101 | test@12  | ACTIVE | james3                              | bond                                | 0784545447              | AG2713    |
      | admin.user  | pass1234    | AM010101 | test12   |        | james5                              | bond                                | 0784545449              | AG2715    |
      | admin.user  | pass1234    | AM010101 | test12   | ACTIVE | james5                              | bond                                | 07845454497845454491222 | AG2706    |
      | admin.user  | pass1234    | AM010101 | test12   | ACTIVE | james5james5<html=tags>james5james5 | bond                                | 0784545449              | AG2704    |
      | admin.user  | pass1234    | AM010101 | test12   | ACTIVE | james5                              | james5james5<html=tags>james5james5 | 9454491222              | AG2705    |

  Scenario: COY user successfully edits the credit settings for an Agent
    When COY  edits the following credit limits "95000","85000" for an Agent
    Then the Agent details should be updated and the user gets "Success" message


  Scenario Outline: Unsuccessful attempt by Coy to edit an agent with invalid credit limits
    When COY user attempts to edit the following credit limits "<creditlimit>","<membermaxcredit>" for an agent
    Then the operation to edit an Agent should fail and error "<errorcode>" returned
    Examples:
      | creditlimit | membermaxcredit | errorcode |
      |             | 555555          | AG2401    |
      | 66666.66    | 555555          | AG2402    |
      | 666666      |                 | AG2408    |
      | 666666      | 55555.55        | AG2409    |
      | 444444      | 555555          | AG2416    |

  Scenario: COY user successfully edits bet settings for an agent
    When COY user edits the following bet settings "300","800" and "13000" for an agent
    Then the Agent details should be updated and the user gets "Success" message


  Scenario Outline: Unsuccessful attempt by Coy to edit agent with invalid bet settings
    When COY user attempts to edit the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for an agent
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

  Scenario Outline: COY user successfully edits position settings for an agent
    When COY user edits the following Agent position takings "<maposition>" and "<agentmaxposition>"
    Then the Agent details should be updated and the user gets "<response>" message
    Examples:
      | maposition | agentmaxposition | response |
      | 10         | 40               | Success  |
      | 0          | 50               | Success  |

  Scenario Outline: Unsuccessful attempt by Coy to edit an agent with invalid position settings
    When COY user attempts to edit an agent with the following position settings "<maposition>" and "<agentmaxposition>"
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