package com.test.smith.page_sd;

import com.test.smith.page.BookingConfirmationPage;
import com.test.smith.utility.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thadeuss on 2/11/2016.
 */
public class BookingConfirmationPage_sd {
    BookingConfirmationPage confirmBooking = PageFactory.initElements(Driver.driver,BookingConfirmationPage.class);

    @Then("^I should be on booking confirmation page$")
    public void i_should_be_on_booking_confirmation_page() throws Throwable {
        confirmBooking.validateBookingConfirmationPage();
    }
    @Then("^I should see booking confirmation reference number and email$")
    public void i_should_see_booking_confirmation_reference_number_and_email() throws Throwable {
         confirmBooking.validateBookingReferenceNumberAndSendingConfirmationEmail();
    }

    @And("^I should see print this page and view confirmation links$")
    public void i_should_see_print_this_page_and_view_confirmation_links(){
         confirmBooking.validatePrintthisPageAndViewConfirmationLinks();
    }

    @Then("^I should see confirmation page Total booking price$")
    public void i_should_see_confirmation_page_Total_booking_price() throws Throwable {
         confirmBooking.validateBookingComfirmationPageTotalBookingPrice();
    }

    @Then("^I should see confirmation page Total Deposite paid$")
    public void i_should_see_confirmation_page_Total_Deposite_paid() throws Throwable {
         confirmBooking.validateBookingComfirmationPageTotalBookingPrice();

    }

    @Then("^I should see confirmation page Total Gift voucher paid$")
    public void i_should_see_confirmation_page_Total_Gift_voucher_paid() throws Throwable {
         confirmBooking.validateBookingConfirmationPageGiftVoucherPaid();
    }

    @Then("^I should see confirmation page Total Loyalty paid$")
    public void i_should_see_confirmation_page_Total_Loyalty_paid() throws Throwable {
         confirmBooking.validateConfirmationPageLoyaltyPaid();
    }

    @Then("^I should see confirmation page Total Still amount paid$")
    public void i_should_see_confirmation_page_Total_Still_amount_paid() throws Throwable {
         confirmBooking.validateBookingComfirmationPageStillToPay();
    }

    @Then("^I should see confirmation page booking Terms and conditions$")
    public void i_should_see_confirmation_page_booking_Terms_and_conditions() throws Throwable {
         confirmBooking.validateBookingconfirmationPageTermasAndConditions();
    }

    @Then("^I should see confirmation page booking cancellation policy$")
    public void i_should_see_confirmation_page_booking_cancellation_policy() throws Throwable {
         confirmBooking.validateCancellationPolicyIsDisplayed();
    }

    @Then("^I should see confirmation page booking deposit policy$")
    public void i_should_see_confirmation_page_booking_deposit_policy() throws Throwable {
         confirmBooking.validateHotelBookingConfirmationDepositPolicyDisplayed();

    }

    @Then("^I should see confirmation page booking check in check out times$")
    public void i_should_see_confirmation_page_booking_check_in_check_out_times() throws Throwable {
         confirmBooking.validateCheckinCheckOutTimes();
    }

    @Then("^I click on view confirmation print this page$")
    public void i_click_on_view_confirmation_print_this_page() throws Throwable {

    }





}
