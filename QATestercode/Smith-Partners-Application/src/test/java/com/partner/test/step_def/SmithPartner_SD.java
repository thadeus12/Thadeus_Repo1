package com.partner.test.step_def;


import com.partner.test.pages.LandingPage;
import com.partner.test.pages.SmithPartnerBookingPage;
import com.partner.test.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thadeuss on 1/27/2016.
 */
public class SmithPartner_SD {

LandingPage landingpage =new LandingPage();
    SmithPartnerBookingPage smithpartners =PageFactory.initElements(Driver.driver,SmithPartnerBookingPage.class);

    @Given("^I am on the smith hotel site \"(.*?)\"$")
    public void i_am_on_the_smith_hotel_site(String url) throws Throwable {
        landingpage.navigateToPartnerHOmePage(url);
    }

    @When("^I enter my destination \"(.*?)\"$")
    public void i_enter_my_destination(String arg1) throws Throwable {
        smithpartners.enterHotelDestination(arg1);
    }

    @When("^I enter my checkin date \"(.*?)\"$")
    public void i_enter_my_checkin_date(String arg1) throws Throwable {
        smithpartners.enterCheckinDate(arg1);

    }

    @When("^I enter my checkout date \"(.*?)\"$")
    public void i_enter_my_checkout_date(String arg1) throws Throwable {
        smithpartners.enterCheckoutDate(arg1);
    }

    @When("^I click on the \"(.*?)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        smithpartners.clickonSearchButton(arg1);

    }
    @Then("^I should see result for \"(.*?)\" and \"(.*?)\"$")
    public void i_should_see_result_for_and(String arg1, String arg2) throws Throwable {
        smithpartners.validateNumberOFHotelsFOrMyDates(arg1,arg2);
    }

    @Then("^I should see hotels Rates from price$")
    public void i_should_see_hotels_Rates_from_price() throws Throwable {
        smithpartners.validaterateToPayAndTotalBooking();

    }

    @Then("^I click on the book now button$")
    public void i_click_on_the_book_now_button() throws Throwable {
        smithpartners.clickOnBookNowButton();
    }



}
