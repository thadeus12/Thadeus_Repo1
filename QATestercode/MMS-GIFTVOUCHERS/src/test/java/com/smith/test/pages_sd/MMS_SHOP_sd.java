package com.smith.test.pages_sd;

import com.smith.test.pages.LandingPage;
import com.smith.test.pages.MMS_SHOP;
import com.smith.test.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thadeuss on 2/16/2016.
 */
public class MMS_SHOP_sd {
    LandingPage langPage = new LandingPage();
    MMS_SHOP mmShop = PageFactory.initElements(Driver.driver,MMS_SHOP.class);

    @Then("^I should be logged in$")
    public void i_should_be_logged_in() throws Throwable {
        mmShop.validateUserIsLoggedIn();

    }

    @Given("^I click on the ShopTab$")
    public void i_click_on_the_ShopTab() throws Throwable {
        mmShop.clickOnShopTab();

    }

    @Then("^I should be on the mrandmrssmith page$")
    public void i_should_be_on_the_mrandmrssmith_page() throws Throwable {
        mmShop.validateUserOnMmsShop();

    }




}
