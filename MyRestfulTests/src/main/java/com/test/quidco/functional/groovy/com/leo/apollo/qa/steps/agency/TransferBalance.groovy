package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.agency

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper

/**
 * Created by sudeep.shenoy on 12/01/2016.
 */
import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.*

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token, response, user, dl

When(~"a \"([^\"]*)\" user with username \"([^\"]*)\" and password \"([^\"]*)\" views their transfer page") { String usertype, String username, String password ->
    if (usertype.equals("COY")) {
        token = helpers.loginCompanySite(username, password)
    } else {
        token = helpers.loginAgencySite(username, password)
    }
    response = helpers.getTransferDetails(token, username)
}

Then(~"they should see the following \"([^\"]*)\" downlines listed with transfer details") { String expecteddownlines ->
    String actualdownlines = ""
    try {
        ObjectMapper mapper = new ObjectMapper()

        JsonNode root = mapper.readTree((String) response)
        for (final JsonNode transferInfo : root.get("result")) {
            actualdownlines += transferInfo.get("name").asText() + ","
        }
    } catch (Exception e) {
        e.printStackTrace()
    }
    actualdownlines = actualdownlines.substring(0, actualdownlines.length() - 1)
    assertTrue(actualdownlines.equals(expecteddownlines))
}

When(~"a \"([^\"]*)\" user with username \"([^\"]*)\" and password \"([^\"]*)\" views their downline transfer") { String level, String username, String password ->
    if (level.equals("COY")) {
        token = helpers.loginCompanySite(username, password)
    } else {
        token = helpers.loginAgencySite(username, password)
    }
    response = helpers.getTransferDetails(token, username)
}

Then(~"they should see user \"([^\"]*)\" where balanceUp equals \"([^\"]*)\" balanceDown equals \"([^\"]*)\" and credit used equals \"([^\"]*)\"") { String expectedUser, String expectedBalanceUp, String expectedBalanceDown, String expectedCreditUsed ->
    try {
        ObjectMapper mapper = new ObjectMapper()
        JsonNode root = mapper.readTree((String) response)
        Boolean success = false
        for (final JsonNode transferInfo : root.get("result")) {
            if (transferInfo.get("name").asText().equals(expectedUser)) {

                if (!transferInfo.get("creditUsed").asText().isEmpty() && !transferInfo.get("creditUsed").asDouble().equals(Double.valueOf(expectedCreditUsed))) {
                    success = false
                    break
                }

                if (transferInfo.get("creditUsed").asText().isEmpty() && !expectedCreditUsed.isEmpty()) {
                    success = false
                    break
                }

                Double balanceUp = transferInfo.get("balanceUp").asDouble()
                Double balanceDown = transferInfo.get("balanceDown").asDouble()
                if (balanceUp.equals(Double.valueOf(expectedBalanceUp)) && balanceDown.equals(Double.valueOf(expectedBalanceDown))) {
                    success = true
                    break
                } else {
                    success = false
                    break
                }
            }
        }
        assertTrue(success)
    } catch (Exception e) {
        e.printStackTrace()
    }
}

When(~"an agency user \"([^\"]*)\" attempts to view downline transfer details of another user \"([^\"]*)\"") { String username, String targetUser ->

    token = helpers.loginAgencySite(username, "pass1234")
    response = helpers.getTransferDetails(token, targetUser)
}

Then(~"they should get forbidden message and not allowed to see the transfer details") { ->
    assertThat(response, containsString("AUTH021"))
}

When(~"an \"([^\"]*)\" user with username \"([^\"]*)\" and password \"([^\"]*)\" transfers the amount \"([^\"]*)\" for downline \"([^\"]*)\" balance of \"([^\"]*)\" displayed") { String usertype, String username, String password, String transferamount, String downline, String displayamount ->
    user = username
    dl = downline
    if (usertype.equals("COY")) {
        token = helpers.loginCompanySite(username, password)
    } else {
        token = helpers.loginAgencySite(username, password)
    }
    double displayAmt = Double.parseDouble(displayamount)
    double transferAmt = Math.abs(Double.parseDouble(transferamount))
    String json = "{\"transferAmt\":" + transferAmt + ",\"displayAmt\":" + displayAmt + "}"
    response = helpers.transferBalance(token, username, downline, json)
}

Then(~"the transfer operation should succeed with \"([^\"]*)\" response") {
    String success ->
        assertThat(response, containsString(success))
}

And(~"the user cash balance should be \"([^\"]*)\" and downline balance should be \"([^\"]*)\"") { String userbalanceafter, String downlinebalanceafter ->
    response = helpers.getTransferDetails(token, user)

    ObjectMapper mapper = new ObjectMapper()
    try {
        JsonNode root = mapper.readTree(response).get("result")
        Double sumBalanceDown = 0D
        Double sumBalanceUp = 0D
        int i = 0
        for (final JsonNode objNode : root) {
            String name = objNode.at("/name").textValue()
            double balanceDown = objNode.at("/balanceDown").asDouble()
            double balanceUp = objNode.at("/balanceUp").asDouble()
            sumBalanceDown += balanceDown
            sumBalanceUp += balanceUp
            if (dl.equals(name)) {
                assertEquals(Double.parseDouble(downlinebalanceafter), balanceUp, 0)
            }
            i++
        }
        assertEquals(Double.parseDouble(userbalanceafter), -1 * sumBalanceUp, 0)
    } catch (Exception e) {
        e.printStackTrace()
    }
}
When(~"a \"([^\"]*)\" with \"([^\"]*)\", password \"([^\"]*)\", balance \"([^\"]*)\" tries to transfer amount of \"([^\"]*)\" for downline \"([^\"]*)\" with balance \"([^\"]*)\"") {
    String usertype, String username, String password, String balance, String downlinebalance, String downline, String transferamount ->
        if (usertype.equals("COY")) {
            token = helpers.loginCompanySite(username, password)
        } else {
            token = helpers.loginAgencySite(username, password)
        }
        double displayAmt = Double.parseDouble(transferamount)
        double transferAmt = Math.abs(Double.parseDouble(transferamount))
        String json = "{\"transferAmt\":" + transferAmt + ",\"displayAmt\":" + displayAmt + "}"
        response = helpers.transferBalance(token, username, downline, json)

}

Then(~"the transfer operation should fail with error code \"([^\"]*)\"") { String errorcode ->
    assertTrue(response.contains(errorcode))
}