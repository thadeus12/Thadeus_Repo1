

Feature: buy smith vouchers

Background:  log in to mms
Given I am on "https://www.mrandmrssmith.com/"
  When I click on the loginIcon
  And  I login and as existing member
  Then I should be logged in

  Scenario:
    Given I click on the ShopTab
    Then I should be on the mrandmrssmith page
    And I click on giftVouchers link
    And I click on "Gift Vouchers" Link
    And I select gift card for "200"
    And I click add to basket button








