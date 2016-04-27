package com.quidco.test.utility;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.Response;
import org.junit.Test;
import java.util.List;
import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
/**
 * Created by sewadeus on 22/03/2016.
 */
public class Applications {
    String baseURL = "https://maps.googleapis.com";
    String path = "/maps/api/geocode/json";


    @Test
    public void testStatus() {
        String url = baseURL + path;
        int statuscode = given()
                .header("Author", "Thadeus")
                .contentType(ContentType.TEXT)
                .param("address", "6500 Dublin Blvd,Dublin, CA")
                .param("key", "AIzaSyAYgjBIxXVJ8EM3Z_tF9ShwkJ7PE-hM7QU")
                // set request method Get to = .get()
                .get(url)
                .statusCode();
        assertTrue(statuscode == 200);

    }
/*
    @Test
    public void testResponseType() {
        //to check response type you have to check response hearder
        String url = baseURL + path;
        given()
                .header("Author", "Thadeus")
                .contentType(ContentType.TEXT)
                .param("address", "6500 Dublin Blvd,Dublin, CA")
                .param("key", "AIzaSyAYgjBIxXVJ8EM3Z_tF9ShwkJ7PE-hM7QU")
                // set request method Get = .get()
                .get(url)
                .then()
                .assertThat()
                .header("ContentType", "application/json; chaeset=UTF-8");
    }


    @Test
    public void testBodyStatusOk() {
        String url = baseURL + path;
        Response response = given()
                .header("Author", "Thadeus")
                .contentType(ContentType.TEXT)
                .param("address", "6500 Dublin Blvd,Dublin, CA")
                .param("key", "AIzaSyAYgjBIxXVJ8EM3Z_tF9ShwkJ7PE-hM7QU")
                // set request method Get = .get()
                .get(url)
                .then()
                .extract()
                .response();
        String status = response.path("status");
        assertTrue(status.equals("ok"));
    }
    //checking response from a nested response

    @Test
    public void testNestedBodyResponce() {
        String url = baseURL + path;
        Response response = given()
                .header("Author", "Thadeus")
                .contentType(ContentType.TEXT)
                .param("address", "6500 Dublin Blvd,Dublin, CA")
                .param("key", "AIzaSyAYgjBIxXVJ8EM3Z_tF9ShwkJ7PE-hM7QU")
                // set request method Get = .get()
                .get(url)
                .then()
                .extract()
                .response();
        List<String> placeid = response.path("results.place id");
        System.out.println(placeid);
        assertNotNull(placeid);
    }

    @Test
    public void testAddressComponentCount() {
        String url = baseURL + path;
        String json = given()
                .header("Author", "Thadeus")
                //get content type
                .contentType(ContentType.TEXT)
                .param("address", "6500 Dublin Blvd,Dublin, CA")
                .param("key", "AIzaSyAYgjBIxXVJ8EM3Z_tF9ShwkJ7PE-hM7QU")
                // set request method Get = .get()
                .get(url)
                .asString();
        JsonPath jsopath = new JsonPath(json).setRoot("results");
        List<String> addres_comp = jsopath.get("address_components");
        System.out.println(addres_comp);
        assertTrue(addres_comp.size() > 1);
    }*/

}