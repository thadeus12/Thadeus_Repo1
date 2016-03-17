package com.shoop.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Thadeus.Ssewanyana on 17/03/2016.
 */
public class RegistrationPage {

    @FindBy(name = "username")
    private WebElement email;
    @FindBy(name = "password")
    private WebElement emailpassword;
    @FindBy(css = "span.left-block")
    private WebElement acceptShoopTerms;
    @FindBy(name = "emails_opt_in")
    private WebElement optinToterms;
    @FindBy(css = "button.qp-btn.ng-binding")
    private WebElement regButton;
    @FindBy(css = "h1.greeting-header > span > span.ng-scope")
    private WebElement regWelcomeGreeting;
}
