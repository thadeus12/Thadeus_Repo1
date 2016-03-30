package com.test.shoop.utility;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Thadeus ssewanyana on 18/03/2016.
 */
public abstract class Driver {

    public static WebDriver driver = null;


    public static void driver(String browsertype) throws IOException {


        if (browsertype.equalsIgnoreCase("firefox") || browsertype.equalsIgnoreCase("")) {
            DesiredCapabilities dc = new DesiredCapabilities();
            driver = new ShoopFireFoxDriver(dc);
        } else {
            if (browsertype.equalsIgnoreCase("chrome")) {
                DesiredCapabilities dc = DesiredCapabilities.chrome();
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\browserBinaries\\chromedriver.exe");
                driver = new ShoopChromeDriver(dc);
            }
        }


    }


    public void waitForElementDisplay(final WebElement element) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.driver)
                .withTimeout(60, TimeUnit.SECONDS)
                .pollingEvery(3, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(input -> element.isDisplayed());
    }


}

