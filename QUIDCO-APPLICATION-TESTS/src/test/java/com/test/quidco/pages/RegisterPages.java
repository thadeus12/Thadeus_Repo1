package com.test.quidco.pages;


import com.test.quidco.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by sewadeus on 15/02/2016.
 */
public class RegisterPages extends Driver{

    String xy ="Join Quidco for free and start earning";

    @FindBy(css = ".mixpanel-join-button-nav")
    private WebElement joinfree;
    @FindBy(css = ".col-xs-12.header.col-md-12>h2")
    private WebElement regiPage;



    public void clickOnJoinFreeButton(){
        waitForElementDisplay(joinfree);
    joinfree.click();
    }

    public void confirmOnRegistrationPage(String xy){
        waitForElementDisplay(regiPage);
        assertTrue(regiPage.isDisplayed());
    }

}
