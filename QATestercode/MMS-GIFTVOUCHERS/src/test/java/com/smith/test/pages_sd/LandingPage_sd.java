package com.smith.test.pages_sd;
import com.smith.test.pages.LandingPage;
import com.smith.test.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thadeuss on 10/12/2015.
 */
public class LandingPage_sd {
    LandingPage landingPage = PageFactory.initElements(Driver.driver,LandingPage.class);

    @Given("^I am on \"(.*?)\"$")
    public void i_am_on(String arg1) throws Throwable {
        landingPage.goToMMSHomePage(arg1);
    }

    @When("^I click on the loginIcon$")
    public void i_click_on_the_loginIcon() throws Throwable {
        landingPage.clickOnHomePageLoginIcon();
    }

    @When("^I login and as existing member$")
    public void i_login_and_as_existing_member() throws Throwable {
        landingPage.loginAsExistingSmithMember();
    }


}
