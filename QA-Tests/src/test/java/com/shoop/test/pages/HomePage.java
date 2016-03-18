package com.shoop.test.pages;

import com.shoop.test.utility.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Created by thadeusssewanyana on 17/03/2016.
 */
public class HomePage extends Driver{

    public void navigateToHomePage(String url){
        driver.get(url);
        System.out.println(driver.getTitle());

    }


    @FindBy(css = ".item-inner.ng-binding")
    private WebElement hometabMode;
    @FindBy(css = "div.item-inner.ng-binding")
    private WebElement modepagelinks;

    public void clickOnModeTab(){
        waitForElementDisplay(hometabMode);
        Driver.driver.getTitle();
        hometabMode.click();
    }

    public void validateTabsonModePage(List<List<String>> tab){

        waitForElementDisplay(modepagelinks);
        Assert.assertTrue(driver.findElement(By.cssSelector(tab.get(1).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(tab.get(2).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(tab.get(3).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(tab.get(4).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(tab.get(5).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(tab.get(6).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(tab.get(7).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(tab.get(8).get(0))).isDisplayed());



    }

}
