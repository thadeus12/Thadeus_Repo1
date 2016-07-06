 Java Spring maven,cucumber and Selenium Webdriver automated  Test flamework
--------------------------------------------------------------------------------

To run this project :
=====================

 In any ide: click on Runner class

command line:  mvn clean verify -DCucumber.options=" --tags @smoke-test"

To Change browser type:
=======================

Go to the runner class  junit @Beforeclass
And change Driver.driver(" chrome ")parameters

Reports :
=========
When tests fail or pass
Maven failsafe-plugin takes screen shots and keeps them in this location "target/cucumber"


For more help see the Apache  maven failsafe plugin documentation
