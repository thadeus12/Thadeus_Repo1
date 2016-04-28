package com.test.smith.page;

import com.test.smith.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by Thadeuss on 2/11/2016.
 */
public class BookingConfirmationPage extends Driver {
    @FindBy(css = ".bookingSummary-confirm")
    private WebElement bookingConfirmationPage;
    @FindBy(css = ".bookingSummary-confirm>p")
    private WebElement bookingReferenceDetails;
    @FindBy(xpath = "//*[@id='hotelDetails']/section/section[2]/div[1]/div/a[2]")
    private WebElement printthispageviewConfirmationLink;

    @FindBy(css = ".hotelPriceBreakdown")
    private WebElement ConfirmationPageotalBookingprice ;

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



    public void validatePrintthisPageAndViewConfirmationLinks(){
        waitForElementDisplay(printthispageviewConfirmationLink);
        assertTrue(printthispageviewConfirmationLink.isDisplayed());
        System.out.println(printthispageviewConfirmationLink.getText());
    }

    public void validateBookingConfirmationPage(){
        waitForElementDisplay(bookingConfirmationPage);
        System.out.println(Driver.driver.getTitle());
        assertTrue(bookingConfirmationPage.isDisplayed());


    }
    public void validateBookingReferenceNumberAndSendingConfirmationEmail(){

        waitForElementDisplay(bookingReferenceDetails);
        System.out.println("This is the booking reference number and confirmation email sent to->" +bookingReferenceDetails.getText());
    }

    public void paymentMethodCardendingAndNameOnCard(){

        waitForElementDisplay(paymentCardTypeAndName);
        assertTrue(paymentCardTypeAndName.isDisplayed());
        System.out.println("Booking " +confirmationPagePaymentMethod.getText());
        System.out.println("Booking " +confirmationPageCardEnding.getText());
        System.out.println("Booking " +confirmationPageNameOnCard.getText());



    }


    public void validateBookingComfirmationPageTotalBookingPrice(){
        waitForElementDisplay(confirmationPagepaymentsummary);
        assertTrue(confirmationPagepaymentsummary.isDisplayed());
        System.out.println("Booking " +confirmationPageToalbookingPrice.getText());




    }
    public void validateBookingComfirmationPageStillToPay(){
        waitForElementDisplay(confirmationPageStillToPay);
        assertTrue(confirmationPageStillToPay.isDisplayed());
        System.out.println("Booking " + confirmationPageStillToPay.getText());
    }
    public void validateConfirmationPageLoyaltyPaid(){
        waitForElementDisplay(confirmationPageLoyaltyPayment);
        assertTrue(confirmationPageLoyaltyPayment.isDisplayed());
        System.out.println("Booking Loyalty paid " +confirmationPageLoyaltyPayment.getText());


    }
    public void validateBookingConfirmationPageGiftVoucherPaid(){
        waitForElementDisplay(confirmationPageGiftVoucherValue);

    }

    public void validateBookingconfirmationPageTermasAndConditions(){

        waitForElementDisplay(confirmationTermAndConditions);
        assertTrue(confirmationTermAndConditions.isDisplayed());
    }

    public void validateCheckinCheckOutTimes(){
        waitForElementDisplay(bookingConfirmationPageCheckInCheckOutTimes);
        assertTrue(bookingConfirmationPageCheckInCheckOutTimes.isDisplayed());
        System.out.println(bookingConfirmationPageCheckInCheckOutTimes);

    }
    public void validateHotelBookingConfirmationDepositPolicyDisplayed(){
        waitForElementDisplay(bookingConfirmationPageDepositPolicy);
        assertTrue(bookingConfirmationPageDepositPolicy.isDisplayed());
        System.out.println("Booking"+ bookingConfirmationPageDepositPolicy);

    }
    public void validateCancellationPolicyIsDisplayed(){

        assertTrue(bookingConfirmationPageCancellationPolicy.isDisplayed());
        System.out.println(bookingConfirmationPageCancellationPolicy);
    }

}
