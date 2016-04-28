$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resource/SmithPartnerBooking.feature");
formatter.feature({
  "comments": [
    {
      "line": 2,
      "value": "#@smoke-test"
    }
  ],
  "line": 3,
  "name": "Hotel search feature",
  "description": "\r\nSearching and booking as an existing customer",
  "id": "hotel-search-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "",
  "description": "",
  "id": "hotel-search-feature;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on the smith hotel site \"http://test2.smithcollections.com/uk/conde-nast/search\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter my destination \"\u003cDestination\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter my checkin date \"\u003cCheckIn Date\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter my checkout date \"\u003cCheckOut Date\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on the \"search\" button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see result for \" \u003cCountry\u003e \" and \" \u003cDestination\u003e \"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 13,
      "value": "# And I should see hotels Rates from price"
    }
  ],
  "line": 14,
  "name": "I click on the book now button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should \"Select a room\" on the hotel page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I click on book it button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see who is sleeping in the room Popup",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I enter \"1\" as number of \"adults staying in the room",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click confirm button to add room to the basket",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on confirm booking button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should be on Enter details payment page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I select currency type as \"USD\" from card type dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should see hotel address displayed",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "should see booking cancellation policy and additional charges",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#And I check my booking summary details"
    }
  ],
  "line": 26,
  "name": "I enter First name as \"Thadeus\" and last name as \"Bule\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I enter email address as \"thadeus@smithhotels.com\" and phone number as \"02097655552\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select my country as \"United Kindgom\" from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I enter my Address line one as \"Running waters\" And line two address as \"Wicklow\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I enter my postcode as \"KA2 9DP\" and town as \"Kent\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter gift card or voucher code as \"ABgs12K\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I select card type as \"VISA\" from card type dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter card number as \"4111111111111111\" and name on card as \"Buke\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I select card expiry month as \"08\" and year \"2018\" from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I enter card CVV as \"087\" in cvv field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I checkbox to agree to booking terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I should see deposit to pay now displayed on page",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I click on the make Payment button",
  "keyword": "And "
});
formatter.examples({
  "line": 42,
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
      "line": 43,
      "id": "hotel-search-feature;;;1"
    },
    {
      "cells": [
        "20-03-2016",
        "23-03-2016",
        "United States",
        "New York City"
      ],
      "line": 44,
      "id": "hotel-search-feature;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 231713,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "",
  "description": "",
  "id": "hotel-search-feature;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on the smith hotel site \"http://test2.smithcollections.com/uk/conde-nast/search\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter my destination \"New York City\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter my checkin date \"20-03-2016\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter my checkout date \"23-03-2016\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on the \"search\" button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see result for \" United States \" and \" New York City \"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 13,
      "value": "# And I should see hotels Rates from price"
    }
  ],
  "line": 14,
  "name": "I click on the book now button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should \"Select a room\" on the hotel page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I click on book it button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should see who is sleeping in the room Popup",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I enter \"1\" as number of \"adults staying in the room",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click confirm button to add room to the basket",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on confirm booking button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should be on Enter details payment page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I select currency type as \"USD\" from card type dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should see hotel address displayed",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "should see booking cancellation policy and additional charges",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#And I check my booking summary details"
    }
  ],
  "line": 26,
  "name": "I enter First name as \"Thadeus\" and last name as \"Bule\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I enter email address as \"thadeus@smithhotels.com\" and phone number as \"02097655552\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I select my country as \"United Kindgom\" from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I enter my Address line one as \"Running waters\" And line two address as \"Wicklow\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I enter my postcode as \"KA2 9DP\" and town as \"Kent\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter gift card or voucher code as \"ABgs12K\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I select card type as \"VISA\" from card type dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter card number as \"4111111111111111\" and name on card as \"Buke\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I select card expiry month as \"08\" and year \"2018\" from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I enter card CVV as \"087\" in cvv field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I checkbox to agree to booking terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I should see deposit to pay now displayed on page",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I click on the make Payment button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://test2.smithcollections.com/uk/conde-nast/search",
      "offset": 30
    }
  ],
  "location": "SmithPartner_SD.i_am_on_the_smith_hotel_site(String)"
});
formatter.result({
  "duration": 7130184196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York City",
      "offset": 24
    }
  ],
  "location": "SmithPartner_SD.i_enter_my_destination(String)"
});
formatter.result({
  "duration": 103378527,
  "error_message": "java.lang.RuntimeException: Unable to load Sizzle.js from classpath (non recoverable so propagating as RuntimeException\r\n\tat com.partner.test.helper.SizzleSelector.getAmdHackSizzle(SizzleSelector.java:99)\r\n\tat com.partner.test.helper.SizzleSelector.injectSizzle(SizzleSelector.java:80)\r\n\tat com.partner.test.helper.SizzleSelector.injectSizzleIfNeeded(SizzleSelector.java:61)\r\n\tat com.partner.test.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:36)\r\n\tat com.partner.test.utility.SmithHotelFireFoxDriver.findElementByCssSelector(SmithHotelFireFoxDriver.java:34)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat com.partner.test.utility.Driver$1.apply(Driver.java:51)\r\n\tat com.partner.test.utility.Driver$1.apply(Driver.java:48)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:209)\r\n\tat com.partner.test.utility.Driver.waitForElementDisplay(Driver.java:48)\r\n\tat com.partner.test.pages.SmithPartnerBookingPage.enterHotelDestination(SmithPartnerBookingPage.java:227)\r\n\tat com.partner.test.step_def.SmithPartner_SD.i_enter_my_destination(SmithPartner_SD.java:27)\r\n\tat ✽.When I enter my destination \"New York City\"(src/test/Resource/SmithPartnerBooking.feature:8)\r\nCaused by: java.io.FileNotFoundException: class path resource [sizzle.js] cannot be opened because it does not exist\r\n\tat org.springframework.core.io.ClassPathResource.getInputStream(ClassPathResource.java:157)\r\n\tat com.partner.test.helper.SizzleSelector.getResourceContents(SizzleSelector.java:110)\r\n\tat com.partner.test.helper.SizzleSelector.readClasspathFile(SizzleSelector.java:104)\r\n\tat com.partner.test.helper.SizzleSelector.getAmdHackSizzle(SizzleSelector.java:96)\r\n\tat com.partner.test.helper.SizzleSelector.injectSizzle(SizzleSelector.java:80)\r\n\tat com.partner.test.helper.SizzleSelector.injectSizzleIfNeeded(SizzleSelector.java:61)\r\n\tat com.partner.test.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:36)\r\n\tat com.partner.test.utility.SmithHotelFireFoxDriver.findElementByCssSelector(SmithHotelFireFoxDriver.java:34)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat com.partner.test.utility.Driver$1.apply(Driver.java:51)\r\n\tat com.partner.test.utility.Driver$1.apply(Driver.java:48)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:209)\r\n\tat com.partner.test.utility.Driver.waitForElementDisplay(Driver.java:48)\r\n\tat com.partner.test.pages.SmithPartnerBookingPage.enterHotelDestination(SmithPartnerBookingPage.java:227)\r\n\tat com.partner.test.step_def.SmithPartner_SD.i_enter_my_destination(SmithPartner_SD.java:27)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:234)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:74)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "20-03-2016",
      "offset": 25
    }
  ],
  "location": "SmithPartner_SD.i_enter_my_checkin_date(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "23-03-2016",
      "offset": 26
    }
  ],
  "location": "SmithPartner_SD.i_enter_my_checkout_date(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "search",
      "offset": 16
    }
  ],
  "location": "SmithPartner_SD.i_click_on_the_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": " United States ",
      "offset": 25
    },
    {
      "val": " New York City ",
      "offset": 47
    }
  ],
  "location": "SmithPartner_SD.i_should_see_result_for_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SmithPartner_SD.i_click_on_the_book_now_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Select a room",
      "offset": 10
    }
  ],
  "location": "HotelPage_sd.i_should_on_the_hotel_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelPage_sd.i_click_on_book_it_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelPage_sd.i_should_see_who_is_sleeping_in_the_room_Popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 9
    }
  ],
  "location": "HotelPage_sd.i_enter_as_number_of_adults_staying_in_the_room(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelPage_sd.i_click_confirm_button_to_add_room_to_the_basket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelPage_sd.i_click_on_confirm_booking_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PaymentPage_sd.i_should_be_on_Enter_details_payment_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "USD",
      "offset": 27
    }
  ],
  "location": "PaymentPage_sd.i_select_currency_type_as_from_card_type_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PaymentPage_sd.i_should_see_hotel_address_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PaymentPage_sd.should_see_booking_cancellation_policy_and_additional_charges()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Thadeus",
      "offset": 23
    },
    {
      "val": "Bule",
      "offset": 50
    }
  ],
  "location": "PaymentPage_sd.i_enter_First_name_as_and_last_name_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "thadeus@smithhotels.com",
      "offset": 26
    },
    {
      "val": "02097655552",
      "offset": 72
    }
  ],
  "location": "PaymentPage_sd.i_enter_email_address_as_and_phone_number_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "United Kindgom",
      "offset": 24
    }
  ],
  "location": "PaymentPage_sd.i_select_my_country_as_from_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Running waters",
      "offset": 32
    },
    {
      "val": "Wicklow",
      "offset": 73
    }
  ],
  "location": "PaymentPage_sd.i_enter_my_Address_line_one_as_And_line_two_address_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "KA2 9DP",
      "offset": 24
    },
    {
      "val": "Kent",
      "offset": 46
    }
  ],
  "location": "PaymentPage_sd.i_enter_my_postcode_as_and_town_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ABgs12K",
      "offset": 38
    }
  ],
  "location": "PaymentPage_sd.i_enter_gift_card_or_voucher_code_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "VISA",
      "offset": 23
    }
  ],
  "location": "PaymentPage_sd.i_select_card_type_as_from_card_type_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4111111111111111",
      "offset": 24
    },
    {
      "val": "Buke",
      "offset": 63
    }
  ],
  "location": "PaymentPage_sd.i_enter_card_number_as_and_name_on_card_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "08",
      "offset": 31
    },
    {
      "val": "2018",
      "offset": 45
    }
  ],
  "location": "PaymentPage_sd.i_select_card_expiry_month_as_and_year_from_dropdown(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "087",
      "offset": 21
    }
  ],
  "location": "PaymentPage_sd.i_enter_card_CVV_as_in_cvv_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PaymentPage_sd.i_checkbox_to_agree_to_booking_terms_and_conditions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PaymentPage_sd.i_should_see_deposit_to_pay_now_displayed_on_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PaymentPage_sd.i_click_on_the_make_Payment_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3683842098,
  "status": "passed"
});
});