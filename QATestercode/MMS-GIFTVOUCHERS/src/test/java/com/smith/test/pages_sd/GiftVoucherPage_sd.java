package com.smith.test.pages_sd;

import com.smith.test.pages.MMS_SHOP;
import com.smith.test.utility.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thadeuss on 2/16/2016.
 */
public class GiftVoucherPage_sd {
    MMS_SHOP mmShop = PageFactory.initElements(Driver.driver,MMS_SHOP.class);


    @And("^I click on giftVouchers link$")
    public void i_click_on_giftVouchers_link() throws Throwable {
        mmShop.clickOnGiftVouchers();

    }

    @And("^I click on \"(.*?)\" Link$")
    public void i_click_on_Link(String arg1) throws Throwable {



    }

    @And("^I select gift card for \"(.*?)\"$")
    public void i_select_gift_card_for(String arg1) throws Throwable {

    }

    @And("^I click add to basket button$")
    public void i_click_add_to_basket_button() throws Throwable {

    }

}
