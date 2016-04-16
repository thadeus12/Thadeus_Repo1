package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.agency

/**
 * Created by charles.moga on 06/01/2016.
 */

import static org.junit.Assert.*
import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.assertThat

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token, json, response, newsma

Given(~"the following SMA basic information details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String username, String password,
                                                                                                                                          String firstname, String lastname,
                                                                                                                                          String contactnumber, String status ->

    String userdata = username + "," + password + ",true,SMA," + status + "," + firstname + "," + lastname + "," + contactnumber + ",500000,400000,300000,100,10000,14000,100,0,60,0,2"
    newsma = username
    json = helpers.createUserJson(userdata)
}

When(~"a COY with username \"([^\"]*)\" and password \"([^\"]*)\" creates an SMA") { String username, String password ->
    token = helpers.loginCompanySite(username, password)
    response = helpers.createUser(token, json, "admin.user")
}

Then(~"the basic details of the SMA should be registered and COY user gets \"([^\"]*)\" message") { String success ->
    assertThat(response, containsString(success))
}

And(~"the new SMA should get \"([^\"]*)\" response when they login to managersite") { String success ->
    String username = newsma
    token = helpers.loginAgencySite(username, "pass1234")
    if (success.equals("Success")) {
        assertFalse(token.contains("AUTH003"))
    } else {
        assertThat(token, containsString("AUTH003"))
    }
}

When(~"COY user attempts to create SMA with the following SMA basic information details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String username, String password,
                                                                                                                                                                              String firstname, String lastname,
                                                                                                                                                                              String contactnumber, String status ->
    String userdata = username + "," + password + ",true,SMA," + status + "," + firstname + "," + lastname + "," + contactnumber + ",500000,400000,300000,100,10000,14000,100,0,60,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "admin.user")

}

Then(~"the operation should fail and error \"([^\"]*)\" returned") { String error ->
    assertThat(response, containsString(error))
}

When(~"COY user sets the following credit limits \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a new SMA called \"([^\"]*)\"") { String creditlimit, String maxmacreditlimit, String membermaxcredit, String username ->

    String userdata = username + ",pass1234,true,SMA,ACTIVE,Test,SMA,9083453," + creditlimit + "," + maxmacreditlimit + "," + membermaxcredit + ",100,10000,14000,100,0,60,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "admin.user")
}

Then(~"the limits should be set successfully and COY user gets \"([^\"]*)\" message") { String success ->
    assertThat(response, containsString(success))
}

When(~"COY user attempts to set the following credit limits \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a new SMA") { String creditlimit, String maxmacreditlimit, String membermaxcredit ->

    String userdata = "SM21,pass1234,true,SMA,ACTIVE,Test,SMA,9083453," + creditlimit + "," + maxmacreditlimit + "," + membermaxcredit + ",100,10000,14000,100,0,60,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "admin.user")
}

When(~"COY user sets the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a new SMA called \"([^\"]*)\"") { String minbet, String maxbet,
                                                                                                                                 String maxpermatch, String username ->

    String userdata = username + ",pass1234,true,SMA,ACTIVE,Test,SMA,9083453,500000,400000,300000," + minbet + "," + maxbet + "," + maxpermatch + ",100,0,60,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "admin.user")
}

Then(~"the bet settings should be set successfully and COY user gets \"([^\"]*)\" message") { String success ->
    assertThat(response, containsString(success))
}

When(~"COY user attempts to set the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a new SMA") { String minbet, String maxbet,
                                                                                                                        String maxpermatch ->

    String userdata = "SM17,pass1234,true,SMA,ACTIVE,Test,SMA,9083453,500000,400000,300000," + minbet + "," + maxbet + "," + maxpermatch + ",100,0,60,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "admin.user")
}

When(~"COY user sets the following position limit \"([^\"]*)\" for a new SMA called \"([^\"]*)\"") { String smamaxposition, String username ->
    String userdata = username + ",pass1234,true,SMA,ACTIVE,Test,SMA,9083453,500000,400000,300000,100,10000,14000,100,0," + smamaxposition + ",0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "admin.user")
}

Then(~"the position settings should be set successfully and COY user gets \"([^\"]*)\" message") { String success ->
    assertThat(response, containsString(success))
}

When(~"COY user attempts to set the following position settings \"([^\"]*)\" for a new SMA") { String smamaxposition ->
    String userdata = "SM11,pass1234,true,SMA,ACTIVE,Test,SMA,9083453,500000,400000,300000,100,10000,14000,100,0," + smamaxposition + ",0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "admin.user")
}

When(~"COY user sets the following commission settings \"([^\"]*)\",\"([^\"]*)\" for a new SMA called \"([^\"]*)\"") { String membercommission, String commission, String username ->
    String userdata = username + ",pass1234,true,SMA,ACTIVE,Test,SMA,9083453,500000,400000,300000,100,10000,14000,100,0,60," + commission + "," + membercommission
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "admin.user")
}

Then(~"the commission settings should be set successfully and COY user gets \"([^\"]*)\" message") { String success ->
    assertThat(response, containsString(success))
}

When(~"COY user attempts to set the following commission settings \"([^\"]*)\",\"([^\"]*)\" for a new SMA") { String membercommission, String commission ->
    String userdata = "SM10,pass1234,true,SMA,ACTIVE,Test,SMA,9083453,500000,400000,300000,100,10000,14000,100,0,60," + commission + "," + membercommission
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "admin.user")
}