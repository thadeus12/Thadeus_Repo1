package com.smith.test.utility;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Thadeuss on 2/15/2016.
 */
public abstract class Driver {

    public static WebDriver driver ;

    public static WebDriver browserType(String browser){

        switch(browser.toUpperCase()){

            case "FIREFOX":
                DesiredCapabilities firefox = new DesiredCapabilities();
                driver = new SmithHotelFireFoxDriver(firefox);
                break;
            case "CHROME":
                DesiredCapabilities chrome = DesiredCapabilities.chrome();
                System.setProperty("webdriver.chrome.driver", "browserBinaries/chromedriver.exe");
                driver = new SmithhotelsChromeDriver(chrome);
                break;


        }
        return driver;
    }

    public void waitForElementDisplay(final WebElement element){

        Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.driver)
                .withTimeout(60, TimeUnit.SECONDS)
                .pollingEvery(3, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(new ExpectedCondition<Boolean>() {
                       @Override
                       public Boolean apply(WebDriver input) {
                           return element.isDisplayed();
                       }
                   }
        );
    }



}
