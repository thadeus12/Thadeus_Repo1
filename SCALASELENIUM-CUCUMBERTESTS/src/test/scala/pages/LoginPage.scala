package pages

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.{FindBy, PageFactory}
import utilty.AbstractDriver


/**
  * Created by thadeus on 19/08/16.
  */
class LoginPage extends AbstractDriver{
val loginPageObejct= new LoginPageObjects()

  def LoginPage(): Unit ={
    PageFactory initElements(driver, loginPageObejct)
  }

  def clickOnMyAccountLink(): Unit ={
    loginPageObejct.myAccountLink.click()
  }
 def  entermMyEmailAndPassword(password_my: String, user_my: String): Unit ={
   loginPageObejct.usernameField.sendKeys(user_my)
   loginPageObejct.passwordField.sendKeys(password_my)
 }
def clickOnTheSubmitButton(): Unit ={
  loginPageObejct.submitButton.click()
}
 def validateIamLoggedIn(welcome_sms: String){
  assert(loginPageObejct.greeting.getText.equals(welcome_sms))
 }



}
