package com.test.smith.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.test.smith.utility.Driver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by sewadeus on 25/05/2015.
 */
public class SearchPage {

    String searchButton = "//*[starts-with(@id, '%s')][@type='submit']";

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
    @FindBy(xpath="//*[@id='hotel_1723']/div/div[3]/a[1]")
     private WebElement BooknowButton;
    String BooknowButton1=".continueToStepOne.btn.btn-small.btn-primary:eq('%s')";

    String hotelResult = ".mod-hotelResult-detail>address>a:contains('%s')";

    WebDriverWait wait = new WebDriverWait(Driver.driver,60);

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
                Assert.assertTrue(al.getText().contains(destination));
            }

            for (WebElement al : hotelR_country) {
                Assert.assertTrue(al.getText().contains(country));
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
    public void clickOnBookNowButton(String Booknow){
        wait.until(ExpectedConditions.visibilityOf(BooknowButton)).click();
    }
    public void clickOnBookNowButton2(String Booknow){
        int booknow=Integer.parseInt(Booknow);
        WebElement Booknowbutton = Driver.driver.findElement(By.cssSelector(String.format(BooknowButton1,booknow)));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".continueToStepOne.btn.btn-small.btn-primary")));
    }
}

