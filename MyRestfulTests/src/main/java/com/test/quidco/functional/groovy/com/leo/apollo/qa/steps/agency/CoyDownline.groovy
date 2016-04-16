package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.agency

/**
 * Created by charles.moga on 07/01/2016.
 */

import groovy.json.JsonSlurper
import static org.junit.Assert.assertEquals

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token, downlines, response

When(~"COY user with username \"([^\"]*)\" and password \"([^\"]*)\"") { String username, String password ->
    token = helpers.loginCompanySite(username, password);
}

Then(~"they should see the SMAs for the coyid \"([^\"]*)\"") { String userCode ->
    response = helpers.getDownlines(token, userCode, "", 0);
    downlines = db.readDownlines(userCode, "", 0);
    assertEquals(downlines, response);
}

When(~"COY user views the downlines of their downline \"([^\"]*)\"") { String ownerid ->
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.getDownlines(token, ownerid, "", 0)
}

Then(~"COY should see these \"([^\"]*)\" downlines") { String downline ->
    assertEquals(response.replaceAll("\\s", ""), downline)

}


When(~"COY user views the details of a downline \"([^\"]*)\" owned by \"([^\"]*)\"") { String downline, String owner ->
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.getDownlineFullDetails(token, owner, "", 0)
}

Then(~"COY should see the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"") { String username, String status, String settledbalance, String netexposure, String creditlimit, String createdDate ->
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


When(~"Unauthorized COY user attempts to view SMA downlines with invalid or missing token \"([^\"]*)\"") { String authorization ->
    String owner = "1";
    error = helpers.forbidDownlineRequest(authorization, owner);
}
Then(~"they should receive error \"([^\"]*)\"") { String error ->
    assertEquals(403, Integer.parseInt(error));
}
When(~"COY user searches for downlines with usercode \"([^\"]*)\" and status \"([^\"]*)\" for agent \"([^\"]*)\"") { String code, String status, String parent ->
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.getDownlines(token, parent, code, Integer.parseInt(status))
}
