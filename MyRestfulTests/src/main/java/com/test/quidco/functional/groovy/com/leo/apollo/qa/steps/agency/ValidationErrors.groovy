package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.agency

import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.assertThat

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token, json, response

/**
 * Created by charles.moga on 11/01/2016.
 */

When(~"COY user creates an SMA with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\""){String username, String password,String firstname, String lastname,
                                                               String contactnumber,String creditlimit,String mamaxcredit,
                                                               String membermaxcredit,String minbet,String maxbet,
                                                               String maxpermatch,String smamaxposition,String membercommission,
                                                               String smacommission ->

    String userdata = username + "," + password + ",true,SMA,ACTIVE," + firstname + "," + lastname + "," + contactnumber + ","+creditlimit+","+mamaxcredit+","+membermaxcredit+","+minbet+","+maxbet+","+maxpermatch+",100,0,"+smamaxposition+","+smacommission+","+membercommission
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "admin.user")
}

When(~"COY user or SMA creates an MA with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"") {
    String username, String password,String firstname, String lastname, String contactnumber,String creditlimit,String mamaxcredit,
    String membermaxcredit,String minbet,String maxbet,
    String maxpermatch,String smamaxposition,String mamaxposition->

    String userdata = username + "," + password + ",true,MA,ACTIVE," + firstname + "," + lastname + "," + contactnumber + ","+creditlimit+","+mamaxcredit+","+membermaxcredit+","+minbet+","+maxbet+","+maxpermatch+",0,,"+smamaxposition+",0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("VE01", "pass1234")

    response = helpers.createUser(token, json, "VE01")
}
When(~"COY user or MA creates an Agent with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"")
                {String username, String password,String firstname, String lastname,String contactnumber,String creditlimit,String membermaxcredit,
                String minbet,String maxbet,String maxpermatch,String smamaxposition,String mamaxposition ->


    String userdata = username + "," + password + ",true,Agent,ACTIVE," + firstname + "," + lastname + "," + contactnumber + ","+creditlimit+",0,"+membermaxcredit+","+minbet+","+maxbet+","+maxpermatch+",0,,"+smamaxposition+",0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite("VE0101", "pass1234")
    response = helpers.createUser(token, json, "VE0101")
}
Then(~"they should see the following multiple errors \"([^\"]*)\""){String errors->
    String[] codes = errors.split(",")
    for(String errorCode: codes) {
        assertThat(response, containsString(errorCode))
    }
}