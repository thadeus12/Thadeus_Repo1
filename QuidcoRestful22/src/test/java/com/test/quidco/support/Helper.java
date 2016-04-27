package com.test.quidco.support;


/**
 * Created by thadeus on 15/04/16.
 */
public class Helper {}

    /*public static String loginMember(String username, String password){

        Response response = RestAssured.given().
                    body("{\"username\":\"" + username + password + "\"kalanzi09\"}").
                    contentType(ContentType.JSON).
                    when().
                    post("/auth/login").
                    then().
                    extract().
                    response();
        if (response.statusCode() == 200) {
            return response.header("Authorization");
                } else {
            return response.asString();
        }

    }

    public static String searchMerchant(String responseType, List<String> responses){
            Response response =

                    RestAssured.given().
                            contentType(com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ContentType.JSON).
                            body(responses).
                            when().
                            post("http://search.beta5.quidco.com/api/v0.14/search/merchant?search_term=hotels&language=english&page_size=40&page=1").
                            then().
                            statusCode(200).
                            extract().
                            response();
        return response.toString();
    }


*/




