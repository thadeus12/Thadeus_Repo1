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
   formatter.result({
  "duration": 3094230740930,
  "status": "passed"
});
;merchant-category-search;;7"
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
  "duration": 136585,
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
  "duration": 1834805240,
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
  "duration": 201675573,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027Mode\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Lon-Quid-WL-16\u0027, ip: \u0027192.168.226.134\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"Mode\"category name(SearchMearch.feature:6)\r\n",
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
  "duration": 875149907,
  "status": "passed"
});
formatter.before({
  "duration": 99083,
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
  "duration": 774710626,
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
  "duration": 185045369,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027Maison \u0026 Jardin\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Lon-Quid-WL-16\u0027, ip: \u0027192.168.226.134\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"Maison \u0026 Jardin\"category name(SearchMearch.feature:6)\r\n",
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
  "duration": 663119537,
  "status": "passed"
});
formatter.before({
  "duration": 91977,
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
  "duration": 640621311,
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
  "duration": 186738470,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027Voyages\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Lon-Quid-WL-16\u0027, ip: \u0027192.168.226.134\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"Voyages\"category name(SearchMearch.feature:6)\r\n",
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
  "duration": 671532144,
  "status": "passed"
});
formatter.before({
  "duration": 60003,
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
  "duration": 544493929,
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
  "duration": 137124579,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027High-Tech \u0026 Électroménager\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Lon-Quid-WL-16\u0027, ip: \u0027192.168.226.134\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"High-Tech \u0026 Électroménager\"category name(SearchMearch.feature:6)\r\n",
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
  "duration": 719020678,
  "status": "passed"
});
formatter.before({
  "duration": 64344,
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
  "duration": 541159440,
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
  "duration": 155923168,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027Mobile, Internet \u0026 TV\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Lon-Quid-WL-16\u0027, ip: \u0027192.168.226.134\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"Mobile, Internet \u0026 TV\"category name(SearchMearch.feature:6)\r\n",
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
  "duration": 710109497,
  "status": "passed"
});
formatter.before({
  "duration": 67898,
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
  "duration": 567051763,
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
  "duration": 183604911,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027Beauté \u0026 Santé\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Lon-Quid-WL-16\u0027, ip: \u0027192.168.226.134\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"Beauté \u0026 Santé\"category name(SearchMearch.feature:6)\r\n",
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
  "duration": 804926690,
  "status": "passed"
});
formatter.before({
  "duration": 68293,
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
  "duration": 812492154,
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
  "duration": 165701230,
  "error_message": "org.openqa.selenium.NoSuchElementException: sizzle could not find CSS element: .item-inner.ng-binding:contains(\u0027Divertissement\u0027)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.46.0\u0027, revision: \u002761506a4624b13675f24581e453592342b7485d71\u0027, time: \u00272015-06-04 10:22:50\u0027\nSystem info: host: \u0027Lon-Quid-WL-16\u0027, ip: \u0027192.168.226.134\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat com.test.shoop.helper.SizzleSelector.findElementBySizzleCss(SizzleSelector.java:42)\r\n\tat com.test.shoop.utility.ShoopChromeDriver.findElementByCssSelector(ShoopChromeDriver.java:33)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:426)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat com.test.shoop.pages.MerchantSearch.clickOnMerchantTab(MerchantSearch.java:37)\r\n\tat com.test.shoop.page_sd.LandingPage_sd.i_click_on_merchant_category_name(LandingPage_sd.java:22)\r\n\tat ✽.When I click on merchant\"Divertissement\"category name(SearchMearch.feature:6)\r\n",
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
  "duration": 805711461,
  "status": "passed"
});
formatter.before({
  "duration": 55660,
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
