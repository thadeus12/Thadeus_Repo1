package pageStepDef
import cucumber.api.scala.{EN, ScalaDsl}
import pages.LoginPage1


class LoginStepDef extends ScalaDsl with EN with LoginPage1 {
 /* lazy val homePage = new HomePage()
  lazy val loginPage = new LoginPage()*/


  Given("""^I go to "([^"]*)"$"""){ (arg0:String) =>

    goToHomePage(arg0)
  }

  When("""^I click on the myaccount button$""") { () =>
    clickOnMyAccountLink()
  }

  When("""^I enter my email as "([^"]*)" and password "([^"]*)"$"""){ (arg0:String, arg1:String) =>
   entermMyEmailAndPassword(arg0,arg1)
  }


  When("""^I click on the submit button$"""){ () =>
    clickOnTheSubmitButton()
  }

  Then("""^I should see a message"([^"]*)" displayed$"""){ (arg0:String) =>
    validateIamLoggedIn(arg0)
  }


}