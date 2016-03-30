package com.test.shoop.page_sd;

import com.test.shoop.pages.HotOfferPage;
import com.test.shoop.pages.ShoopMerchantPage;
import com.test.shoop.utility.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thadeus Ssewanyana on 29/03/2016.
 */
public class HotOffersPage_sd {
    HotOfferPage hotoffers = PageFactory.initElements(Driver.driver, HotOfferPage.class);
    ShoopMerchantPage merchantPage = PageFactory.initElements(Driver.driver, ShoopMerchantPage.class);

    @When("^I click on hot offer$")
    public void i_click_on_hot_offer() throws Throwable {
        hotoffers.clickOnMerchantLink();

    }

    @Then("^I should be taken to the merchant's Shoop page$")
    public void i_should_be_taken_to_the_merchant_s_Shoop_page() throws Throwable {
        merchantPage.validateUserOnMerchantPage();

    }


}
