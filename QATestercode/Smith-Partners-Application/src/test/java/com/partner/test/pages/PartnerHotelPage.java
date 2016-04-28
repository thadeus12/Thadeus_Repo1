package com.partner.test.pages;

import com.partner.test.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

/**
 * Created by Thadeuss on 2/10/2016.
 */
public class PartnerHotelPage extends Driver {

    Actions action = new Actions(Driver.driver);
    Select ageObj;
    String hotelPage =".banner>h2:contains('%s')";

    @FindBy(css = ".add-to-basket.btn.btn-primary")
    private WebElement bookItButton;
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
    private WebElement addRoomToBasket;
    @FindBy(css = "#book-confirm")
    private WebElement confirmaBasketButton;
    @FindBy(css = "#book-pay")
    private WebElement confrimStayOnPopUpButton;
    @FindBy(css = ".banner>h2")
    private WebElement selectroom;



    public void validateUserOnHotelPage(String hotel_page){
        waitForElementDisplay(selectroom);
        Driver.driver.findElement(By.cssSelector(String.format(hotelPage,hotel_page)));
    }

    public void clickOnBookItButton() {
        waitForElementDisplay(bookItButton);
        bookItButton.click();
    }
    public void validateRoomGuestPopUp(){
        waitForElementDisplay(roomGuestPopup);
        assertTrue(roomGuestPopup.isDisplayed());

    }
    public void enterAdultStayingInThisRoom(String adult_s) {
        waitForElementDisplay(adultsStaying);
        adultsStaying.clear();
        adultsStaying.sendKeys(adult_s);
            }

        public void clickingOnNextButtonForARoomWithExtras() {
        waitForElementDisplay(roomNextButton);
        roomNextButton.click();
    }
    public void clickConfirmButtonToAddRoomToBasket(){
        waitForElementDisplay(addRoomToBasket);
        addRoomToBasket.click();
    }

    public void clickOnConfirmBookingButton(){
        waitForElementDisplay(confirmaBasketButton);
        confirmaBasketButton.click();
    }



}
