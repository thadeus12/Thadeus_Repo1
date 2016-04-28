package com.smith.test.pages;

import com.smith.test.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;


/**
 * Created by Thadeuss on 2/16/2016.
 */

public class MMS_SHOP extends Driver {
   @FindBy(id = "nav-main-shop")
    private WebElement shopLink;
    @FindBy(linkText = "Gift vouchers")
    private WebElement giftVoucher;
    @FindBy(css = "#content>h1:contains('Smith gift shop')")
    private WebElement smithGiftShop;

    @FindBy(linkText="Get a Room! gift e-voucher")
    private WebElement getAroomEvoucherlink;
    @FindBy(css = "#product-pricelist")
    private WebElement voucherAmount;
    @FindBy(css = "#loginNotifications")
    private WebElement loggedIn;
    @FindBy(css = ".invalid.message:contains('Hello')")
    private WebElement userloggedIn;
    @FindBy(css = ".close-sc")
    private WebElement closePopUp;

    @FindBy(css = "#left-column>ul>li>a:contains('Gift vouchers')")
    private WebElement giftVouchersLink;

    @FindBy(css = ".addToBasket")
    private WebElement addToBasket;


    String giftvouchers = ".title>a:contains('%s')";

    public void clickOnShopTab(){
        waitForElementDisplay(shopLink);
        shopLink.click();
    }

    public void validateUserOnMmsShop(){
        waitForElementDisplay(smithGiftShop);
        assertTrue(smithGiftShop.isDisplayed());
    }
    public void clickOnGiftVouchers(){
        waitForElementDisplay(giftVoucher);
        giftVoucher.click();
    }
    public void clickingOnGetARoomEVoucher(){
       waitForElementDisplay(getAroomEvoucherlink);
        getAroomEvoucherlink.click();
    }

    public void validateUserIsLoggedIn(){
        waitForElementDisplay(userloggedIn);
        assertTrue( userloggedIn.isDisplayed());

    }
   public void clickOnGiftCardLink(String giftType){
       waitForElementDisplay(giftVouchersLink);
       WebElement giftcardlink = Driver.driver.findElement(By.cssSelector(String.format(giftvouchers, giftType)));
       giftcardlink.click();
}
    public void selectingVoucherAmount(String e_value){
        waitForElementDisplay(voucherAmount);
        Select cost = new Select(voucherAmount);
        cost.selectByVisibleText(e_value);
    }

    public void clickAddToBasketButton(){
        waitForElementDisplay(addToBasket);
        addToBasket.click();
    }

}


