package com.smith.test.pages;

import com.smith.test.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by Thadeuss on 10/12/2015
 */
public class LandingPage extends Driver {

    public void goToMMSHomePage(String url){
        driver.get(url);
    }
    public void clickOnHomePageLoginIcon(){
        waitForElementDisplay(loginIcon);
        loginIcon.click();

    }
public void loginAsExistingSmithMember(){
    waitForElementDisplay(email);
    email.sendKeys("thadeus.ssewanyana@smithhotels.com");
    password.sendKeys("kalanzi01");
    subMitbutton.click();

}


@FindBy(xpath = "html/body/div[6]/header/div[1]/div/a[1]/i")
    private WebElement loginIcon;
    @FindBy(css = "#LoginType_email")
    private WebElement email;
    @FindBy(css = "#LoginType_password")
    private WebElement password;
    @FindBy(css = "#submitLogin")
    private WebElement subMitbutton;
    private WebElement loggedIn;
    @FindBy(css = ".close-sc")
    private WebElement closePopUp;

}
