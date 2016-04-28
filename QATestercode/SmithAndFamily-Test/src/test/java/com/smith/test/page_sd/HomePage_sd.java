package com.smith.test.page_sd;


import com.smith.test.pages.HomePage;
import com.smith.test.pages.LandingPage;
import com.smith.test.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;



/**
 * Created by sewadeus on 25/05/2015.
 */
public class HomePage_sd {

    LandingPage landingPage = PageFactory.initElements(Driver.driver, LandingPage.class);
    HomePage homePage = PageFactory.initElements(Driver.driver, HomePage.class);
    @Given("^I am on the smith hotel site \"(.*?)\"$")
    public void i_am_on_the_smith_hotel_site(String url) throws Throwable {
        landingPage.navigateToSmithAndFamily(url);

    }
    @Given("^I click on opt out link$")
    public void i_click_on_opt_out_link() throws Throwable {

    }

    @When("^I enter my destination \"(.*?)\"$")
    public void i_enter_my_destination(String destination) {
        System.out.println("entering my"+ destination);
        homePage.enterHotelDestination(destination);
    }

    @When("^I enter my checkin date \"(.*?)\"$")
    public void i_enter_my_checkin_date(String checkInDate)  {
        System.out.println("entering my"+ checkInDate);
        homePage.enterCheckinDate(checkInDate);
    }

    @When("^I enter my checkout date \"(.*?)\"$")
    public void i_enter_my_checkout_date(String checkOutDate)  {
        System.out.println("entering my"+ checkOutDate);
        homePage.enterCheckoutDate(checkOutDate);
    }

    @When("^I click on the \"(.*?)\" button$")
    public void i_click_on_the_button(String search)  {
        System.out.println("clinking on the" + search);
        homePage.clickOnSearchButton(search);
    }

    @Then("^I should see result for \"(.*?)\" and \"(.*?)\"$")
    public void i_should_see_result_for_and(String country, String destination) {
        System.out.print("I should see results for" + country + "and " + destination);
        homePage.validateHotelDestination(destination, country);
    }


    @Then("^I should see hotels Rates from price$")
    public void i_should_see_hotels_Rates_from_price() throws Throwable {
        homePage.validateHotelAverageRoomPrice();

    }

    @Then("^I click on the book now button$")
    public void i_click_on_the_book_now_button() throws Throwable {
        homePage.clickOnBookNowButton();
    }





}
