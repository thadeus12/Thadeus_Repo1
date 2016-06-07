package com.test.shoop.pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by sewadeus on 07/06/2016.
 */
public class CategoryTest_sd {
    HomePage homePage = new HomePage();

    @Given("^I go to shoop website$")
    public void i_go_to_shoop_website() throws Throwable {
        homePage.naviagetToHomePage();

    }

  /*  @When("^I search a merchant \"([^\"]*)\"$")
    public void i_search_a_merchant(String arg1) throws Throwable {

    }

    @Then("^I should be on the merchant \"([^\"]*)\" page$")
    public void i_should_be_on_the_merchant_page(String arg1) throws Throwable {

    }*/

}
