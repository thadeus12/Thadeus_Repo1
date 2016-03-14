package com.leo.apollo.qa.steps.agency

/**
 * Created by charles.moga on 04/01/2016.
 */


import static org.junit.Assert.*
import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.assertThat

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token, json, response

When(~"a \"([^\"]*)\" user with username \"([^\"]*)\" and password \"([^\"]*)\" creates an MA with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String site, String coyusername, String coypassword, String username,
                                                                                                                                                                                                            String passwd, String firstname, String lastname, String contactnumber, String status ->
    ma = username
    mapassword = passwd
    mastatus = status

    String userdata = username + "," + passwd + ",true,MA," + status + "," + firstname + "," + lastname + "," + contactnumber + ",200000,150000,140000,200,8000,13000,0,10,50,0,2";
    json = helpers.createUserJson(userdata)

    if(site.equals("company")) {
        token = helpers.loginCompanySite(coyusername, coypassword)
    } else {
        token = helpers.loginAgencySite(coyusername, coypassword)
    }
    response = helpers.createUser(token, json, "MM01")
}

Then(~"the MA should be created and the user gets \"([^\"]*)\" message") { String success ->
    assertThat response, containsString(success)
}

And(~"the new MA should get \"([^\"]*)\" response when they login to managersite") { String success ->
    token = helpers.loginAgencySite(ma, mapassword)
    if (success.equals("Success")) {
        assertFalse(token.contains("AUTH004"))
    } else {
        assertThat(token, containsString("AUTH004"))
    }
}

