package com.quidco.test.utility;

import com.jayway.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Assert;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.get;
import static org.junit.Assert.*;


/**
 * Created by sewadeus on 05/03/2016.
 */
public class QuicoAppTest {
    String url= "https://maps.googleapis.com";
    String path= "/maps/api/geocode/json";




    @Test
    public void getRequestFindCapital() throws JSONException {
        //make get request to fetch capital of norway


        Response resp = get("http://restcountries.eu/rest/v1/name/Uganda");
        //Fetching response in JSON
        JSONArray jsonResponse = new JSONArray(resp.asString());
        // Fetching value of capital parameter
        String capital = jsonResponse.getJSONObject(0).getString("capital");
        // Asserting that capital of Norway is Oslo

                assertEquals(capital, "Kampala");
    }

    }
