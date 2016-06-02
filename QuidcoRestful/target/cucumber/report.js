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
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "micro-service;a-member-successfully-searches;",
  "rows": [
    {
      "cells": [
        "Search term",
        "MerchantId",
        "ExactMatch"
      ],
      "line": 15,
      "id": "micro-service;a-member-successfully-searches;;1"
    },
    {
      "cells": [
        "Amaz",
        "4412",
        "Amazon"
      ],
      "line": 16,
      "id": "micro-service;a-member-successfully-searches;;2"
    },
    {
      "cells": [
        "Amazon",
        "4412",
        "Amazon"
      ],
      "line": 17,
      "id": "micro-service;a-member-successfully-searches;;3"
    },
    {
      "cells": [
        "Arg",
        "3035",
        "Argos"
      ],
      "line": 18,
      "id": "micro-service;a-member-successfully-searches;;4"
    },
    {
      "cells": [
        "Argos",
        "3035",
        "Argos"
      ],
      "line": 19,
      "id": "micro-service;a-member-successfully-searches;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
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
  "duration": 4246442928,
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c200\u003e doesn\u0027t match actual status code \u003c401\u003e.\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:77)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:71)\r\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:81)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallConstructor(CallSiteArray.java:57)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:182)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:190)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure.validate(ResponseSpecificationImpl.groovy:576)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure$validate$1.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:108)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeFilterChain(RequestSpecificationImpl.groovy:957)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:324)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1207)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1016)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:807)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.callCurrent(PogoInterceptableSite.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:49)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:133)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:149)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.applyPathParamsAndSendRequest(RequestSpecificationImpl.groovy:1414)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.this$2$applyPathParamsAndSendRequest(RequestSpecificationImpl.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:324)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1207)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1016)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:807)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.callCurrent(PogoInterceptableSite.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:49)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:133)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:149)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.get(RequestSpecificationImpl.groovy:150)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.get(RequestSpecificationImpl.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:324)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1207)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1016)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:807)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:108)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:120)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl.get(ResponseSpecificationImpl.groovy:265)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl.get(ResponseSpecificationImpl.groovy)\r\n\tat com.test.quidco.utility.SearchTest.sendSearchRequest(SearchTest.java:19)\r\n\tat com.test.quidco.Search_sd.SearchTest_sd.i_enter_a_on_the_rest_url(SearchTest_sd.java:24)\r\n\tat ✽.Given I enter a \"Amaz\" on the rest url(SearchTest.feature:8)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
formatter.scenario({
  "line": 17,
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
  "duration": 84008712,
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c200\u003e doesn\u0027t match actual status code \u003c401\u003e.\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:77)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:71)\r\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:81)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:190)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure.validate(ResponseSpecificationImpl.groovy:576)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure$validate$1.call(Unknown Source)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeFilterChain(RequestSpecificationImpl.groovy:957)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:324)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1207)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1016)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:807)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.callCurrent(PogoInterceptableSite.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:149)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.applyPathParamsAndSendRequest(RequestSpecificationImpl.groovy:1414)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.this$2$applyPathParamsAndSendRequest(RequestSpecificationImpl.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:324)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1207)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1016)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:807)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.callCurrent(PogoInterceptableSite.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:149)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.get(RequestSpecificationImpl.groovy:150)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.get(RequestSpecificationImpl.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:324)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1207)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1016)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:807)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:120)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl.get(ResponseSpecificationImpl.groovy:265)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl.get(ResponseSpecificationImpl.groovy)\r\n\tat com.test.quidco.utility.SearchTest.sendSearchRequest(SearchTest.java:19)\r\n\tat com.test.quidco.Search_sd.SearchTest_sd.i_enter_a_on_the_rest_url(SearchTest_sd.java:24)\r\n\tat ✽.Given I enter a \"Amazon\" on the rest url(SearchTest.feature:8)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
formatter.scenario({
  "line": 18,
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
  "duration": 90463728,
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c200\u003e doesn\u0027t match actual status code \u003c401\u003e.\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:77)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:71)\r\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:81)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:190)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure.validate(ResponseSpecificationImpl.groovy:576)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure$validate$1.call(Unknown Source)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeFilterChain(RequestSpecificationImpl.groovy:957)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:324)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1207)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1016)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:807)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.callCurrent(PogoInterceptableSite.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:149)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.applyPathParamsAndSendRequest(RequestSpecificationImpl.groovy:1414)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.this$2$applyPathParamsAndSendRequest(RequestSpecificationImpl.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:324)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1207)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1016)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:807)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.callCurrent(PogoInterceptableSite.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:149)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.get(RequestSpecificationImpl.groovy:150)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.get(RequestSpecificationImpl.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:324)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1207)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1016)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:807)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:120)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl.get(ResponseSpecificationImpl.groovy:265)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl.get(ResponseSpecificationImpl.groovy)\r\n\tat com.test.quidco.utility.SearchTest.sendSearchRequest(SearchTest.java:19)\r\n\tat com.test.quidco.Search_sd.SearchTest_sd.i_enter_a_on_the_rest_url(SearchTest_sd.java:24)\r\n\tat ✽.Given I enter a \"Arg\" on the rest url(SearchTest.feature:8)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
formatter.scenario({
  "line": 19,
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
  "duration": 117163580,
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c200\u003e doesn\u0027t match actual status code \u003c401\u003e.\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:77)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:71)\r\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:81)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:190)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure.validate(ResponseSpecificationImpl.groovy:576)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure$validate$1.call(Unknown Source)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeFilterChain(RequestSpecificationImpl.groovy:957)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:324)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1207)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1016)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:807)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.callCurrent(PogoInterceptableSite.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:149)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.applyPathParamsAndSendRequest(RequestSpecificationImpl.groovy:1414)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.this$2$applyPathParamsAndSendRequest(RequestSpecificationImpl.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:324)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1207)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1016)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:807)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.callCurrent(PogoInterceptableSite.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:149)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.get(RequestSpecificationImpl.groovy:150)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.get(RequestSpecificationImpl.groovy)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:324)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1207)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1016)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:807)\r\n\tat com.jayway.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:120)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl.get(ResponseSpecificationImpl.groovy:265)\r\n\tat com.jayway.restassured.internal.ResponseSpecificationImpl.get(ResponseSpecificationImpl.groovy)\r\n\tat com.test.quidco.utility.SearchTest.sendSearchRequest(SearchTest.java:19)\r\n\tat com.test.quidco.Search_sd.SearchTest_sd.i_enter_a_on_the_rest_url(SearchTest_sd.java:24)\r\n\tat ✽.Given I enter a \"Argos\" on the rest url(SearchTest.feature:8)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
});