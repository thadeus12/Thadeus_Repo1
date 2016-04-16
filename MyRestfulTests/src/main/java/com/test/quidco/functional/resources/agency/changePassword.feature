@feature @changepassword
Feature: change own password
  As COY User
  I would like to be able to change my own password
  So I can have my own password

  Scenario: Setup test data for change password
    When I insert data for change password scenarios to database
    Then the test data should be available in the database

  Scenario Outline: User unsuccessfully update password
    When a "<site>" user logs in with a valid username "<username>", password "<password>" and tries to update his password to "<newPassword>"
    Then the user should get response "<expectedResponse>"
    Examples:
      | username | password | newPassword      | expectedResponse | site   |
      | AA01     | pass1234 |                  | AG2716           | agency |
      | AA01     | pass1234 | pass456790123456 | AG2713           | agency |
      | AA01     | pass1234 | pass456%9012345$ | AG2713           | agency |
      | AA01     | pass1234 | pass4            | AG2713           | agency |
      | AA01     | pass1234 | 123456789012345  | AG2713           | agency |
      | AA01     | pass1234 | abcdefghijklmno  | AG2713           | agency |

  Scenario Outline: User successfully update password
    When a "<site>" user logs in with a valid username "<username>", password "<password>" and tries to update his password to "<newPassword>"
    Then the user should get response "<expectedResponse>"
    Examples:
      | username | password | newPassword | expectedResponse | site   |
      | AA01     | pass1234 | pass5678    | 0                | agency |

  Scenario: Tear down test data for change password
    When I delete data for change password scenarios from database
    Then the database should not contain the data that was deleted