package com.partner.test.pages;


import com.partner.test.utility.Driver;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import static org.junit.Assert.*;

/**
 * Created by Thadeuss on 1/27/2016.
 */
public class SmithPartnerBookingPage extends Driver {
    Actions action = new Actions(Driver.driver);
    Select ageObj;
    @FindBy(css = "#hotelSearch")
    private WebElement hotelLocation;

    @FindBy(css = "#s_date_from")
    private WebElement dateFrom;

    @FindBy(css = "#s_date_to")
    private WebElement dateTo;
    @FindBy(css = "#search-search")
    private WebElement searhhotels;
    @FindBy(css = ".continueToStepOne.btn.btn-small.btn-primary")
    private WebElement bookNowButton;
    @FindBy(css = ".currency-to-convert.price.dark.priceSpan_4167.currency-show-inc")
    private WebElement ratePerNightTotalBooking;

    @FindBy(css = ".add-to-basket.btn.btn-primary")
    private WebElement bookItButton;
    @FindBy(css = ".count")
    private WebElement numberOfHotels;
    @FindBy(css = "input[id$='_adults']")
    private WebElement adultsStaying;
    @FindBy(css = "input[id$='_number_of_children']")
    private WebElement numberChildrenStaying;
    @FindBy(css = "[id*='_child_ages_']")
    private WebElement ageOFChildrenStaying;
    @FindBy(css = "input[id$='_cots']")
    private WebElement cotsForInfants;
    @FindBy(css = "[id$='_child_ages_0']")
    private WebElement ageOFInfant;
    @FindBy(css = "[id*='get-extras']")
    private WebElement roomNextButton;

    @FindBy(css = "#book-pay")
    private WebElement confrimStayOnPopUpButton;

    @FindBy(css = "#book-confirm")
    private WebElement basketConfirmation;

    @FindBy(css = "#tostep2-new-customer")
    private WebElement newCustomerGoToBookingStepTwo;


    @FindBy(css = "#LoginType_email")
    private WebElement useremail;

    @FindBy(css = "#LoginType_password")
    private WebElement userpassword;

    @FindBy(css = "#login")
    private WebElement signInButton;

    @FindBy(css = ".half>p")
    private WebElement inframePopup;

    String hotelResult = ".mod-hotelResult-detail>address>a:contains('%s')";

    //smithcollections
    @FindBy(css = "#currency_filter_currency")
    private WebElement currencyDropdown;

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

    //confirmation Page
    @FindBy(css = ".bookingSummary-confirm")
    private WebElement bookingConfirmationPage;
    @FindBy(css = ".bookingSummary-confirm>p")
    private WebElement bookingReferenceDetails;
    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[1]/div/a[2]")
    private WebElement printthispageviewConfirmationLink;

    @FindBy(css = ".hotelPriceBreakdown")
    private WebElement ConfirmationPageotalBookingprice;

    @FindBy(css = ".mod-paymentDetailOverview>ul>li")
    private WebElement paymentCardTypeAndName;

    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[2]/footer/ul/li[1]")
    private WebElement confirmationPagePaymentMethod;
    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[2]/footer/ul/li[2]")
    private WebElement confirmationPageCardEnding;
    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[2]/footer/ul/li[3]")
    private WebElement confirmationPageNameOnCard;

    @FindBy(css = ".mod-bookingSummaryTable-priceTable>tbody>tr>td>strong")
    private WebElement confirmationPagepaymentsummary;

    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[2]/footer/table/tbody/tr[1]/td[2]")
    private WebElement confirmationPageToalbookingPrice;
    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[2]/footer/table/tbody/tr[2]/td[2]")
    private WebElement confirmationPageCardPayment;
    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[2]/footer/table/tbody/tr[3]/td[2]")
    private WebElement confirmationPageLoyaltyPayment;
    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[2]/footer/table/tbody/tr[4]/td[2]")
    private WebElement confirmationPageStillToPay;

    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[3]")
    private WebElement confirmationTermAndConditions;
    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[3]/p[2]")
    private WebElement bookingConfirmationPageCancellationPolicy;

    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[3]/p[3]")
    private WebElement bookingConfirmationPageDepositPolicy;

    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[3]/p[4]")
    private WebElement bookingConfirmationPageCheckInCheckOutTimes;

    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[3]/p[6]")
    private WebElement bookingConfirmationPageOtherDetails;

    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[1]/div/a[2]")
    private WebElement bookingConfirmationPageViewConfirmationLink;
    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[1]/div/a[1]")
    private WebElement bookingConfirmationPagePrintThisPageLink;
    @FindBy(css = ".mod-bookingSummaryTable-priceTable>tbody>tr>td")
    private WebElement confirmationPageGiftVoucherValue;

