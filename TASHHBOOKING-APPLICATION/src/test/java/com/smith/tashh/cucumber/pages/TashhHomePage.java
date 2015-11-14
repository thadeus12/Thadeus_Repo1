package com.smith.tashh.cucumber.pages;

import com.smith.tashh.cucumber.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sewadeus on 04/10/2015.
 */
public class TashhHomePage extends Driver {

    public void navigateTashhHomePage(String url){
        driver.get(url);
    }
    public void tashhLogin(){
        waitForElementDisplay(username);
        username.sendKeys("Thadeus01");
        password.sendKeys("Thad3us");
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    @FindBy(css="#username")
    private WebElement username;

    @FindBy(css="#password")
    private WebElement password;

    @FindBy(name="login")
    private WebElement loginButton;

}
