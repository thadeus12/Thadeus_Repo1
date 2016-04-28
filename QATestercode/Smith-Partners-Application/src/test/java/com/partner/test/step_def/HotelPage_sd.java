package com.partner.test.step_def;

import com.partner.test.pages.PartnerHotelPage;
import com.partner.test.pages.SmithPartnerBookingPage;
import com.partner.test.utility.Driver;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thadeuss on 2/10/2016.
 */
public class HotelPage_sd extends Driver {

   PartnerHotelPage partnerHotelPage = PageFactory.initElements(Driver.driver,PartnerHotelPage.class);

    @Then("^I should \"(.*?)\" on the hotel page$")
    public void i_should_on_the_hotel_page(String arg1) throws Throwable {
        partnerHotelPage.validateUserOnHotelPage(arg1);
    }

    @Then("^I click on book it button$")
    public void i_click_on_book_it_button() throws Throwable {
       partnerHotelPage.clickOnBookItButton();
    }

    @Then("^I should see who is sleeping in the room Popup$")
    public void i_should_see_who_is_sleeping_in_the_room_Popup() throws Throwable {
        partnerHotelPage.validateRoomGuestPopUp();
    }

    @Then("^I enter \"(.*?)\" as number of \"adults staying in the room$")
    public void i_enter_as_number_of_adults_staying_in_the_room(String arg1) throws Throwable {
        partnerHotelPage.enterAdultStayingInThisRoom(arg1);

    }
    @Then("^I click confirm button to add room to the basket$")
    public void i_click_confirm_button_to_add_room_to_the_basket() throws Throwable {
       partnerHotelPage.clickConfirmButtonToAddRoomToBasket();
    }

    @Then("^I click on confirm booking button$")
    public void i_click_on_confirm_booking_button() throws Throwable {
        partnerHotelPage.clickOnConfirmBookingButton();

    }
}
