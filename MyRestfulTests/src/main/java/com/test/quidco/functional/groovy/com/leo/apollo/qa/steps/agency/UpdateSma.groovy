package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.agency

/**
 * Created by charles.moga on 06/01/2016.
 */

import static org.junit.Assert.*
import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.assertThat

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token, json, response, newstatus
String newpassword

When(~"COY with username \"([^\"]*)\" and password \"([^\"]*)\" edits an SMA and enters the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String coyusername, String coypassword, String password,
                                                                                                                                                                                       String firstname, String lastname,
                                                                                                                                                                                       String contactnumber, String status ->
    String userdata = "SM01," + password + ",true,SMA," + status + "," + firstname + "," + lastname + "," + contactnumber + ",500000,400000,300000,100,10000,14000,100,0,60,0,2"
    json = helpers.createUserJson(userdata)
    newpassword = password
    newstatus = status
    token = helpers.loginCompanySite(coyusername, coypassword)
    response = helpers.updateUser(token, json, "admin.user")
}

Then(~"the SMA details should be updated and the user gets \"([^\"]*)\" message") { String success ->
    assertThat(response, containsString(success))
}

And(~"the SMA should get \"([^\"]*)\" response when they login to agency site after the update") { String success ->

    if (newpassword.equals("null")) {
        token = helpers.loginAgencySite("SM01", "pass1234")
    } else {
        token = helpers.loginAgencySite("SM01", newpassword)
    }
    if (newstatus.equals("ACTIVE")) {
        assertFalse(token.contains("AUTH004"))
    } else {
        assertThat(token, containsString("AUTH004"))
    }
}

When(~"COY with username \"([^\"]*)\" and password \"([^\"]*)\" attempts to edit an SMA with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String coyusername, String coypassword, String password,
                                                                                                                                                                                            String firstname, String lastname,
                                                                                                                                                                                            String contactnumber, String status ->

    String userdata = "SM01," + password + ",true,SMA," + status + "," + firstname + "," + lastname + "," + contactnumber + ",500000,400000,300000,100,10000,14000,100,0,60,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite(coyusername, coypassword)
    response = helpers.updateUser(token, json, "admin.user")
}

Then(~"the operation to edit an SMA should fail and error \"([^\"]*)\" returned") { String error ->
    assertThat(response, containsString(error))
}

When(~"COY user updates the following position limits \"([^\"]*)\" for an SMA") { String positiontaking ->
    String userdata = "SM01,pass1234,true,SMA,ACTIVE,Test,SMA,9083453,500000,400000,300000,100,10000,14000,100,0," + positiontaking + ",0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "admin.user")
}

When(~"COY user attempts to update the following position settings \"([^\"]*)\" for an SMA") { String positiontaking ->
    String userdata = "SM01,pass1234,true,SMA,ACTIVE,Test,SMA,9083453,500000,400000,300000,100,10000,14000,100,0," + positiontaking + ",0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "admin.user")
}

When(~"COY user edits the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for an SMA") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "SM01,pass1234,true,SMA,ACTIVE,Test,SMA,9083453,500000,400000,300000," + minbet + "," + maxbet + "," + maxpermatch + ",100,0,60,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "admin.user")
}

When(~"COY user attempts to edit the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for an SMA") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "SM01,pass1234,true,SMA,ACTIVE,Test,SMA,9083453,500000,400000,300000," + minbet + "," + maxbet + "," + maxpermatch + ",100,0,60,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "admin.user")
}

When(~"COY user updates the following credit limits \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for an SMA") { String creditlimit, String maxmacreditlimit, String membermaxcredit ->
    String userdata = "SM01,pass1234,true,SMA,ACTIVE,Test,SMA,9083453," + creditlimit + "," + maxmacreditlimit + "," + membermaxcredit + ",100,10000,14000,100,0,60,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "admin.user")
}

When(~"COY user attempts to updates the following credit limits \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for an SMA") { String creditlimit, String maxmacreditlimit, String membermaxcredit ->
    String userdata = "SM01,pass1234,true,SMA,ACTIVE,Test,SMA,9083453," + creditlimit + "," + maxmacreditlimit + "," + membermaxcredit + ",100,10000,14000,100,0,60,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "admin.user")
}

When(~"COY user attempts to reduce SMA bet settings as follows \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "SM01,null,true,SMA,ACTIVE,Test,SMA,908345,500000,400000,300000," + minbet + "," + maxbet + "," + maxpermatch + ",100,0,60,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "admin.user")
}

When(~"COY user attempts to reduce SMA credit limits as follows \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String creditlimit, String maxmacreditlimit, String membermaxcredit ->
    String userdata = "SM01,null,true,SMA,ACTIVE,Test,SMA,908345," + creditlimit + "," + maxmacreditlimit + "," + membermaxcredit + ",100,10000,14000,100,0,60,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "admin.user")
}

When(~"COY user attempts to reduce SMA position settings as follows \"([^\"]*)\"") { String position ->
    String userdata = "SM01,null,true,SMA,ACTIVE,Test,SMA,908345,500000,400000,300000,100,10000,14000,100,0," + position + ",0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "admin.user")
}