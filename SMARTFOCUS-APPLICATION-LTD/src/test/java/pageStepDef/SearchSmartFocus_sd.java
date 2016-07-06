package com.test.smartfocus.pageStepDef;

import com.test.smartfocus.pages.HomePage;
import com.test.smartfocus.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by sewadeus on 06/07/2016.
 */
public class SearchSmartFocus_sd {
    HomePage homePage= new HomePage();
    SearchSmartFocus_sd smartFocus = PageFactory.initElements(Driver.driver, SearchSmartFocus_sd.class);
    @Given("^I go to \"([^\"]*)\"$")
    public void i_go_to(String arg1) throws Throwable {
        homePage.navigateToHomePage(arg1);

    }

    @When("^I enter \"([^\"]*)\"in the google search field$")
    public void i_enter_in_the_google_search_field(String arg1) throws Throwable {


    }

    @When("^I click on the SmartFocus company link$")
    public void i_click_on_the_SmartFocus_company_link() throws Throwable {

    }

    @Given("^I am on the smartfocus website$")
    public void i_am_on_the_smartfocus_website() throws Throwable {

    }

    @When("^I Select 'Smart Personalisation Email'from the the Message Cloud menu item$")
    public void i_Select_Smart_Personalisation_Email_from_the_the_Message_Cloud_menu_item() throws Throwable {

    }

    @Then("^I should see the \"([^\"]*)\" and \"([^\"]*)\" displayed on the page$")
    public void i_should_see_the_and_displayed_on_the_page(String arg1, String arg2) throws Throwable {

    }


}
