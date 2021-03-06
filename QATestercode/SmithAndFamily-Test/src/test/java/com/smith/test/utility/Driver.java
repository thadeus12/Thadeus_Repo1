package com.smith.test.utility;

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
 * Created by Thadeuss on 2/11/2015
 */
public abstract class Driver {

    public static WebDriver driver = null;


    public static void driver(String browsertype) throws IOException {


        if (browsertype.equalsIgnoreCase("firefox") || browsertype.equalsIgnoreCase("")) {
            DesiredCapabilities dc = new DesiredCapabilities();
            driver = new SmithHotelFireFoxDriver(dc);
        } else {
            if (browsertype.equalsIgnoreCase("chrome")) {
                DesiredCapabilities dc = DesiredCapabilities.chrome();
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\browserBinaries\\chromedriver.exe");
                driver = new SmithhotelsChromeDriver(dc);
            }
        }


    }

    public void waitForElementDisplay(final WebElement element) {

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

