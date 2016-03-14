package com.leo.apollo.qa.steps.agency

import com.fasterxml.jackson.databind.ObjectMapper

import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.assertThat

/**
 * Created by charles.moga on 14/01/2016.
 */
this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)
Map user = new HashMap<>()

When(~"a COY creates subuser with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String username, String password,
                                                                                                                                              String firstname, String lastname,
                                                                                                                                              String contactnumber, String status ->

    user.clear()
    user.put("name", username)
    user.put("password", password)
    user.put("level", "COY")
    user.put("status", status)
    user.put("firstName", firstname)
    user.put("lastName", lastname)
    user.put("contactNumber", contactnumber)
    user.put("master", "false")

    data = new HashMap<>()
    data.put("personalInformation", user)

    ObjectMapper mapper = new ObjectMapper()
    try {
        json = mapper.writeValueAsString(data)
    } catch (Exception ex) {
        System.out.println(ex)
    }
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createSubUser(token, json)
}

Then(~"the subuser should be created and COY user gets \"([^\"]*)\" message") { String success ->
    assertThat(response, containsString(success))
}

And(~"the new subuser should get \"([^\"]*)\" response when they login to backoffice") { String success ->
    token = helpers.loginCompanySite(user.get("name").toString(), user.get("password").toString())
    assertThat(response, containsString(success))
}

When(~"a COY attempts to create subuser with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String username, String password,
                                                                                                                                                         String firstname, String lastname,
                                                                                                                                                         String contactnumber, String status ->

    user.clear()
    user.put("name", username)
    user.put("password", password)
    user.put("level", "COY")
    if (status.length() > 0) {
        user.put("status", status)
    } else {
        user.put("status", "")
    }
    user.put("firstName", firstname)
    user.put("lastName", lastname)
    user.put("contactNumber", contactnumber)
    user.put("master", "false")

    data = new HashMap<>()
    data.put("personalInformation", user)

    ObjectMapper mapper = new ObjectMapper()
    try {
        json = mapper.writeValueAsString(data)
    } catch (Exception ex) {
        System.out.println(ex)
    }
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createSubUser(token, json)
}
Then(~"the user should fail to create new subuser and error \"([^\"]*)\" returned") { String error ->
    assertThat(response, containsString(error))
}