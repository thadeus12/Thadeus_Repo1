$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotelsearch.feature");
formatter.feature({
  "line": 2,
  "name": "Hotel search feature",
  "description": "\r\nAs a user i want to search for hotels",
  "id": "hotel-search-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test12"
    }
  ]
});
formatter.scenarioOutline({
  "line": 21,
  "name": "",
  "description": "",
  "id": "hotel-search-feature;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@complete"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I am on the smith hotel site \"https://www.mrandmrssmith.com/beta\"",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I click on opt out link",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I enter my destination \"\u003cDestination\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I enter my checkin date \"\u003cCheckIn Date\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter my checkout date \"\u003cCheckOut Date\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on the \"search\" button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I should see result for \"\u003cCountry\u003e\" and \"\u003cDestination\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I should see hotels Rates from price",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on the book now button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I should be on get a room tab",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I should see rate per night and total cost of stay",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on book it button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I should see who is sleeping in the room Popup",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I enter \"1\" as number of \"adults staying in the room",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 36,
      "value": "# And I enter \"1\" as number of children staying in the room"
    },
    {
      "line": 37,
      "value": "# And I enter \"1\" as number of Infants staying in the room"
    },
    {
      "line": 38,
      "value": "# And I select \"8\" as age of child staying from dropdown"
    },
    {
      "line": 39,
      "value": "# And I select \"2\" as the age of Infant from dropdown"
    },
    {
      "line": 40,
      "value": "# Then I should click on next  button for a room with extas"
    }
  ],
  "line": 41,
  "name": "I click on confirm button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I should see signin as  returning or continue as new customer Popup",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 43,
      "value": "# And I click on continue as new customer"
    }
  ],
  "line": 44,
  "name": "I sign in a returning customer",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I should be on smithcollections booking step two",
  "keyword": "Then "
});
formatter.examples({
  "line": 48,
  "name": "",
  "description": "",
  "id": "hotel-search-feature;;",
  "rows": [
    {
      "cells": [
        "CheckIn Date",
        "CheckOut Date",
        "Country",
        "Destination"
      ],
      "line": 49,
      "id": "hotel-search-feature;;;1"
    },
    {
      "cells": [
        "20-11-2015",
        "23-11-2015",
        "France",
        "Paris"
      ],
      "line": 50,
      "id": "hotel-search-feature;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 681937,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "",
  "description": "",
  "id": "hotel-search-feature;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test12"
    },
    {
      "line": 20,
      "name": "@complete"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I am on the smith hotel site \"https://www.mrandmrssmith.com/beta\"",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I click on opt out link",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I enter my destination \"Paris\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I enter my checkin date \"20-11-2015\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter my checkout date \"23-11-2015\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on the \"search\" button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I should see result for \"France\" and \"Paris\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I should see hotels Rates from price",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on the book now button",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I should be on get a room tab",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I should see rate per night and total cost of stay",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on book it button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I should see who is sleeping in the room Popup",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I enter \"1\" as number of \"adults staying in the room",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 36,
      "value": "# And I enter \"1\" as number of children staying in the room"
    },
    {
      "line": 37,
      "value": "# And I enter \"1\" as number of Infants staying in the room"
    },
    {
      "line": 38,
      "value": "# And I select \"8\" as age of child staying from dropdown"
    },
    {
      "line": 39,
      "value": "# And I select \"2\" as the age of Infant from dropdown"
    },
    {
      "line": 40,
      "value": "# Then I should click on next  button for a room with extas"
    }
  ],
  "line": 41,
  "name": "I click on confirm button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I should see signin as  returning or continue as new customer Popup",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 43,
      "value": "# And I click on continue as new customer"
    }
  ],
  "line": 44,
  "name": "I sign in a returning customer",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I should be on smithcollections booking step two",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.mrandmrssmith.com/beta",
      "offset": 30
    }
  ],
  "location": "HotelSearch_sd.i_am_on_the_smith_hotel_site(String)"
});
formatter.result({
  "duration": 4187705871,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch_sd.i_click_on_opt_out_link()"
});
formatter.result({
  "duration": 5745331500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Paris",
      "offset": 24
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_destination(String)"
});
formatter.result({
  "duration": 13342799668,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20-11-2015",
      "offset": 25
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkin_date(String)"
});
formatter.result({
  "duration": 2005121936,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23-11-2015",
      "offset": 26
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkout_date(String)"
});
formatter.result({
  "duration": 2135948260,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "search",
      "offset": 16
    }
  ],
  "location": "HotelSearch_sd.i_click_on_the_button(String)"
});
formatter.result({
  "duration": 4991667375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "France",
      "offset": 25
    },
    {
      "val": "Paris",
      "offset": 38
    }
  ],
  "location": "HotelSearch_sd.i_should_see_result_for_and(String,String)"
});
formatter.result({
  "duration": 35474841618,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch_sd.i_should_see_hotels_Rates_from_price()"
});
formatter.result({
  "duration": 1140489181,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch_sd.i_click_on_the_book_now_button()"
});
formatter.result({
  "duration": 961232823,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch_sd.i_should_be_on_get_a_room_tab()"
});
formatter.result({
  "duration": 16454253522,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch_sd.i_should_see_rate_per_night_and_total_cost_of_stay()"
});
formatter.result({
  "duration": 2269031930,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch_sd.i_click_on_book_it_button()"
});
formatter.result({
  "duration": 2394983206,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch_sd.i_should_see_who_is_sleeping_in_the_room_Popup()"
});
formatter.result({
  "duration": 1090271058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 9
    }
  ],
  "location": "HotelSearch_sd.i_enter_as_number_of_adults_staying_in_the_room(String)"
});
formatter.result({
  "duration": 1933525446,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch_sd.i_click_on_confirm_button()"
});
formatter.result({
  "duration": 1711098972,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch_sd.i_should_see_signin_as_returning_or_continue_as_new_customer_Popup()"
});
formatter.result({
  "duration": 63193497770,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 60 seconds waiting for com.test.smith.utility.Driver$1@2555fff0\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.153.42\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: driver.version: Driver\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:259)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)\r\n\tat com.test.smith.utility.Driver.waitForElementDisplay(Driver.java:51)\r\n\tat com.test.smith.page.SearchPage.validateNewReturningCustomerPopUp(SearchPage.java:315)\r\n\tat com.test.smith.page_sd.HotelSearch_sd.i_should_see_signin_as_returning_or_continue_as_new_customer_Popup(HotelSearch_sd.java:148)\r\n\tat ✽.Then I should see signin as  returning or continue as new customer Popup(hotelsearch.feature:42)\r\nCaused by: org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .half\u003ep\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.153.42\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: driver.version: Driver\r\n\tat com.test.smith.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.smith.utility.SmithHotelFireFoxDriver.findElementByCssSelector(SmithHotelFireFoxDriver.java:32)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:425)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:59)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:37)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat com.test.smith.utility.Driver$1.apply(Driver.java:55)\r\n\tat com.test.smith.utility.Driver$1.apply(Driver.java:51)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\tat com.test.smith.utility.Driver.waitForElementDisplay(Driver.java:51)\r\n\tat com.test.smith.page.SearchPage.validateNewReturningCustomerPopUp(SearchPage.java:315)\r\n\tat com.test.smith.page_sd.HotelSearch_sd.i_should_see_signin_as_returning_or_continue_as_new_customer_Popup(HotelSearch_sd.java:148)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:78)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:212)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:68)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:140)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HotelSearch_sd.i_sign_in_a_returning_customer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelSearch_sd.i_should_be_on_smithcollections_booking_step_two()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 6570813346,
  "status": "passed"
});
});