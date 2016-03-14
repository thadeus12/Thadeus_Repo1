package com.leo.apollo.qa.support

import com.jayway.restassured.RestAssured
import com.jayway.restassured.http.ContentType
import com.jayway.restassured.response.Header
import com.jayway.restassured.response.Response
import com.jayway.restassured.specification.RequestSpecification
import groovy.json.JsonSlurper

/**
 * Created by arturo.michel on 2/18/2016.
 */
class EndpointClient {

    enum RequestType {
        GET, POST, PUT, DELETE

        static RequestType toRequestType(String requestType) {
            switch (requestType.capitalize()) {
                case "GET":
                    return GET
                    break
                case "POST":
                    return POST
                    break
                case "PUT":
                    return PUT
                    break
                case "DELETE":
                    return DELETE
                    break
                default:
                    return GET
                    break
            }
        }
    }

    static Response callEndpoint(String endpoint, RequestType requestType, String token, Map<String,?> pathParameters, String requestBody) {

        Response response
        RequestSpecification request =  RestAssured.given().contentType(ContentType.JSON)

        if(token) {
             request.header("Authorization", token)
        }


         request.when()

            switch (requestType) {

                case EndpointClient.RequestType.GET:
                    response =  request.get(endpoint, pathParameters)
                    break

                case EndpointClient.RequestType.POST:
                     request.body(requestBody)
                    response =  request.post(endpoint, pathParameters)
                    break

                case EndpointClient.RequestType.PUT:
                     request.body(requestBody)
                    response =  request.put(endpoint, pathParameters)
                    break

                case EndpointClient.RequestType.DELETE:
                     request.body(requestBody)
                    response =  request.delete(endpoint, pathParameters)
                    break
            }

        return response.then().extract().response()
    }

    static Map toMap(String mapString) {
        return new JsonSlurper().parseText(mapString)
    }
}
