@feature @coycreatesma
Feature: Creating Super Master Agent
  As COY User or SubUser
  I would like to be able to create SMA
  So I can setup business structure

  Scenario Outline: COY user or subuser successfully creates an SMA
    Given the following SMA basic information details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    When a COY with username "<coyusername>" and password "<coypassword>" creates an SMA
    Then the basic details of the SMA should be registered and COY user gets "<response>" message
    Examples:
      | coyusername | coypassword | username | password       | firstname | lastname | contactnum | status   | response |
      | admin.user  | pass1234    | SM01     | pass1234       | Apollo    | 57       | 911        | ACTIVE   | Success  |
      | user.01     | pass1234    | SM02     | pass1234       | Apollo    | 57b      | 911        | INACTIVE | Success  |
      | user.01     | pass1234    | SM03     | pass4567912345 |           |          |            | ACTIVE   | Success  |

  Scenario Outline: COY user or subuser fails to create an SMA
    When COY user attempts to create SMA with the following SMA basic information details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the operation should fail and error "<error>" returned
    Examples:
      | username | password         | firstname                         | lastname                          | contactnum             | status   | error  |
      |          | pass1234         | Apollo                            | 57                                | 911                    | ACTIVE   | AG2714 |
      | SM26     |                  | Apollo                            | 57b                               | 911                    | INACTIVE | AG2716 |
      | SM26     | pass456790123456 |                                   |                                   |                        | ACTIVE   | AG2713 |
      | SM26     | pass456%9012345$ |                                   |                                   |                        | ACTIVE   | AG2713 |
      | SM26     | pass4            |                                   |                                   |                        | ACTIVE   | AG2713 |
      | SM26     | 123456789012345  |                                   |                                   |                        | ACTIVE   | AG2713 |
      | SM26     | abcdefghijklmno  |                                   |                                   |                        | ACTIVE   | AG2713 |
      | AA01     | pass1234         | Apollo                            | 57                                | 911                    | ACTIVE   | AG2703 |
      | SM26XX   | pass1234         | Apollo                            | 57                                | 911                    | ACTIVE   | AG2707 |
      | SM26     | pass1234         | 123456789012345678901234567890123 | 57                                | 911                    | ACTIVE   | AG2704 |
      | SM26     | pass1234         |                                   | 123456789012345678901234567890123 | 911                    | ACTIVE   | AG2705 |
      | SM26     | pass1234         |                                   |                                   | 1234567890123456789012 | ACTIVE   | AG2706 |

  Scenario Outline: COY user or subuser successfully sets credit settings for a new SMA
    When COY user sets the following credit limits "<creditlimit>","<mamaxcredit>" and "<membermaxcredit>" for a new SMA called "<username>"
    Then the limits should be set successfully and COY user gets "<errorcode>" message

    Examples:
      | username | creditlimit | mamaxcredit | membermaxcredit | errorcode |
      | SM04     | 1000000     | 999999      | 999998          | Success   |

  Scenario Outline: Unsuccessful attempt by Coy to create SMA with invalid credit limits
    When COY user attempts to set the following credit limits "<creditlimit>","<mamaxcredit>" and "<membermaxcredit>" for a new SMA
    Then the operation should fail and error "<errorcode>" returned

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

  Scenario Outline: COY user or subuser successfully sets bet settings for a new SMA
    When COY user sets the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a new SMA called "<username>"
    Then the bet settings should be set successfully and COY user gets "<errorcode>" message

    Examples:
      | username | minbet | maxbet | maxpermatch | errorcode |
      | SM05     | 10     | 100    | 100         | Success   |
      | SM06     | 10     | 100    | 0           | Success   |
      | SM07     | 10     | 0      |             | Success   |


  Scenario Outline: Unsuccessful attempt by Coy to create SMA with invalid bet settings
    When COY user attempts to set the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a new SMA
    Then the operation should fail and error "<errorcode>" returned

    Examples:
      | minbet | maxbet | maxpermatch | errorcode |
      |        | 10     | 5           | AG2501    |
      | -100   | 10     | 5           | AG2502    |
      | 1      |        | 5           | AG2503    |
      | 10     | -100   | 5           | AG2504    |
      | 10     | 5      | 2           | AG2507    |


  Scenario Outline: COY user or subuser successfully sets position settings for a new SMA
    When COY user sets the following position limit "<smamaxposition>" for a new SMA called "<username>"
    Then the position settings should be set successfully and COY user gets "<errorcode>" message

    Examples:
      | username | smamaxposition | errorcode |
      | SM08     | 60             | Success   |
      | SM09     | 70             | Success   |
      | SM10     | 0              | Success   |
      | SM11     | 5              | Success   |


  Scenario Outline: Unsuccessful attempt by Coy to create SMA with invalid position settings
    When COY user attempts to set the following position settings "<smamaxposition>" for a new SMA
    Then the operation should fail and error "<errorcode>" returned

    Examples:
      | smamaxposition | errorcode |
      |                | AG2103    |
      | 81             | AG2104    |
      | 78.77          | AG2104    |
      | -77            | AG2104    |

  Scenario Outline: COY user or subuser successfully sets commission settings for a new SMA
    When COY user sets the following commission settings "<membercommission>","<smacommission>" for a new SMA called "<username>"
    Then the commission settings should be set successfully and COY user gets "<errorcode>" message

    Examples:
      | username | membercommission | smacommission | errorcode |
      | SM12     | 2                | 0             | Success   |
      | SM13     | 2                | 0             | Success   |

  Scenario Outline: Unsuccessful attempt by Coy to create SMA with invalid commission settings
    When COY user attempts to set the following commission settings "<membercommission>","<smacommission>" for a new SMA
    Then the operation should fail and error "<errorcode>" returned

    Examples:
      | membercommission | smacommission | errorcode |
      |                  | 5             | AG2302    |
      | 12               | 10            | AG2301    |
      | -5               | 5             | AG2301    |
      | 5.5897           | 5             | AG2301    |


  Scenario: Tear down test data for create SMA
    When I delete data for create SMA scenarios from database
    Then the database should not contain the data that was deleted