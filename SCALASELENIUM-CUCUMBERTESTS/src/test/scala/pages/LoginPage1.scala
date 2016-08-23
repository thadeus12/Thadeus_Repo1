package pages

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import utility.AbstractDriver

/**
  * Created by thadeus on 23/08/16.
  */
class LoginPage1 extends AbstractDriver{

  @FindBy(xpath=".//*[@id='menu']/ul/li[3]/a")
  var myAccountLink: WebElement =_

  @FindBy(xpath="//*[@id='signinemail']")
  var usernameField:WebElement =_

  @FindBy(xpath="//*[@id='signinpassword']")
  var passwordField:WebElement =_

  @FindBy(xpath="//*[@id='submit']")
  var submitButton:WebElement =_
  @FindBy(id = "//*[@id='content']/h2")
  var greeting: WebElement =_



  def clickOnMyAccountLink(): Unit ={
    myAccountLink.click()
  }
  def  entermMyEmailAndPassword(password_my: String, user_my: String): Unit ={
    usernameField.sendKeys(user_my)
    passwordField.sendKeys(password_my)
  }
  def clickOnTheSubmitButton(): Unit ={
    submitButton.click()
  }
  def validateIamLoggedIn(welcome_sms: String){
    assert(greeting.getText.equals(welcome_sms))
  }


}
