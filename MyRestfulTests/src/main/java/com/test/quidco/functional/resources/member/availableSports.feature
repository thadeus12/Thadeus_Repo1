@feature @availablesports
Feature: Available sports
  As a member
  I would like to be able to list all available sports
  So I can decide which sports to bet on

  Scenario: A member views all sports available in Betfair Exchange
    When a member views available sports
    Then they should see "[Cricket, Football, Tennis]" sports
