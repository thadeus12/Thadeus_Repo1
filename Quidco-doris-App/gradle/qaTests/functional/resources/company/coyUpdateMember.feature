@feature @coyupdatemember
Feature: Editing Member
  As COY User or Agent
  I would like to be able to Edit Member
  So I can setup their business structure

  Scenario: Setup test data for member management
    When I insert data for member management scenarios to database
    Then the test data should be available in the database

  Scenario: Coy successfully edits a member's basic details
    When COY with username "admin.user" and password "pass1234" edits a member and enters the following details "ME010101M01","pass1234","JAM","Tomas","089787767" and "ACTIVE"
    Then the details of the member should be updated and the user gets "Success" message

  Scenario Outline: COY unsuccessfully tries to edit Member
    When COY with username "<coyusername>" and password "<coypassword>" attempts to edit a member with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the operation to edit a member should fail and error "<errorcode>" returned
    Examples:
      | coyusername | coypassword | username    | password | status | firstname                           | lastname                            | contactnum              | errorcode |
      | admin.user  | pass1234    | ME010101M01 | null     | REST   | james1                              | bond                                | 0784545445              | AG2712    |
      | admin.user  | pass1234    | ME010101M01 | test@12  | ACTIVE | james3                              | bond                                | 0784545447              | AG2713    |
      | admin.user  | pass1234    | ME010101M01 | test12   |        | james5                              | bond                                | 0784545449              | AG2715    |
      | admin.user  | pass1234    | ME010101M01 | test12   | ACTIVE | james5                              | bond                                | 07845454497845454491222 | AG2706    |
      | admin.user  | pass1234    | ME010101M01 | test12   | ACTIVE | james5james5<html=tags>james5james5 | bond                                | 0784545449              | AG2704    |
      | admin.user  | pass1234    | ME010101M01 | test12   | ACTIVE | james5                              | james5james5<html=tags>james5james5 | 9454491222              | AG2705    |

  Scenario: COY user successfully edits credit settings for a member
    When COY user edits the following credit limits "50000" for a member
    Then the details of the member should be updated and the user gets "Success" message

  Scenario Outline: Unsuccessful attempt by Coy to edit a member with invalid credit limits
    When COY user attempts to edit the following credit limits "<creditlimit>" for a member
    Then the operation to edit a member should fail and error "<errorcode>" returned
    Examples:
      | creditlimit | errorcode |
      |             | AG2401    |
      | 65.890      | AG2402    |
      | 9999999     | AG2410    |
      | 7777777     | AG2411    |

  Scenario Outline: COY user successfully edits bet settings for a member
    When COY user edits following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a member
    Then the details of the member should be updated and the user gets "Success" message
    Examples:
      | minbet | maxbet | maxpermatch | response |
      | 400    | 700    | 0        | Success  |


  Scenario Outline: Unsuccessful attempt by Coy to edit agent with invalid bet settings
    When COY user attempts to edit the invalid bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a member
    Then the operation to edit a member should fail and error "<errorcode>" returned
    Examples:
      | minbet | maxbet | maxpermatch | errorcode |
      |        | 700    | 12000       | AG2501    |
      | -100   | 700    | 12000       | AG2502    |
      | 400    |        | 12000       | AG2503    |
      | 400    | -100   | 12000       | AG2504    |
      | 400    | 299    | 12000       | AG2507    |
      | 99     | 7000   | 12000       | AG2509    |
      | 400    | 10001  | 12000       | AG2510    |

  Scenario Outline: COY user successfully edits position settings for a member
    When COY user edits the following Member position takings "<agentposition>" for "<member>"
    Then the details of the member should be updated and the user gets "Success" message
    Examples:
      | member      | agentposition |
      | ME010101M01 | 10            |
      | ME010101M01 | 20            |

  Scenario Outline: Unsuccessful attempt by Coy to edit agent with invalid position settings
    When COY user attempts to edit a member with the following position settings "<agentposition>"
    Then the operation to edit a member should fail and error "<errorcode>" returned
    Examples:
      | agentposition | errorcode |
      |               | AG2101    |
      | 40.66         | AG2102    |
      | -40.66        | AG2102    |
      | 51            | AG2107    |

   Scenario: Tear down test data for member management
    When I delete data for member management scenarios from database
    Then the database should not contain the data that was deleted
