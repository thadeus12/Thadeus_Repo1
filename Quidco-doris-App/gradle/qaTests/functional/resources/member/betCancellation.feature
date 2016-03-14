@feature @betcancellation
Feature: Available markets
  As a member
  I would like to cancel unmatched bets
  So I can have back my money to place new bets

  Scenario Outline: A member cancels a bet
    When a member with username "<username>" and password "<password>" logs in
    And place the bet "<bet>" for selected events getting back the responses "successfulBet1"
    And the bet matched size is "0"
    And the available balance of the member is reduced by "<stake>"
    And the liability is increased by "<stake>"
    And they take note of the balance
    And they cancel the last placed bet getting back the response "<cancellationResponse>"
    Then the bet status is "<finalStatus>"
    And the available balance of the member is increased by "<refund>"
    And the liability is reduced by "<refund>"
    Examples:
      | username    | password | bet                              | stake | (cancelledSize) | refund | cancellationResponse     | finalStatus |
      | AA010101M01 | pass1234 | 1,1.122694969,1096,0,1.77,5,45,1 | 5     | 5               | 5      | cancelledBet             | 2           |
      | AA010101M01 | pass1234 | 1,1.122694969,1096,0,1.77,5,45,1 | 5     | 2               | 2      | partiallyCancelledBet    | 1           |
      | AA010101M01 | pass1234 | 1,1.122694969,1096,0,1.77,5,45,1 | 5     | 0               | 0      | unsuccessfulCancellation | 1           |

# the test related to the partially matched bet has to be modified later
# currently, we mock the betFair response with a sizeCancelled < size
# but the bet has not been matched, so, after the partial cancellation, sizeRemaining = size - sizeCancelled > 0
# and that's why the final status of the bet is still 1=UNSETTLED, and not 2=CANCELLED (there is still some remaining size)
# this scenario is not happening in live production. When a bet is cancelled, the final sizeRemaining should be always 0
# and partial cancellations only happen when bets are partially matched
# when we will have the way to test the matching process, we will be able to fix this scenario