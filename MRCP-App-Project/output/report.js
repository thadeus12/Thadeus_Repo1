$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/smithapp/mrcp/PolicyTest/Policy.feature");
formatter.feature({
  "line": 1,
  "name": "Policy sentence on mms",
  "description": "",
  "id": "policy-sentence-on-mms",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "check policy sentence on mms website",
  "description": "",
  "id": "policy-sentence-on-mms;check-policy-sentence-on-mms-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I go to \"baseurl\" on \"browserType\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"hotel\" name as \"3 nagas\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter \"checkin\" date as \"15-06-2015\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"checkout\" date \"18-06-2015\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click the \"search\" to find avaialbe hotel",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should \"SearchResults\" for the hotel",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click the \"booknow\" to go on hotelpage",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on \"terms\u0026conditions\" of the room",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see \"cancellation\" policy sentence",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click on the \"bookit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter \"people\" sleeping in the room as \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click the \"next\" button to add extras",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click \"confirm\" button to login",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click \"continue\" as new customer",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter \"Fname\" as \"KAla\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter \"Sname\" as \"Bule\" in the surname field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter \"emailaddress\" as \"thadeus+bule@smithhotels.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter \"Phone\" as \"02097655552\" in contact field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I \"selectcountry\" as \"United Kindgom\" from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I enter \"line1 Address\" as \"15 Running waters\" in the line1 field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter my \"town\" as \"Kent\" in the town field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter \"postcode\" as \"KA2 9DP\" in the postcode field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I select \"cardtype\" as \"VISA\" from card type dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I enter my \"cardtype\" as \"4111111111111111\" in the card field",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I enter \"Nameoncard\" as \"Buke\" in name on card field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select card \"expirymonth\" as \"08\" from month dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I select card \"expiryyear\" as \"2017\" from year dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I enter card \"CVV\" as \"087\" in cvv field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click to \"confirmterms\" checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on the \"makePayment\" button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on the \"view confirmation\" link",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I should the see \"cancellation\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "baseurl",
      "offset": 9
    },
    {
      "val": "browserType",
      "offset": 22
    }
  ],
  "location": "PolicyTest.I_go_to_on(String,String)"
});
formatter.result({
  "duration": 237994398,
  "error_message": "java.lang.NullPointerException\r\n\tat com.smithapp.mrcp.util.WebConnector.openBrowser(WebConnector.java:78)\r\n\tat com.smithapp.mrcp.PolicyTest.PolicyTest.I_go_to_on(PolicyTest.java:16)\r\n\tat ✽.Given I go to \"baseurl\" on \"browserType\"(src/test/resources/com/smithapp/mrcp/PolicyTest/Policy.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "hotel",
      "offset": 9
    },
    {
      "val": "3 nagas",
      "offset": 25
    }
  ],
  "location": "PolicyTest.I_enter_name_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "checkin",
      "offset": 9
    },
    {
      "val": "15-06-2015",
      "offset": 27
    }
  ],
  "location": "PolicyTest.I_enter_date_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "checkout",
      "offset": 9
    },
    {
      "val": "18-06-2015",
      "offset": 25
    }
  ],
  "location": "PolicyTest.I_enter_date(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "search",
      "offset": 13
    }
  ],
  "location": "PolicyTest.I_click_the_to_find_avaialbe_hotel(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "SearchResults",
      "offset": 10
    }
  ],
  "location": "PolicyTest.I_should_for_the_hotel(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "booknow",
      "offset": 13
    }
  ],
  "location": "PolicyTest.I_click_the_to_go_on_hotelpage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "terms\u0026conditions",
      "offset": 10
    }
  ],
  "location": "PolicyTest.click_on_of_the_room(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "cancellation",
      "offset": 14
    }
  ],
  "location": "PolicyTest.I_should_see_policy_sentence(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "bookit",
      "offset": 16
    }
  ],
  "location": "PolicyTest.I_click_on_the_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "people",
      "offset": 9
    },
    {
      "val": "2",
      "offset": 42
    }
  ],
  "location": "PolicyTest.I_enter_sleeping_in_the_room_as(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "next",
      "offset": 13
    }
  ],
  "location": "PolicyTest.I_click_the_button_to_add_extras(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "confirm",
      "offset": 9
    }
  ],
  "location": "PolicyTest.I_click_button_to_login(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "continue",
      "offset": 9
    }
  ],
  "location": "PolicyTest.I_click_as_new_customer(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Fname",
      "offset": 9
    },
    {
      "val": "KAla",
      "offset": 20
    }
  ],
  "location": "PolicyTest.I_enter_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sname",
      "offset": 9
    },
    {
      "val": "Bule",
      "offset": 20
    }
  ],
  "location": "PolicyTest.I_enter_as_in_the_surname_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "emailaddress",
      "offset": 9
    },
    {
      "val": "thadeus+bule@smithhotels.com",
      "offset": 27
    }
  ],
  "location": "PolicyTest.I_enter_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Phone",
      "offset": 9
    },
    {
      "val": "02097655552",
      "offset": 20
    }
  ],
  "location": "PolicyTest.I_enter_as_in_contact_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "selectcountry",
      "offset": 3
    },
    {
      "val": "United Kindgom",
      "offset": 22
    }
  ],
  "location": "PolicyTest.I_as_from_dropdown(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "line1 Address",
      "offset": 9
    },
    {
      "val": "15 Running waters",
      "offset": 28
    },
    {
      "val": "1",
      "offset": 58
    }
  ],
  "location": "PolicyTest.I_enter_as_in_the_line_field(String,String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "town",
      "offset": 12
    },
    {
      "val": "Kent",
      "offset": 22
    }
  ],
  "location": "PolicyTest.I_enter_my_as_in_the_town_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "postcode",
      "offset": 9
    },
    {
      "val": "KA2 9DP",
      "offset": 23
    }
  ],
  "location": "PolicyTest.I_enter_as_in_the_postcode_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "cardtype",
      "offset": 10
    },
    {
      "val": "VISA",
      "offset": 24
    }
  ],
  "location": "PolicyTest.I_select_as_from_card_type_dropdown(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "cardtype",
      "offset": 12
    },
    {
      "val": "4111111111111111",
      "offset": 26
    }
  ],
  "location": "PolicyTest.I_enter_my_as_in_the_card_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Nameoncard",
      "offset": 9
    },
    {
      "val": "Buke",
      "offset": 25
    }
  ],
  "location": "PolicyTest.I_enter_as_in_name_on_card_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "expirymonth",
      "offset": 15
    },
    {
      "val": "08",
      "offset": 32
    }
  ],
  "location": "PolicyTest.I_select_card_as_from_month_dropdown(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "expiryyear",
      "offset": 15
    },
    {
      "val": "2017",
      "offset": 31
    }
  ],
  "location": "PolicyTest.I_select_card_as_from_year_dropdown(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CVV",
      "offset": 14
    },
    {
      "val": "087",
      "offset": 23
    }
  ],
  "location": "PolicyTest.I_enter_card_as_in_cvv_field(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "confirmterms",
      "offset": 12
    }
  ],
  "location": "PolicyTest.I_click_to_checkbox(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "makePayment",
      "offset": 16
    }
  ],
  "location": "PolicyTest.I_click_on_the_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "view confirmation",
      "offset": 16
    }
  ],
  "location": "PolicyTest.I_click_on_the_link(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "cancellation",
      "offset": 18
    }
  ],
  "location": "PolicyTest.I_should_the_see(String)"
});
formatter.result({
  "status": "skipped"
});
});