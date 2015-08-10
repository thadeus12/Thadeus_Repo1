package com.test.smith.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.test.smith.utility.Driver;

/**
 * Created by sewadeus on 09/06/2015.
 */




public class InspirationPage extends Driver{


    String availabilityButton= ".btn-primary:contains('%s')";
    String link_page= ".mod-imgList>li>a>div>h3:contains('%s')";

    WebDriverWait wait=new WebDriverWait(driver, 20);

     public void clickonLink(String link){

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(String.format(link_page, link))));
         driver.findElement(By.cssSelector(String.format(link_page, link))).click();
     }

    public void  selectCountryDropdow(String country){
        WebElement country_name=driver.findElement(By.cssSelector("#countryDropDown"));
        Select country_select=new Select(country_name);
        country_select.selectByVisibleText(country);
    }

    public void  selectDestinationDropdow(String destination){
        WebElement country_name= Driver.driver.findElement(By.cssSelector("#destinationDropDown"));
        Select country_select=new Select(country_name);
        country_select.selectByVisibleText(destination);
    }

    public void checkAvailability(String availibilty){
        WebElement checkAvailabilty= Driver.driver.findElement(By.cssSelector(String.format(availabilityButton, availibilty)));
        wait.until(ExpectedConditions.visibilityOf(checkAvailabilty));
        Driver.driver.findElement(By.cssSelector(String.format(availabilityButton,availibilty))).submit();

    }


}
