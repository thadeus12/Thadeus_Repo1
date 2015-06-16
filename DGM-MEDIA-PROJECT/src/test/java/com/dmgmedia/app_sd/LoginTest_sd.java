package com.dmgmedia.app_sd;


import com.dmgmedia.apputility.GetConfigProperties;
import com.dmgmedia.pages.LoginPage;
import cucumber.api.DataTable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import java.util.List;

/**
 * Created by sewadeus on 14/06/2015.
 */
public class LoginTest_sd {

    LoginPage loginPage = new LoginPage();


    @Given("^I am on the Media Plus page$")
    public void i_am_on_the_Media_Plus_page() throws Throwable {

        loginPage.getHomePage();
    }

    @When("^I click on the Account tab$")
    public void i_click_on_the_Account_tab() throws Throwable {
        loginPage.navigateToAccount();
    }

    @When("^I enter my username$")
    public void i_enter_my_username() throws Throwable {
        String username = GetConfigProperties.getUsername();
        loginPage.enterUserEmail(username);
    }

    @When("^I enter my password$")
    public void i_enter_my_password() throws Throwable {
        String password = GetConfigProperties.getPassword();
        loginPage.enterUserPassword(password);
    }

    @When("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {
        loginPage.clickLoginButton();

    }

    @Then("^I should be logged in to my account$")
    public void i_should_be_logged_in_to_my_account() throws Throwable {
        loginPage.validateAccountPage();
    }

    @Then("^The tabs listed below should be displayed$")
    public void the_tabs_listed_below_should_be_displayed(DataTable table) throws Throwable {
        List<List<String>> tabs = table.raw();
        loginPage.validateTabsonAccountPage(tabs);

    }

    @When("^I click on the signout link$")
    public void i_click_on_the_signout_link() throws Throwable {

        loginPage.clickOnSignOut();
    }

    @Then("^I should be logged out of my account$")
    public void i_should_be_logged_out_of_my_account() throws Throwable {

        loginPage.validateSignOutComplete();
    }

}
