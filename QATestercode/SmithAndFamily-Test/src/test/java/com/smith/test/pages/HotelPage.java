package com.smith.test.pages;

import com.smith.test.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

/**
 * Created by Thadeuss on 27/06/2015.
 */
public class HotelPage extends Driver {
    Select ageObj;


    @FindBy(css = "#nav-hotel-rooms")
    private WebElement getARoomPage;
    @FindBy(css = ".add-to-basket")
    private WebElement roomBookItButton ;

    @FindBy(css = ".average-price")
    private WebElement ratesFromPrice;

    @FindBy(css = ".currency-to-convert.currency-show-inc:eq(1)")
    private WebElement stayRoomRateCostings;

    @FindBy(css = ".totalPrice")
    private WebElement roomTotalcost;

    @FindBy(css = ".list")
    private WebElement whoCanStayInRoom;

    @FindBy(css = ".rateStandard>p>a")
    private WebElement termsAndConditions ;

    @FindBy(css = ".modal-body>p")
    private WebElement roomBookingPolicyLink ;
    @FindBy(css = ".roomArrangement.selectDropDowns.numPeople>legend")
    private WebElement roomGuestPopup;

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


    public void validateLandedOnGetARoomPage(){
        waitForElementDisplay(getARoomPage);
        assertTrue(getARoomPage.isDisplayed());
        System.out.println("Landed on the " + getARoomPage);
    }

    public void validateRoomratePerNightAndTotalCostForStay(){
        waitForElementDisplay(stayRoomRateCostings);
        System.out.println(stayRoomRateCostings.getText());
        assertTrue(roomTotalcost.isDisplayed());
        System.out.println("Cost for Entire stay without Extras is" + roomTotalcost.getText());



    }

    public void validatedBookingPolicyLinkAndConditions(){
        waitForElementDisplay(roomBookingPolicyLink);
        roomBookingPolicyLink.click();
        waitForElementDisplay(termsAndConditions);
        assertTrue(termsAndConditions.isDisplayed());
        System.out.println("Booking Terms And Conditions : " + termsAndConditions.getText());

    }


    public void clickOnBookITButton() {
        waitForElementDisplay(roomBookItButton);
        roomBookItButton.click();
        System.out.println(roomBookItButton);
    }

    public void validateHotelAveragePrice(){
        waitForElementDisplay(ratesFromPrice);
        assertTrue(ratesFromPrice.isDisplayed());
        System.out.println("verifying hotel ");


    }

    public void validatedHowManyPeopleCanStayInThisRoom(){
        waitForElementDisplay(whoCanStayInRoom);
        assertTrue(whoCanStayInRoom.isDisplayed());

        System.out.println("This room can accommodate " + whoCanStayInRoom.getText());

    }

    public void validateRoomGuestPopUp(){
        waitForElementDisplay(roomGuestPopup);
        assertTrue(roomGuestPopup.isDisplayed());

    }

    public void enterAdultStayingInThisRoom(String adult_s){
        waitForElementDisplay(adultsStaying);
        adultsStaying.clear();
        adultsStaying.sendKeys(adult_s);


    }
    public void enterChildrenStaying(String Child_staying){
        waitForElementDisplay(numberChildrenStaying);
        numberChildrenStaying.sendKeys(Child_staying);

    }
    public void enterInfantsStayingInThisRoom(String infants_staying){
        waitForElementDisplay(cotsForInfants);
        cotsForInfants.sendKeys(infants_staying);
    }

    public void clickingToConfirmPeopleStaying(){
        waitForElementDisplay(confrimStayOnPopUpButton);
        confrimStayOnPopUpButton.click();

    }

    public void selectingAgeOFChildStaying(String child_Age){
        waitForElementDisplay(ageOFChildrenStaying);
        ageObj = new Select(ageOFChildrenStaying);
        ageObj.selectByIndex(9);


    }

    public void selectingAgeInfantStaying(String infantsAge){
        waitForElementDisplay(ageOFInfant);
        ageObj.selectByIndex(1);
    }

    public void clickingOnNextButtonForARoomWithExtras(){
        waitForElementDisplay(roomNextButton);
        roomNextButton.click();
    }
    public void validateNewReturningCustomerPopUp(){
        waitForElementDisplay(inframePopup);
        assertTrue(inframePopup.isDisplayed());

    }
    static String parentHandle;
    public void getParentWindowHandle(){
        parentHandle=Driver.driver.getWindowHandle();
    }

    public void switchToLoginIframe(){

        Driver.driver.switchTo().frame("iframeLogin");
    }

    public void switchToParentWindow(){

        Driver.driver.switchTo().window(parentHandle);

    }
    public void iframeLogin(){
        useremail.sendKeys("Thadeus.ssewanyana@smithhotels.com");
        userpassword.sendKeys("kalanzi01");
        signInButton.click();

    }

    public void continueAsNewCustomer(){
        waitForElementDisplay(newCustomerGoToBookingStepTwo);
        newCustomerGoToBookingStepTwo.click();

    }

}