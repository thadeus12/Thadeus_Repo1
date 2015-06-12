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
        "20-06-2015",
        "23-06-2015",
        "France",
        "Paris"
      ],
      "line": 20,
      "id": "search-by-smith-inspired-hotels-feature;;;2"
    },
    {
      "cells": [
        "Go swimming",
        "20-06-2015",
        "23-06-2015",
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
  "duration": 604961,
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
  "name": "I enter my checkin date \"20-06-2015\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter my checkout date \"23-06-2015\"",
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
  "duration": 11100487447,
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
  "duration": 6748923927,
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
  "duration": 21774067741,
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
  "duration": 1484506774,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20-06-2015",
      "offset": 25
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkin_date(String)"
});
formatter.result({
  "duration": 1963970303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23-06-2015",
      "offset": 26
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkout_date(String)"
});
formatter.result({
  "duration": 1070960087,
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
  "duration": 3840869502,
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
  "duration": 9972288094,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 4923530260,
  "status": "passed"
});
formatter.before({
  "duration": 197282,
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
  "name": "I enter my checkin date \"20-06-2015\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter my checkout date \"23-06-2015\"",
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
  "duration": 7949877725,
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
  "duration": 5533461320,
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
  "duration": 20367372341,
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
  "duration": 1629086269,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20-06-2015",
      "offset": 25
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkin_date(String)"
});
formatter.result({
  "duration": 1269635444,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23-06-2015",
      "offset": 26
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkout_date(String)"
});
formatter.result({
  "duration": 1265976026,
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
  "duration": 4118208082,
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
  "duration": 10195585550,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 4589077853,
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
        "20-06-2015",
        "23-06-2015",
        "France",
        "Paris"
      ],
      "line": 16,
      "id": "hotel-search-feature;;;2"
    },
    {
      "cells": [
        "20-06-2015",
        "23-06-2015",
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
  "duration": 208686,
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
  "name": "I enter my checkin date \"20-06-2015\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter my checkout date \"23-06-2015\"",
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
      "offset": 28
    }
  ],
  "location": "HotelSearch_sd.am_on_the_smith_hotel_site(String)"
});
formatter.result({
  "duration": 22716274259,
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
  "duration": 6454323706,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20-06-2015",
      "offset": 25
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkin_date(String)"
});
formatter.result({
  "duration": 2234147988,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23-06-2015",
      "offset": 26
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkout_date(String)"
});
formatter.result({
  "duration": 1324237056,
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
  "duration": 7348084279,
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
  "duration": 25209791023,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 1646083346,
  "status": "passed"
});
formatter.before({
  "duration": 195572,
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
  "name": "I enter my checkin date \"20-06-2015\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter my checkout date \"23-06-2015\"",
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
      "offset": 28
    }
  ],
  "location": "HotelSearch_sd.am_on_the_smith_hotel_site(String)"
});
formatter.result({
  "duration": 3585733175,
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
  "duration": 35319109994,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20-06-2015",
      "offset": 25
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkin_date(String)"
});
formatter.result({
  "duration": 1714107003,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23-06-2015",
      "offset": 26
    }
  ],
  "location": "HotelSearch_sd.i_enter_my_checkout_date(String)"
});
formatter.result({
  "duration": 1241546648,
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
  "duration": 7281327562,
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
  "duration": 48145872664,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 3358117743,
  "status": "passed"
});
});