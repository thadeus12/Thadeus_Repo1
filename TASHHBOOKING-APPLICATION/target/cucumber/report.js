$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TashhHotelSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Belly",
  "description": "",
  "id": "belly",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test12"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "login to Tashh",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on \"https://tashh.smithbookings.com/login\"",
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
formatter.step({
  "line": 8,
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://tashh.smithbookings.com/login",
      "offset": 9
    }
  ],
  "location": "TashhLogin_sd.i_am_on(String)"
});
formatter.result({
  "duration": 1348710735,
  "status": "passed"
});
formatter.match({
  "location": "TashhLogin_sd.i_enter_my_username_and_password()"
});
formatter.result({
  "duration": 3813725854,
  "status": "passed"
});
formatter.match({
  "location": "TashhLogin_sd.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 2710377694,
  "status": "passed"
});
formatter.match({
  "location": "TashhUserProfilePage_sd.i_should_be_logged_in()"
});
formatter.result({
  "duration": 1373523873,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "",
  "description": "",
  "id": "belly;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I select \"Smith\" as Agent",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on the search drop down and select \"Members\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter the Member name as \"Thadeus\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on the search button",
  "keyword": "When "
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
  "duration": 4449767908,
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
  "duration": 2478883061,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thadeus",
      "offset": 28
    }
  ],
  "location": "TashhUserProfilePage_sd.i_enter_the_Member_name_as(String)"
});
formatter.result({
  "duration": 1166613164,
  "status": "passed"
});
formatter.match({
  "location": "TashhUserProfilePage_sd.i_click_on_the_search_button()"
});
formatter.result({
  "duration": 719682478,
  "status": "passed"
});
});