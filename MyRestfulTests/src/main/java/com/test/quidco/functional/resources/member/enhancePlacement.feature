@feature @membersite @betplacement
Feature: Available markets
  As a member
  I would like to place bets
  So I can win some prize

  Scenario Outline: A member successfully places multiple bets
    When a member with username "<username>" and password "<password>" logs in
    And place the bet "<bets>" for selected events getting back the responses "<response1>"
    And the bet details is updated with the betfair id "61205608528,61205608529"
    And the response contains "<status>" message
    And the available balance of the member is reduced by "<totalstake>"
    And the liability is increased by "<totalstake>"
    And the number of bets successfully placed is "<betcount>"
    Examples:


      | username    | password | bets                                                              | totalstake | response1                 | status  |betcount|
      | AA010101M01 | pass1234 | 1,1.122694969,1097,0,1.77,5,45,0:1,1.122694969,1096,0,1.77,5,45,1 | 10         | multiOrderRequestTemplate | SUCCESS |2       |




