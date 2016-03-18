package com.shoop.test.page_sd;

import com.shoop.test.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by sewadeus on 18/03/2016.
 */
public class HomePageLinks_sd {
    HomePage homePage = new HomePage();

    @When("^I click on Mode tab on the home page$")
    public void i_click_on_Mode_tab_on_the_home_page() throws Throwable {
        homePage.clickOnModeTab();
    }

    @Then("^The tabs listed below should be displayed$")
    public void the_tabs_listed_below_should_be_displayed(DataTable table) throws Throwable {
        List<List<String>> tabs = table.raw();
        homePage.validateTabsonModePage(tabs);

    }



}
