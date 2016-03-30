package com.test.shoop.cucumber;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Thadeus Ssweanyana on 3/21/2016.
 */
public class LoginTest {

    static WebDriver driver;

    @Test
    public void mydemo() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("https://shoop.fr");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);




    }
}