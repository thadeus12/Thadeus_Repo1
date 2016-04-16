package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.member

import com.leo.apollo.qa.support.EndpointClient
import groovy.json.JsonSlurper

import java.util.concurrent.ThreadLocalRandom

import static org.junit.Assert.*

/**
 * Created by charles.moga on 09/02/2016.
 */


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

String apolloResponse, token, usercode
double balanceBefore,balanceAfter,liabilityBefore,liabilityAfter

When(~"a member with username \"([^\"]*)\" and password \"([^\"]*)\" logs in") { String username, String password ->
    token = helpers.loginMemberSite(username,password)
    usercode = username
    db.deleteBets(usercode)
    balanceBefore = db.getAvailableBalance(usercode)
    liabilityBefore = db.getLiability(usercode)
}

When(~"they take note of the balance") { ->
    balanceBefore = db.getAvailableBalance(usercode)
    liabilityBefore = db.getLiability(usercode)
}


When(~"they place a bet \"([^\"]*)\" for a selected event getting back the response \"([^\"]*)\"") { String bet, String betFairResponse ->
    List<String> pricesForMarketList = helpers.createMockResponse("pricesForMarkets", ["pricesForMarkets"])
    helpers.mockResponse("pricesForMarkets",pricesForMarketList)

    List<String> listMarketCatalogue = helpers.createMockResponse("listMarketCatalogue", ["listMarketCatalogue"])
    helpers.mockResponse("listMarketCatalogue",listMarketCatalogue)

    List<String> placeOrdersList = helpers.createMockResponse("placeOrders", [betFairResponse])
    helpers.mockResponse("placeOrders",placeOrdersList)

    List json = helpers.createBetList(bet)
    apolloResponse = helpers.placeBets(token,json)
    helpers.printdebug(apolloResponse)
}


When(~"they cancel the last placed bet getting back the response \"([^\"]*)\"") { String betFairResponse ->
    List<String> pricesForMarketList = helpers.createMockResponse("pricesForMarkets", ["pricesForMarkets"])
    helpers.mockResponse("pricesForMarkets",pricesForMarketList)

    List<String> listMarketCatalogue = helpers.createMockResponse("listMarketCatalogue", ["listMarketCatalogue"])
    helpers.mockResponse("listMarketCatalogue",listMarketCatalogue)

    List<String> cancelOrderList = helpers.createMockResponse("cancelOrder", [betFairResponse].toList())

    helpers.mockResponse("cancelOrder",cancelOrderList)

    Map bets = db.getBets(usercode)
    apolloResponse = helpers.cancelBet(token, bets["61205608528"].bet_num.toString())
    helpers.printdebug(apolloResponse)
}


When(~"place the bet \"([^\"]*)\" for selected events getting back the responses \"([^\"]*)\"") {
    String bets, String betFairResponse ->
    List<String> pricesForMarketList = helpers.createMockResponse("pricesForMarkets", ["pricesForMarkets"])

    helpers.mockResponse("pricesForMarkets",pricesForMarketList)

    List<String> listMarketCatalogue = helpers.createMockResponse("listMarketCatalogue", ["listMarketCatalogue"])
    helpers.mockResponse("listMarketCatalogue",listMarketCatalogue)


    List<String> placeOrdersList = helpers.createMockResponse("placeOrders", betFairResponse.split(",").toList())

    helpers.mockResponse("placeOrders",placeOrdersList)

    List json = helpers.createBetList(bets)
    apolloResponse = helpers.placeBets(token,json)
}


And(~"the bet details is updated with the betfair id \"([^\"]*)\""){

    String betfairids ->

    List ids = db.getBetfairId(usercode)
    String[] expectedIds = betfairids.split(",")
    int j = 0
    expectedIds.each{
        //int id = Integer.parseInt(it)
        assertEquals(it,ids[j].toString())
        j++
    }
//    assertEquals(61205608528,ids[0])
//  assertEquals(61205608529,ids[1])
}

And(~"the response contains confirmation message"){ ->
    def slurper = new JsonSlurper()
    def data = slurper.parseText((String) apolloResponse)
    data.result.result.each {

        if ((it.betSlipRef).equals(0)) {
            assertTrue(apolloResponse.contains("SUCCESS"))
        }
        if ((it.betSlipRef).equals(1)) {
            assertTrue(apolloResponse.contains("FAILURE"))
        }
    }
}

And(~"the response contains \"([^\"]*)\" message"){ String status ->
    assertTrue(apolloResponse.contains(status))
}

And(~"the bet matched size is \"([^\"]*)\""){ long matchedSize ->
    Map bets = db.getBets(usercode)
    assertEquals(matchedSize,bets["61205608528"].size_matched, 0.01)
}

And(~"the bet status is \"([^\"]*)\""){ long betStatus ->
    Map bets = db.getBets(usercode)
    assertEquals(betStatus,bets["61205608528"].bet_status)
}

