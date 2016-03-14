package com.leo.apollo.qa.steps.agency


import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.assertNotNull
import static org.junit.Assert.assertThat

/**
 * Created by charles.moga on 07/01/2016.
 */

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token

When(~"I login with username \"([^\"]*)\" and password \"([^\"]*)\"") { String username, String password ->
    token = helpers.loginCompanySite(username, password)
}

Then(~"I should succeed") { ->
    assertNotNull(token)
    token = null
}

When(~"I try to login with username \"([^\"]*)\" and password \"([^\"]*)\"") { String username, String password ->
    token = helpers.loginCompanySite(username, password)
}

Then(~"I should receive \"([^\"]*)\"") { String errorcode ->
    assertThat(token, containsString(errorcode))
    token = null
}

When(~"I login with inactive username \"([^\"]*)\" and password \"([^\"]*)\"") { String username, String password ->
    token = helpers.loginCompanySite(username, password)
}

Then(~"I should receive error \"([^\"]*)\"") { String errorcode ->
    assertThat(token, containsString(errorcode))
    token = null
}

When(~"I login to bo with agent username \"([^\"]*)\" and password \"([^\"]*)\"") { String username, String password ->
    token = helpers.loginCompanySite(username, password)
}

Then(~"I should not be authorised and receive \"([^\"]*)\"") { String errorcode ->
    assertThat(token, containsString(errorcode))
    token = null
}