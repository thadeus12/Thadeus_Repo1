$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Inspiration.feature");
formatter.feature({
  "line": 3,
  "name": "search by Smith inspired hotels feature",
  "description": "\r\nAs a user i want to serach for hotels using the inspiration link",
  "id": "search-by-smith-inspired-hotels-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@smoke-test12"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "",
  "description": "",
  "id": "search-by-smith-inspired-hotels-feature;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I go \"https://www.mrandmrssmith.com/collections\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on the \"\u003cLinks\u003e\" link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I select \"\u003cCountry\u003e\" from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select destination \"\u003cDestination\u003e\" from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter my checkin date \"\u003cCheckIn Date\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter my checkout date \"\u003cCheckOut Date\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click to \"Check availability\" button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see result for \"\u003cCountry\u003e\" and \"\u003cDestination\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "search-by-smith-inspired-hotels-feature;;",
  "rows": [
    {
      "cells": [
        "Links",
        "CheckIn Date",
        "CheckOut Date",
        "Country",
        "Destination"
      ],
      "line": 19,
      "id": "search-by-smith-inspired-hotels-feature;;;1"
    },
    {
      "cells": [
        "Child-friendly",
        "20-08-2015",
        "23-08-2015",
        "France",
        "Paris"
      ],
      "line": 20,
      "id": "search-by-smith-inspired-hotels-feature;;;2"
    },
    {
      "cells": [
        "Go swimming",
        "20-08-2015",
        "23-08-2015",
        "United Kingdom",
        "London"
      ],
      "line": 21,
      "id": "search-by-smith-inspired-hotels-feature;;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 691630,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "",
  "description": "",
  "id": "search-by-smith-inspired-hotels-feature;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smoke-test12"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I go \"https://www.mrandmrssmith.com/collections\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on the \"Child-friendly\" link",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I select \"France\" from dropdown",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select destination \"Paris\" from dropdown",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter my checkin date \"20-08-2015\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter my checkout date \"23-08-2015\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click to \"Check availability\" button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see result for \"France\" and \"Paris\"",
  "matchedColumns": [
    3,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.mrandmrssmith.com/collections",
      "offset": 6
    }
  ],
  "location": "Inspiration_sd.i_go(String)"
});
formatter.result({
  "duration": 4800830412,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Child-friendly",
      "offset": 16
    }
  ],
  "location": "Inspiration_sd.i_click_on_the_link(String)"
});
formatter.result({
  "duration": 5109511371,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "France",
      "offset": 10
    }
  ],
  "location": "Inspiration_sd.i_select_from_dropdown(String)"
});
formatter.result({
  "duration": 5492406606,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Paris",
      "offset": 22
    }
  ],
  "location": "Inspiration_sd.i_select_destination_from_dropdown(String)"
});
formatter.result({
  "duration": 231229193,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20-08-2015",
      "offset": 25
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkin_date(String)"
});
formatter.result({
  "duration": 1637054282,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23-08-2015",
      "offset": 26
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkout_date(String)"
});
formatter.result({
  "duration": 1005106547,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Check availability",
      "offset": 12
    }
  ],
  "location": "Inspiration_sd.i_click_to_button(String)"
});
formatter.result({
  "duration": 2314784754,
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
  "duration": 464472266,
  "error_message": "java.lang.NumberFormatException: For input string: \"\"\r\n\tat java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)\r\n\tat java.lang.Integer.parseInt(Integer.java:592)\r\n\tat java.lang.Integer.parseInt(Integer.java:615)\r\n\tat com.test.smith.page.SearchPage.validateHotelDestination(SearchPage.java:78)\r\n\tat com.test.smith.page_sd.HotelSearch_sd.i_should_see_result_for_and(HotelSearch_sd.java:54)\r\n\tat ✽.Then I should see result for \"France\" and \"Paris\"(Inspiration.feature:16)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 381441842,
  "status": "passed"
});
formatter.before({
  "duration": 194432,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "",
  "description": "",
  "id": "search-by-smith-inspired-hotels-feature;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smoke-test12"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I go \"https://www.mrandmrssmith.com/collections\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on the \"Go swimming\" link",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I select \"United Kingdom\" from dropdown",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select destination \"London\" from dropdown",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter my checkin date \"20-08-2015\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter my checkout date \"23-08-2015\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click to \"Check availability\" button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see result for \"United Kingdom\" and \"London\"",
  "matchedColumns": [
    3,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.mrandmrssmith.com/collections",
      "offset": 6
    }
  ],
  "location": "Inspiration_sd.i_go(String)"
});
formatter.result({
  "duration": 2250721422,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Go swimming",
      "offset": 16
    }
  ],
  "location": "Inspiration_sd.i_click_on_the_link(String)"
});
formatter.result({
  "duration": 1572418488,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United Kingdom",
      "offset": 10
    }
  ],
  "location": "Inspiration_sd.i_select_from_dropdown(String)"
});
formatter.result({
  "duration": 369418990,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: #countryDropDown\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.smith.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.smith.utility.SmithhotelsChromeDriver.findElementByCssSelector(SmithhotelsChromeDriver.java:34)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:425)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat com.test.smith.page.InspirationPage.selectCountryDropdow(InspirationPage.java:32)\r\n\tat com.test.smith.page_sd.Inspiration_sd.i_select_from_dropdown(Inspiration_sd.java:36)\r\n\tat ✽.And I select \"United Kingdom\" from dropdown(Inspiration.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 22
    }
  ],
  "location": "Inspiration_sd.i_select_destination_from_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "20-08-2015",
      "offset": 25
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkin_date(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "23-08-2015",
      "offset": 26
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkout_date(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Check availability",
      "offset": 12
    }
  ],
  "location": "Inspiration_sd.i_click_to_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "United Kingdom",
      "offset": 25
    },
    {
      "val": "London",
      "offset": 46
    }
  ],
  "location": "HotelSearch_sd.i_should_see_result_for_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 434491544,
  "status": "passed"
});
formatter.uri("hotelsearch.feature");
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
  "line": 6,
  "name": "",
  "description": "",
  "id": "hotel-search-feature;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I am on the smith hotel site \"https://www.mrandmrssmith.com\"",
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
  "name": "I should see result for \"\u003cCountry\u003e\" and \"\u003cDestination\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
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
      "line": 15,
      "id": "hotel-search-feature;;;1"
    },
    {
      "cells": [
        "20-08-2015",
        "23-08-2015",
        "France",
        "Paris"
      ],
      "line": 16,
      "id": "hotel-search-feature;;;2"
    },
    {
      "cells": [
        "20-08-2015",
        "23-08-2015",
        "United Kingdom",
        "London"
      ],
      "line": 17,
      "id": "hotel-search-feature;;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 213248,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "",
  "description": "",
  "id": "hotel-search-feature;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test12"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the smith hotel site \"https://www.mrandmrssmith.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter my destination \"Paris\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter my checkin date \"20-08-2015\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter my checkout date \"23-08-2015\"",
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
  "name": "I should see result for \"France\" and \"Paris\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.mrandmrssmith.com",
      "offset": 30
    }
  ],
  "location": "HotelSearch_sd.i_am_on_the_smith_hotel_site(String)"
});
formatter.result({
  "duration": 237574743,
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
  "duration": 4106749412,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20-08-2015",
      "offset": 25
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkin_date(String)"
});
formatter.result({
  "duration": 334035798,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23-08-2015",
      "offset": 26
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkout_date(String)"
});
formatter.result({
  "duration": 773847706,
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
  "duration": 484303754,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element is not clickable at point (544, 408). Other element would receive the click: \u003ch4\u003e...\u003c/h4\u003e\n  (Session info: chrome\u003d44.0.2403.130)\n  (Driver info: chromedriver\u003d2.9.248315,platform\u003dWindows NT 6.3 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 180 milliseconds\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: com.test.smith.utility.SmithhotelsChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, chrome\u003d{userDataDir\u003dC:\\Users\\sewadeus\\AppData\\Local\\Temp\\scoped_dir7960_27049}, takesHeapSnapshot\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d44.0.2403.130, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 8761483446f43b5ed8efcaa3d9f2c1a7\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:268)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:79)\r\n\tat com.test.smith.page.SearchPage.clickOnSearchButton(SearchPage.java:73)\r\n\tat com.test.smith.page_sd.HotelSearch_sd.i_click_on_the_button(HotelSearch_sd.java:48)\r\n\tat ✽.And I click on the \"search\" button(hotelsearch.feature:11)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 883381314,
  "status": "passed"
});
formatter.before({
  "duration": 269696,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": "hotel-search-feature;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test12"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the smith hotel site \"https://www.mrandmrssmith.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter my destination \"London\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter my checkin date \"20-08-2015\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter my checkout date \"23-08-2015\"",
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
  "name": "I should see result for \"United Kingdom\" and \"London\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.mrandmrssmith.com",
      "offset": 30
    }
  ],
  "location": "HotelSearch_sd.i_am_on_the_smith_hotel_site(String)"
});
formatter.result({
  "duration": 585951750,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 24
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_destination(String)"
});
formatter.result({
  "duration": 590316490,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20-08-2015",
      "offset": 25
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkin_date(String)"
});
formatter.result({
  "duration": 1174049094,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d44.0.2403.130)\n  (Driver info: chromedriver\u003d2.9.248315,platform\u003dWindows NT 6.3 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 256 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: com.test.smith.utility.SmithhotelsChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, chrome\u003d{userDataDir\u003dC:\\Users\\sewadeus\\AppData\\Local\\Temp\\scoped_dir7960_27049}, takesHeapSnapshot\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d44.0.2403.130, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 8761483446f43b5ed8efcaa3d9f2c1a7\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:268)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.isDisplayed(RemoteWebElement.java:320)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:50)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:227)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$100(ExpectedConditions.java:39)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:213)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:210)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\tat com.test.smith.page.SearchPage.enterCheckinDate(SearchPage.java:60)\r\n\tat com.test.smith.page_sd.HotelSearch_sd.i_enter_my_checkin_date(HotelSearch_sd.java:36)\r\n\tat ✽.And I enter my checkin date \"20-08-2015\"(hotelsearch.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "23-08-2015",
      "offset": 26
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkout_date(String)"
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
  "location": "HotelSearch_sd.i_click_on_the_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "United Kingdom",
      "offset": 25
    },
    {
      "val": "London",
      "offset": 46
    }
  ],
  "location": "HotelSearch_sd.i_should_see_result_for_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 1203780077,
  "status": "passed"
});
formatter.before({
  "duration": 221800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "",
  "description": "",
  "id": "hotel-search-feature;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I am on the smith hotel site \"https://www.mrandmrssmith.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I click on the \"book now\" button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.mrandmrssmith.com",
      "offset": 30
    }
  ],
  "location": "HotelSearch_sd.i_am_on_the_smith_hotel_site(String)"
});
formatter.result({
  "duration": 1437621271,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "book now",
      "offset": 16
    }
  ],
  "location": "HotelSearch_sd.i_click_on_the_button(String)"
});
formatter.result({
  "duration": 92147629,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element\n  (Session info: chrome\u003d44.0.2403.130)\n  (Driver info: chromedriver\u003d2.9.248315,platform\u003dWindows NT 6.3 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 91 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: com.test.smith.utility.SmithhotelsChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, chrome\u003d{userDataDir\u003dC:\\Users\\sewadeus\\AppData\\Local\\Temp\\scoped_dir7960_27049}, takesHeapSnapshot\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d44.0.2403.130, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 8761483446f43b5ed8efcaa3d9f2c1a7\n*** Element info: {Using\u003dxpath, value\u003d//*[starts-with(@id, \u0027book now\u0027)][@type\u003d\u0027submit\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat com.test.smith.page.SearchPage.clickOnSearchButton(SearchPage.java:70)\r\n\tat com.test.smith.page_sd.HotelSearch_sd.i_click_on_the_button(HotelSearch_sd.java:48)\r\n\tat ✽.And I click on the \"book now\" button(hotelsearch.feature:21)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 361090918,
  "status": "passed"
});
});