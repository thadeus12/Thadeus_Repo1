
@login

Feature: As member of daily mail plus I should be able to login with email and password


  Scenario:
    Given I go to "https://www.dailymailplus.co.uk/"
    When I click on the myaccount button
    And I enter my username and password
    And I click on the submit button
    Then I should be logged in to my Account

