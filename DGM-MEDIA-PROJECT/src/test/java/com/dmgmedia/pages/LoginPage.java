package com.dmgmedia.pages;

import com.dmgmedia.apputility.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;



/**
 * Created by sewadeus on 14/06/2015.
 */
public class LoginPage extends Driver {

    @FindBy(css=".basic-page.dailymaillogin>h1")
    private WebElement memberSignin;

  @FindBy(css=".sign-out")
  private  WebElement signOut;

    @FindBy(linkText="Personal Details")
     private WebElement personnaldetails;

    @FindBy(id="signinemail")
    private WebElement signinemail;

    @FindBy(id="signinpassword")
    private WebElement signinpassword;

    @FindBy(linkText="My Account")
    private WebElement myAccount;

    @FindBy(xpath="//*[@id='content']/h2")
    private WebElement welcomeMessage;

    @FindBy(id="submit")
    private WebElement loginButton;


    WebDriverWait wait= new WebDriverWait(driver, 60);

    public LoginPage(){PageFactory.initElements(driver,this);}




    public void getHomePage() throws IOException {

         HomePage.navigateToHomePage();

    }

    public void navigateToAccount(){
        wait.until(ExpectedConditions.visibilityOf(myAccount));
        myAccount.click();
    }

    public void enterUserEmail(String emailAddress) {
        wait.until(ExpectedConditions.visibilityOf(signinemail));
        signinemail.sendKeys(emailAddress);
    }



    public void enterUserPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(signinpassword));
        signinpassword.sendKeys(password);

    }

    public void clickLoginButton(){
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }

    public void validateAccountPage(){
        wait.until(ExpectedConditions.visibilityOf(personnaldetails));
        Assert.assertTrue(welcomeMessage.getText().contains("Welcome Mr Test"));
    }



    public void validateTabsonAccountPage(List<List<String>> tab){

        wait.until(ExpectedConditions.visibilityOf(personnaldetails));
        Assert.assertTrue(driver.findElement(By.linkText(tab.get(1).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText(tab.get(2).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText(tab.get(3).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText(tab.get(4).get(0))).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText(tab.get(5).get(0))).isDisplayed());


    }
 public void clickOnSignOut(){
     wait.until(ExpectedConditions.visibilityOf(signOut));
     signOut.click();

 }

    public void validateSignOutComplete(){
        wait.until(ExpectedConditions.visibilityOf(memberSignin));
        Assert.assertTrue(memberSignin.getText().contains("Member Sign In"));
    }



}
