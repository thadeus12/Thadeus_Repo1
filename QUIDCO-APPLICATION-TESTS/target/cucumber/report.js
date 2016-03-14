$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/test/quidco/Reg.feature");
formatter.feature({
  "line": 3,
  "name": "As a new user i should be able to join Quidco",
  "description": "",
  "id": "as-a-new-user-i-should-be-able-to-join-quidco",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@smoke-test"
    }
  ]
});
formatter.before({
  "duration": 275397,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "a few cukes",
  "description": "",
  "id": "as-a-new-user-i-should-be-able-to-join-quidco;a-few-cukes",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I go to \"http://www.quidco.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the joine for free button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see registration form",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.quidco.com/",
      "offset": 9
    }
  ],
  "location": "LandingPage_sd.i_go_to(String)"
});
formatter.result({
  "duration": 8874049222,
  "status": "passed"
});
formatter.match({
  "location": "LandingPage_sd.i_click_on_the_joine_for_free_button()"
});
formatter.result({
  "duration": 1395511989,
  "status": "passed"
});
formatter.match({
  "location": "LandingPage_sd.i_should_see_registration_form()"
});
formatter.result({
  "duration": 61056609884,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 60 seconds waiting for com.test.quidco.utility.Driver$1@2cae1042\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: Driver\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:259)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)\r\n\tat com.test.quidco.utility.Driver.waitForElementDisplay(Driver.java:46)\r\n\tat com.test.quidco.pages.RegisterPages.clickOnJoinFreeButton(RegisterPages.java:25)\r\n\tat com.test.quidco.page_sd.LandingPage_sd.i_should_see_registration_form(LandingPage_sd.java:28)\r\n\tat ✽.Then I should see registration form(com/test/quidco/Reg.feature:8)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".mixpanel-join-button-nav\"}\nCommand duration or timeout: 86 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d37.0.2, platform\u003dWINDOWS, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: adaf31c6-402e-4f7d-ab6f-192b192fe2fe\n*** Element info: {Using\u003dcss selector, value\u003d.mixpanel-join-button-nav}\r\n\tat sun.reflect.GeneratedConstructorAccessor12.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:441)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:425)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:59)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:37)\r\n\tat com.sun.proxy.$Proxy17.isDisplayed(Unknown Source)\r\n\tat com.test.quidco.utility.Driver$1.apply(Driver.java:50)\r\n\tat com.test.quidco.utility.Driver$1.apply(Driver.java:46)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\tat com.test.quidco.utility.Driver.waitForElementDisplay(Driver.java:46)\r\n\tat com.test.quidco.pages.RegisterPages.clickOnJoinFreeButton(RegisterPages.java:25)\r\n\tat com.test.quidco.page_sd.LandingPage_sd.i_should_see_registration_form(LandingPage_sd.java:28)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:234)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:74)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".mixpanel-join-button-nav\"}\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027Thadeus\u0027, ip: \u0027169.254.65.248\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: driver.version: unknown\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElementInternal_(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous3336842454882637548webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10271)\r\n\tat \u003canonymous class\u003e.FirefoxDriver.prototype.findElement(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous3336842454882637548webdriver-profile/extensions/fxdriver@googlecode.com/components/driver-component.js:10280)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_/h(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous3336842454882637548webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12274)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.executeInternal_(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous3336842454882637548webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12279)\r\n\tat \u003canonymous class\u003e.DelayedCommand.prototype.execute/\u003c(file:///C:/Users/sewadeus/AppData/Local/Temp/anonymous3336842454882637548webdriver-profile/extensions/fxdriver@googlecode.com/components/command-processor.js:12221)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 462332110,
  "status": "passed"
});
});