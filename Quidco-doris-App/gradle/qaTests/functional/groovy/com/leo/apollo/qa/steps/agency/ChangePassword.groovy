package com.leo.apollo.qa.steps.agency

import com.leo.apollo.qa.support.Helpers

import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.assertNotNull
import static org.junit.Assert.assertThat
import static org.junit.Assert.assertTrue

/**
 * Created by michal.nawrocki on 29/01/2016.
 */

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def user =[:]
def response

When(~"a \"([^\"]*)\" user logs in with a valid username \"([^\"]*)\", password \"([^\"]*)\" and tries to update his password to \"([^\"]*)\"") {
    String site, String username, String password, String newPassword ->
    if(site.equals("company")) {
        user.token = helpers.loginCompanySite(username,password)
    } else {
        user.token = helpers.loginAgencySite(username, password)
    }
    user.name = username
    user.password = password
    user.newPassword = newPassword
    response = helpers.changePassword(user.token,user.name,user.password,newPassword)

}

Then(~"the user should get response \"([^\"]*)\"") { String expectedResponse ->
    assertTrue(response.contains(expectedResponse))
}
And(~"the user should be able to login with the password \"([^\"]*)\"") {->
    token = helpers.loginAgencySite(user.name, user.newPassword)
    //reset password back to original as we are using generic users
    response = helpers.changePassword(user.token,user.name,"pass1234",user.password)

}
