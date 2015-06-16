Feature: Testing the login to dailymailplus application
  
  As daily mail plus account holder I should be able to login with my email and password

  Scenario: Login to Myaccount
    When I go to "baseurl" on "firefox browser"
    Given I click on "Myaccount" menu bar
    And I enter "MyemailAddress" as "dmgtesters2+2@gmail.com"
    And I enter "Mypassword" as "Technical01"
    And I click on the "login" button
    Then I should be successfully "logged in"
