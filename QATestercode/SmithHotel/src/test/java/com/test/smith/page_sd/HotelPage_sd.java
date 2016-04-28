package com.test.smith.page_sd;

import com.test.smith.page.HotelPage;
import com.test.smith.page.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

import static com.test.smith.utility.Driver.driver;

/**
 * Created by sewadeus on 18/07/2015.
 */
public class HotelPage_sd {

    HotelPage hotelPage = PageFactory.initElements(driver,HotelPage.class);

    @Then("^I should be on get a room tab$")
    public void i_should_be_on_get_a_room_tab() throws Throwable {
        hotelPage.validateLandedOnGetARoomPage();
    }

    @Then("^I should see rate per night and total cost of stay$")
    public void i_should_see_rate_per_night_and_total_cost_of_stay() throws Throwable {
        hotelPage.validateRoomratePerNightAndTotalCostForStay();

    }

    @Then("^I click on book it button$")
    public void i_click_on_book_it_button() throws Throwable {
        hotelPage.clickOnBookITButton();
    }
    @Then("^I should see who is sleeping in the room Popup$")
    public void i_should_see_who_is_sleeping_in_the_room_Popup() throws Throwable {
        hotelPage.validateRoomGuestPopUp();
    }

    @Then("^I enter \"(.*?)\" as number of \"adults staying in the room$")
    public void i_enter_as_number_of_adults_staying_in_the_room(String arg1) throws Throwable {
        hotelPage.enterAdultStayingInThisRoom(arg1);

    }

    @Then("^I enter \"(.*?)\" as number of children staying in the room$")
    public void i_enter_as_number_of_children_staying_in_the_room(String arg1) throws Throwable {
       hotelPage.enterChildrenStaying(arg1);

    }
    @Then("^I enter \"(.*?)\" as number of Infants staying in the room$")
    public void i_enter_as_number_of_Infants_staying_in_the_room(String arg1) throws Throwable {
        hotelPage.enterInfantsStayingInThisRoom(arg1);

    }

    @Then("^I select \"(.*?)\" as age of child staying from dropdown$")
    public void i_select_as_age_of_child_staying_from_dropdown(String arg1) throws Throwable {
        hotelPage.selectingAgeOFChildStaying(arg1);

    }

    @Then("^I select \"(.*?)\" as the age of Infant from dropdown$")
    public void i_select_as_the_age_of_Infant_from_dropdown(String arg1) throws Throwable {
        hotelPage.selectingAgeInfantStaying(arg1);

    }

    @Then("^I click on confirm button$")
    public void i_click_on_confirm_button() throws Throwable {
        hotelPage.clickingToConfirmPeopleStaying();

    }
    @Then("^I should click on next  button for a room with extas$")
    public void i_should_click_on_next_button_for_a_room_with_extras() throws Throwable {
        hotelPage.clickingOnNextButtonForARoomWithExtras();

    }
    @Then("^I should see signin as  returning or continue as new customer Popup$")
    public void i_should_see_signin_as_returning_or_continue_as_new_customer_Popup() throws Throwable {
        hotelPage.validateNewReturningCustomerPopUp();

    }

    @Then("^I click on continue as new customer$")
    public void i_click_on_continue_as_new_customer() throws Throwable {hotelPage.getParentWindowHandle();
       hotelPage.switchToLoginIframe();
       hotelPage.continueAsNewCustomer();
       hotelPage.getParentWindowHandle();

    }


    @Then("^I sign in a returning customer$")
    public void i_sign_in_a_returning_customer() throws Throwable {
        hotelPage.getParentWindowHandle();
        hotelPage.switchToLoginIframe();
        hotelPage.iframeLogin();
        hotelPage.getParentWindowHandle();

    }


}
