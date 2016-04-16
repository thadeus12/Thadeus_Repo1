@feature @coyupdatesma
Feature: Updating agents
  As COY, SMA, MA or Agent user or subuser
  I would like to be able to edit my downline
  So I can their account up to date

  Scenario: Setup test data for update SMA
    When I insert data for update SMA scenarios to database
    Then the test data should be available in the database

  Scenario Outline: COY user or subuser successfully edits an SMA
    When COY with username "<coyusername>" and password "<coypassword>" edits an SMA and enters the following details "<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the SMA details should be updated and the user gets "<response>" message
    Examples:
      | coyusername | coypassword | password  | status | firstname | lastname | contactnum | response |
      | admin.user  | pass1234    | null      | ACTIVE | mark      | tomas    | 078787678  | Success  |
      | admin.user  | pass1234    | pass12345 | ACTIVE |           | tomas    |            | Success  |
      | admin.user  | pass1234    | pass12345 | ACTIVE | mark      | tomas    | 078787678  | Success  |

  Scenario Outline: COY or subuser of COY unsuccessfully tries to edit SMA basic details
    When COY with username "<coyusername>" and password "<coypassword>" attempts to edit an SMA with the following details "<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the operation to edit an SMA should fail and error "<errorcode>" returned
    Examples:
      | coyusername | coypassword | password | status | firstname                           | lastname                            | contactnum              | errorcode |
      | admin.user  | pass1234    | null     | REST   | james1                              | bond                                | 0784545445              | AG2712    |
      | admin.user  | pass1234    | test@12  | ACTIVE | james3                              | bond                                | 0784545447              | AG2713    |
      | admin.user  | pass1234    | test12   |        | james5                              | bond                                | 0784545449              | AG2715    |
      | admin.user  | pass1234    | test12   | ACTIVE | james5                              | bond                                | 07845454497845454491222 | AG2706    |
      | admin.user  | pass1234    | test12   | ACTIVE | james5james5<html=tags>james5james5 | bond                                | 0784545449              | AG2704    |
      | admin.user  | pass1234    | test12   | ACTIVE | james5                              | james5james5<html=tags>james5james5 | 9454491222              | AG2705    |

  Scenario Outline: COY user or subuser successfully updates position settings for an SMA
    When COY user updates the following position limits "<smamaxposition>" for an SMA
    Then the SMA details should be updated and the user gets "<response>" message

    Examples:
      | smamaxposition | response |
      | 60             | Success  |
      | 70             | Success  |

  Scenario Outline: Unsuccessful attempt by Coy to edit SMA with invalid position settings
    When COY user attempts to update the following position settings "<smamaxposition>" for an SMA
    Then the operation to edit an SMA should fail and error "<errorcode>" returned

    Examples:
      | smamaxposition | errorcode |
      |                | AG2103    |
      | 81             | AG2104    |
      | 78.77          | AG2104    |
      | -77            | AG2104    |

  Scenario Outline: COY user or subuser successfully updates bet settings for an SMA
    When COY user edits the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for an SMA
    Then the SMA details should be updated and the user gets "<response>" message

    Examples:
      | minbet | maxbet | maxpermatch | response |
      | 10     | 10000  | 14000       | Success  |
      | 10     | 10000  | 0           | Success  |
      | 10     | 0      | 0           | Success  |

  Scenario Outline: Unsuccessful attempt by Coy to update SMA with invalid bet settings
    When COY user attempts to edit the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for an SMA
    Then the operation to edit an SMA should fail and error "<errorcode>" returned

    Examples:
      | minbet | maxbet | maxpermatch | errorcode |
      |        | 10     | 5           | AG2501    |
      | -100   | 10     | 5           | AG2502    |
      | 1      |        | 5           | AG2503    |
      | 10     | -100   | 5           | AG2504    |
      | 10     | 5      | 2           | AG2507    |


  Scenario Outline: COY user or subuser successfully updates credit settings for a new SMA
    When COY user updates the following credit limits "<creditlimit>","<mamaxcredit>" and "<membermaxcredit>" for an SMA
    Then the SMA details should be updated and the user gets "<response>" message

    Examples:
      | creditlimit | mamaxcredit | membermaxcredit | response |
      | 1000000     | 999999      | 999998          | Success  |

  Scenario Outline: Unsuccessful attempt by Coy to update SMA with invalid credit limits
    When COY user attempts to updates the following credit limits "<creditlimit>","<mamaxcredit>" and "<membermaxcredit>" for an SMA
    Then the operation to edit an SMA should fail and error "<errorcode>" returned

    Examples:
      | creditlimit  | mamaxcredit | membermaxcredit | errorcode |
      | -2222        | 0           | 0               | AG2402    |
      | 999999999999 | 0           | 0               | AG2402    |
      | 89.8958      | 0           | 0               | AG2402    |
      | 0            | -5555       | 0               | AG2405    |
      | 0            | 555.55      | 0               | AG2405    |
      | 5555         | 2222        | -666            | AG2409    |
      | 5555         | 2222        | 77.78           | AG2409    |
      | 5555         | 7777        | 15999           | AG2414    |
      | 0            | 7777        | 0               | AG2418    |
      | 0            | 5555        | 15999           | AG2414    |
      | 20000        | 0           | 15999           | AG2414    |
      | 45000        | 55555       | 89857           | AG2414    |
      | 10000        | 15999       | 0               | AG2418    |

  Scenario Outline: Unsuccessful attempt by Coy to update SMA with invalid bet settings
    When COY user attempts to reduce SMA bet settings as follows "<minbet>","<maxbet>" and "<maxpermatch>"
    Then the operation to edit an SMA should fail and error "<errorcode>" returned

    Examples:
      | minbet | maxbet | maxpermatch | errorcode |
      | 300    | 10000  | 14000       | AG2512    |
      | 100    | 6000   | 14000       | AG2513    |


  Scenario Outline: Unsuccessful attempt by Coy to update SMA with invalid credit limits
    When COY user attempts to reduce SMA credit limits as follows "<creditlimit>","<mamaxcredit>" and "<membermaxcredit>"
    Then the operation to edit an SMA should fail and error "<errorcode>" returned

    Examples:
      | creditlimit | mamaxcredit | membermaxcredit | errorcode |
      | 500000      | 199999      | 100000          | AG2420    |
      | 500000      | 400000      | 139999          | AG2423    |
      | 199999      | 140000      | 130000          | AG2424    |


  Scenario Outline: Unsuccessful attempt by Coy to edit SMA with invalid position settings
    When COY user attempts to reduce SMA position settings as follows "<smamaxposition>"
    Then the operation to edit an SMA should fail and error "<errorcode>" returned

    Examples:
      | smamaxposition | errorcode |
      | 40             | AG2106    |

  Scenario: Tear down test data for update SMA
    When I delete data for update SMA scenarios from database
    Then the database should not contain the data that was deleted