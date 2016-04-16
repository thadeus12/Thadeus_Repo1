package com.test.quidco.utility;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.junit.Test;


import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


/**
 * Created by sewadeus on 16/04/2016.
 */
public class SearchTest {

    public SearchTest() {
        RestAssured.baseURI = "http://www.quidco.com";
    }




    public Response sendSearchRequest(String searchTerm) {
        String url = "/search-typeahead-direct.php?search=%s&fn=logout";
        return given().expect().statusCode(200).when().get(String.format(url, searchTerm)).then().extract().response();
    }

    public void validateMerchantID(Response response, String merchantId){
        assertThat(response.path("results.merchant_id") ,hasItem(merchantId));
    }

    public  void validateMostRelavant(){

    }
    public void validateMerchantName(){

    }

    public void validateMerchantResultPosition(){

    }


 public void validateExactMatch(){

 }
    public void validateBestNatch(){


    }
}
