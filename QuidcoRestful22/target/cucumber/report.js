$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchTest.feature");
formatter.feature({
  "line": 2,
  "name": "Micro service",
  "description": "As a  signed quidco member\r\nI should be able to find merchants using search terms",
  "id": "micro-service",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@QP-153"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "A member successfully searches",
  "description": "",
  "id": "micro-service;a-member-successfully-searches",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I enter a \"\u003cSearch term\u003e\" on the rest url",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should get back these events merchantId \"\u003cMerchantId\u003e\" in search results response",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should get back these events exactMatch \"\u003cExactMatch\u003e\" in search results response",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see similar merchant\"\u003cSimilarMerchantID\u003e\" returned",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "micro-service;a-member-successfully-searches;",
  "rows": [
    {
      "cells": [
        "Search term",
        "MerchantId",
        "ExactMatch",
        "SimilarMerchantID"
      ],
      "line": 16,
      "id": "micro-service;a-member-successfully-searches;;1"
    },
    {
      "cells": [
        "Amaz",
        "4412",
        "Amazon",
        "109"
      ],
      "line": 17,
      "id": "micro-service;a-member-successfully-searches;;2"
    },
    {
      "cells": [
        "Amazon",
        "4412",
        "Amazon",
        ""
      ],
      "line": 18,
      "id": "micro-service;a-member-successfully-searches;;3"
    },
    {
      "cells": [
        "Arg",
        "3035",
        "Argos",
        ""
      ],
      "line": 19,
      "id": "micro-service;a-member-successfully-searches;;4"
    },
    {
      "cells": [
        "Argos",
        "3035",
        "Argos",
        ""
      ],
      "line": 20,
      "id": "micro-service;a-member-successfully-searches;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "A member successfully searches",
  "description": "",
  "id": "micro-service;a-member-successfully-searches;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@QP-153"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I enter a \"Amaz\" on the rest url",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should get back these events merchantId \"4412\" in search results response",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should get back these events exactMatch \"Amazon\" in search results response",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see similar merchant\"109\" returned",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Amaz",
      "offset": 11
    }
  ],
  "location": "SearchTest_sd.i_enter_a_on_the_rest_url(String)"
});
formatter.result({
  "duration": 5591541835,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4412",
      "offset": 43
    }
  ],
  "location": "SearchTest_sd.i_should_get_back_these_events_merchantId_in_search_results_response(String)"
});
formatter.result({
  "duration": 1379717669,
  "error_message": "java.lang.AssertionError: \nExpected: a collection containing \"4412\"\n     but: was \u003c4412\u003e\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)\r\n\tat com.test.quidco.utility.SearchTest.validateMerchantID(SearchTest.java:31)\r\n\tat com.test.quidco.Search_sd.SearchTest_sd.i_should_get_back_these_events_merchantId_in_search_results_response(SearchTest_sd.java:29)\r\n\tat ✽.Then I should get back these events merchantId \"4412\" in search results response(SearchTest.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon",
      "offset": 43
    }
  ],
  "location": "SearchTest_sd.i_should_get_back_these_events_exactMatch_in_search_results_response(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "109",
      "offset": 30
    }
  ],
  "location": "SearchTest_sd.i_should_see_similar_merchant_returned(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "A member successfully searches",
  "description": "",
  "id": "micro-service;a-member-successfully-searches;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@QP-153"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I enter a \"Amazon\" on the rest url",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should get back these events merchantId \"4412\" in search results response",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should get back these events exactMatch \"Amazon\" in search results response",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see similar merchant\"\" returned",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon",
      "offset": 11
    }
  ],
  "location": "SearchTest_sd.i_enter_a_on_the_rest_url(String)"
});
formatter.result({
  "duration": 453193921,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4412",
      "offset": 43
    }
  ],
  "location": "SearchTest_sd.i_should_get_back_these_events_merchantId_in_search_results_response(String)"
});
formatter.result({
  "duration": 163212896,
  "error_message": "java.lang.AssertionError: \nExpected: a collection containing \"4412\"\n     but: was \u003c4412\u003e\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)\r\n\tat com.test.quidco.utility.SearchTest.validateMerchantID(SearchTest.java:31)\r\n\tat com.test.quidco.Search_sd.SearchTest_sd.i_should_get_back_these_events_merchantId_in_search_results_response(SearchTest_sd.java:29)\r\n\tat ✽.Then I should get back these events merchantId \"4412\" in search results response(SearchTest.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amazon",
      "offset": 43
    }
  ],
  "location": "SearchTest_sd.i_should_get_back_these_events_exactMatch_in_search_results_response(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 30
    }
  ],
  "location": "SearchTest_sd.i_should_see_similar_merchant_returned(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "A member successfully searches",
  "description": "",
  "id": "micro-service;a-member-successfully-searches;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@QP-153"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I enter a \"Arg\" on the rest url",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should get back these events merchantId \"3035\" in search results response",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should get back these events exactMatch \"Argos\" in search results response",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see similar merchant\"\" returned",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Arg",
      "offset": 11
    }
  ],
  "location": "SearchTest_sd.i_enter_a_on_the_rest_url(String)"
});
formatter.result({
  "duration": 417754380,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3035",
      "offset": 43
    }
  ],
  "location": "SearchTest_sd.i_should_get_back_these_events_merchantId_in_search_results_response(String)"
});
formatter.result({
  "duration": 228336009,
  "error_message": "java.lang.AssertionError: \nExpected: a collection containing \"3035\"\n     but: was \u003c3035\u003e, was \u003c1485\u003e, was \u003c1369\u003e, was \u003c1317\u003e, was \u003c3036\u003e, was \u003c8198\u003e, was \u003c2542\u003e, was \u003c9906\u003e, was \u003c4564\u003e, was \u003c11934\u003e, was \u003c11456\u003e, was \u003c9770\u003e, was \u003c12276\u003e, was \u003c6454\u003e, was \u003c1456\u003e, was \u003c12667\u003e\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)\r\n\tat com.test.quidco.utility.SearchTest.validateMerchantID(SearchTest.java:31)\r\n\tat com.test.quidco.Search_sd.SearchTest_sd.i_should_get_back_these_events_merchantId_in_search_results_response(SearchTest_sd.java:29)\r\n\tat ✽.Then I should get back these events merchantId \"3035\" in search results response(SearchTest.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Argos",
      "offset": 43
    }
  ],
  "location": "SearchTest_sd.i_should_get_back_these_events_exactMatch_in_search_results_response(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 30
    }
  ],
  "location": "SearchTest_sd.i_should_see_similar_merchant_returned(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "A member successfully searches",
  "description": "",
  "id": "micro-service;a-member-successfully-searches;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@QP-153"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I enter a \"Argos\" on the rest url",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I should get back these events merchantId \"3035\" in search results response",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should get back these events exactMatch \"Argos\" in search results response",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see similar merchant\"\" returned",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Argos",
      "offset": 11
    }
  ],
  "location": "SearchTest_sd.i_enter_a_on_the_rest_url(String)"
});
formatter.result({
  "duration": 347703201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3035",
      "offset": 43
    }
  ],
  "location": "SearchTest_sd.i_should_get_back_these_events_merchantId_in_search_results_response(String)"
});
formatter.result({
  "duration": 44873169,
  "error_message": "java.lang.AssertionError: \nExpected: a collection containing \"3035\"\n     but: was \u003c3035\u003e\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)\r\n\tat com.test.quidco.utility.SearchTest.validateMerchantID(SearchTest.java:31)\r\n\tat com.test.quidco.Search_sd.SearchTest_sd.i_should_get_back_these_events_merchantId_in_search_results_response(SearchTest_sd.java:29)\r\n\tat ✽.Then I should get back these events merchantId \"3035\" in search results response(SearchTest.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Argos",
      "offset": 43
    }
  ],
  "location": "SearchTest_sd.i_should_get_back_these_events_exactMatch_in_search_results_response(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 30
    }
  ],
  "location": "SearchTest_sd.i_should_see_similar_merchant_returned(String)"
});
formatter.result({
  "status": "skipped"
});
});