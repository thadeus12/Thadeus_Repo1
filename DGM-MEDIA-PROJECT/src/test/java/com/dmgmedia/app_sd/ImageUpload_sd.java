package com.dmgmedia.app_sd;

import com.dmgmedia.pages.ImpageUploadPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by sewadeus on 14/06/2015.
 */
public class ImageUpload_sd {

    ImpageUploadPage impageUploadPage=new ImpageUploadPage();

    @Given("^I am on the image upload page$")
    public void i_am_on_the_image_upload_page() throws Throwable {
         impageUploadPage.getImageUploadPage();
    }

    @When("^I click on the start uploading button$")
    public void i_click_on_the_start_uploading_button() throws Throwable {
        impageUploadPage.clickStartOnUploadButton();

    }

    @When("^I enter the location of the file$")
    public void i_enter_the_location_of_the_file() throws Throwable {
        impageUploadPage.selectFilePath();

    }

    @Then("^The image upload overlay should be displayed$")
    public void the_image_upload_overlay_should_be_displayed() throws Throwable {
    impageUploadPage.validateImageUploadOverlay();
    }

    @When("^I click on upload button$")
    public void i_click_on_upload_button() throws Throwable {

        impageUploadPage.clickonUpload();
    }

    @Then("^The image upload progress should be started$")
    public void the_image_upload_progress_should_be_started() throws Throwable {
        impageUploadPage.validateProgessUpload();
    }

    @Then("^I should see upload completion success page$")
    public void i_should_see_upload_completion_success_page() throws Throwable {
       impageUploadPage.validateUploadComplete();
    }

}
