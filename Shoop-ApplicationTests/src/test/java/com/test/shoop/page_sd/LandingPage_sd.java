package com.test.shoop.page_sd;

import com.test.shoop.pages.HomePage;
import com.test.shoop.pages.MerchantSearch;
import com.test.shoop.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class LandingPage_sd {
    HomePage landingpage = new HomePage();

    MerchantSearch registerPages = PageFactory.initElements(Driver.driver,MerchantSearch.class);
    @Given("^I go to \"(.*?)\"$")
    public void i_go_to(String arg1) throws Throwable {
       landingpage.navigateToHomePage(arg1);
    }

    @When("^I click on merchant\"(.*?)\"category name$")
    public void i_click_on_merchant_category_name(String arg1) throws Throwable {
        registerPages.clickOnMerchantTab(arg1);

    }

    @Then("^I should see a category of merchant$")
    public void i_should_see_a_category_of_merchant() throws Throwable {
        registerPages.confirmOnCategoryList();

}

}
