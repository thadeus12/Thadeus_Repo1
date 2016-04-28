$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("manualLineItem.feature");
formatter.feature({
  "line": 5,
  "name": "Manual booking",
  "description": "",
  "id": "manual-booking",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@smoke-test12"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "login to Tashh",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on \"http://test2.tashh.com/login\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter my username and password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://test2.tashh.com/login",
      "offset": 9
    }
  ],
  "location": "TashhLogin_sd.i_am_on(String)"
});
formatter.result({
  "duration": 2504740937,
  "status": "passed"
});
formatter.match({
  "location": "TashhLogin_sd.i_enter_my_username_and_password()"
});
formatter.result({
  "duration": 1494669517,
  "status": "passed"
});
formatter.match({
  "location": "TashhLogin_sd.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 4092648633,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#Then I should be logged in"
    }
  ],
  "line": 13,
  "name": "Given i am smith TTC I should be able to add a manual booking",
  "description": "",
  "id": "manual-booking;given-i-am-smith-ttc-i-should-be-able-to-add-a-manual-booking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I select \"Smith\" as Agent",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click on the search drop down and select \"Members\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter the Member name as \"Thadeus.Ssewanyana@smithhotels.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on the find members button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on the view link for searched member",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on the create enquiry button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should see a popup for  booking contact media type",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I select \"Email\"as booking contact media from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on the contact media submit button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select \"manual hotel\" from otherlineitem dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should see manual line item popup",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I enter Hotel name As \"The Opposite House\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter room name ase \"Studio 45\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select \"Invoice\" as contract type",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I enter check-in date as \"2016-03-21 14:04:46\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I enter \"2\" as number of nights",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I \"2\" as number of Adults staying",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter deposit policy as \"50% deposite need to confirm booking\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I select \"CNY\" from curreny provide dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter tax rate as \"15\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I select \"Gross minus commission\" as cost type",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I enter \"8000\" as gross",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 36,
      "value": "#And I tick includes tax check box"
    }
  ],
  "line": 37,
  "name": "I enter commission as \"1200\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I select \"Actual\" from commission dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I enter \"4000\" amount for the booking",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I select \"Actual\" from deposit dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I select \"China\" as hotel country",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click on add button",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I should see manual line item created successfully popup",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "I click back to enquiry link",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I should see equiry status as \"New\"",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "I select \"card\" the way to pay",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "payment popup appear with \" To pay\" amount",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "I select \"GBP\" as curreny from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "I select billing country as \"United Kingdom\"",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I enter billing \"addressline one\"",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I enter postCode as \"w4 5wp\"",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I select card type as \"VISA\"",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I enter card number as \"4111111111111111\"",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I enter on card as \"Thomas\"",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I select card expiry month and year as \"12\" and year as \"2017\"",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I enter card cvv number as \"341\"",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I should see message appear \"Payment processed successfully \" on popup",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "click on the pop close button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Smith",
      "offset": 10
    }
  ],
  "location": "TashhUserProfilePage_sd.i_select_as_Agent(String)"
});
formatter.result({
  "duration": 2206941837,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Members",
      "offset": 44
    }
  ],
  "location": "TashhUserProfilePage_sd.i_click_on_the_search_drop_down(String)"
});
formatter.result({
  "duration": 3259571698,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thadeus.Ssewanyana@smithhotels.com",
      "offset": 28
    }
  ],
  "location": "TashhUserProfilePage_sd.i_enter_the_Member_name_as(String)"
});
formatter.result({
  "duration": 614230510,
  "status": "passed"
});
formatter.match({
  "location": "TashhUserProfilePage_sd.i_click_on_the_find_members_button()"
});
formatter.result({
  "duration": 409524770,
  "status": "passed"
});
formatter.match({
  "location": "TashhUserProfilePage_sd.i_click_on_the_view_link_for_searched_member()"
});
formatter.result({
  "duration": 3580669986,
  "status": "passed"
});
formatter.match({
  "location": "TashhUserProfilePage_sd.i_click_on_the_create_enquiry_button()"
});
formatter.result({
  "duration": 18683152461,
  "status": "passed"
});
formatter.match({
  "location": "TashhUserProfilePage_sd.i_should_see_a_popup_for_booking_contact_media_type()"
});
formatter.result({
  "duration": 7006744955,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email",
      "offset": 10
    }
  ],
  "location": "TashhUserProfilePage_sd.i_select_as_booking_contact_media_from_dropdown(String)"
});
formatter.result({
  "duration": 560400291,
  "status": "passed"
});
formatter.match({
  "location": "TashhUserProfilePage_sd.i_click_on_the_contact_media_submit_button()"
});
formatter.result({
  "duration": 686519989,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "manual hotel",
      "offset": 10
    }
  ],
  "location": "ManualLineItem_sd.i_select_from_otherlineitem_dropdown(String)"
});
formatter.result({
  "duration": 1636017335,
  "status": "passed"
});
formatter.match({
  "location": "ManualLineItem_sd.i_should_see_manual_line_item_popup()"
});
formatter.result({
  "duration": 3473110738,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027manual\u0027]/div[1]/div[1]/label\"}\nCommand duration or timeout: 87 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027HP007\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: com.smith.tashh.cucumber.utility.SmithHotelFireFoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d37.0.2, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: bfab2e10-b2f4-4bf2-87ca-2f7fa568f48b\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027manual\u0027]/div[1]/div[1]/label}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:358)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:455)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:358)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.isDisplayed(Unknown Source)\r\n\tat com.smith.tashh.cucumber.pages.ManaulLineItemPage.validateManualLineItemPoppup(ManaulLineItemPage.java:92)\r\n\tat com.smith.tashh.cucumber.step_def.ManualLineItem_sd.i_should_see_manual_line_item_popup(ManualLineItem_sd.java:25)\r\n\tat ✽.Then I should see manual line item popup(manualLineItem.feature:24)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027manual\u0027]/div[1]/div[1]/label\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027HP007\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/Thadeuss/AppData/Local/Temp/anonymous5339427295399530804webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10299)\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///C:/Users/Thadeuss/AppData/Local/Temp/anonymous5339427295399530804webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10308)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/Thadeuss/AppData/Local/Temp/anonymous5339427295399530804webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12282)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/Thadeuss/AppData/Local/Temp/anonymous5339427295399530804webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12287)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/Thadeuss/AppData/Local/Temp/anonymous5339427295399530804webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12229)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "The Opposite House",
      "offset": 23
    }
  ],
  "location": "ManualLineItem_sd.i_enter_Hotel_name_As(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Studio 45",
      "offset": 23
    }
  ],
  "location": "ManualLineItem_sd.i_enter_room_name_ase(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Invoice",
      "offset": 10
    }
  ],
  "location": "ManualLineItem_sd.i_select_as_contract_type(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2016-03-21 14:04:46",
      "offset": 26
    }
  ],
  "location": "ManualLineItem_sd.i_enter_check_in_date_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 9
    }
  ],
  "location": "ManualLineItem_sd.i_enter_as_number_of_nights(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 3
    }
  ],
  "location": "ManualLineItem_sd.i_as_number_of_Adults_staying(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "50% deposite need to confirm booking",
      "offset": 27
    }
  ],
  "location": "ManualLineItem_sd.i_enter_deposit_policy_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CNY",
      "offset": 10
    }
  ],
  "location": "ManualLineItem_sd.i_select_from_curreny_provide_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 21
    }
  ],
  "location": "ManualLineItem_sd.i_enter_tax_rate_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Gross minus commission",
      "offset": 10
    }
  ],
  "location": "ManualLineItem_sd.i_select_as_cost_type(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "8000",
      "offset": 9
    }
  ],
  "location": "ManualLineItem_sd.i_enter_as_gross(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1200",
      "offset": 23
    }
  ],
  "location": "ManualLineItem_sd.i_enter_commission_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Actual",
      "offset": 10
    }
  ],
  "location": "ManualLineItem_sd.i_select_from_commission_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4000",
      "offset": 9
    }
  ],
  "location": "ManualLineItem_sd.i_enter_amount_for_the_booking(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Actual",
      "offset": 10
    }
  ],
  "location": "ManualLineItem_sd.i_select_from_deposit_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "China",
      "offset": 10
    }
  ],
  "location": "ManualLineItem_sd.i_select_as_hotel_country(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ManualLineItem_sd.i_click_on_add_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ManualLineItem_sd.i_should_see_manual_line_item_created_successfully_popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ManualLineItem_sd.i_click_back_to_enquiry_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "New",
      "offset": 31
    }
  ],
  "location": "ManualLineItem_sd.i_should_see_equiry_status_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "card",
      "offset": 10
    }
  ],
  "location": "AddPayment_SD.i_select_the_way_to_pay(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": " To pay",
      "offset": 27
    }
  ],
  "location": "AddPayment_SD.payment_popup_appear_with_amount(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "GBP",
      "offset": 10
    }
  ],
  "location": "AddPayment_SD.i_select_as_curreny_from_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "United Kingdom",
      "offset": 29
    }
  ],
  "location": "AddPayment_SD.i_select_billing_country_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "addressline one",
      "offset": 17
    }
  ],
  "location": "AddPayment_SD.i_enter_billing(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "w4 5wp",
      "offset": 21
    }
  ],
  "location": "AddPayment_SD.i_enter_postCode_as(String)"
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
  "location": "AddPayment_SD.i_select_card_type_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4111111111111111",
      "offset": 24
    }
  ],
  "location": "AddPayment_SD.i_enter_card_number_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Thomas",
      "offset": 20
    }
  ],
  "location": "AddPayment_SD.i_enter_on_card_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 40
    },
    {
      "val": "2017",
      "offset": 57
    }
  ],
  "location": "AddPayment_SD.i_select_card_expiry_month_and_year_as_and_year_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "341",
      "offset": 28
    }
  ],
  "location": "AddPayment_SD.i_enter_card_cvv_number_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddPayment_SD.i_click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Payment processed successfully ",
      "offset": 29
    }
  ],
  "location": "AddPayment_SD.i_should_see_message_appear_on_popup(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddPayment_SD.click_on_the_pop_close_button()"
});
formatter.result({
  "status": "skipped"
});
});