And(~"the available balance of the member is reduced by \"([^\"]*)\""){ String expectedDelta ->
    balanceAfter = db.getAvailableBalance(usercode)
    BigDecimal delta = balanceBefore - balanceAfter
    assertEquals(Double.parseDouble(expectedDelta),delta,0.00)
}

And(~"the available balance of the member is increased by \"([^\"]*)\""){ String expectedDelta ->
    balanceAfter = db.getAvailableBalance(usercode)
    BigDecimal delta = balanceAfter - balanceBefore
    assertEquals(Double.parseDouble(expectedDelta),delta,0.00)
}

And(~"the liability is increased by \"([^\"]*)\""){ String expectedDelta ->
    liabilityAfter = db.getLiability(usercode)
    BigDecimal delta = liabilityAfter - liabilityBefore
    assertEquals(Double.parseDouble(expectedDelta),delta,0.00)
}

And(~"the liability is reduced by \"([^\"]*)\""){ String expectedDelta ->
    liabilityAfter = db.getLiability(usercode)
    BigDecimal delta = liabilityBefore - liabilityAfter
    assertEquals(Double.parseDouble(expectedDelta),delta,0.00)
}

Given(~"set betfair bet place response with status (SUCCESS|FAILURE|PROCESSED_WITH_ERRORS|TIMEOUT) and id (ANY|[\\d]+)") {
    String status, String id ->
    List<String> ordersList = helpers.createMockResponse("placeOrders", ["betResponseTemplate"])
    ordersList = ordersList.collect {
            betResponse ->
                betResponse = betResponse.replaceAll("%status%", status)
                if(!id.equalsIgnoreCase("ANY") && id.isNumber()) {
                    betResponse = betResponse.replaceAll("%id%", id)
                } else {
                    Long betId = ThreadLocalRandom.current().nextLong(99999999999)
                    betResponse = betResponse.replace("%id%", String.format("%011d", betId))
                }
                return betResponse
        }

    helpers.mockResponse("placeOrders", ordersList)

}

And(~"set betfair bet cancel response with status (SUCCESS|FAILURE|PROCESSED_WITH_ERRORS|TIMEOUT) and id (ANY|[\\d]+)") {
    String status, String id ->
        List<String> ordersList = helpers.createMockResponse("cancelOrder", ["betCancelResponseTemplate"])
        ordersList = ordersList.collect {
            betResponse ->
                betResponse = betResponse.replaceAll("%status%", status)
                if(!id.equalsIgnoreCase("ANY") && id.isNumber()) {
                    betResponse = betResponse.replaceAll("%id%", id)
                } else {
                    Long betId = ThreadLocalRandom.current().nextLong(99999999999)
                    betResponse = betResponse.replace("%id%", String.format("%011d", betId))
                }
                return betResponse
        }

        helpers.mockResponse("cancelOrder", ordersList)

}

And(~"call update bet for bet id (\\d+) set price (\\d+|\\d+\\.\\d+) and stake (\\d+|\\d+\\.\\d+)") {
    String betId, String price, String stake ->
        def bet = db.getBetByBetfairId(betId)
        bet.totalSize = stake
        bet.price = price
        def map = "{ \"$bet.apolloBetId\" : { \"marketId\" : \"$bet.marketId\", \"eventId\" : \"$bet.eventId\", \"selectionId\" : \"$bet.selectionId\", \"side\": $bet.side, \"price\":$price, \"totalSize\" : $stake}}"
        EndpointClient.callEndpoint("http://localhost:8081/api/exchange/order/", EndpointClient.RequestType.PUT, token, [:], map)
}

And(~"places bets \"([^\"]*)\"") { String betsStr  ->
    List<String> pricesForMarketList = helpers.createMockResponse("pricesForMarkets", ["pricesForMarkets"])
    helpers.mockResponse("pricesForMarkets",pricesForMarketList)

    List<String> listMarketCatalogue = helpers.createMockResponse("listMarketCatalogue", ["listMarketCatalogue"])
    helpers.mockResponse("listMarketCatalogue",listMarketCatalogue)

    List json = helpers.createBetList(betsStr)
    response = helpers.placeBets(token,json)
}


Then (~"all bet parameters should remain same for \"([^\"]*)\" whereas \"([^\"]*)\" and \"([^\"]*)\" should be updated"){
    String betId, String price, String stake ->
        def bet = db.getBetByBetfairId(betId)
        assertEquals(bet.price,price)
        assertEquals(bet.totalSize,stake)
        assertEquals(bet.eventTypeId,"1")
        assertEquals(bet.marketId,"1.122694969")
        assertEquals(bet.selectionId,"1096")
        assertEquals(bet.side,0)
        assertEquals(bet.memberId,"45")
}

And (~"the number of bets successfully placed is \"([^\"]*)\""){String betCount->
    int placedbetcount=db.getBetCount()
    assertEquals(placedbetcount,Integer.parseInt(betCount))
}

