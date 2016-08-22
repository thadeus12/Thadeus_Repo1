package pages

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

/**
  * Created by thadeus on 22/08/16.
  */
class LoginPageObjects {

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


}
