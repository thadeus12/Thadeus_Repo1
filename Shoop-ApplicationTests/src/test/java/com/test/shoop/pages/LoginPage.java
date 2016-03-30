package com.test.shoop.pages;

import com.test.shoop.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Thadeus Ssweanyana on 3/21/2016.
 */
public class LoginPage extends Driver {

    @FindBy(css = "h1.mb20 > span.ng-scope")
    private WebElement loginPopup;
    @FindBy(xpath = "//li[2]/a/span/span")
    private WebElement loginLink;
    @FindBy(xpath= "//input[@type='email']")
    private WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement emailpassword;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;
    @FindBy(css= ".dropdown-trigger.has-icon.has-text")
    private WebElement loggedIn;
    @FindBy(xpath= "//*[contains(@name,'account-link')]")
    private WebElement confirmUserLogged;

    @FindBy(css = ".clearfix.item.ng-scope>a")
    private WebElement merchantLink;

    @FindBy(css = ".list-unstyled.xxs-mt10.ng-binding.ng-scope>li")
    private WebElement merchantShoopPage;


    public void clickOnLoginLink(){
        waitForElementDisplay(loginLink);
        loginLink.click();
    }
    public void enterUsernameAndPassWord(){
        waitForElementDisplay(username);
        username.sendKeys("t.ssewanyana@quidco.com");
        emailpassword.sendKeys("kalanzi09");
        loginButton.click();
    }

    public void confirmUserIsSignedIN(){
        waitForElementDisplay(loggedIn);
        assertTrue(loggedIn.isDisplayed());
    }
    public void goToMerchantHome(){
        waitForElementDisplay(merchantLink);
        merchantLink.click();
    }
    public void confirmUserIsOnShoopmerchantHomepage(){
        waitForElementDisplay(merchantShoopPage);
        assertTrue(merchantShoopPage.isDisplayed());

    }
}
