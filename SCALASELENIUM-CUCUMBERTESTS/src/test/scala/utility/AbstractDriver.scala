package utility

import java.util.concurrent.TimeUnit

import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.support.ui.{ExpectedCondition, FluentWait}


/**
  * Created by thadeus on 19/08/16.
  */
abstract class AbstractDriver {
  var driver: WebDriver =_
  def initialize(browserType:String): Unit ={
    if(browserType.equalsIgnoreCase("firefox") || browserType.equalsIgnoreCase("")){
      System.setProperty("webdriver.gecko.driver",System.getProperty("usr.dir") +"/src/test/resources/LinuxbrowserBinaries/geckodriver")
       driver = new FirefoxDriver()
    }
  }

   def waitForElementDisplay(elementLoadCondition: ExpectedCondition[WebElement]) {
    val wait = new FluentWait(driver)
      .withTimeout(30, TimeUnit.SECONDS)
      .pollingEvery(3, TimeUnit.SECONDS)
    wait until elementLoadCondition
  }

  def goToHomePage(url:String): Unit = {
    driver.get(url)
  }


}