    @FindBy(css = ".banner>h2")
            private WebElement selectroom;

    String searchButton = "//*[starts-with(@id, '%s')][@type='submit']";
    String hotelPage =".banner>h2:contains('%s')";



    public void enterHotelDestination(String destination) {
        waitForElementDisplay(hotelLocation);
        hotelLocation.sendKeys(destination);
    }


    public void enterCheckinDate(String checkinDate) {
        waitForElementDisplay(dateFrom);
              dateFrom.sendKeys(checkinDate);
    }

    public void enterCheckoutDate(String checkOutDate) {
        waitForElementDisplay(dateTo);
      dateTo.sendKeys(checkOutDate);
           }

    public void clickonSearchButton(String search) {
        waitForElementDisplay(searhhotels);
        WebElement hotelSearchButton = Driver.driver.findElement(By.xpath(String.format(searchButton, search)));
        hotelSearchButton.click();

    }
    public void validateNumberOFHotelsFOrMyDates(String  destination, String country){
        waitForElementDisplay(numberOfHotels);
        if(Integer.parseInt(numberOfHotels.getText()) != 0) {
            List<WebElement> hotelR_dest = Driver.driver.findElements(By.cssSelector(String.format(hotelResult, destination)));
            List<WebElement> hotelR_country = Driver.driver.findElements(By.cssSelector(String.format(hotelResult, country)));

            for (WebElement al: hotelR_dest){
                assertTrue(al.getText().contains(destination));
            }
            for (WebElement al: hotelR_country){

            }

        }
        assertTrue(numberOfHotels.isDisplayed());
    }
public void validaterateToPayAndTotalBooking(){
        waitForElementDisplay(ratePerNightTotalBooking);
        assertTrue(ratePerNightTotalBooking.isDisplayed());
    }

    public void clickOnBookNowButton(){
        waitForElementDisplay(bookNowButton);
        bookNowButton.click();

    }

    public void clickOnBookItButton() {
        waitForElementDisplay(bookItButton);
        bookItButton.click();
    }
    public void enterAdultStayingInThisRoom(String adult_s) {
        waitForElementDisplay(adultsStaying);
        adultsStaying.clear();
        adultsStaying.sendKeys(adult_s);


    }

    public void enterChildrenStaying(String Child_staying) {
        waitForElementDisplay(numberChildrenStaying);
        numberChildrenStaying.sendKeys(Child_staying);

    }

    public void enterInfantsStayingInThisRoom(String infants_staying) {
        waitForElementDisplay(cotsForInfants);
        cotsForInfants.sendKeys(infants_staying);
    }

    public void clickingToConfirmPeopleStaying() {
        waitForElementDisplay(confrimStayOnPopUpButton);
        confrimStayOnPopUpButton.click();

    }

    public void selectingAgeOFChildStaying(String child_Age) {
        waitForElementDisplay(ageOFChildrenStaying);
        ageObj = new Select(ageOFChildrenStaying);
        ageObj.selectByIndex(9);


    }

    public void selectingAgeInfantStaying(String infantsAge) {
        waitForElementDisplay(ageOFInfant);
        ageObj.selectByIndex(1);
    }

    public void clickingOnNextButtonForARoomWithExtras() {
        waitForElementDisplay(roomNextButton);
        roomNextButton.click();
    }

    public void clickonBasketConfirmationButton() {
        waitForElementDisplay(basketConfirmation);
        basketConfirmation.click();
    }

    public void validateUserOnHotelPage(String hotel_page){
        waitForElementDisplay(selectroom);
      Driver.driver.findElement(By.cssSelector(String.format(hotelPage,hotel_page)));



    }
    public void validateSmithCollectionsBookingSummaryBookingStep2() {
        waitForElementDisplay(bookinStepTwo);
        assertTrue(bookinStepTwo.isDisplayed());

    }

    public void validateRoomBookingSummary() {
        waitForElementDisplay(stepTwoRoomDetails);
        assertTrue(stepTwoRoomDetails.isDisplayed());
        System.out.println("Booking details" + stepTwoRoomDetails);


    }

    public void validateBookingCancellationPolicyAndAdditionalCharges() {
        waitForElementDisplay(roomCancellationPolicy);
        assertTrue(roomCancellationPolicy.isDisplayed());
        System.out.println((roomCancellationPolicy.getText()));
        waitForElementDisplay(additionalCharges);
        assertTrue(additionalCharges.isDisplayed());
        System.out.println(additionalCharges.getText());

    }

    public void validateHotelAddressDisplayed() {
        waitForElementDisplay(hotelAddress);
        assertTrue(hotelAddress.isDisplayed());
        System.out.println(hotelAddress.getText());
    }

