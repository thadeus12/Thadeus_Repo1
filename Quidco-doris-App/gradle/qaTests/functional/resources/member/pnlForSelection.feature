@feature @pnlselection
Feature: View Member Profit and Loss
  As a member
  I would like to view my profit and loss for selection


  Scenario Outline: A member views a selection of unsettled bets
    When a member "<username>" views selection "<eventid>"
    Then they should see the following PnL "<pnl>"
    Examples:
      |username| eventid |pnl|
    |AA010101M01|6.123455678|1.91,-2.25,-2.25|

