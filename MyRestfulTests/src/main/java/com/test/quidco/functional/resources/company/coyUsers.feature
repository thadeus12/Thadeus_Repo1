@feature @coysubusers
Feature: List the Coy Users
  As COY User
  Given the proper access rights
  I would like to be able to view my sub users
  So I can manage them

  Scenario Outline: View Coy subuser
    When Coy user with "<username>", "<password>" queries their subusers
    Then Coy should see the following "<subusers>" subusers for usercode "<ownerid>"
    Examples:
      | username   | password | ownerid    | subusers                                      |
      | admin.user | pass1234 | admin.user | [user.01, user.02, user.03, user.04, user.05] |
      | user.01    | pass1234 | admin.user | [user.01, user.02, user.03, user.04, user.05] |


  Scenario Outline: Attempt by Coy to view subusers with invalid token
    When Unauthorized COY user attempts to view subusers with invalid or missing token "<token>"
    Then the Coy should receive error "403"
    Examples:
      | token              |
      | xyxyxyxyyxyxyyxyxy |
      |                    |
