package com.test.smith.page_sd;

import com.test.smith.page.HotelPage;
import com.test.smith.page.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

import static com.test.smith.utility.Driver.driver;

/**
 * Created by sewadeus on 18/07/2015.
 */
public class HotelPage_sd {
    LandingPage homepage = new LandingPage();
    HotelPage hotelPage = PageFactory.initElements(driver(),HotelPage.class);

    @Given("^I am on the \"(.*?)\"$")
    public void i_am_on_the(String arg1) throws Throwable {

    }

    @Given("^I click on the \"(.*?)\" tab$")
    public void i_click_on_the_tab(String arg1) throws Throwable {

    }

    @Then("^I should see all hotel pictures$")
    public void i_should_see_all_hotel_pictures() throws Throwable {

    }

    @Then("^I should see overviewcontent$")
    public void i_should_see_overviewcontent() throws Throwable {

    }

    @Then("^I should see Food&Drink  content$")
    public void i_should_see_Food_Drink_content() throws Throwable {

    }

    @Given("^I Click on \"(.*?)\" tab$")
    public void i_Click_on_tab(String arg1) throws Throwable {

    }

    @Then("^I should see localguide content$")
    public void i_should_see_localguide_content() throws Throwable {

    }

    @Given("^I click on  \"(.*?)\" link$")
    public void i_click_on_link(String arg1) throws Throwable {

    }

    @Then("^I should hotel Location$")
    public void i_should_hotel_Location() throws Throwable {

    }

    @Given("^I click on \"(.*?)\" tab$")
    public void i_click_on_tab(String arg1) throws Throwable {

    }

    @Then("^I should see hotel reviews$")
    public void i_should_see_hotel_reviews() throws Throwable {

    }

    @Given("^I click on the view terms & conditions$")
    public void i_click_on_the_view_terms_conditions() throws Throwable {

    }

    @Then("^I should see hotel booking terms and conditions$")
    public void i_should_see_hotel_booking_terms_and_conditions() throws Throwable {

    }

    @Given("^I click on \"(.*?)\"button$")
    public void i_click_on_button(String arg1) throws Throwable {

    }

    @Given("^I enter number of \"(.*?)\" as \"(.*?)\"$")
    public void i_enter_number_of_as(String arg1, String arg2) throws Throwable {

    }

    @Given("^I select \"(.*?)\" from dropdown as \"(.*?)\"$")
    public void i_select_from_dropdown_as(String arg1, String arg2) throws Throwable {

    }

    @Given("^I am logged in to smith hotels$")
    public void i_am_logged_in_to_smith_hotels() throws Throwable {

    }

    @Then("^I should \"(.*?)\" as existing customer$")
    public void i_should_as_existing_customer(String arg1) throws Throwable {

    }

    @Then("^I should be logged in to my account$")
    public void i_should_be_logged_in_to_my_account() throws Throwable {

    }




}
