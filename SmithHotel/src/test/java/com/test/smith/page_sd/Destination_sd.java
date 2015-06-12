package com.test.smith.page_sd;

import com.test.smith.page.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by sewadeus on 10/06/2015.
 */
public class Destination_sd {

HomePage homePage = new HomePage();

    @When("^I click on the \"(.*?)\" tag map$")
    public void i_click_on_the_tag_map(String arg1) throws Throwable {

    }

    @And("^I click on country  \"(.*?)\"$")
    public void i_click_on_country(String arg1) throws Throwable {

    }

    @And("^I click on \"(.*?)\" link$")
    public void i_click_on_link(String arg1) throws Throwable {

    }


    @And("^I click on \"(.*?)\" city link$")
    public void i_click_on_city_link(String arg1) throws Throwable {




    }
}
