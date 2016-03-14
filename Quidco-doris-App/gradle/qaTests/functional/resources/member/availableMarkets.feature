@feature @availablemarkets
Feature: Available markets
  As a member
  I would like to be able to list all available whitelisted markets
  So I can decide which sports to bet on

  Scenario Outline: A member views all events available in Betfair Exchange
    When a member views available markets for event type "<eventtype>"
    Then they should see white listed markets
    Examples:
      | eventtype |
      | 1         |
      | 2         |
      | 4         |
