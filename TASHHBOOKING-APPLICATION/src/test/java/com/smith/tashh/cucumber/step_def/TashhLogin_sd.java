package com.smith.tashh.cucumber.step_def;

import com.smith.tashh.cucumber.pages.TashhHomePage;
import com.smith.tashh.cucumber.utility.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sewadeus on 04/10/2015.
 */


public class TashhLogin_sd {

    TashhHomePage tashhHomePage=PageFactory.initElements(Driver.driver,TashhHomePage.class);

    @Given("^I am on \"(.*?)\"$")
    public void i_am_on(String url) throws Throwable {
       tashhHomePage.navigateTashhHomePage(url);
    }

    @Given("^I enter my username and password$")
    public void i_enter_my_username_and_password() throws Throwable {
        tashhHomePage.tashhLogin();
    }

    @Given("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {
       tashhHomePage.clickLoginButton();
    }



}
