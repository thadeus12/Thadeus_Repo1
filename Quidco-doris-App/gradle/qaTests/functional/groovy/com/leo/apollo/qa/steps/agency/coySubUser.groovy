package com.leo.apollo.qa.steps.agency

/**
 * Created by charles.moga on 14/01/2016.
 */

import static org.junit.Assert.assertEquals

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~"Coy user with \"([^\"]*)\", \"([^\"]*)\" queries their subusers") { String username, String password ->
    token = helpers.loginCompanySite(username, password)
}

Then(~"Coy should see the following \"([^\"]*)\" subusers for usercode \"([^\"]*)\"") { String subusers, String userCode ->
    String result = helpers.getSubUsers(token, userCode)
    assertEquals(subusers, result)
}
When(~"Unauthorized COY user attempts to view subusers with invalid or missing token \"([^\"]*)\"") { String authorization ->
    String owner = "1"
    error = helpers.rejectGetSubUsers(authorization, owner)
}
Then(~"the Coy should receive error \"([^\"]*)\"") { String error ->
    assertEquals(403, Integer.parseInt(error))
}