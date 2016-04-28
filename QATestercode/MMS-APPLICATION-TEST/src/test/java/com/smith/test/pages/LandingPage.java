package com.smith.test.pages;

import com.smith.test.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Thadeuss on 2/15/2016.
 */
public class LandingPage extends Driver{

    public void goToHomePage(String url){
        driver.get(url);
        driver.getTitle();


    }

    public void loginAtSmithCollections(){
        waitForElementDisplay(membershipTab);
        memberSignButton.click();
        emailfield.sendKeys("Thadeus.ssewanyana@smithhotels.com");
        passwordfield.sendKeys("kalanzi01");
        loginButton.click();

    }





    @FindBy(css = ".primary.button")
    private WebElement memberSignButton;
    @FindBy(css = "#nav-main-members")
    private WebElement membershipTab;
    @FindBy(css = "#LoginType_email")
    private WebElement emailfield;
    @FindBy(css = "#LoginType_password")
    private WebElement passwordfield;
    @FindBy(css = ".primary.button")
    private WebElement loginButton;


}
