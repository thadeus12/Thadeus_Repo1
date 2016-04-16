@feature  @unsettled_bets
Feature: Retrieve open orders

  Scenario Outline: Placed orders are unmatched
    Given clear bets for user "<username>"
    When log in with username "<username>" and password "<password>"
    And places bets "<bets>"
    And retrieve open bets for user "<username>"
    Then open bets "<attribute>" is "<value>"

    Examples:
      | username    | password | bets                                                              | attribute   | value     |
      | AA010101M01 | pass1234 | 1,1.122694969,1096,0,1.77,5,45,1:1,1.122694969,1097,0,1.80,5,45,1 | orderStatus | unmatched |


  Scenario Outline: Placed orders partially_matched
    Given clear bets for user "<username>"
    And log in with username "<username>" and password "<password>"
    And places bets "<bets>"
    And set bets attribute "<attribute>" to value "<value>"
    When retrieve open bets for user "<username>"
    Then open bets "<openBetAttr>" is "<openBetValue>"

    Examples:
      | username    | password | bets                                                              | attribute      | value | openBetAttr | openBetValue      |
      | AA010101M01 | pass1234 | 1,1.122694969,1096,0,1.80,5,45,1:1,1.122694969,1097,0,1.77,5,45,1 | size_remaining | 1.00  | orderStatus | partially_matched |


  Scenario Outline: Placed orders partially_matched
    Given clear bets for user "<username>"
    And log in with username "<username>" and password "<password>"
    And places bets "<bets>"
    And set bets attribute "<attribute>" to value "<value>"
    When retrieve open bets for user "<username>"
    Then open bets "<openBetAttr>" is "<openBetValue>"

    Examples:
      | username    | password | bets                                                              | attribute    | value | openBetAttr | openBetValue |
      | AA010101M01 | pass1234 | 1,1.122694969,1096,0,1.80,5,45,1:1,1.122694969,1097,0,1.77,5,45,1 | order_status | 1     | orderStatus | matched      |