When(~"an SMA creates an MA with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String username, String password,
                                                                                                                                             String firstname, String lastname,
                                                                                                                                             String contactnumber, String status ->

    ma = username;
    mapassword = password;
    mastatus = status;

    String userdata = username + "," + password + ",true,MA," + status + "," + firstname + "," + lastname + "," + contactnumber + ",200000,150000,140000,200,8000,13000,0,10,50,0,2";
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM01", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}

When(~"a COY or subuser attempts to create an MA with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String username, String password,
                                                                                                                                                                  String firstname, String lastname,
                                                                                                                                                                  String contactnumber, String status ->

    ma = username;
    mapassword = password;
    mastatus = status;

    String userdata = username + "," + password + ",true,MA," + status + "," + firstname + "," + lastname + "," + contactnumber + ",200000,150000,140000,200,8000,13000,0,10,50,0,2";
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}

Then(~"the operation to create an MA should fail and error \"([^\"]*)\" returned") { String success ->
    assertThat(response, containsString(success))
}

When(~"an SMA attempts to an MA with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String username, String password,
                                                                                                                                                 String firstname, String lastname,
                                                                                                                                                 String contactnumber, String status ->

    ma = username;
    mapassword = password;
    mastatus = status;

    String userdata = username + "," + password + ",true,MA," + status + "," + firstname + "," + lastname + "," + contactnumber + ",200000,150000,140000,200,8000,13000,0,10,50,0,2";
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM01", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}


When(~"COY user creates an MA \"([^\"]*)\" with the following credit settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String ma, String creditlimit, String mamaxcredit, String membermaxcredit ->
    String userdata = ma + ",pass1234,true,MA,ACTIVE,Test,MA,9083453," + creditlimit + "," + mamaxcredit + "," + membermaxcredit + ",200,8000,13000,0,10,50,0,2";
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}

When(~"SMA user creates an MA \"([^\"]*)\" with the following credit settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String ma, String creditlimit, String mamaxcredit, String membermaxcredit ->
    String userdata = ma + ",pass1234,true,MA,ACTIVE,Test,MA,9083453," + creditlimit + "," + mamaxcredit + "," + membermaxcredit + ",200,8000,13000,0,10,50,0,2";
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM01", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}

When(~"COY user attempts to create an MA with the following credit settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String creditlimit, String mamaxcredit, String membermaxcredit ->
    String userdata = "MM0117,pass1234,true,MA,ACTIVE,Test,MA,9083453," + creditlimit + "," + mamaxcredit + "," + membermaxcredit + ",200,8000,13000,0,10,50,0,2";
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}

When(~"SMA attempts to create an MA with the following credit settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String creditlimit, String mamaxcredit, String membermaxcredit ->
    String userdata = "MM0123,pass1234,true,MA,ACTIVE,Test,MA,9083453," + creditlimit + "," + mamaxcredit + "," + membermaxcredit + ",200,8000,13000,0,10,50,0,2";
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM01", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}

When(~"COY user creates an MA \"([^\"]*)\" with the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String username, String minbet, String maxbet, String maxpermatch ->
    String userdata = username + ",pass1234,true,MA,ACTIVE,Test,MA,9083453,200000,150000,140000," + minbet + "," + maxbet + "," + maxpermatch + ",0,10,50,0,2";
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}

When(~"SMA creates an MA \"([^\"]*)\" with the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String username, String minbet, String maxbet, String maxpermatch ->
    String userdata = username + ",pass1234,true,MA,ACTIVE,Test,MA,9083453,200000,150000,140000," + minbet + "," + maxbet + "," + maxpermatch + ",0,10,50,0,2";
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM01", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}

When(~"COY user attempts to create an MA with the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "MM0124,pass1234,true,MA,ACTIVE,Test,MA,9083453,200000,150000,140000," + minbet + "," + maxbet + "," + maxpermatch + ",0,10,50,0,2";
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}


When(~"SMA user attempts to create an MA with the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "MM0124,pass1234,true,MA,ACTIVE,Test,MA,9083453,200000,150000,140000," + minbet + "," + maxbet + "," + maxpermatch + ",0,10,50,0,2";
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM01", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}

When(~"COY user creates an MA \"([^\"]*)\" with the following position settings \"([^\"]*)\" and \"([^\"]*)\"") { String mausername, String smamaxposition, String mamaxposition ->
    String userData = mausername + ",pass1234,true,MA,ACTIVE,Test,MA,9083453,200000,150000,140000,200,8000,13000,0," + smamaxposition + "," + mamaxposition + ",0,2";
    json = helpers.createUserJson(userData)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}

Then(~"the position settings must be set successfully and COY user gets \"([^\"]*)\" message") { String errorcode ->
    assertThat(response, containsString(errorcode))
}

When(~"COY user attempts to create an MA with the following position settings \"([^\"]*)\" and \"([^\"]*)\"") { String smamaxposition, String mamaxposition ->
    String userData = "MM0125,pass1234,true,MA,ACTIVE,Test,MA,9083453,200000,150000,140000,200,8000,13000,0," + smamaxposition + "," + mamaxposition + ",0,2";
    json = helpers.createUserJson(userData)

    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}

Then(~"the operation must fail and error \"([^\"]*)\" returned") { String errorcode ->
    assertThat(response, containsString(errorcode))
}

When(~"SMA user creates an MA \"([^\"]*)\" with the following position settings \"([^\"]*)\" and \"([^\"]*)\"") { String mausername, String smamaxposition, String mamaxposition ->
    String userData = mausername + ",pass1234,true,MA,ACTIVE,Test,MA,9083453,200000,150000,140000,200,8000,13000,0," + smamaxposition + "," + mamaxposition + ",0,2";
    json = helpers.createUserJson(userData)

    token = helpers.loginAgencySite("MM01", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}

Then(~"the position settings must be set successfully and SMA user gets \"([^\"]*)\" message") { String errorcode ->
    assertThat(response, containsString(errorcode))
}

When(~"SMA user attempts to set the following position settings \"([^\"]*)\" and \"([^\"]*)\"") { String smamaxposition, String mamaxposition ->
    String userData = "MM0120,pass1234,true,MA,ACTIVE,Test,MA,9083453,200000,150000,140000,200,8000,13000,0," + smamaxposition + "," + mamaxposition + ",0,2";
    json = helpers.createUserJson(userData)

    token = helpers.loginAgencySite("MM01", "pass1234")
    response = helpers.createUser(token, json, "MM01")
}


