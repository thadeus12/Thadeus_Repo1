$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MYLogin.feature");
formatter.feature({
  "line": 4,
  "name": "As member of daily mail plus I should be able to login with email and password",
  "description": "",
  "id": "as-member-of-daily-mail-plus-i-should-be-able-to-login-with-email-and-password",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "",
  "description": "",
  "id": "as-member-of-daily-mail-plus-i-should-be-able-to-login-with-email-and-password;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I go to \"https://www.dailymailplus.co.uk/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on the myaccount button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter my email as \"tseyana@gmail.com\" and password \"kalanzi01\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on the submit button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I should see a message\"Welcome Mr sewa\" displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.dailymailplus.co.uk/",
      "offset": 9
    }
  ],
  "location": "LoginStepDef.scala:12"
});
formatter.result({
  "duration": 233206463,
  "error_message": "java.lang.NullPointerException\n\tat pages.HomePage.goToHomePage(HomePage.scala:10)\n\tat pageStepDef.LoginStepDef$$anonfun$3.apply(LoginStepDef.scala:13)\n\tat pageStepDef.LoginStepDef$$anonfun$3.apply(LoginStepDef.scala:12)\n\tat cucumber.api.scala.ScalaDsl$StepBody$$anonfun$apply$2.applyOrElse(ScalaDsl.scala:98)\n\tat cucumber.api.scala.ScalaDsl$StepBody$$anonfun$apply$2.applyOrElse(ScalaDsl.scala:96)\n\tat scala.runtime.AbstractPartialFunction.apply(AbstractPartialFunction.scala:36)\n\tat cucumber.runtime.scala.ScalaStepDefinition.execute(ScalaStepDefinition.scala:71)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:117)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:42)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:262)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:84)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)\n\tat ✽.Given I go to \"https://www.dailymailplus.co.uk/\"(MYLogin.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDef.scala:16"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "tseyana@gmail.com",
      "offset": 21
    },
    {
      "val": "kalanzi01",
      "offset": 54
    }
  ],
  "location": "LoginStepDef.scala:21"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDef.scala:26"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome Mr sewa",
      "offset": 23
    }
  ],
  "location": "LoginStepDef.scala:30"
});
formatter.result({
  "status": "skipped"
});
});