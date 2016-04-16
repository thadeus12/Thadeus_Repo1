@feature @QP-153
Feature: Micro service
  As a  signed quidco member
  I should be able to find merchants using search terms

  Scenario: A member successfully searches
    Given I enter a search term on the rest url
      | search term |
      | Amaz        |
    Then I should get back these events in search results response
      | MostRelevant | MerchantId | ExactMatch | bestMatch |
      |              | 4412       |            |           |


