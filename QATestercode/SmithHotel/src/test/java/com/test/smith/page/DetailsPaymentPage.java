package com.test.smith.page;

import com.test.smith.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Thadeuss on 2/11/2015.
 */
public class DetailsPaymentPage extends Driver {


    @FindBy(css = "#currency_filter_currency")
    private WebElement  currencyDropdown;

    @FindBy(css = ".bookingSummary.mod-bookingDetail.inner")
    private WebElement bookingSummaryDetails;

    @FindBy(css = ".mod-bookingSummaryTable-priceTable>tbody>tr>th")
    private WebElement totalBookingPriceAndDepositToPayNow;
    @FindBy(css = ".room")
    private WebElement stepTwoRoomDetails;

    @FindBy(css = ".roomInfoLast")
    private WebElement additionalCharges;

    @FindBy(css = ".roomInfoBar>p")
    private WebElement roomCancellationPolicy;

    @FindBy(css = ".featHead")
    private WebElement bookinStepTwo;

    @FindBy(css = ".bookingSummary.mod-bookingDetail.inner>address")
    private WebElement hotelAddress;

    @FindBy(css = "#step_two_member_firstname")
    private WebElement fname;
    @FindBy(css = "#step_two_member_lastname")
    private WebElement Lname;
    @FindBy(css = "#step_two_member_default_identity_email")
    private WebElement emailInput;
    @FindBy(css = "#step_two_member_default_phone_number_number")
    private WebElement phoneNumber;
    @FindBy(css = "#step_two_address_country")
    private WebElement usersCountry;

    @FindBy(css = "#step_two_address_line_1")
    private WebElement addressLine1;
    @FindBy(css = "#step_two_address_line_2")
    private WebElement addressLine2;

    @FindBy(css = "#step_two_address_town")
    private WebElement addressTown;
    @FindBy(css = "#step_two_address_postcode")
    private WebElement addressPostCode;

    @FindBy(css = "#voucher_code")
    private WebElement AddGiftCardNumber;
    @FindBy(css = "#voucher-button-submit")
    private WebElement submitvouchercode;

    @FindBy(css = "#loyalty_amount")
    private WebElement AddLoyaltyAmount;
    @FindBy(css = "#loyalty-button-submit")
    private WebElement submitloyaltycode;

    @FindBy(css = "#step_two_payment_type")
    private WebElement cardPaymentType;

    @FindBy(css = "#step_two_payment_number")
    private WebElement addCardNumber;
    @FindBy(css = "#step_two_payment_name_on_card")
    private WebElement addNameOnCard;

    @FindBy(css = "#step_two_payment_expiry_date_month")
    private WebElement selectMonth;
    @FindBy(css = "#step_two_payment_expiry_date_year")
    private WebElement selectYear;

    @FindBy(css = "#cvv")
    private WebElement securityNumber;
    @FindBy(css = "#step_two_newsletter")
    private WebElement newsLetter;

    @FindBy(css = "#step_two_t_and_c")
    private WebElement termsAndcondition;

    @FindBy(css = ".paymentAction.actionBarRight>h3")
    private WebElement depositToPayNow;

    @FindBy(css = "#makePayment")
    private WebElement makePayment;




    public void validateSmithCollectionsBookingSummaryBookingStep2(){
        waitForElementDisplay(bookinStepTwo);
        assertTrue(bookinStepTwo.isDisplayed());
        System.out.println("User details and payment page");

    }
    public void validateRoomBookingSummary(){
        waitForElementDisplay(stepTwoRoomDetails);
        assertTrue(stepTwoRoomDetails.isDisplayed());
        System.out.println("Booking details" + stepTwoRoomDetails);


    }

    public void validateBookingCancellationPolicyAndAdditionalCharges(){
        waitForElementDisplay(roomCancellationPolicy);
        assertTrue(roomCancellationPolicy.isDisplayed());
        System.out.println((roomCancellationPolicy.getText()));
        waitForElementDisplay(additionalCharges);
        assertTrue(additionalCharges.isDisplayed());
        System.out.println(additionalCharges.getText());

    }

    public void validateHotelAddressDisplayed(){
        waitForElementDisplay(hotelAddress);
        assertTrue(hotelAddress.isDisplayed());
        System.out.println(hotelAddress.getText());
    }