    public void selectCurrencyType(String currency_type) {
        waitForElementDisplay(currencyDropdown);
        Select curr = new Select(currencyDropdown);
        List<String> exp_options = Arrays.asList(new String[]{"GBP", "USD", "EUR", "AUD", "CAD", "HKD", "SGD"});
        List<String> act_options = new ArrayList<String>();
        assertEquals(8, curr.getOptions().size());
        for (WebElement option : curr.getOptions()) {
            act_options.add(option.getText());
            System.out.println(option.getText());

            try {
                assertArrayEquals(exp_options.toArray(), act_options.toArray());
            } catch (Throwable e) {
                System.out.println("The currency in the list is not the same");
            }
            curr.selectByVisibleText("USD");
        }
    }

    public void validateTotalBookingPriceAndDepositToPayNow() {
        waitForElementDisplay(totalBookingPriceAndDepositToPayNow);
        assertTrue(totalBookingPriceAndDepositToPayNow.isDisplayed());
        System.out.println(totalBookingPriceAndDepositToPayNow.getText());
    }

    public void entermyFirstandLastNames(String f_name, String l_name) {
        waitForElementDisplay(fname);
        fname.sendKeys(f_name);
        Lname.sendKeys(l_name);
    }

    public void enterMyEmaildAndPhoneNumbers(String E_mail, String p_number) {
        waitForElementDisplay(emailInput);
        emailInput.sendKeys(E_mail);
        phoneNumber.sendKeys(p_number);


    }

    public void selectMyCountry(String user_country) {
        waitForElementDisplay(usersCountry);
        Select country = new Select(usersCountry);
        country.selectByVisibleText(user_country);
    }


    public void enterMyAddressline1AndLine2(String a_line1, String a_line2) {
        waitForElementDisplay(addressLine1);
        addressLine1.sendKeys(a_line1);
        addressLine2.sendKeys(a_line2);

    }

    public void enterMyTownAndPostcode(String my_Postcode, String my_Town) {
        waitForElementDisplay(addressTown);
        addressTown.sendKeys(my_Town);
        addressPostCode.sendKeys(my_Postcode);

    }

    public void enterGiftCardAndPromoCodeVoucherNumber(String g_voucher) {
        waitForElementDisplay(AddGiftCardNumber);
        AddGiftCardNumber.sendKeys(g_voucher);
        submitvouchercode.click();
    }

    public void addLoyaltyCredit(String loyalty_credit) {
        waitForElementDisplay(AddLoyaltyAmount);
        AddLoyaltyAmount.sendKeys(loyalty_credit);
        submitloyaltycode.click();
    }

    public void selecteCardType(String card_type) {
        waitForElementDisplay(cardPaymentType);
        Select sel = new Select(cardPaymentType);
        sel.selectByVisibleText(card_type);
    }


    public void enterCardNumberAndNameOnCard(String card_number, String name_on_card) {
        waitForElementDisplay(addCardNumber);
        addCardNumber.sendKeys(card_number);
        addNameOnCard.sendKeys(name_on_card);


    }

    public void selectcardExpiryDates(String e_month, String e_year) {
        waitForElementDisplay(selectMonth);
        Select month = new Select(selectMonth);
        month.selectByVisibleText(e_month);
        waitForElementDisplay(selectYear);
        Select year = new Select(selectYear);
        year.selectByVisibleText(e_year);

    }

    public void enterCardSecurityCode(String s_code) {
        waitForElementDisplay(securityNumber);
        securityNumber.sendKeys(s_code);


    }

    public void agreeToBookingTermsAndConditions() {
        waitForElementDisplay(termsAndcondition);
        WebElement agreement = termsAndcondition;
        //Check if its already selected? otherwise select the Checkbox

        if (!agreement.isSelected())
            agreement.click();
        assertTrue(agreement.isSelected());

    }

    public void clickOnMakePaymentButton() {
        waitForElementDisplay(makePayment);
        makePayment.click();


    }

    public void validateDepositToPayNow() {
        waitForElementDisplay(depositToPayNow);
        assertTrue(depositToPayNow.isDisplayed());
        System.out.println(depositToPayNow.getText());

    }

    public void validatePrintthisPageAndViewConfirmationLinks() {
        waitForElementDisplay(printthispageviewConfirmationLink);
        assertTrue(printthispageviewConfirmationLink.isDisplayed());
        System.out.println(printthispageviewConfirmationLink.getText());
    }

    public void validateBookingConfirmationPage() {
        waitForElementDisplay(bookingConfirmationPage);
        System.out.println(Driver.driver.getTitle());
        assertTrue(bookingConfirmationPage.isDisplayed());

    }

}