@feature @betplacement @apl-951
Feature: Available markets
  As a member
  I would like to place bets
  So I can win some prize

  Scenario Outline: A member successfully places multiple bets
    Given clear bets for user "<username>"
    When a member with username "<username>" and password "<password>" logs in
    When place the bet "<bets>" for selected events getting back the responses "<responses>"
    And the bet details is updated with the betfair id "<betfairids>"
    And the response contains "<status>" message
    And the available balance of the member is reduced by "<totalstake>"
    And the liability is increased by "<totalstake>"

    Examples:

      | username    | password | bets                                                              | totalstake | responses                     | status  | betfairids              |
      | AA010101M01 | pass1234 | 1,1.122694969,1097,0,1.77,5,45,0:1,1.122694969,1096,0,1.77,5,45,1 | 10         | multiOrderRequestTemplate     | SUCCESS | 61205608528,61205608529 |
      | AA010101M01 | pass1234 | 1,1.122694969,1096,0,1.77,5,45,0                                  | 5          | successfulBet3                | SUCCESS | 61205608530             |


  Scenario Outline: A member unsuccessfully places multiple bets
    Given clear bets for user "<username>"
    When a member with username "<username>" and password "<password>" logs in
    When place the bet "<bets>" for selected events getting back the responses "<responses>"
    And the response contains "<status>" message
    And the available balance of the member is reduced by "<totalstake>"
    And the liability is increased by "<totalstake>"

    Examples:

      | username    | password | bets                                                              | totalstake | responses                         | status  |
      | AA010101M01 | pass1234 | 1,1.122694969,1097,0,1.77,5,45,0:1,1.122694969,1096,0,1.77,5,45,1 | 0.00       | multiOrderRequestTemplate_failure | FAILURE |


  Scenario Outline: A member places multiple bets that partially succeed
    Given clear bets for user "<username>"
    When a member with username "<username>" and password "<password>" logs in
    And place the bet "<bets>" for selected events getting back the responses "<responses>"
    And the response contains confirmation message
    And the available balance of the member is reduced by "<totalstake>"
    And the liability is increased by "<totalstake>"

    Examples:
      | username    | password | bets                                                              | totalstake | responses                                         |
      | AA010101M01 | pass1234 | 1,1.122694969,1096,0,1.77,5,45,0:1,1.122694970,1090,0,1.77,5,45,1 | 5.00       | successfulBet1, multiOrderRequestTemplate_partial |
