$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchMearch.feature");
formatter.feature({
  "line": 2,
  "name": "As a new user i should be able to join Quidco",
  "description": "",
  "id": "as-a-new-user-i-should-be-able-to-join-quidco",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Merchant category search",
  "description": "",
  "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I go to \"https://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on merchant\"\u003cmerchantTable\u003e\"category name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see a category of merchant",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;",
  "rows": [
    {
      "cells": [
        "merchantTable"
      ],
      "line": 9,
      "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;1"
    },
    {
      "cells": [
        "Mode"
      ],
      "line": 10,
      "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;2"
    },
    {
      "cells": [
        "Maison \u0026 Jardin"
      ],
      "line": 11,
      "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;3"
    },
    {
      "cells": [
        "Voyages"
      ],
      "line": 12,
      "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;4"
    },
    {
      "cells": [
        "High-Tech \u0026 Électroménager"
      ],
      "line": 13,
      "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;5"
    },
    {
      "cells": [
        "Mobile, Internet \u0026 TV"
      ],
      "line": 14,
      "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;6"
    },
    {
      "cells": [
        "Beauté \u0026 Santé"
      ],
      "line": 15,
      "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;7"
    },
    {
      "cells": [
        "Divertissement"
      ],
      "line": 16,
      "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;8"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 534259,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Merchant category search",
  "description": "",
  "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to \"https://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on merchant\"Mode\"category name",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see a category of merchant",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.shoop.fr/",
      "offset": 9
    }
  ],
  "location": "LandingPage_sd.i_go_to(String)"
});
formatter.result({
  "duration": 4363766313,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mode",
      "offset": 20
    }
  ],
  "location": "LandingPage_sd.i_click_on_merchant_category_name(String)"
});
formatter.result({
  "duration": 495404349,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027Mode\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"Mode\"category name(SearchMearch.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LandingPage_sd.i_should_see_a_category_of_merchant()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1032357147,
  "status": "passed"
});
formatter.before({
  "duration": 81536,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Merchant category search",
  "description": "",
  "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to \"https://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on merchant\"Maison \u0026 Jardin\"category name",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see a category of merchant",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.shoop.fr/",
      "offset": 9
    }
  ],
  "location": "LandingPage_sd.i_go_to(String)"
});
formatter.result({
  "duration": 1576905313,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Maison \u0026 Jardin",
      "offset": 20
    }
  ],
  "location": "LandingPage_sd.i_click_on_merchant_category_name(String)"
});
formatter.result({
  "duration": 297357443,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027Maison \u0026 Jardin\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"Maison \u0026 Jardin\"category name(SearchMearch.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LandingPage_sd.i_should_see_a_category_of_merchant()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 923276004,
  "status": "passed"
});
formatter.before({
  "duration": 86097,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Merchant category search",
  "description": "",
  "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to \"https://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on merchant\"Voyages\"category name",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see a category of merchant",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.shoop.fr/",
      "offset": 9
    }
  ],
  "location": "LandingPage_sd.i_go_to(String)"
});
formatter.result({
  "duration": 1618396175,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Voyages",
      "offset": 20
    }
  ],
  "location": "LandingPage_sd.i_click_on_merchant_category_name(String)"
});
formatter.result({
  "duration": 489108991,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027Voyages\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"Voyages\"category name(SearchMearch.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LandingPage_sd.i_should_see_a_category_of_merchant()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 766871628,
  "status": "passed"
});
formatter.before({
  "duration": 142546,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Merchant category search",
  "description": "",
  "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to \"https://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on merchant\"High-Tech \u0026 Électroménager\"category name",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see a category of merchant",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.shoop.fr/",
      "offset": 9
    }
  ],
  "location": "LandingPage_sd.i_go_to(String)"
});
formatter.result({
  "duration": 1061764752,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "High-Tech \u0026 Électroménager",
      "offset": 20
    }
  ],
  "location": "LandingPage_sd.i_click_on_merchant_category_name(String)"
});
formatter.result({
  "duration": 318388534,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027High-Tech \u0026 Électroménager\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"High-Tech \u0026 Électroménager\"category name(SearchMearch.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LandingPage_sd.i_should_see_a_category_of_merchant()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 610169047,
  "status": "passed"
});
formatter.before({
  "duration": 99211,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Merchant category search",
  "description": "",
  "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to \"https://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on merchant\"Mobile, Internet \u0026 TV\"category name",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see a category of merchant",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.shoop.fr/",
      "offset": 9
    }
  ],
  "location": "LandingPage_sd.i_go_to(String)"
});
formatter.result({
  "duration": 1087942859,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mobile, Internet \u0026 TV",
      "offset": 20
    }
  ],
  "location": "LandingPage_sd.i_click_on_merchant_category_name(String)"
});
formatter.result({
  "duration": 217195262,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027Mobile, Internet \u0026 TV\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"Mobile, Internet \u0026 TV\"category name(SearchMearch.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LandingPage_sd.i_should_see_a_category_of_merchant()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 673502365,
  "status": "passed"
});
formatter.before({
  "duration": 114606,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Merchant category search",
  "description": "",
  "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to \"https://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on merchant\"Beauté \u0026 Santé\"category name",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see a category of merchant",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.shoop.fr/",
      "offset": 9
    }
  ],
  "location": "LandingPage_sd.i_go_to(String)"
});
formatter.result({
  "duration": 1099153738,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Beauté \u0026 Santé",
      "offset": 20
    }
  ],
  "location": "LandingPage_sd.i_click_on_merchant_category_name(String)"
});
formatter.result({
  "duration": 227212754,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027Beauté \u0026 Santé\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"Beauté \u0026 Santé\"category name(SearchMearch.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LandingPage_sd.i_should_see_a_category_of_merchant()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded5.png");
formatter.after({
  "duration": 654947566,
  "status": "passed"
});
formatter.before({
  "duration": 112895,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Merchant category search",
  "description": "",
  "id": "as-a-new-user-i-should-be-able-to-join-quidco;merchant-category-search;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I go to \"https://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on merchant\"Divertissement\"category name",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see a category of merchant",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.shoop.fr/",
      "offset": 9
    }
  ],
  "location": "LandingPage_sd.i_go_to(String)"
});
formatter.result({
  "duration": 1064203413,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Divertissement",
      "offset": 20
    }
  ],
  "location": "LandingPage_sd.i_click_on_merchant_category_name(String)"
});
formatter.result({
  "duration": 257597649,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027Divertissement\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"Divertissement\"category name(SearchMearch.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LandingPage_sd.i_should_see_a_category_of_merchant()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded6.png");
formatter.after({
  "duration": 774347258,
  "status": "passed"
});
formatter.before({
  "duration": 163072,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "",
  "description": "",
  "id": "as-a-new-user-i-should-be-able-to-join-quidco;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I click on a merchant link",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should be on merchant home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage_sd.i_click_on_a_merchant_link()"
});
formatter.result({
  "duration": 60875956762,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 60 seconds waiting for com.test.shoop.utility.Driver$$Lambda$2/911501858@4f2c9ba6\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: Driver\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:260)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:229)\r\n\tat com.test.shoop.utility.Driver.waitForElementDisplay(Driver.java:46)\r\n\tat com.test.shoop.pages.LoginPage.goToMerchantHome(LoginPage.java:52)\r\n\tat com.test.shoop.page_sd.LoginPage_sd.i_click_on_a_merchant_link(LoginPage_sd.java:37)\r\n\tat ✽.And I click on a merchant link(SearchMearch.feature:20)\r\nCaused by: org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .clearfix.item.ng-scope\u003ea\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: Driver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.isDisplayed(Unknown Source)\r\n\tat com.test.shoop.utility.Driver.lambda$waitForElementDisplay$0(Driver.java:46)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:209)\r\n\tat com.test.shoop.utility.Driver.waitForElementDisplay(Driver.java:46)\r\n\tat com.test.shoop.pages.LoginPage.goToMerchantHome(LoginPage.java:52)\r\n\tat com.test.shoop.page_sd.LoginPage_sd.i_click_on_a_merchant_link(LoginPage_sd.java:37)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:234)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:74)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginPage_sd.i_should_be_on_merchant_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded7.png");
formatter.after({
  "duration": 773403610,
  "status": "passed"
});
});