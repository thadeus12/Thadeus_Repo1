$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ImageUpload.feature");
formatter.feature({
  "line": 2,
  "name": "Testing image Upload to http://www.imageupload.co.uk/",
  "description": "",
  "id": "testing-image-upload-to-http://www.imageupload.co.uk/",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.before({
  "duration": 642024,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Image Upload",
  "description": "",
  "id": "testing-image-upload-to-http://www.imageupload.co.uk/;image-upload",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on the image upload page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the start uploading button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter the location of the file",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "The image upload overlay should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on upload button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "The image upload progress should be started",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should see upload completion success page",
  "keyword": "Then "
});
formatter.match({
  "location": "ImageUpload_sd.i_am_on_the_image_upload_page()"
});
formatter.result({
  "duration": 10724867861,
  "status": "passed"
});
formatter.match({
  "location": "ImageUpload_sd.i_click_on_the_start_uploading_button()"
});
formatter.result({
  "duration": 356394861,
  "status": "passed"
});
formatter.match({
  "location": "ImageUpload_sd.i_enter_the_location_of_the_file()"
});
formatter.result({
  "duration": 500925404,
  "status": "passed"
});
formatter.match({
  "location": "ImageUpload_sd.the_image_upload_overlay_should_be_displayed()"
});
formatter.result({
  "duration": 700426496,
  "status": "passed"
});
formatter.match({
  "location": "ImageUpload_sd.i_click_on_upload_button()"
});
formatter.result({
  "duration": 797665681,
  "status": "passed"
});
formatter.match({
  "location": "ImageUpload_sd.the_image_upload_progress_should_be_started()"
});
formatter.result({
  "duration": 57156623,
  "status": "passed"
});
formatter.match({
  "location": "ImageUpload_sd.i_should_see_upload_completion_success_page()"
});
formatter.result({
  "duration": 28498579109,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 667151320,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Testing the login to dailymailplus application",
  "description": "\r\nAs daily mail plus account holder I should be able to login with my email and password",
  "id": "testing-the-login-to-dailymailplus-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke-test"
    }
  ]
});
formatter.before({
  "duration": 131141,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "Login to to User Account",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the Media Plus page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on the Account tab",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter my username",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter my password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest_sd.i_am_on_the_Media_Plus_page()"
});
formatter.result({
  "duration": 5832326395,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_sd.i_click_on_the_Account_tab()"
});
formatter.result({
  "duration": 334582600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_sd.i_enter_my_username()"
});
formatter.result({
  "duration": 313915829,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_sd.i_enter_my_password()"
});
formatter.result({
  "duration": 231259586,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_sd.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 149197471,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login to Myaccount",
  "description": "",
  "id": "testing-the-login-to-dailymailplus-application;login-to-myaccount",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I should be logged in to my account",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest_sd.i_should_be_logged_in_to_my_account()"
});
formatter.result({
  "duration": 2856489511,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 223937896,
  "status": "passed"
});
formatter.before({
  "duration": 147107,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "Login to to User Account",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the Media Plus page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on the Account tab",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter my username",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter my password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest_sd.i_am_on_the_Media_Plus_page()"
});
formatter.result({
  "duration": 1410173164,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_sd.i_click_on_the_Account_tab()"
});
formatter.result({
  "duration": 143678692,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_sd.i_enter_my_username()"
});
formatter.result({
  "duration": 310942908,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_sd.i_enter_my_password()"
});
formatter.result({
  "duration": 208846924,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_sd.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 149776774,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Validate Login page tabs",
  "description": "",
  "id": "testing-the-login-to-dailymailplus-application;validate-login-page-tabs",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "The tabs listed below should be displayed",
  "rows": [
    {
      "cells": [
        "Tabs"
      ],
      "line": 25
    },
    {
      "cells": [
        "Personal Details"
      ],
      "line": 26
    },
    {
      "cells": [
        "Payment Details"
      ],
      "line": 27
    },
    {
      "cells": [
        "Subscription"
      ],
      "line": 28
    },
    {
      "cells": [
        "Order History"
      ],
      "line": 29
    },
    {
      "cells": [
        "Help"
      ],
      "line": 30
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest_sd.the_tabs_listed_below_should_be_displayed(DataTable)"
});
formatter.result({
  "duration": 1662032238,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 197385152,
  "status": "passed"
});
formatter.before({
  "duration": 126580,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "Login to to User Account",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on the Media Plus page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on the Account tab",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter my username",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter my password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTest_sd.i_am_on_the_Media_Plus_page()"
});
formatter.result({
  "duration": 593273009,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_sd.i_click_on_the_Account_tab()"
});
formatter.result({
  "duration": 231010417,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_sd.i_enter_my_username()"
});
formatter.result({
  "duration": 245736474,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_sd.i_enter_my_password()"
});
formatter.result({
  "duration": 177854753,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_sd.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 128977153,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Validate User Account Signout",
  "description": "",
  "id": "testing-the-login-to-dailymailplus-application;validate-user-account-signout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "I click on the signout link",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "I should be logged out of my account",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest_sd.i_click_on_the_signout_link()"
});
formatter.result({
  "duration": 1582580980,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest_sd.i_should_be_logged_out_of_my_account()"
});
formatter.result({
  "duration": 117787927,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 173130805,
  "status": "passed"
});
});