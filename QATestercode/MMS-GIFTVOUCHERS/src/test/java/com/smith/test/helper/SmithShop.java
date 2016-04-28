package com.smith.test.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class SmithShop {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.mrandmrssmith.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testShopMssProdn() throws Exception {
        driver.get(baseUrl + "/");
        driver.findElement(By.id("nav-main-shop")).click();
        driver.findElement(By.linkText("Gift vouchers")).click();
        driver.findElement(By.linkText("Get a Room! gift e-voucher")).click();
        new Select(driver.findElement(By.xpath("//select[@id='product-pricelist']"))).selectByVisibleText("£100.00");
        driver.findElement(By.xpath("//button[@id='Products_Product_15_100']")).click();
        driver.findElement(By.linkText("Gift vouchers")).click();
        driver.findElement(By.linkText("Smith Get a Room! gift card")).click();
        new Select(driver.findElement(By.id("product-pricelist"))).selectByVisibleText("£50.00");
        driver.findElement(By.xpath("//button[@id='Products_Product_5_50']")).click();
        driver.findElement(By.linkText("Memberships")).click();
        driver.findElement(By.xpath("//button[@id='Products_Product_27']")).click();
        driver.findElement(By.linkText("Accessories")).click();
        driver.findElement(By.xpath("//button[@id='Products_Product_70']")).click();
        driver.findElement(By.linkText("Guidebooks")).click();
        driver.findElement(By.xpath("//button[@id='Products_Product_60']")).click();
        driver.findElement(By.linkText("Music")).click();
        driver.findElement(By.xpath("//button[@id='Products_Product_7']")).click();
        driver.findElement(By.id("btn-checkout")).click();
        new Select(driver.findElement(By.id("country-dropdown"))).selectByVisibleText("United States");
        driver.findElement(By.id("shipping_postcode")).clear();
        driver.findElement(By.id("shipping_postcode")).sendKeys("10128");
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.id("btn-checkout")).click();
        driver.findElement(By.id("member_firstname")).clear();
        driver.findElement(By.id("member_firstname")).sendKeys("Skinner");
        driver.findElement(By.id("member_lastname")).clear();
        driver.findElement(By.id("member_lastname")).sendKeys("Mark");
        driver.findElement(By.id("identity_email")).click();
        driver.findElement(By.id("identity_email")).clear();
        driver.findElement(By.id("identity_email")).sendKeys("skinnerm@yahoomail.com");
        driver.findElement(By.id("identity_confirm_email")).click();
        driver.findElement(By.id("identity_confirm_email")).clear();
        driver.findElement(By.id("identity_confirm_email")).sendKeys("skinnerm@yahoomail.com");
        driver.findElement(By.id("phone_number")).clear();
        driver.findElement(By.id("phone_number")).sendKeys("(718) 630-4706");
        driver.findElement(By.id("order_billing_address_address_line_1")).clear();
        driver.findElement(By.id("order_billing_address_address_line_1")).sendKeys("55 West 44th Street");
        driver.findElement(By.id("order_billing_address_address_town")).clear();
        driver.findElement(By.id("order_billing_address_address_town")).sendKeys("New York");
        new Select(driver.findElement(By.id("order_billing_address_address_state"))).selectByVisibleText("New York");
        driver.findElement(By.id("customer_password")).clear();
        driver.findElement(By.id("customer_password")).sendKeys("city12");
        driver.findElement(By.id("customer_password_confirm")).clear();
        driver.findElement(By.id("customer_password_confirm")).sendKeys("city12");
        driver.findElement(By.id("payment_number")).click();
        driver.findElement(By.id("payment_number")).clear();
        driver.findElement(By.id("payment_number")).sendKeys("555000555000550");
        new Select(driver.findElement(By.id("payment_expiry_month"))).selectByVisibleText("02");
        new Select(driver.findElement(By.id("payment_expiry_year"))).selectByVisibleText("15");
        driver.findElement(By.id("payment_cv2")).clear();
        driver.findElement(By.id("payment_cv2")).sendKeys("333");
        driver.findElement(By.id("order_terms_and_conditions")).click();
        driver.findElement(By.id("submit-checkout-form")).click();
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
