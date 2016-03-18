package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
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
