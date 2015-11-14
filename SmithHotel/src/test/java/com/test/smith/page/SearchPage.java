package com.test.smith.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.test.smith.utility.Driver;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertTrue;

/**
 * Created by sewadeus on 25/05/2015.
 */
public class SearchPage extends Driver {
    Select ageObj;
    String searchButton = "//*[starts-with(@id, '%s')][@type='submit']";

    @FindBy(xpath = "//*[@class='secondary button']")
    private WebElement optoutLink;

    @FindBy(css=".smithExtraInfo")
    private WebElement smithExtra;

    @FindBy(css="#hotelSearch")
    private WebElement hotelLocation;

    @FindBy(css="#s_date_from")
    private WebElement dateFrom;

    @FindBy(css="#s_date_to")
    private WebElement dateTo;

    @FindBy(css=".count")
    private WebElement hotelCount;

    @FindBy(xpath="//*[@id='searchResultsBar']/section[1]/ul/li[*]/a[contains(text(),'Next')]")
     private WebElement nextButton;

    @FindBy(css=".hotel-name>h3")
     List <WebElement> hotelName;

    @FindBy(xpath="//*[@id='searchResultsBar']/section[1]/ul/li[*]/a")
            List <WebElement> pages;
// Get A Room Page
   @FindBy(css=".continueToStepOne.btn.btn-small.btn-primary")
   private WebElement bookNowButton;
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

    @FindBy(css = "#LoginType_email")
    private WebElement useremail;

    @FindBy(css = "#LoginType_password")
    private WebElement userpassword;

    @FindBy(css = "#login")
    private WebElement signInButton;

    @FindBy(css = ".half>p")
    private WebElement inframePopup;
    @FindBy(css = ".featHead")
     private WebElement bookinStepTwo;

    String hotelResult = ".mod-hotelResult-detail>address>a:contains('%s')";

    WebDriverWait wait = new WebDriverWait(Driver.driver,60);
    public void clickingToOptoutOFBeta(){
        waitForElementDisplay(optoutLink);
        optoutLink.click();
    }

   public void enterHotelDestination(String destination){

    wait.until(ExpectedConditions.visibilityOf(hotelLocation)).sendKeys(destination);
   }


    public void enterCheckinDate(String checkinDate){
        wait.until(ExpectedConditions.visibilityOf(dateFrom)).sendKeys(checkinDate);
    }

    public void enterCheckoutDate(String checkOutDate){

        wait.until(ExpectedConditions.visibilityOf(dateTo)).sendKeys(checkOutDate);

    }

    public void clickOnSearchButton(String search){
        WebElement checksearchButton = Driver.driver.findElement(By.xpath(String.format(searchButton, search)));
        wait.until(ExpectedConditions.visibilityOf(checksearchButton));

       Driver.driver.findElement(By.xpath(String.format(searchButton, search))).click();
    }

    public void validateHotelDestination(String destination, String country){

        if(Integer.parseInt(hotelCount.getText()) != 0) {

            List<WebElement> hotelR_dest = Driver.driver.findElements(By.cssSelector(String.format(hotelResult, destination)));
            List<WebElement> hotelR_country = Driver.driver.findElements(By.cssSelector(String.format(hotelResult, country)));

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mod-hotelResult-detail>address>a")));

            for (WebElement al : hotelR_dest) {
                assertTrue(al.getText().contains(destination));
            }

            for (WebElement al : hotelR_country) {
                assertTrue(al.getText().contains(country));
            }
        }else{

            System.out.println("No hotel search result found for " + country + destination);
        }

        List<String> mylist = new ArrayList<String>();

        int p = 1;
        int size = pages.size();


        if (Integer.parseInt(hotelCount.getText()) != 0) {

            if (size > p) {

                for (int i = 1; i < pages.size(); i++) {

                    wait.until(ExpectedConditions.visibilityOf(smithExtra));
                    wait.until(ExpectedConditions.visibilityOfAllElements(hotelName));

                    for (WebElement al : hotelName) {

                        mylist.add(al.getText());

                    }
                    if (size - 1 > i) {
                        nextButton.click();
                    } else {
                        break;

                    }
                }

            } else {

                for (WebElement al : hotelName) {

                    mylist.add(al.getText());

                }
            }
        } else {

            System.out.println("No hotel search result found for " + country + destination);

        }

        Assert.assertEquals(Integer.parseInt(hotelCount.getText()), mylist.size());

        System.out.println("hotel Count: " + hotelCount + "List result:" + mylist.size());



    }

public void clickOnBookNowButton(){
     bookNowButton.click();

}
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

    public void validateSmithCollectionsBookingSummaryBookingStep2(){
        waitForElementDisplay(bookinStepTwo);
        assertTrue(bookinStepTwo.isDisplayed());

    }
}
