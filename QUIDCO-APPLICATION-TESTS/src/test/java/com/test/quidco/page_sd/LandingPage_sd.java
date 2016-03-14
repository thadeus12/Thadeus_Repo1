package com.test.quidco.page_sd;

import com.test.quidco.Belly;
import com.test.quidco.pages.LandingPage;
import com.test.quidco.pages.RegisterPages;
import com.test.quidco.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class LandingPage_sd {
    LandingPage landingpage = new LandingPage();
    RegisterPages registerPages = PageFactory.initElements(Driver.driver,RegisterPages.class);
    @Given("^I go to \"(.*?)\"$")
    public void i_go_to(String arg1) throws Throwable {
       landingpage.navigateToHomePage(arg1);
    }

    @When("^I click on the joine for free button$")
    public void i_click_on_the_joine_for_free_button() throws Throwable {
        registerPages.clickOnJoinFreeButton();

    }

    @Then("^I should see registration form$")
    public void i_should_see_registration_form() throws Throwable {
        registerPages.clickOnJoinFreeButton();

    }

}
