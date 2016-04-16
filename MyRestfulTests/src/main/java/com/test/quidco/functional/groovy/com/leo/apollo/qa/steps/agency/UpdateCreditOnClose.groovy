package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.agency

import groovy.json.JsonSlurper

import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertThat
import static org.junit.Assert.assertTrue

/**
 * Created by Sudeep.Shenoy on 04/02/2016.
 */

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def userToken
def agentUsername
String website
When(~/^An agent with username"([^"]*)", password"([^"]*)" and available balance"([^"]*)" logs into site "([^"]*)" and tries close a downline with downlineUsername"([^"]*)" , downlineLevel"([^"]*)" and downlineCreditLimit"([^"]*)"$/) {
    String username, String password, String availableBalance, String site, String downlineUsername, String downlineLevel, String downlineCreditLimit ->

    if(site.equals("company")) {
        userToken = helpers.loginCompanySite(username,password)
    } else {
        userToken = helpers.loginAgencySite(username, password)
    }
    agentUsername = username
        website = site
    currentAvailableBalance = availableBalance
    closedStatus = "CLOSED"
    downline = downlineUsername

    String userdata = downlineUsername + "," + password + ",true," + downlineLevel + "," + closedStatus + ", firstname,lastname,09898978," + downlineCreditLimit + ",0,0,200,200,0,0,10,0,0,2"
    json = helpers.createUserJson(userdata)

    response = helpers.updateUser(userToken, json, username)
}

Then(~/^User gets "([^"]*)"$/) { String success->
    assertThat(response, containsString(success))
}

Then(~/^Agent should be able to get back the credit limits "([^"]*)" of the downline to his new available balance"([^"]*)"$/) { String downlineCreditLimit, String newAvailableBalance ->

    response = helpers.getAccountDetails(userToken, agentUsername)

    def slurper = new JsonSlurper()
    def data = slurper.parseText((String) response)

    def userAvailableBalance = data.result.availableBalance as Double
    assertTrue(userAvailableBalance.compareTo(Double.parseDouble(newAvailableBalance)) == 0)
}

Then(~/^downline user new credit Limit "([^"]*)" and new available balance "([^"]*)" should be zero$/) { String newDownlineCreditLimit, String newDownlineAvailableBalance ->
    response = helpers.getDownlineFullDetails(userToken, agentUsername, downline, 4)

    def slurper = new JsonSlurper()
    def data = slurper.parseText((String) response)
    data.result.each {

        if ((it.user.name).equals(downline)) {

            Double actualCreditLimit = it.account.creditLimit
            Double actualAvailableBalance = it.account.availableBalance

            assertEquals(Double.parseDouble(newDownlineCreditLimit), actualCreditLimit, 0.00)
            assertEquals(Double.parseDouble(newDownlineAvailableBalance), actualAvailableBalance, 0.00)
        }
    }
}

When(~/^An agent with username"([^"]*)", password"([^"]*)" and available balance"([^"]*)" logs into site "([^"]*)" and tries close a downline with downlineUsername"([^"]*)" , downlineLevel"([^"]*)", downlineCreditLimit"([^"]*)" and open bets$/) {
    String username, String password, String availableBalance, String site, String downlineUsername, String downlineLevel, String downlineCreditLimit ->
website = site
        if(site.equals("company")) {
            userToken = helpers.loginCompanySite(username,password)
        } else {
            userToken = helpers.loginAgencySite(username, password)
        }
        agentUsername = username
        currentAvailableBalance = availableBalance
        closedStatus = "CLOSED"
        downline = downlineUsername

        String userdata = downlineUsername + "," + password + ",true," + downlineLevel + "," + closedStatus + ", firstname,lastname,09898978," + downlineCreditLimit + ",0,0,200,200,0,0,10,0,0,2"
        json = helpers.createUserJson(userdata)

        response = helpers.updateUser(userToken, json, username)
}

Then(~/^User gets error"([^"]*)"$/) { String error->
    assertThat(response, containsString(error))
}

Then(~/^Agent new available balance"([^"]*)" should not change$/) { String newAvailableBalance ->

    if (website.equals("company")){
        response = helpers.coyGetAccountDetails(userToken, agentUsername)
    }else{
        response = helpers.getAccountDetails(userToken, agentUsername)
    }


    def slurper = new JsonSlurper()
    def data = slurper.parseText((String) response)
helpers.printdebug(data.toString())
    def userAvailableBalance = data.result.availableBalance as Double
    assertTrue(userAvailableBalance.compareTo(Double.parseDouble(newAvailableBalance)) == 0)
}