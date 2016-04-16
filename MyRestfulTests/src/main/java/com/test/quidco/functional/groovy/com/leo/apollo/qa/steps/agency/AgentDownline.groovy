package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.agency

import groovy.json.JsonSlurper
import static org.junit.Assert.assertEquals

/**
 * Created by charles.moga on 07/01/2016.
 */


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token, response

When(~"\"([^\"]*)\" user with username \"([^\"]*)\" and password \"([^\"]*)\" views their downlines") { String usertype, String username, String password ->
    token = helpers.loginAgencySite(username, password)
    response = helpers.getDownlines(token, username, "", 0)
}

Then(~"they should see these \"([^\"]*)\" downlines listed") { String downline ->
    assertEquals(response.replaceAll("\\s", ""), downline)

}

When(~"\"([^\"]*)\" user with username \"([^\"]*)\" and password \"([^\"]*)\" views the downlines of their downline \"([^\"]*)\"") { String usertype, String username, String password, String ownerid ->
    token = helpers.loginAgencySite(username, password)
    response = helpers.getDownlines(token, ownerid, "", 0)
}

When(~"\"([^\"]*)\" user with username \"([^\"]*)\" and password \"([^\"]*)\" views the details of a downline") { String usertype, String username, String password ->
    token = helpers.loginAgencySite(username, password)
    response = helpers.getDownlineFullDetails(token, username, "", 0)
}

Then(~"they should see the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"") { String username, String status, String settledbalance, String netexposure, String creditlimit, String createdDate ->
    int userexists = 0

    def slurper = new JsonSlurper()
    def data = slurper.parseText((String) response)
    data.result.each {

        if ((it.user.name).equals(username)) {
            Double actalbalance = it.account.settledBalance
            Double actualexposure = it.account.netExposure
            Double actualcreditlimit = it.account.creditLimit
            String actualstatus = it.user.userStatus

            assertEquals(Double.parseDouble(settledbalance), actalbalance, 0.00)
            assertEquals(Double.parseDouble(netexposure), actualexposure, 0.00)
            assertEquals(Double.parseDouble(creditlimit), actualcreditlimit, 0.00)
            assertEquals(status, actualstatus)
            userexists = 1

        }

    }


    assertEquals(1, userexists)
}


When(~"Agent with username \"([^\"]*)\" and password \"([^\"]*)\" makes unauthorised query to list downlines") { String username, String password ->
    token = helpers.loginAgencySite(username, password)
}

Then(~"The request to list downlines of \"([^\"]*)\" will fail") { String owner ->
    int error = helpers.forbidDownlineRequest(token, owner)
    assertEquals(403, error)
}

When(~"Agent with username \"([^\"]*)\" and password \"([^\"]*)\" searches for downlines with usercode \"([^\"]*)\" and status \"([^\"]*)\"") { String username, String password, String code, String status ->
    token = helpers.loginAgencySite(username, password)
    response = helpers.getDownlines(token, username, code, Integer.parseInt(status))
}

Then(~"the Agent should see the downlines \"([^\"]*)\"") { String downline ->
    assertEquals(response.replaceAll("\\s", ""), downline)
}
