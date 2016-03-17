package com.shoop.test.page_sd;

import com.shoop.test.pages.ShoopLoginPage;
import com.shoop.test.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thadeus Ssewanyana on 16/03/2016.
 *
 */

public class ShoopLoginPage_sd {
    ShoopLoginPage loginPage = PageFactory.initElements(Driver.driver,ShoopLoginPage.class);

    @Given("^I enter my username and password$")
    public void i_enter_my_username_and_password() throws Throwable {
        loginPage.confirmLoginPopupIsDisplayedAndLogin();

    }

    @Given("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {
        loginPage.clickOnLoginButton();

    }

    @Then("^I should be logged in$")
    public void i_should_be_logged_in() throws Throwable {
        loginPage.validateUserIsLoggedIn();


    }


}
