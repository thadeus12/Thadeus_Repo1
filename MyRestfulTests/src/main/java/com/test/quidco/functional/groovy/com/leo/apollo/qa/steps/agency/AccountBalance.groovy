package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.agency

import groovy.json.JsonSlurper

import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertTrue

/**
 * Created by charles.moga on 12/01/2016.
 */
this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token, response
String name, child

When(~"a \"([^\"]*)\" user with username \"([^\"]*)\" and password \"([^\"]*)\" views their accounts") { String usertype, String username, String password ->
    if (usertype.equals("COY")) {
        token = helpers.loginCompanySite(username, password)
    } else {
        token = helpers.loginAgencySite(username, password)
    }
    response = helpers.getAccountDetails(token, username)

}

Then(~"they should see their net exposure \"([^\"]*)\", cash balance \"([^\"]*)\", yesterday balance \"([^\"]*)\", total balance \"([^\"]*)\", yesterday total balance \"([^\"]*)\",  sma credit \"([^\"]*)\", total ma credit \"([^\"]*)\", total agent credit \"([^\"]*)\", total member credit \"([^\"]*)\"") { String netexposure, String cashbalance, String ydaybalance, String totalbalance, String ydaytotalbalance, String smacredit, String macredit, String totalagentcredit, String totalmembercredit ->


    def slurper = new JsonSlurper()
    def data = slurper.parseText((String) response)

    def cashBalance = data.result.cashBalance
    def smaCredit = data.result.smaCredit as String
    def netExposure = data.result.netExposure
    def totalMACredit = data.result.totalMACredit as String
    def totalAgentCredit = data.result.totalAgentCredit as String
    def totalMemeberCredit = data.result.totalMemeberCredit as Double
    def ydayTotalBalance = data.result.ydayTotalBalance as Double
    assertTrue(cashBalance.compareTo(Double.parseDouble(cashbalance)) == 0)
    assertTrue(netExposure.compareTo(Double.parseDouble(netexposure)) == 0)


    if (smaCredit!=null && !smaCredit.isEmpty()) {
        Double doubleValue = Double.parseDouble(smaCredit)
        assertTrue(doubleValue.compareTo(Double.parseDouble(smacredit))==0)
    }
    if (totalMACredit!=null && !totalMACredit.isEmpty()) {
        Double doubleValue = Double.parseDouble(totalMACredit)
        assertTrue(doubleValue.compareTo(Double.parseDouble(macredit))==0)
    }
    if (totalAgentCredit!=null && !totalAgentCredit.isEmpty()) {
        Double doubleValue = Double.parseDouble(totalAgentCredit)
        assertTrue(doubleValue.compareTo(Double.parseDouble(totalagentcredit))==0)
    }
    if (totalMemeberCredit!=null) {
        assertTrue(totalMemeberCredit.compareTo(Double.parseDouble(totalmembercredit))==0)
    }
    assertTrue(ydayTotalBalance.compareTo(Double.parseDouble(ydaytotalbalance)) == 0)

}
When(~"an agency user \"([^\"]*)\" attempts to view the account details of another user \"([^\"]*)\"") { String username, String targetuser ->
    token = helpers.loginAgencySite(username, "pass1234")
    response = helpers.getAccountDetails(token, targetuser)
}

Then(~"they should be forbidden") { ->
    println(response)
    assertFalse(response.contains("Success"))
}

When(~"\"([^\"]*)\" user with username \"([^\"]*)\" and password \"([^\"]*)\" creates a \"([^\"]*)\" with the following \"([^\"]*)\"") { String usertype, String username, String password, String downline, String creditlimit ->
    def userdata

    name = username
    if (usertype.equals("SMA")) {
        userdata = downline + ",pass1234,true,MA,ACTIVE,Update,Balance,911," + creditlimit + ",150000,150000,100,10000,14000,0,10,50,0,2"
    } else if (usertype.equals("MA")) {
        userdata = downline + ",pass1234,true,Agent,ACTIVE,Update,Balance,911," + creditlimit + ",50000,50000,100,10000,14000,0,10,40,0,2"
    } else {
        userdata = downline + ",pass1234,true,Member,ACTIVE,Update,Balance,911," + creditlimit + ",0,0,100,10000,14000,0,25,0,0,2"
    }
    String json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite(username, password)
    response = helpers.createUser(token, json, username)
}

Then(~"the \"([^\"]*)\" available balance should be updated to \"([^\"]*)\"") { String usertype, String balance ->
    def expectedbalance = db.getAvailableBalance(name)
    assertTrue(expectedbalance.equals(Double.parseDouble(balance)))
}

When(~"\"([^\"]*)\" user with username \"([^\"]*)\" and password \"([^\"]*)\" updates the credit limit of a \"([^\"]*)\" to \"([^\"]*)\"") { String usertype, String username, String password, String downline, String creditlimit ->
    def userdata
    name = username
    child = downline
    if (usertype.equals("SMA")) {
        userdata = downline + ",pass1234,true,MA,ACTIVE,Update,Balance,911," + creditlimit + ",150000,150000,100,10000,14000,0,10,50,0,2"
    } else if (usertype.equals("MA")) {
        userdata = downline + ",pass1234,true,Agent,ACTIVE,Update,Balance,911," + creditlimit + ",50000,50000,100,10000,14000,0,10,40,0,2"
    } else {
        userdata = downline + ",pass1234,true,Member,ACTIVE,Update,Balance,911," + creditlimit + ",0,0,100,10000,14000,0,25,0,0,2"
    }
    String json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite(username, password)
    response = helpers.updateUser(token, json, username)
}
And(~"downline balance should be \"([^\"]*)\"") { String balance ->
    def expectedbalance = db.getAvailableBalance(child)
    assertTrue(expectedbalance.equals(Double.parseDouble(balance)))
}