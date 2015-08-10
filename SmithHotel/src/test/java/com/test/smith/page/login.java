package com.test.smith.page;

import com.test.smith.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by sewadeus on 08/08/2015.
 */
public class login extends Driver {
  @FindBy(css = ".ui")
    private WebElement link;
    @FindBy(css = "#LoginType_email")
    private WebElement Email;
    @FindBy(css = "#LoginType_password")
    private WebElement Password;
    @FindBy(css = "#submitLogin")
    private WebElement Loginbutton;

    public void ClickonSiginlink(String link) {



    }
    public void EnterUseremail(String Email){

    }

     public void EnterUserPassword(){

     }
        }






