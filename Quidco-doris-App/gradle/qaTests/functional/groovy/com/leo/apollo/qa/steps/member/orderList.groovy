package com.leo.apollo.qa.steps.member

import com.leo.apollo.qa.support.EndpointClient
import groovy.json.JsonSlurper
import static org.junit.Assert.fail

/**
 * Created by arturo.michel on 19/02/2016.
 */


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

String token
String user
def bets

When(~"log in with username \"([^\"]*)\" and password \"([^\"]*)\"") {
    String username, String password ->
        user = username
        def body = "{\"username\" : \"" + username + "\", \"password\" : \"" + password + "\", \"token\" : \"dummytoken\", \"answer\":\"11111\"}"
        def endpoint ="http://localhost:8081/api/auth/login"
        def response = EndpointClient.callEndpoint(endpoint, EndpointClient.RequestType.POST, "", [:], body)

        if (response.statusCode() == 200) {
            token = response.header("Authorization")
        } else {
            fail("Invalid login, error: " + response.asString())
        }
}


And(~"set bets attribute \"([^\"]*)\" to value \"([^\"]*)\"") {
    String attribute, String value ->
        if(!bets) {
            bets = getBets(user, token)
        }
        if(bets) {
            bets.result.each { bet ->
                String query = "UPDATE bet_details SET " + attribute + " = " + value + "  WHERE bet_fair_bet_id = '" + bet.betfairBetId + "'"
                db.update(query)
                sleep(3000) // wait for transaction to be committed, the tests move faster and might fail.
            }
        }
}

When(~"retrieve open bets for user \"([^\"]*)\"") {
    String username ->
        bets = null
       bets = getBets(username, token)
}

And(~"clear bets for user \"([^\"]*)\"") {
    String username ->
        db.deleteBets(username)
        if(bets)
            bets = null
}

Then(~"open bets \"([^\"]*)\" is \"([^\"]*)\"") {
    String attr, String value ->
        bets.result.each{ bet ->
            assert bet[attr] == value
        }
}

def getBets(def username, def token) {

    def endpoint = "http://localhost:8081/api/exchange/orderList/unsettled/" + username
    def jsonResponse = EndpointClient.callEndpoint(endpoint,  EndpointClient.RequestType.GET, token, [:], "").asString()
    new JsonSlurper().parseText(jsonResponse)
}