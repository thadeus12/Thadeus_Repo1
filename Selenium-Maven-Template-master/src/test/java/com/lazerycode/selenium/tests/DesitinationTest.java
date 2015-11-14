package com.lazerycode.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sewadeus on 13/11/2015.
 */
public class DesitinationTest {

    private WebDriver driver= null;
    private String baseUrl;
    final static String ab= "We have city breaks and country escapes";
    @BeforeTest
    public void setUp() throws Exception {
        //
        baseUrl= "https://www.mrandmrssmith.com/destinations";
        driver = new FirefoxDriver();
        // System.setProperty("Webdriver.ie.driver","C:\\Users\\sewadeus\\Browser exe\\IEDriverServer.exe");
        //  DesiredCapabilities dc = new DesiredCapabilities();
        // driver = new InternetExplorerDriver(dc);
    }


    @Test
    public void destinationTest(){
        driver.get(baseUrl + "/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[6]/section/section[2]/p[2]")));
        String text = driver.findElement(By.xpath("html/body/div[6]/section/section[2]/p[2]")).getText();
        try{
            Assert.assertTrue(text.contains(ab));}catch(Throwable e){
            System.out.println("error"+ e.getMessage());
        }
    }

    @Test
    public void validateContinent(){
        String displayinfo= "We've hand-picked the very best boutique and luxury hotels in %s to bring you our collection of stylish romantic retreats. Find your perfect hotel and get the low-down on holidays in %s – just choose your destination from the list below…";
        String continentPath= "//a[*]/span[contains(text(), '%s')]";
        driver.get(baseUrl + "/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver,10);
        List<String> mystring= Arrays.asList("North America","Europe","Caribbean","Central America","South America","Africa","Middle East","Indian Ocean","Asia","Australasia");
        for(String continent:mystring){
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(continentPath,continent))));
            driver.findElement(By.xpath(String.format(continentPath,continent))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[1]/p")));
            String text= driver.findElement(By.xpath("//div[1]/p")).getText();
            String pageinfo=String.format(displayinfo, continent, continent);
            Assert.assertEquals(text,pageinfo);
            driver.navigate().back();
        }
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }






}
