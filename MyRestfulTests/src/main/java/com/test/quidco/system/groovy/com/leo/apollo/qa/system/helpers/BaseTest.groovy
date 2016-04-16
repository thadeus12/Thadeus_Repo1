package com.test.quidco.system.groovy.com.leo.apollo.qa.system.helpers

/**
 * Created by Charles.Moga on 13/02/2016.
 */

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import java.util.concurrent.TimeUnit

public class BaseTest {

    public WebDriver driver

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver/chromedriver.exe")
        try {
            def WebDriver driver = new ChromeDriver()
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS)

        }catch(Exception ex){System.out.println(ex.toString())}
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS)
    }

    public void tearDown(){
        driver.quit()

    }
}
