@QP-153
Feature: Micro service
  As a  signed quidco member
  I should be able to find merchants using search terms

  Scenario Outline: A member successfully searches

    Given I enter a "<Search term>" on the rest url

    Then I should get back these events merchantId "<MerchantId>" in search results response

    And I should get back these events exactMatch "<ExactMatch>" in search results response
    And I should see similar merchant"<SimilarMerchantID>" returned

    Examples:
      | Search term | MerchantId | ExactMatch |SimilarMerchantID|
      | Amaz        | 4412       | Amazon     |     109         |
      | Amazon      | 4412       | Amazon     |                 |
      | Arg         | 3035       | Argos      |                 |
      | Argos       | 3035       | Argos      |                 |




