@feature @membersite @betplacement
Feature: The member can update an order

  Scenario Outline: A member changes the size of the bet.
    Given clear bets for user "<username>"
    Given set betfair bet place response with status SUCCESS and id <betfairId>
    When a member with username "<username>" and password "<password>" logs in
    And  places bets "<bets>"
    And  set betfair bet cancel response with status <betfairOrderStatus> and id <betfairId>
    And  set betfair bet place response with status <betfairOrderStatus> and id <newBetBetFairId>
    And  call update bet for bet id <betfairId> set price <price> and stake <stake>
    Then all bet parameters should remain same for "<newBetBetFairId>" whereas "<price>" and "<stake>" should be updated

    Examples:

      | username    | password | bets                             | betfairOrderStatus | betfairId |newBetBetFairId | price | stake |
      | AA010101M01 | pass1234 | 1,1.122694969,1096,0,1.77,5,45,0 | SUCCESS            | 0         | 13             | 10.000| 6.000 |
