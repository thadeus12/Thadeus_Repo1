package com.quidco.test.db;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by thadeus on 15/04/16.
 */
public class SearchOneBy {
    static WebDriver driver;


    @Before
    public void mydemo() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("http://beta5.quidco.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
}
    @Test
        public void TypeInField(){
            String val = "Arg";
            WebElement element = driver.findElement(By.xpath(".//*[@id='store-q1search']"));
            element.clear();

            for (int i = 0; i < val.length(); i++){
                char c = val.charAt(i);
                String s = new StringBuilder().append(c).toString();
                element.sendKeys(s);
            }
        }

}
