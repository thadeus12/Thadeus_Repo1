@feature @updatemember
Feature: Editing Member
  As COY User or Agent
  I would like to be able to Edit Member
  So I can setup their business structure

  Scenario: Setup test data for member management
    When I insert data for member management scenarios to database
    Then the test data should be available in the database

  Scenario: Agent successfully edits members basic details
    When an agent with username "ME010101" and password "pass1234" updates a member with the following details "ME010101M01","pass1234","mark","tomas","078787678A" and "ACTIVE"
    Then the details of the member should be updated and the user gets "Success" message

  Scenario Outline: Agent unsuccessfully tries to edit Member
    When an agent with username "<agentusername>" and password "<agentpassword>" attempts to edit a member with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then operation to edit a member should fail and error "<errorcode>" returned
    Examples:
      | agentusername | agentpassword | username    | password | status | firstname                           | lastname                            | contactnum              | errorcode |
      | ME010101      | pass1234      | ME010101M01 | null     | REST   | james1                              | bond                                | 0784545445              | AG2712    |
      | ME010101      | pass1234      | ME010101M01 | test@12  | ACTIVE | james3                              | bond                                | 0784545447              | AG2713    |
      | ME010101      | pass1234      | ME010101M01 | test12   |        | james5                              | bond                                | 0784545449              | AG2715    |
      | ME010101      | pass1234      | ME010101M01 | test12   | ACTIVE | james5                              | bond                                | 07845454497845454491222 | AG2706    |
      | ME010101      | pass1234      | ME010101M01 | test12   | ACTIVE | james5james5<html=tags>james5james5 | bond                                | 0784545449              | AG2704    |
      | ME010101      | pass1234      | ME010101M01 | test12   | ACTIVE | james5                              | james5james5<html=tags>james5james5 | 9454491222              | AG2705    |


  Scenario: SMA unsuccessfully attempts to update a member
    When an SMA with username "AM01" and password "pass1234" tries to update a member
    Then they should not be authorised and error message should be thrown


  Scenario: MA unsuccessfully attempts to update a member
    When an MA with username "AM0101" and password "pass1234" tries to update a member
    Then they must not be authorised and error message should be thrown

  Scenario: Agent user  successfully edits credit settings for a member
    When Agent user edits the following credit limits "40000" for a member
    Then the details of the member should be updated and the user gets "Success" message

  Scenario Outline: Unsuccessful attempt by Agent to edit a member with invalid credit limits
    When Agent user attempts to edit the following credit limits "<creditlimit>" for a member
    Then operation to edit a member should fail and error "<errorcode>" returned
    Examples:
      | creditlimit | errorcode |
      |             | AG2401    |
      | 65.890      | AG2402    |
      | 7777777     | AG2410    |
      | 7777777      | AG2411    |

  Scenario Outline: Agent user successfully edits bet settings for an agent
    When Agent user edits the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a member
    Then the details of the member should be updated and the user gets "Success" message
    Examples:
      | minbet | maxbet | maxpermatch |
      | 400    | 700    | 0       |

  Scenario Outline: Unsuccessful attempt by Agent to edits member with invalid bet settings
    When  Agent attempts to edits the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a member
    Then operation to edit a member should fail and error "<errorcode>" returned
    Examples:
      | minbet | maxbet | maxpermatch | errorcode |
      |        | 700    | 12000       | AG2501    |
      | -100   | 700    | 12000       | AG2502    |
      | 400    |        | 12000       | AG2503    |
      | 400    | -100   | 12000       | AG2504    |
      | 400    | 299    | 12000       | AG2507    |
      | 99     | 7000   | 12000       | AG2509    |
      | 400    | 10001  | 12000       | AG2510    |


  Scenario Outline: Agent user successfully edits position settings for a member
    When Agent user edits the following Member position takings "<agentposition>" for "<member>"
    Then the details of the member should be updated and the user gets "Success" message
    Examples:
      | member      | agentposition |
      | ME010101M01 | 11            |
      | ME010101M01 | 19            |

  Scenario Outline: Unsuccessful attempt by Agent to edit Member with invalid position settings
    When Agent user attempts to edit a member with the following position settings "<agentposition>"
    Then operation to edit a member should fail and error "<errorcode>" returned
    Examples:
      | agentposition | errorcode |
      |               | AG2101    |
      | 40.66         | AG2102    |
      | -40.66        | AG2102    |
      | 80            | AG2107    |

  Scenario: Tear down test data for member management
    When I delete data for member management scenarios from database
    Then the database should not contain the data that was deleted
