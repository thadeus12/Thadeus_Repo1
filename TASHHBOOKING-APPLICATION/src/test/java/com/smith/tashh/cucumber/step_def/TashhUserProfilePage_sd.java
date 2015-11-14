package com.smith.tashh.cucumber.step_def;

import com.smith.tashh.cucumber.pages.TashhUserProfilePage;
import com.smith.tashh.cucumber.utility.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by sewadeus on 04/10/2015.
 */
public class TashhUserProfilePage_sd {

    TashhUserProfilePage tashhUserProfilePage= PageFactory.initElements(Driver.driver,TashhUserProfilePage.class);

    @Then("^I should be logged in$")
    public void i_should_be_logged_in() throws Throwable {
        tashhUserProfilePage.validateUserIsLoggedIn();
    }

    @Given("^I select \"(.*?)\" as Agent$")
    public void i_select_as_Agent(String agentType) throws Throwable {
        tashhUserProfilePage.clickDropdownEnterSelectAgent(agentType);
    }

    @Given("^I click on the search drop down and select \"(.*?)\"$")
    public void i_click_on_the_search_drop_down(String searchmenuItem) throws Throwable {
        tashhUserProfilePage.clickDropdownSelect(searchmenuItem);
    }

    @Given("^I enter the Member name as \"(.*?)\"$")
    public void i_enter_the_Member_name_as(String arg1) throws Throwable {
        tashhUserProfilePage.enterMemberName(arg1);
    }

    @When("^I click on the search button$")
    public void i_click_on_the_search_button() throws Throwable {
        tashhUserProfilePage.clickOnFindMemberButton();
    }
}
