package com.test.quidco.utility;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;


public class SearchTest {

    public SearchTest() {

        RestAssured.baseURI = "http://www.quidco.com";
    }


    public Response sendSearchRequest(String searchTerm) {

        String searchPath = "/search-typeahead-direct.php?search=%s&fn=logout";
        return given().expect().statusCode(200).when().get(String.format(searchPath, searchTerm)).then().log().ifError().extract().response();
    }

    public void validateMerchantID(Response response, String merchantId) {

        assertThat(response.path("results.merchant_id"), hasItem(merchantId));
    }

    public void validateExactMatch(Response response, String exactMatchTerm) {

        assertThat(response.path("results.name"), hasItem(exactMatchTerm));
    }


}
