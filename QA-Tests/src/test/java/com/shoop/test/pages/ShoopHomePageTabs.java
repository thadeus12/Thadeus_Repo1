package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ShoopHomePageTabs {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://shoop.fr/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testShoopHomePageTabs() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("div.item-inner.ng-binding")).click();
    assertEquals("Mode", driver.findElement(By.linkText("Mode")).getText());
    assertEquals("Femmes enceintes", driver.findElement(By.cssSelector("div.item-inner.ng-binding")).getText());
    assertEquals("Bébé", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[2]/a/div")).getText());
    assertEquals("Sacs & bagages", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[3]/a/div")).getText());
    assertEquals("Lunettes de soleil", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[4]/a/div")).getText());
    assertEquals("Montres & Bijoux", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[5]/a/div")).getText());
    assertEquals("Chaussures", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[6]/a/div")).getText());
    assertEquals("Enfant", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[7]/a/div")).getText());
    driver.findElement(By.cssSelector("div.qp-offer-bottom > div")).click();
    assertEquals("Vêtements d'occasion", driver.findElement(By.xpath("//div[@id='navbar-menu']/ul/li[8]/a/div")).getText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
