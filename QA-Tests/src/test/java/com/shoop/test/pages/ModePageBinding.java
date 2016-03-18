package com.shoop.test.pages;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by sewadeus on 18/03/2016.
 */
public class ModePageBinding {



//    driver.get(baseUrl + "/");
//    driver.findElement(By.cssSelector("div.item-inner.ng-binding")).click();
//    assertEquals("Mode", driver.findElement(By.linkText("Mode")).getText());
//    assertEquals("Femmes enceintes", driver.findElement(By.cssSelector("div.item-inner.ng-binding")).getText());
//    assertEquals("Bébé", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[2]/a/div")).getText());
//    assertEquals("Sacs & bagages", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[3]/a/div")).getText());
//    assertEquals("Lunettes de soleil", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[4]/a/div")).getText());
//    assertEquals("Montres & Bijoux", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[5]/a/div")).getText());
//    assertEquals("Chaussures", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[6]/a/div")).getText());
//    assertEquals("Enfant", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[7]/a/div")).getText());
//    driver.findElement(By.cssSelector("div.qp-offer-bottom > div")).click();
//    assertEquals("Vêtements d'occasion", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[8]/a/div")).getText())
//
//

/**
    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://shoop.fr/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testLogin() throws Exception {
        assertTrue(isElementPresent(By.cssSelector("h1.greeting-header > span.ng-binding.ng-scope")));
        driver.get(baseUrl + "/");
        driver.findElement(By.xpath("//li[2]/a/span/span")).click();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("t.ssewanyana@quidco.com");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("kalanzi09");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        assertEquals("Bonjour", driver.findElement(By.cssSelector("h1.greeting-header > span > span.ng-scope")).getText());
        assertEquals("Mon compte", driver.findElement(By.xpath("//span/span/span")).getText());
        assertEquals("Mon compte | Shoop", driver.getTitle());
        assertEquals("Se déconnecter", driver.findElement(By.cssSelector("li.sign-out-link > a > span.ng-scope")).getText());
        driver.findElement(By.xpath("//span/span/span")).click();
        driver.findElement(By.linkText("Se déconnecter")).click();
    }

*/



//
}
