package com.smith.test.page_sd;


import com.smith.test.pages.HomePage;
import com.smith.test.pages.InspirationPage;
import com.smith.test.pages.LandingPage;
import com.smith.test.utility.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thadeuss on 2/3/2016.
 */
public class InspirationPage_sd {

    LandingPage landingPage = new LandingPage();
    HomePage homePage = PageFactory.initElements(Driver.driver, HomePage.class);
    InspirationPage inspirationPage= PageFactory.initElements(Driver.driver, InspirationPage.class);



    @Given("^I go \"(.*?)\"$")
    public void i_go(String smithCollections) throws Throwable {
        landingPage.navigateToSmithAndFamily(smithCollections);
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
        homePage.validateHotelDestination(destination, country);
    }



}
