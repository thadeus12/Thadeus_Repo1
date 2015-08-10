package com.test.smith.page_sd;

import com.test.smith.page.LandingPage;
import com.test.smith.page.InspirationPage;

import com.test.smith.page.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static com.test.smith.utility.Driver.driver;

/**
 * Created by sewadeus on 09/06/2015.
 */
public class Inspiration_sd{

    LandingPage homepage = new LandingPage();
    InspirationPage inspirationPage=PageFactory.initElements(driver, InspirationPage.class);
    SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

    @Given("^I go \"(.*?)\"$")
    public void i_go(String smithCollections) throws Throwable {

        homepage.navigateToHomePage(smithCollections);
    }

    @When("^I click on the \"(.*?)\" link$")
    public void i_click_on_the_link(String link) throws Throwable {
        inspirationPage.clickonLink(link);
    }

    @When("^I select \"(.*?)\" from dropdown$")
    public void i_select_from_dropdown(String country) throws Throwable {
       inspirationPage.selectCountryDropdow(country);
    }

    @When("^I select destination \"(.*?)\" from dropdown$")
    public void i_select_destination_from_dropdown(String destination) throws Throwable {
        inspirationPage.selectDestinationDropdow(destination);
    }

    @And("^I click to \"(.*?)\" button$")
    public void i_click_to_button(String arg1) throws Throwable {
     inspirationPage.checkAvailability(arg1);
    }


    @And("^I should see hotels result for \"(.*?)\" and \"(.*?)\"$")
    public void i_should_see_hotels_result_for_and(String country, String destination) throws Throwable {
        searchPage.validateHotelDestination(destination, country);
    }


}
