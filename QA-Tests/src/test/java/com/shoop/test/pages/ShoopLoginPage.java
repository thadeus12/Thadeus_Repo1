package com.shoop.test.pages;

import com.shoop.test.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by sewadeus on 17/03/2016.
 */
public class ShoopLoginPage extends Driver {

    @FindBy(css = "h1.mb20 > span.ng-scope")
    private WebElement loginPopup;
    @FindBy(xpath = "//li[2]/a/span/span")
    private WebElement loginLink;
    @FindBy(name = "username")
    private WebElement email;
    @FindBy(name = "password")
    private WebElement emailpassword;
   @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;
    @FindBy(css= ".ng-scope:contains('Mon compte')")
    private WebElement loggedIn;






    public void clickOnLoginButton(){
        loginButton.click();
    }
    public void confirmLoginPopupIsDisplayedAndLogin(){
        waitForElementDisplay(loginLink);
        loginLink.click();
        waitForElementDisplay(loginPopup);
        assertTrue(loginPopup.isDisplayed());
        email.sendKeys("tseyana@gmail.com");
        emailpassword.sendKeys("kalanzi09");



    }

    public void validateUserIsLoggedIn(){
        waitForElementDisplay(loggedIn);
        assertTrue(loggedIn.isDisplayed());

    }
}
