package com.test.shoop.pages;

import com.test.shoop.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Thadeus Ssewanyana on 29/03/2016.
 */
public class HotOfferPage extends Driver{

    @FindBy(css = ".cover-img")
    private WebElement coverPhotoLink;


    public void clickOnMerchantLink(){
        waitForElementDisplay(coverPhotoLink);
        coverPhotoLink.click();

    }


}
