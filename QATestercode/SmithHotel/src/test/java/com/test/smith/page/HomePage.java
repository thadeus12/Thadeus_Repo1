package com.test.smith.page;

import com.test.smith.utility.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Thadeuss on 22/05/2015.
 */
public class HomePage extends Driver {
    WebDriverWait wait = new WebDriverWait(Driver.driver,60);

    String searchButton = "//*[starts-with(@id, '%s')][@type='submit']";

    @FindBy(css = ".icon")
    private WebElement homepageloginIcon;

    @FindBy(css = "#mms-row-stay-in-nasa")
    private WebElement stayHereButton;

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
    @FindBy(css = ".average-price")
    private WebElement hotelAveragePrice;
    @FindBy(css=".continueToStepOne.btn.btn-small.btn-primary")
    private WebElement bookNowButton;

    String hotelResult = ".mod-hotelResult-detail>address>a:contains('%s')";

        public void deleteNewSiteCookie(String edward){
        Driver.driver.manage().getCookieNamed(edward);

    }

    public void clickStayHereToSearchSmithHotelsAmerica(){
        waitForElementDisplay(stayHereButton);
        stayHereButton.click();
    }


   public void enterHotelDestination(String destination){
       waitForElementDisplay(hotelLocation);

   hotelLocation.sendKeys(destination);
   }


    public void enterCheckinDate(String checkinDate){
        waitForElementDisplay(dateFrom);
        dateFrom.sendKeys(checkinDate);

    }

    public void enterCheckoutDate(String checkOutDate){
        waitForElementDisplay(dateTo);
        dateTo.sendKeys(checkOutDate);

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


    public void validateHotelAverageRoomPrice(){
        waitForElementDisplay(hotelAveragePrice);
        assertTrue(hotelAveragePrice.isDisplayed());
        System.out.println(hotelAveragePrice.getText());
    }

public void clickOnBookNowButton(){
     bookNowButton.click();

}

}
