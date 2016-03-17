$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testFeatures/ShoopSearch.feature");
formatter.feature({
  "line": 2,
  "name": "As shoop customer I should be able to Login",
  "description": "",
  "id": "as-shoop-customer-i-should-be-able-to-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": ": login to Tashh",
  "description": "",
  "id": "as-shoop-customer-i-should-be-able-to-login;:-login-to-tashh",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I go to \"http://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter my username and password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.shoop.fr/",
      "offset": 9
    }
  ],
  "location": "MerchantSearch_sd.i_go_to(String)"
});
formatter.result({
  "duration": 4069907613,
  "status": "passed"
});
formatter.match({
  "location": "ShoopLoginPage_sd.i_enter_my_username_and_password()"
});
formatter.result({
  "duration": 1653002088,
  "status": "passed"
});
formatter.match({
  "location": "ShoopLoginPage_sd.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 173008315,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 8,
      "value": "#Then I should be logged in"
    }
  ],
  "line": 10,
  "name": "As shoop customer I should be able to Search for Merchants",
  "description": "",
  "id": "as-shoop-customer-i-should-be-able-to-login;as-shoop-customer-i-should-be-able-to-search-for-merchants",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I go to \"http://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I enter merchant name as \"\u003cMerchantName\u003e\"into search",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should see name of \"\u003cMerchantName\u003e\" and own  best rates displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "as-shoop-customer-i-should-be-able-to-login;as-shoop-customer-i-should-be-able-to-search-for-merchants;",
  "rows": [
    {
      "cells": [
        "MerchantName"
      ],
      "line": 16,
      "id": "as-shoop-customer-i-should-be-able-to-login;as-shoop-customer-i-should-be-able-to-search-for-merchants;;1"
    },
    {
      "cells": [
        "My Jolie candle"
      ],
      "line": 17,
      "id": "as-shoop-customer-i-should-be-able-to-login;as-shoop-customer-i-should-be-able-to-search-for-merchants;;2"
    },
    {
      "cells": [
        "1-2-3"
      ],
      "line": 18,
      "id": "as-shoop-customer-i-should-be-able-to-login;as-shoop-customer-i-should-be-able-to-search-for-merchants;;3"
    },
    {
      "cells": [
        "Access Moto"
      ],
      "line": 19,
      "id": "as-shoop-customer-i-should-be-able-to-login;as-shoop-customer-i-should-be-able-to-search-for-merchants;;4"
    },
    {
      "cells": [
        "M M\u0026MS"
      ],
      "line": 20,
      "id": "as-shoop-customer-i-should-be-able-to-login;as-shoop-customer-i-should-be-able-to-search-for-merchants;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "As shoop customer I should be able to Search for Merchants",
  "description": "",
  "id": "as-shoop-customer-i-should-be-able-to-login;as-shoop-customer-i-should-be-able-to-search-for-merchants;;2",
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
  "line": 11,
  "name": "I go to \"http://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I enter merchant name as \"My Jolie candle\"into search",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should see name of \"My Jolie candle\" and own  best rates displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.shoop.fr/",
      "offset": 9
    }
  ],
  "location": "MerchantSearch_sd.i_go_to(String)"
});
formatter.result({
  "duration": 1530807166,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Jolie candle",
      "offset": 26
    }
  ],
  "location": "MerchantSearch_sd.i_enter_merchant_name_as_into_search(String)"
});
formatter.result({
  "duration": 414871689,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Jolie candle",
      "offset": 22
    }
  ],
  "location": "MerchantSearch_sd.i_should_see_name_of_and_own_best_rates_displayed(String)"
});
formatter.result({
  "duration": 3243618391,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "As shoop customer I should be able to Search for Merchants",
  "description": "",
  "id": "as-shoop-customer-i-should-be-able-to-login;as-shoop-customer-i-should-be-able-to-search-for-merchants;;3",
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
  "line": 11,
  "name": "I go to \"http://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I enter merchant name as \"1-2-3\"into search",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should see name of \"1-2-3\" and own  best rates displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.shoop.fr/",
      "offset": 9
    }
  ],
  "location": "MerchantSearch_sd.i_go_to(String)"
});
formatter.result({
  "duration": 956906289,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1-2-3",
      "offset": 26
    }
  ],
  "location": "MerchantSearch_sd.i_enter_merchant_name_as_into_search(String)"
});
formatter.result({
  "duration": 353901663,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1-2-3",
      "offset": 22
    }
  ],
  "location": "MerchantSearch_sd.i_should_see_name_of_and_own_best_rates_displayed(String)"
});
formatter.result({
  "duration": 3234607251,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "As shoop customer I should be able to Search for Merchants",
  "description": "",
  "id": "as-shoop-customer-i-should-be-able-to-login;as-shoop-customer-i-should-be-able-to-search-for-merchants;;4",
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
  "line": 11,
  "name": "I go to \"http://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I enter merchant name as \"Access Moto\"into search",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should see name of \"Access Moto\" and own  best rates displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.shoop.fr/",
      "offset": 9
    }
  ],
  "location": "MerchantSearch_sd.i_go_to(String)"
});
formatter.result({
  "duration": 1119689548,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Access Moto",
      "offset": 26
    }
  ],
  "location": "MerchantSearch_sd.i_enter_merchant_name_as_into_search(String)"
});
formatter.result({
  "duration": 310758917,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Access Moto",
      "offset": 22
    }
  ],
  "location": "MerchantSearch_sd.i_should_see_name_of_and_own_best_rates_displayed(String)"
});
formatter.result({
  "duration": 3269705314,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "As shoop customer I should be able to Search for Merchants",
  "description": "",
  "id": "as-shoop-customer-i-should-be-able-to-login;as-shoop-customer-i-should-be-able-to-search-for-merchants;;5",
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
  "line": 11,
  "name": "I go to \"http://www.shoop.fr/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I enter merchant name as \"M M\u0026MS\"into search",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should see name of \"M M\u0026MS\" and own  best rates displayed",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.shoop.fr/",
      "offset": 9
    }
  ],
  "location": "MerchantSearch_sd.i_go_to(String)"
});
formatter.result({
  "duration": 1027683429,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "M M\u0026MS",
      "offset": 26
    }
  ],
  "location": "MerchantSearch_sd.i_enter_merchant_name_as_into_search(String)"
});
formatter.result({
  "duration": 403716098,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "M M\u0026MS",
      "offset": 22
    }
  ],
  "location": "MerchantSearch_sd.i_should_see_name_of_and_own_best_rates_displayed(String)"
});
formatter.result({
  "duration": 3217272607,
  "status": "passed"
});
});