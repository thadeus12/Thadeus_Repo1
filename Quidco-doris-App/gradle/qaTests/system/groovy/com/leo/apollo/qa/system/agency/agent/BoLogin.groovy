package com.leo.apollo.qa.system.agent

/**
 * Created by Charles.Moga on 13/09/2016.
 */

import com.leo.apollo.qa.system.helpers.BaseTest
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

public class BoLogin extends BaseTest {
    public String website = "http://localhost:8080/backoffice.html"

    public BoLogin() {
        super("Backoffice login")
    }

    public void login() throws Exception {

        driver.get(website)

        driver.getPageSource().contains("Enter Username:")
        driver.getPageSource().contains("Enter Password:")

        WebElement usr = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("username")))
        usr.sendKeys("admin.user")

        WebElement pwd = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("password")))
        pwd.sendKeys("pass1234")

        WebElement btn = (new WebDriverWait(this.driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("submit")))
        btn.submit()
    }
}


