
@complete
Feature: Ordered Number Test

  Scenario: Display Numbers in ascending order

    Given The Ordered Number Test File renders

    When The order button is clicked

    Then The Numbers rendered under the order button should be displayed in ascending order