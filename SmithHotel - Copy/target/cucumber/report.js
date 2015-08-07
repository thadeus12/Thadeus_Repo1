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
  "duration": 593558,
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
  "duration": 5807062148,
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
  "duration": 5884607907,
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
  "duration": 8871242294,
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
  "duration": 1717106399,
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
  "duration": 2231118883,
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
  "duration": 1343011776,
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
  "duration": 4456990390,
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
  "duration": 10639716300,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3240526870,
  "status": "passed"
});
formatter.before({
  "duration": 385443,
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
  "duration": 2879029826,
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
  "duration": 4874288200,
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
  "duration": 8559324199,
  "status": "passed"
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
  "duration": 1841531301,
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
  "duration": 1724523314,
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
  "duration": 1379511913,
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
  "duration": 4217183659,
  "status": "passed"
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
  "duration": 9634638269,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 2258988761,
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
  "name": "am on the smith hotel site \"https://www.mrandmrssmith.com\"",
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
formatter.step({
  "line": 13,
  "name": "I click on the \"Book now\" button",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
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
      "line": 16,
      "id": "hotel-search-feature;;;1"
    },
    {
      "cells": [
        "20-08-2015",
        "23-08-2015",
        "France",
        "Paris"
      ],
      "line": 17,
      "id": "hotel-search-feature;;;2"
    },
    {
      "cells": [
        "20-08-2015",
        "23-08-2015",
        "United Kingdom",
        "London"
      ],
      "line": 18,
      "id": "hotel-search-feature;;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 229783,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
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
  "name": "am on the smith hotel site \"https://www.mrandmrssmith.com\"",
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
formatter.step({
  "line": 13,
  "name": "I click on the \"Book now\" button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.mrandmrssmith.com",
      "offset": 28
    }
  ],
  "location": "HotelSearch_sd.am_on_the_smith_hotel_site(String)"
});
formatter.result({
  "duration": 5443885351,
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
  "duration": 5073988970,
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
  "duration": 1517245410,
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
  "duration": 1391776508,
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
  "duration": 3743951092,
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
  "duration": 30145303219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Book now",
      "offset": 16
    }
  ],
  "location": "HotelSearch_sd.i_click_on_the_button(String)"
});
formatter.result({
  "duration": 179600177,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[starts-with(@id, \u0027Book now\u0027)][@type\u003d\u0027submit\u0027]\"}\nCommand duration or timeout: 178 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: com.test.smith.utility.SmithHotelFireFoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d39.0, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: f1805652-9af5-4c82-b834-66db40864ebd\n*** Element info: {Using\u003dxpath, value\u003d//*[starts-with(@id, \u0027Book now\u0027)][@type\u003d\u0027submit\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat com.test.smith.page.SearchPage.clickOnSearchButton(SearchPage.java:71)\r\n\tat com.test.smith.page_sd.HotelSearch_sd.i_click_on_the_button(HotelSearch_sd.java:47)\r\n\tat ✽.Then I click on the \"Book now\" button(hotelsearch.feature:13)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[starts-with(@id, \u0027Book now\u0027)][@type\u003d\u0027submit\u0027]\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6363905194165371436webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10271)\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6363905194165371436webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10280)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6363905194165371436webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12274)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6363905194165371436webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12279)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6363905194165371436webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12221)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 2786288173,
  "status": "passed"
});
formatter.before({
  "duration": 130001,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
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
  "name": "am on the smith hotel site \"https://www.mrandmrssmith.com\"",
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
formatter.step({
  "line": 13,
  "name": "I click on the \"Book now\" button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.mrandmrssmith.com",
      "offset": 28
    }
  ],
  "location": "HotelSearch_sd.am_on_the_smith_hotel_site(String)"
});
formatter.result({
  "duration": 4939220985,
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
  "duration": 5778164804,
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
  "duration": 2270150625,
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
  "duration": 1407022578,
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
  "duration": 6821020179,
  "status": "passed"
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
  "duration": 42643461820,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Book now",
      "offset": 16
    }
  ],
  "location": "HotelSearch_sd.i_click_on_the_button(String)"
});
formatter.result({
  "duration": 186408139,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[starts-with(@id, \u0027Book now\u0027)][@type\u003d\u0027submit\u0027]\"}\nCommand duration or timeout: 186 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: com.test.smith.utility.SmithHotelFireFoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d39.0, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: f1805652-9af5-4c82-b834-66db40864ebd\n*** Element info: {Using\u003dxpath, value\u003d//*[starts-with(@id, \u0027Book now\u0027)][@type\u003d\u0027submit\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat com.test.smith.page.SearchPage.clickOnSearchButton(SearchPage.java:71)\r\n\tat com.test.smith.page_sd.HotelSearch_sd.i_click_on_the_button(HotelSearch_sd.java:47)\r\n\tat ✽.Then I click on the \"Book now\" button(hotelsearch.feature:13)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[starts-with(@id, \u0027Book now\u0027)][@type\u003d\u0027submit\u0027]\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6363905194165371436webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10271)\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6363905194165371436webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10280)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6363905194165371436webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12274)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6363905194165371436webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12279)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6363905194165371436webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12221)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 3056475290,
  "status": "passed"
});
});