package com.test.smith.page_sd;

import com.test.smith.page.LandingPage;
import com.test.smith.page.SearchPage;
import com.test.smith.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static com.test.smith.utility.Driver.driver;

/**
 * Created by sewadeus on 25/05/2015.
 */
public class HotelSearch_sd {

    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
    @Given("^I am on the smith hotel site \"(.*?)\"$")
    public void i_am_on_the_smith_hotel_site(String url) throws Throwable {
        landingPage.navigateToHomePage(url);

    }

    @Given("^I click on opt out link$")
    public void i_click_on_opt_out_link() throws Throwable {
       searchPage.clickingToOptoutOFBeta();
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
        System.out.println("clinking on the" + search);
        searchPage.clickOnSearchButton(search);
    }

    @Then("^I should see result for \"(.*?)\" and \"(.*?)\"$")
    public void i_should_see_result_for_and(String country, String destination) {
        System.out.print("I should see results for" + country + "and " + destination);
        searchPage.validateHotelDestination(destination, country);
    }


    @Then("^I should see hotels Rates from price$")
    public void i_should_see_hotels_Rates_from_price() throws Throwable {
        searchPage.validateHotelAveragePrice();

    }

    @Then("^I click on the book now button$")
    public void i_click_on_the_book_now_button() throws Throwable {
        searchPage.clickOnBookNowButton();
    }


    @Then("^I should be on get a room tab$")
    public void i_should_be_on_get_a_room_tab() throws Throwable {
        searchPage.validateLandedOnGetARoomPage();
    }

    @Then("^I should see rate per night and total cost of stay$")
    public void i_should_see_rate_per_night_and_total_cost_of_stay() throws Throwable {
        searchPage.validateRoomratePerNightAndTotalCostForStay();

    }

    @Then("^I click on book it button$")
    public void i_click_on_book_it_button() throws Throwable {
        searchPage.clickOnBookITButton();
    }
    @Then("^I should see who is sleeping in the room Popup$")
    public void i_should_see_who_is_sleeping_in_the_room_Popup() throws Throwable {
        searchPage.validateRoomGuestPopUp();
    }

    @Then("^I enter \"(.*?)\" as number of \"adults staying in the room$")
    public void i_enter_as_number_of_adults_staying_in_the_room(String arg1) throws Throwable {
        searchPage.enterAdultStayingInThisRoom(arg1);

    }



    @Then("^I enter \"(.*?)\" as number of children staying in the room$")
    public void i_enter_as_number_of_children_staying_in_the_room(String arg1) throws Throwable {
        searchPage.enterChildrenStaying(arg1);

    }


    @Then("^I enter \"(.*?)\" as number of Infants staying in the room$")
    public void i_enter_as_number_of_Infants_staying_in_the_room(String arg1) throws Throwable {
        searchPage.enterInfantsStayingInThisRoom(arg1);

    }

    @Then("^I select \"(.*?)\" as age of child staying from dropdown$")
    public void i_select_as_age_of_child_staying_from_dropdown(String arg1) throws Throwable {
        searchPage.selectingAgeOFChildStaying(arg1);

    }

    @Then("^I select \"(.*?)\" as the age of Infant from dropdown$")
    public void i_select_as_the_age_of_Infant_from_dropdown(String arg1) throws Throwable {
        searchPage.selectingAgeInfantStaying(arg1);

    }

    @Then("^I click on confirm button$")
    public void i_click_on_confirm_button() throws Throwable {
        searchPage.clickingToConfirmPeopleStaying();

    }
    @Then("^I click on continue as new customer$")
    public void i_click_on_continue_as_new_customer() throws Throwable {

    }


    @Then("^I should click on next  button for a room with extas$")
    public void i_should_click_on_next_button_for_a_room_with_extras() throws Throwable {
        searchPage.clickingOnNextButtonForARoomWithExtras();

    }
    @Then("^I should see signin as  returning or continue as new customer Popup$")
    public void i_should_see_signin_as_returning_or_continue_as_new_customer_Popup() throws Throwable {
        searchPage.getParentWindowHandle();
        searchPage.switchToLoginIframe();
        searchPage.validateNewReturningCustomerPopUp();

    }

    @Then("^I sign in a returning customer$")
    public void i_sign_in_a_returning_customer() throws Throwable {

         searchPage.iframeLogin();
        searchPage.getParentWindowHandle();

    }

    @Then("^I should be on smithcollections booking step two$")
    public void i_should_be_on_smithcollections_booking_step_two()     {
     searchPage.validateSmithCollectionsBookingSummaryBookingStep2();
    }

}