    public void selectCurrencyType(String currency_type){
        waitForElementDisplay(currencyDropdown);
        Select curr = new Select(currencyDropdown);
        List<String> exp_options = Arrays.asList(new String[]{"GBP", "USD", "EUR", "AUD", "CAD", "HKD", "SGD"});
        List<String> act_options = new ArrayList<String>();
        assertEquals(8, curr.getOptions().size());
        for(WebElement option : curr.getOptions()){
            act_options.add(option.getText());
            System.out.println(option.getText());

            try {assertArrayEquals(exp_options.toArray(),act_options.toArray()) ; } catch (Throwable e){
                System.out.println("The currency in the list is not the same");
            }
            curr.selectByVisibleText("USD");
        }
    }

    public void validateTotalBookingPriceAndDepositToPayNow(){
        waitForElementDisplay(totalBookingPriceAndDepositToPayNow);
        assertTrue(totalBookingPriceAndDepositToPayNow.isDisplayed());
        System.out.println(totalBookingPriceAndDepositToPayNow.getText());
    }

    public void entermyFirstandLastNames(String f_name, String l_name){
        waitForElementDisplay(fname);
        fname.sendKeys(f_name);
        Lname.sendKeys(l_name);
    }
    public void enterMyEmaildAndPhoneNumbers(String E_mail, String p_number){
        waitForElementDisplay(emailInput);
        emailInput.sendKeys(E_mail);
        phoneNumber.sendKeys(p_number);


    }
    public void selectMyCountry(String user_country){
        waitForElementDisplay(usersCountry);
        Select country = new Select(usersCountry);
        country.selectByVisibleText(user_country);
    }


    public void enterMyAddressline1AndLine2( String a_line1,String a_line2 ){
        waitForElementDisplay(addressLine1);
        addressLine1.sendKeys(a_line1);
        addressLine2.sendKeys(a_line2);

    }

    public void enterMyTownAndPostcode(String my_Postcode,String my_Town){
        waitForElementDisplay(addressTown);
        addressTown.sendKeys(my_Town);
        addressPostCode.sendKeys(my_Postcode);

    }

    public void enterGiftCardAndPromoCodeVoucherNumber(String g_voucher){
        waitForElementDisplay(AddGiftCardNumber);
        AddGiftCardNumber.sendKeys(g_voucher);
        submitvouchercode.click();
    }

    public void addLoyaltyCredit(String loyalty_credit){
        waitForElementDisplay(AddLoyaltyAmount);
        AddLoyaltyAmount.sendKeys(loyalty_credit);
        submitloyaltycode.click();
    }

    public void selecteCardType(String card_type){
        waitForElementDisplay(cardPaymentType);
        Select sel =new Select(cardPaymentType);
        sel.selectByVisibleText(card_type);
    }


    public void enterCardNumberAndNameOnCard(String card_number, String name_on_card){
        waitForElementDisplay(addCardNumber);
        addCardNumber.sendKeys(card_number);
        addNameOnCard.sendKeys(name_on_card);


    }
    public void  selectcardExpiryDates(String e_month, String e_year){
        waitForElementDisplay(selectMonth);
        Select month = new Select(selectMonth);
        month.selectByVisibleText(e_month);
        waitForElementDisplay(selectYear);
        Select year = new Select(selectYear);
        year.selectByVisibleText(e_year);

    }
    public void enterCardSecurityCode(String s_code){
        waitForElementDisplay(securityNumber);
        securityNumber.sendKeys(s_code);


    }
    public void agreeToBookingTermsAndConditions(){
        waitForElementDisplay(termsAndcondition);
        WebElement agreement = termsAndcondition;
        //Check if its already selected? otherwise select the Checkbox

        if (!agreement.isSelected())
            agreement.click();
        assertTrue(agreement.isSelected());

    }
    public void clickOnMakePaymentButton(){
        waitForElementDisplay(makePayment);
        makePayment.click();


    }
    public void validateDepositToPayNow(){
        waitForElementDisplay(depositToPayNow);
        assertTrue(depositToPayNow.isDisplayed());
        System.out.println(depositToPayNow.getText());

    }




}
