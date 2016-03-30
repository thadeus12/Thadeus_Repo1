package com.test.shoop.pages;

import com.test.shoop.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Thadeus Ssewanyana on 29/03/2016.
 */
public class ShoopMerchantPage extends Driver {
    @FindBy(css = ".section-image")
    private WebElement merchantLogo;
    @FindBy(xpath = "html/body/header/div[2]/div/div[4]/div/div/div/h1")
    private WebElement merchantHomePage;



  public void validateUserOnMerchantPage(){

      waitForElementDisplay(merchantHomePage);
      Driver.driver.getTitle();
      assertTrue(merchantHomePage.isDisplayed());
      assertTrue(merchantLogo.isDisplayed());

  }


}
