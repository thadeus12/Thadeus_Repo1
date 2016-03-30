package com.test.shoop.page_sd;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Thadeus ssewanyana on 18/03/2016.
 */
public class Move {
    static WebDriver driver;

    @Test
    public void mydemo() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("https://shoop.fr");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        List<WebElement> elements = driver.findElements(By.cssSelector(".item-inner.ng-binding"));
        elements.get(0).click();
        String catResult = driver.findElement(By.cssSelector("h4 span .ng-scope")).getText().replaceAll("([A-Za-z\\s])\\w+", "").trim();
        WebElement p= driver.findElement(By.cssSelector("div .show-more-big-button .ng-scope"));
        do {

           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", p);
           ((JavascriptExecutor) driver).executeScript("arguments[0].click();",p);
            WebDriverWait wait= new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfAllElements((driver.findElements(By.cssSelector(".merchants-list a div h4")))));
            System.out.println(driver.findElements(By.cssSelector(".merchants-list a div h4")).size());
        }
        while(p.isDisplayed());
        Assert.assertEquals(Integer.parseInt(catResult),driver.findElements(By.cssSelector(".merchants-list a div h4")).size());
        driver.quit();

    }
}
