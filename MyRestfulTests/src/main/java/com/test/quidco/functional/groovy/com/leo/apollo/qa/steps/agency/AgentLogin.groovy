package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.agency


import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.assertNotNull
import static org.junit.Assert.assertThat
import static org.junit.Assert.assertTrue

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token

When(~"I login to agency site with username \"([^\"]*)\" and password \"([^\"]*)\"") { String username, String password ->
    token = helpers.loginAgencySite(username, password)
}

Then(~"I should get valid authentication token") { ->
    assertNotNull(token)
}
When(~"I attempt login to agency site as \"([^\"]*)\" with wrong username \"([^\"]*)\" or password \"([^\"]*)\"") { String usertype, String username, String password ->
    token = helpers.loginAgencySite(username, password)
}

Then(~"I should not succeed to login to agency site and receive error") { ->
    assertThat(token, containsString("AUTH004"))
    token = null
}

When(~"I login to agency site with inactive or closed account status \"([^\"]*)\", username \"([^\"]*)\" and password \"([^\"]*)\"") { String usertype, String username, String password ->
    token = helpers.loginAgencySite(username, password)
}

Then(~"I should fail and receive AUTH003 error") { ->
    assertThat(token, containsString("AUTH003"))
}

When(~"I try to login to agency site as \"([^\"]*)\" with username \"([^\"]*)\" and password \"([^\"]*)\"") { String usertype, String username, String password ->
    token = helpers.loginAgencySite(username, password)
}

Then(~"I should not succeed and receive contact your upline error") { ->
    assertThat(token, containsString("AUTH003"))
}

When(~"I attempt to login to agency site as \"([^\"]*)\" with username \"([^\"]*)\" and password \"([^\"]*)\"") { String usertype, String username, String password ->
    token = helpers.loginAgencySite(username, password)
}

Then(~"My attempt should fail and I should receive contact your upline error") { ->
    assertThat(token, containsString("AUTH003"))
}

When(~/^an upline agent status updates to "([^"]*)" for username "([^"]*)"$/) { status, name ->
    def agentStatus = [:]
    agentStatus.put("ACTIVE", 1)
    agentStatus.put("INACTIVE", 2)
    agentStatus.put("SUSPENDED", 3)
    agentStatus.put("CLOSED", 4)

    statusId = agentStatus.get(status.toUpperCase())

    String query = "UPDATE user SET status_id = ${statusId} WHERE name = '${name}'"

    db.update(query)

    sleep(3000)
}

When(~/^an agent with "([^"]*)" and password "([^"]*)" update fails$/) { username, password ->
    response = helpers.changePasswordAndGetHttpResponse(token,username,password,"pass12345")

    assertTrue(response.getStatusCode()==403)

    // here we reset the changed status for the users back to active
    String query = "UPDATE user SET status_id = 1 WHERE name = '${username}'"

    db.update(query)
    sleep(3000)
}

