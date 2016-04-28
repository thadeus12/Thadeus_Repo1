package com.smith.test.page_sd;


import com.smith.test.pages.DetailsPaymentPage;
import com.smith.test.utility.Driver;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thadeuss on 2/11/2016.
 */
public class DetailsPaymentPage_sd {
    DetailsPaymentPage paymentDetails = PageFactory.initElements(Driver.driver,DetailsPaymentPage.class);

    @Then("^I should be on smithcollections booking step two$")
    public void i_should_be_on_smithcollections_booking_step_two()     {
        paymentDetails.validateSmithCollectionsBookingSummaryBookingStep2();
    }
    @Then("^I select currency type as \"(.*?)\" from card type dropdown$")
    public void i_select_currency_type_as_from_card_type_dropdown(String arg1) throws Throwable {
        paymentDetails.selectCurrencyType(arg1);
    }
    @Then("^I should see hotel address displayed$")
    public void i_should_see_hotel_address_displayed() throws Throwable {
        paymentDetails.validateHotelAddressDisplayed();

    }

    @Then("^should see booking cancellation policy and additional charges$")
    public void should_see_booking_cancellation_policy_and_additional_charges() throws Throwable {
        paymentDetails.validateBookingCancellationPolicyAndAdditionalCharges();
    }

    @Then("^I check my booking summary detals$")
    public void i_check_my_booking_summary_detals() throws Throwable {
     paymentDetails.validateRoomBookingSummary();
    }


    @Then("^I enter First name as \"(.*?)\" and last name as \"(.*?)\"$")
    public void i_enter_First_name_as_and_last_name_as(String arg1, String arg2) throws Throwable {
        paymentDetails.entermyFirstandLastNames(arg1,arg2);
    }

    @Then("^I enter email address as \"(.*?)\" and phone number as \"(.*?)\"$")
    public void i_enter_email_address_as_and_phone_number_as(String arg1, String arg2) throws Throwable {
        paymentDetails.enterMyEmaildAndPhoneNumbers(arg1,arg2);

    }

    @Then("^I select my country as \"(.*?)\" from dropdown$")
    public void i_select_my_country_as_from_dropdown(String arg1) throws Throwable {
        paymentDetails.selectMyCountry(arg1);

    }

    @Then("^I enter my Address line one as \"(.*?)\" And line two address as \"(.*?)\"$")
    public void i_enter_my_Address_line_one_as_And_line_two_address_as(String arg1, String arg2) throws Throwable {
        paymentDetails.enterMyAddressline1AndLine2(arg1,arg2);
    }

    @Then("^I enter my postcode as \"(.*?)\" and town as \"(.*?)\"$")
    public void i_enter_my_postcode_as_and_town_as(String arg1, String arg2) throws Throwable {
        paymentDetails.enterMyTownAndPostcode(arg1,arg2);
    }


    @Then("^I enter gift card or voucher code as \"(.*?)\"$")
    public void i_enter_gift_card_or_voucher_code_as(String arg1) throws Throwable {
        paymentDetails.enterGiftCardAndPromoCodeVoucherNumber(arg1);
    }

    @Then("^I enter my loyallty credit as \"(.*?)\"$")
    public void i_enter_my_loyallty_credit_as(String arg1) throws Throwable {
        paymentDetails.addLoyaltyCredit(arg1);

    }


    @Then("^I select card type as \"(.*?)\" from card type dropdown$")
    public void i_select_card_type_as_from_card_type_dropdown(String arg1) throws Throwable {
        paymentDetails.selecteCardType(arg1);

    }

    @Then("^I enter card number as \"(.*?)\" and name on card as \"(.*?)\"$")
    public void i_enter_card_number_as_and_name_on_card_as(String arg1, String arg2) throws Throwable {
        paymentDetails.enterCardNumberAndNameOnCard(arg1, arg2);

    }

    @Then("^I select card expiry month as \"(.*?)\" and year \"(.*?)\" from dropdown$")
    public void i_select_card_expiry_month_as_and_year_from_dropdown(String arg1, String arg2) throws Throwable {
        paymentDetails.selectcardExpiryDates(arg1,arg2);
    }

    @Then("^I enter card CVV as \"(.*?)\" in cvv field$")
    public void i_enter_card_CVV_as_in_cvv_field(String arg1) throws Throwable {
        paymentDetails.enterCardSecurityCode(arg1);
    }

    @Then("^I checkbox to agree to booking terms and conditions$")
    public void i_checkbox_to_agree_to_booking_terms_and_conditions() throws Throwable {
        paymentDetails.agreeToBookingTermsAndConditions();
    }

    @Then("^I should see deposit to pay now displayed on page$")
    public void i_should_see_deposit_to_pay_now_displayed_on_page() throws Throwable {
        paymentDetails.validateDepositToPayNow();

    }
    @Then("^I click on the make Payment button$")
    public void i_click_on_the_make_Payment_button() throws Throwable {
        paymentDetails.clickOnMakePaymentButton();
    }




}
