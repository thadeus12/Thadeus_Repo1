package com.test.smith.page_sd;

import com.test.smith.page.HomePage;
import com.test.smith.page.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static com.test.smith.utility.Driver.driver;

/**
 * Created by sewadeus on 25/05/2015.
 */
public class HotelSearch_sd {

    HomePage homePage = PageFactory.initElements(driver(), HomePage.class);
    SearchPage searchPage = PageFactory.initElements(driver(), SearchPage.class);

    @Given("^am on the smith hotel site \"(.*?)\"$")
    public void am_on_the_smith_hotel_site(String url) throws Throwable {

        homePage.navigateToHomePage(url);
    }

    @When("^I enter my destination \"(.*?)\"$")
    public void i_enter_my_destination(String destination) {
        System.out.println("entering my"+ destination);
        searchPage.enterHotelDestination(destination);
    }

    @When("^I enter my checkin date \"(.*?)\"$")
    public void i_enter_my_checkin_date(String checkInDate)  {
        System.out.println("entering my"+ checkInDate);
        searchPage.enterCheckinDate(checkInDate);
    }

    @When("^I enter my checkout date \"(.*?)\"$")
    public void i_enter_my_checkout_date(String checkOutDate)  {
        System.out.println("entering my"+ checkOutDate);
        searchPage.enterCheckoutDate(checkOutDate);
    }

    @When("^I click on the \"(.*?)\" button$")
    public void i_click_on_the_button(String search)  {
        System.out.println("clinking on the"+ search);
        searchPage.clickOnSearchButton(search);
    }

    @Then("^I should see result for \"(.*?)\" and \"(.*?)\"$")
    public void i_should_see_result_for_and(String country, String destination) {
        System.out.print("I should see results for"+ country +"and "+ destination);
        searchPage.validateHotelDestination(destination,country);
    }


}
