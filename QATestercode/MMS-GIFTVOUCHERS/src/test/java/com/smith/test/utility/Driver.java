package com.smith.test.utility;

import com.sun.istack.internal.Nullable;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

/**
 * Created by sewadeus on 16/02/2016.
 */
public abstract class Driver {


    public static WebDriver driver;

    protected static WebDriver browserType(String browser){

        String s = browser.toUpperCase();
        if (s.equals("FIREFOX")) {
            DesiredCapabilities dc = new DesiredCapabilities();
            driver = new MMSShopFirefoxDriver(dc);

        } else if (s.equals("CHROME")) {
            DesiredCapabilities chrome = DesiredCapabilities.chrome();
            System.setProperty("webdriver.chrome.driver", "browserBinaries/chromedriver.exe");
            driver = new MMSShopChromeDriver(chrome);

        } else if (s.equals("IE")) {
            driver = new InternetExplorerDriver();

        }
        return driver;
    }

    public void waitForElementDisplay(final WebElement element){

        Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.driver)
                .withTimeout(60, TimeUnit.SECONDS)
                .pollingEvery(3, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(new ExpectedCondition<Boolean>() {
                       @Nullable
                       @Override
                       public Boolean apply(WebDriver input) {
                           return element.isDisplayed();
                       }
                   }
        );
    }




}
