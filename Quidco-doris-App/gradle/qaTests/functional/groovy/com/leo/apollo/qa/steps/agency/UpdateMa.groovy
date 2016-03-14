package com.leo.apollo.qa.steps.agency

/**
 * Created by charles.moga on 05/01/2016.
 */

import static org.junit.Assert.*
import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.assertThat

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token, json, response

When(~"SMA with username \"([^\"]*)\" and password \"([^\"]*)\" edits an MA and enters the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") {
    String smausername, String smapassword, String username, String password, String firstname, String lastname, String contactnum, String status ->
        ma = username
        mapassword = password
        mastatus = status

        String userdata = username + "," + password + ",true,MA," + status + "," + firstname + "," + lastname + "," + contactnum + ",150000,140000,130000,200,8000,13000,0,10,50,0,2"
        json = helpers.createUserJson(userdata)

        token = helpers.loginAgencySite(smausername, smapassword)
        response = helpers.updateUser(token, json, smausername)
}

Then(~"the MA details should be updated and the user gets \"([^\"]*)\" message") { String success ->
    assertThat(response, containsString(success))
}

And(~"the MA should get success response when they login to agency site after the update") { ->
    if (mapassword.equalsIgnoreCase("null")) {
        mapassword = "pass1234"
    }
    token = helpers.loginAgencySite(ma, mapassword)
    if (mastatus.equals("ACTIVE")) {
        assertFalse(token.contains("AUTH004"))
    } else {
        assertThat(token, containsString("AUTH004"))
    }
}

When(~"SMA with username \"([^\"]*)\" and password \"([^\"]*)\" attempts to edit an MA with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") {
    String smausername, String smapassword, String username, String password, String firstname, String lastname, String contactnum, String status ->

        String userdata = username + "," + password + ",true,MA," + status + "," + firstname + "," + lastname + "," + contactnum + ",150000,140000,130000,200,8000,13000,0,10,50,0,2"
        json = helpers.createUserJson(userdata)

        token = helpers.loginAgencySite(smausername, smapassword)
        response = helpers.updateUser(token, json, smausername)

}

Then(~"the operation to edit an MA should fail and error \"([^\"]*)\" returned") { String errorcode ->
    assertThat(response, containsString(errorcode))
}

When(~"SMA user updates the following position limits smaxposition \"([^\"]*)\", mamaxposition \"([^\"]*)\" for an MA") { String smaposition, String mamaxposition ->
    String userdata = "MM0201,null,true,MA,ACTIVE,Test,MA,9083453,150000,140000,130000,200,8000,13000,0," + smaposition + "," + mamaxposition + ",0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM02", "pass1234")
    response = helpers.updateUser(token, json, "MM02")
}

When(~"SMA user attempts to update the following position settings \"([^\"]*)\", \"([^\"]*)\" for an MA") { String smaposition, String mamaxposition ->
    String userdata = "MM0201,null,true,MA,ACTIVE,Test,MA,9083453,150000,140000,130000,200,8000,13000,0," + smaposition + "," + mamaxposition + ",0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM02", "pass1234")
    response = helpers.updateUser(token, json, "MM02")
}

When(~"SMA user edits the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for an MA") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "MM0201,null,true,MA,ACTIVE,Test,MA,9083453,150000,140000,130000," + minbet + "," + maxbet + "," + maxpermatch + ",0,10,50,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM02", "pass1234")
    response = helpers.updateUser(token, json, "MM02")
}

When(~"SMA user attempts to edit the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for an MA") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "MM0201,null,true,MA,ACTIVE,Test,MA,9083453,150000,140000,130000," + minbet + "," + maxbet + "," + maxpermatch + ",0,10,50,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM02", "pass1234")
    response = helpers.updateUser(token, json, "MM02")
}

When(~"SMA user updates the following MA credit limits \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String creditlimit, String mamaxcredit, String membermaxcredit ->
    String userdata = "MM0201,null,true,MA,ACTIVE,Test,MA,9083453," + creditlimit + "," + mamaxcredit + "," + membermaxcredit + ",200,8000,13000,0,10,50,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM02", "pass1234")
    response = helpers.updateUser(token, json, "MM02")

}

When(~"SMA user attempts to update the following MA credit limits \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String creditlimit, String mamaxcredit, String membermaxcredit ->
    String userdata = "MM0201,null,true,MA,ACTIVE,Test,MA,9083453," + creditlimit + "," + mamaxcredit + "," + membermaxcredit + ",200,8000,13000,0,10,50,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM02", "pass1234")
    response = helpers.updateUser(token, json, "MM02")

}

When(~"SMA user attempts to reduce MA credit limits as follows \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String creditlimit, String maxmacreditlimit, String membermaxcredit ->
    String userdata = "MM0201,null,true,MA,ACTIVE,Test,MA,9083453," + creditlimit + "," + maxmacreditlimit + "," + membermaxcredit + ",200,8000,13000,0,10,50,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM02", "pass1234")
    response = helpers.updateUser(token, json, "MM02")
}

When(~"SMA user attempts reduce MA bet settings as follows \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "MM0201,null,true,MA,ACTIVE,Test,MA,9083453,150000,140000,130000," + minbet + "," + maxbet + "," + maxpermatch + ",0,10,50,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM02", "pass1234")
    response = helpers.updateUser(token, json, "MM02")
}

When(~"SMA user attempts to reduce MA position settings as follows \"([^\"]*)\", \"([^\"]*)\"") { String smaposition, String maposition ->
    String userdata = "MM0201,null,true,MA,ACTIVE,Test,MA,9083453,150000,140000,130000,200,8000,13000,0," + smaposition + "," + maposition + ",0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("MM02", "pass1234")
    response = helpers.updateUser(token, json, "MM02")
}
