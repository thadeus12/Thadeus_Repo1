@feature @createagent
Feature: Creating Master Agent
  As COY User
  I would like to be able to create Agent
  So I can setup their business structure

  Scenario: Setup test data for create Agent
    When I insert data for agent management scenarios to database
    Then the test data should be available in the database

  Scenario Outline: Master Agent successfully creates an Agent
    When a "<site>" user with username "<mausername>" and password "<mapassword>" creates an Agent with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the Agent should be created and the user gets "<response>" message
    And the new Agent should get "<response>" response when they login to managersite

    Examples:
      |site|mausername |mapassword |username |password |status|firstname|lastname|contactnum |response|
      |agency|AM0101     |pass1234   |AM010104 |pass1234 |ACTIVE|mark     |tomas   |078787678  |Success |
      |agency|AM0101     |pass1234   |AM010105 |pass1234 |ACTIVE|mark     |        |           |Success |
      |agency|AM0101     |pass1234   |AM010106 |pass1234 |ACTIVE|         |        |078787678  |Success |

  Scenario Outline: MA unsuccessfully tries to create Agent
    When an MA with username "<mausername>" and password "<mapassword>" attempts to create an Agent with the following details "<username>","<password>","<firstname>","<lastname>","<contactnum>" and "<status>"
    Then the operation to create an Agent should fail and error "<errorcode>" returned
    Examples:
      |mausername |mapassword |username |password|status |firstname                           |lastname |contactnum |errorcode|
      |AM0101     |pass1234   |AM010101 |test12  |ACTIVE |james2                              |bond     |0784545446 |AG2703   |
      |AM0101     |pass1234   |$#%?     |test12  |ACTIVE |james                               |bond     |0784545444 |AG2707   |
      |AM0101     |pass1234   |AM01155  |test12  |ACTIVE |james                               |bond     |0784545444 |AG2707   |
      |AM0101     |pass1234   |ZZZC0108 |test12  |ACTIVE |james                               |bond     |0784545444 |AG2707   |
      |AM0101     |pass1234   |AM010108 |Test12  |REST   |james1                              |bond     |0784545445 |AG2712   |
      |AM0101     |pass1234   |         |test12  |ACTIVE |james5                              |bond     |0784545449 |AG2714   |
      |AM0101     |pass1234   |AM010108 |test@12 |ACTIVE |james3                              |bond     |0784545447 |AG2713   |
      |AM0101     |pass1234   |AM010108 |        |ACTIVE |james4                              |bond     |0784545448 |AG2716   |
      |AM0101     |pass1234   |AM010108 |test12  |       |james5                              |bond     |0784545449 |AG2715   |
      |AM0101     |pass1234   |         |test12  |ACTIVE |james5                              |bond     |0784545449 |AG2714   |
      |AM0101     |pass1234   |AM010108 |test12  |ACTIVE |james5                              |bond     |07845454497845454491222 |AG2706   |
      |AM0101     |pass1234   |AM010108 |test12  |ACTIVE |james5james5<html=tags>james5james5 |bond     |0784545449 |AG2704   |
      |AM0101     |pass1234   |AM010108 |test12  |ACTIVE |james5                              |james5james5<html=tags>james5james5    |9454491222 |AG2705   |

  Scenario: SMA unsuccessfully attempts to create an Agent
    When an SMA with username "AM01" and password "pass1234" tries to create an Agent
    Then they will not be authorised and error message thrown

  Scenario Outline: MA user  successfully sets credit settings for a new Agent
    When MA user sets the following credit limits "<creditlimit>","<membermaxcredit>" for a new Agent
    Then the Agent should be created and the user gets "<response>" message
    Examples:
      |creditlimit |membermaxcredit |response|
      |130000      |110000          |Success  |

  Scenario Outline: Unsuccessful attempt by MA to create an agent with invalid credit limits
    When MA user attempts to set the following credit limits "<creditlimit>","<membermaxcredit>" for a new agent
    Then the operation to create an Agent should fail and error "<errorcode>" returned
    Examples:
      |creditlimit |membermaxcredit|errorcode  |
      |            |110000         |AG2401     |
      |89.8958     |110000         |AG2402     |
      |130000      |               |AG2408     |
      |130000      |1100.34        |AG2409     |
      |130000      |140000         |AG2416     |

  Scenario Outline: MA user successfully sets bet settings for a new agent
    When MA user sets the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a new agent
    Then the Agent should be created and the user gets "<response>" message
    Examples:
      |minbet|maxbet|maxpermatch|response|
      |300   |7000  |12000      |Success |

  Scenario Outline: Unsuccessful attempt by MA to create agent with invalid bet settings
    When  MA  attempts to set the following bet settings "<minbet>","<maxbet>" and "<maxpermatch>" for a new agent
    Then the operation to create an Agent should fail and error "<errorcode>" returned
    Examples:
      |minbet |maxbet |maxpermatch|errorcode|
      |       | 7000  |12000      |AG2501   |
      |-100   | 7000  |12000      |AG2502   |
      |300    |       |12000      |AG2503   |
      |300    | -100  |12000      |AG2504   |
      |300    |299    |12000      |AG2507   |
      |99     |7000   |12000      |AG2509   |
      |300    |10001  |12000      |AG2510   |
      |300    |0      |           |AG2510   |

  Scenario Outline: MA user successfully sets position settings for a new agent
    When MA user sets the following Agent position takings "<maposition>" and "<agentmaxposition>" for "<agent>"
    Then the Agent should be created and the user gets "<response>" message
    Examples:
      |agent   |maposition |agentmaxposition|response|
      |AM010116|10         |40              |Success  |
      |AM010117|0          |50              |Success  |


  Scenario Outline: Unsuccessful attempt by MA to create agent with invalid position settings
    When MA user attempts to create an agent with the following position settings "<maposition>" and "<agentmaxposition>"
    Then the operation to create an Agent should fail and error "<errorcode>" returned
    Examples:
      |maposition |agentmaxposition|errorcode|
      |           |40              |AG2101   |
      |10.11      |40              |AG2102   |
      |-50        |40              |AG2102   |
      |10         |                |AG2103   |
      |10         |50.55           |AG2104   |
      |10         |-50             |AG2104   |
      |10         |60              |AG2105   |

  Scenario: Tear down test data for create Agent
    When I delete data for agent management scenarios from database
    Then the database should not contain the data that was deleted