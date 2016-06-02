package com.test.quidco.utility;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;


public class SearchTest {

    public SearchTest() {
        RestAssured.baseURI = "http://search.beta5.quidco.com/";
    }

    public Response sendSearchRequest(String searchTerm) {
        String searchPath = "api/v0/search/merchant?search_term=%s&language=english&page_size=40&page=1&Access-Token=1";
        return given().expect().statusCode(200).when().get(String.format(searchPath, searchTerm)).then().log().ifError().extract().response();
    }

    public void validateMerchantID(Response response, String merchantId) {
        assertThat(response.path("merchant_search_hits.merchant_id"), hasItem(merchantId));
    }

    public void validateExactMatch(Response response, String exactMatchTerm) {

        assertThat(response.path("merchant_search_hits.name"), hasItem(exactMatchTerm));
    }


    public void validateExacMatch(Response response, String middleMatch){
                response.
                body().
                jsonPath().
                getList().size();

    }

}
