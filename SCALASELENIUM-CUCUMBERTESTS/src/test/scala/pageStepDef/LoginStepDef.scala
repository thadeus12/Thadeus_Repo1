package pageStepDef
import pages.{HomePage, LoginPage}
import cucumber.api.scala.{EN, ScalaDsl}




class LoginStepDef {
  lazy val homePage = new HomePage()
  lazy val loginPage = new LoginPage()


  Given("""^I go to "([^"]*)"$"""){ (arg0:String) =>
    homePage.goToHomePage(arg0)
  }

  When("""^I click on the myaccount button$""") { () =>

  loginPage.clickOnMyAccountLink()
  }

  When("""^I enter my email as "([^"]*)" and password "([^"]*)"$"""){ (arg0:String, arg1:String) =>
   loginPage.entermMyEmailAndPassword(arg0,arg1)
  }


  When("""^I click on the submit button$"""){ () =>
    loginPage.clickOnTheSubmitButton()
  }

  Then("""^I should see a message"([^"]*)" displayed$"""){ (arg0:String) =>
    loginPage.validateIamLoggedIn(arg0)
  }


}