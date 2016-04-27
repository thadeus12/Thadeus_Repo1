package com.test.quidco.Search_sd;


import com.jayway.restassured.response.Response;
import com.test.quidco.utility.SearchTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by sewadeus on 16/04/2016.
 */
public class SearchTest_sd {

    SearchTest searchTest;
    Response response;

    public SearchTest_sd() {
        searchTest = new SearchTest();
    }

    @Given("^I enter a \"(.*)\" on the rest url$")
    public void i_enter_a_on_the_rest_url(String searchTerm) throws Throwable {

        response = searchTest.sendSearchRequest(searchTerm);
    }

    @Then("^I should get back these events merchantId \"(.*)\" in search results response$")
    public void i_should_get_back_these_events_merchantId_in_search_results_response(String merchantId) throws Throwable {
         searchTest.validateMerchantID(response,merchantId);
    }

    @Then("^I should get back these events exactMatch \"(.*)\" in search results response$")
    public void i_should_get_back_these_events_exactMatch_in_search_results_response(String exactMatch) throws Throwable {
          searchTest.validateExactMatch(response,exactMatch);
    }
    @Then("^I should see similar merchant\"([^\"]*)\" returned$")
    public void i_should_see_similar_merchant_returned(String SimilarMerchantID) throws Throwable {
    searchTest.validateSimilartMerchnatId(response,SimilarMerchantID);
    }


}
