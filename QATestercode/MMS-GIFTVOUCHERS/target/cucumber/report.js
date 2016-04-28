$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MmsVouchers.feature");
formatter.feature({
  "line": 3,
  "name": "buy smith vouchers",
  "description": "",
  "id": "buy-smith-vouchers",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "log in to mms",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on \"https://www.mrandmrssmith.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the loginIcon",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I login and as existing member",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.mrandmrssmith.com/",
      "offset": 9
    }
  ],
  "location": "LandingPage_sd.i_am_on(String)"
});
formatter.result({
  "duration": 8668078626,
  "status": "passed"
});
formatter.match({
  "location": "LandingPage_sd.i_click_on_the_loginIcon()"
});
formatter.result({
  "duration": 9580032364,
  "status": "passed"
});
formatter.match({
  "location": "LandingPage_sd.i_login_and_as_existing_member()"
});
formatter.result({
  "duration": 6761006780,
  "error_message": "org.openqa.selenium.NoSuchWindowException: Window not found. The browser window may have been closed.\nCommand duration or timeout: 1.92 seconds\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: com.smith.test.utility.MMSShopFirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d37.0.2, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 3510abd8-743c-4288-b828-97c4c8719f03\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:268)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:79)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:50)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat com.smith.test.pages.LandingPage.loginAsExistingSmithMember(LandingPage.java:26)\r\n\tat com.smith.test.pages_sd.LandingPage_sd.i_login_and_as_existing_member(LandingPage_sd.java:27)\r\n\tat ✽.And I login and as existing member(MmsVouchers.feature:8)\r\nCaused by: org.openqa.selenium.NoSuchWindowException: Window not found. The browser window may have been closed.\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.nsCommandProcessor.prototype.execute(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6378438526692628581webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12343)\r\n\tat \u003canonymous class\u003e.Dispatcher.executeAs/\u003c(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6378438526692628581webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:9061)\r\n\tat \u003canonymous class\u003e.Resource.prototype.handle(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6378438526692628581webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:9208)\r\n\tat \u003canonymous class\u003e.Dispatcher.prototype.dispatch(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6378438526692628581webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:9155)\r\n\tat \u003canonymous class\u003e.WebDriverServer/\u003c.handle(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6378438526692628581webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:12128)\r\n\tat \u003canonymous class\u003e.createHandlerFunc/\u003c(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6378438526692628581webdriver-profile/extensions/fxdriver@googlecode.com/components/httpd.js:2058)\r\n\tat \u003canonymous class\u003e.ServerHandler.prototype.handleResponse(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6378438526692628581webdriver-profile/extensions/fxdriver@googlecode.com/components/httpd.js:2391)\r\n\tat \u003canonymous class\u003e.Connection.prototype.process(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6378438526692628581webdriver-profile/extensions/fxdriver@googlecode.com/components/httpd.js:1227)\r\n\tat \u003canonymous class\u003e.RequestReader.prototype._handleResponse(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6378438526692628581webdriver-profile/extensions/fxdriver@googlecode.com/components/httpd.js:1681)\r\n\tat \u003canonymous class\u003e.RequestReader.prototype._processBody(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6378438526692628581webdriver-profile/extensions/fxdriver@googlecode.com/components/httpd.js:1529)\r\n\tat \u003canonymous class\u003e.RequestReader.prototype.onInputStreamReady(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous6378438526692628581webdriver-profile/extensions/fxdriver@googlecode.com/components/httpd.js:1397)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MMS_SHOP_sd.i_should_be_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "",
  "id": "buy-smith-vouchers;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I click on the ShopTab",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I should be on the mrandmrssmith page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I click on giftVouchers link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on \"Gift Vouchers\" Link",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select gift card for \"200\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click add to basket button",
  "keyword": "And "
});
formatter.match({
  "location": "MMS_SHOP_sd.i_click_on_the_ShopTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MMS_SHOP_sd.i_should_be_on_the_mrandmrssmith_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GiftVoucherPage_sd.i_click_on_giftVouchers_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Gift Vouchers",
      "offset": 12
    }
  ],
  "location": "GiftVoucherPage_sd.i_click_on_Link(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 24
    }
  ],
  "location": "GiftVoucherPage_sd.i_select_gift_card_for(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GiftVoucherPage_sd.i_click_add_to_basket_button()"
});
formatter.result({
  "status": "skipped"
});
});