package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.agency

import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.*

/**
 * Created by charles.moga on 07/01/2016.
 */

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token, json, response

When(~"a \"([^\"]*)\" user with username \"([^\"]*)\" and password \"([^\"]*)\" creates an Agent with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") {
    String site, String coyusername, String coypassword, String username, String password,String firstname, String lastname, String contactnumber, String status ->

    agent = username
    agentpassword = password
    agentstatus = status

    String userdata = username + "," + password + ",true,Agent," + status + "," + firstname + "," + lastname + "," + contactnumber + ",90000,0,80000,400,9000,14000,0,15,35,0,2"
    json = helpers.createUserJson(userdata)
    if(site.equals("company")) {
        token = helpers.loginCompanySite(coyusername, coypassword)
        response = helpers.createUser(token, json, "AM0101")
    }else{
        token = helpers.loginAgencySite(coyusername, coypassword)
        response = helpers.createUser(token, json, coyusername)
    }

}

Then(~"the Agent should be created and the user gets \"([^\"]*)\" message") { String success ->
    assertThat(response, containsString(success))
}

And(~"the new Agent should get \"([^\"]*)\" response when they login to managersite") { String success ->

    token = helpers.loginAgencySite(agent, agentpassword)
    if (success.equals("Success")) {
        assertFalse(token.contains("AUTH004"))
    } else {
        assertThat(token, containsString("AUTH004"))
    }

}

When(~"an MA with username \"([^\"]*)\" and password \"([^\"]*)\" creates an Agent with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String mausername, String mapassword, String username, String password,
                                                                                                                                                                                                    String firstname, String lastname, String contactnumber, String status ->
    agent = username
    agentpassword = password
    agentstatus = status

    String userdata = username + "," + password + ",true,Agent," + status + "," + firstname + "," + lastname + "," + contactnumber + ",90000,0,80000,400,9000,14000,0,15,35,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite(mausername, mapassword)
    response = helpers.createUser(token, json, mausername)
}


When(~"a COY with username \"([^\"]*)\" and password \"([^\"]*)\" attempts to create an Agent with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String coyusername, String coypassword, String username, String password,
                                                                                                                                                                                                               String firstname, String lastname, String contactnumber, String status ->

    String userdata = username + "," + password + ",true,Agent," + status + "," + firstname + "," + lastname + "," + contactnumber + ",90000,0,80000,90,7000,14000,0,15,35,1,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginCompanySite(coyusername, coypassword)
    response = helpers.createUser(token, json, "AM0101")
}

Then(~"the operation to create an Agent should fail and error \"([^\"]*)\" returned") { String success ->
    assertThat(response, containsString(success))
}

When(~"an MA with username \"([^\"]*)\" and password \"([^\"]*)\" attempts to create an Agent with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String mausername, String mapassword, String username, String password,
                                                                                                                                                                                                               String firstname, String lastname, String contactnumber, String status ->

    String userdata = username + "," + password + ",true,Agent," + status + "," + firstname + "," + lastname + "," + contactnumber + ",90000,0,80000,400,9000,14000,0,15,35,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite(mausername, mapassword)
    response = helpers.createUser(token, json, mausername)
}

When(~"an SMA with username \"([^\"]*)\" and password \"([^\"]*)\" tries to create an Agent") { String smausername, String smapassword ->

    String userdata = "AM010109,pass1234,true,Agent,ACTIVE,firstname,lastname,911,90000,0,80000,400,9000,14000,0,15,35,0,2"
    json = helpers.createUserJson(userdata)

    token = helpers.loginAgencySite(smausername, smapassword)
    response = helpers.createUser(token, json, "AM0101")
}

Then(~"they will not be authorised and error message thrown") { ->
    assertThat(response, containsString("AUTH021"))
}

When(~"COY user sets the following credit limits \"([^\"]*)\",\"([^\"]*)\" for a new Agent") { String creditlimit, String membermaxcredit ->
    String userdata = "AM010109,pass124,true,Agent,ACTIVE,Test,Agent,9083453," + creditlimit + ",0," + membermaxcredit + ",300,7000,12000,0,10,40,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "AM0101")
}

When(~"COY user attempts to set the following credit limits \"([^\"]*)\",\"([^\"]*)\" for a new agent") { String creditlimit, String membermaxcredit ->
    String userdata = "AM010110,pass124,true,Agent,ACTIVE,Test,Agent,9083453," + creditlimit + ",0," + membermaxcredit + ",300,7000,12000,0,10,40,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "AM0101")
}

When(~"MA user sets the following credit limits \"([^\"]*)\",\"([^\"]*)\" for a new Agent") { String creditlimit, String membermaxcredit ->
    String userdata = "AM010110,pass124,true,Agent,ACTIVE,Test,Agent,9083453," + creditlimit + ",0," + membermaxcredit + ",300,7000,12000,0,10,40,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("AM0101", "pass1234")
    response = helpers.createUser(token, json, "AM0101")
}

When(~"MA user attempts to set the following credit limits \"([^\"]*)\",\"([^\"]*)\" for a new agent") { String creditlimit, String membermaxcredit ->
    String userdata = "AM010111,pass124,true,Agent,ACTIVE,Test,Agent,9083453," + creditlimit + ",0," + membermaxcredit + ",300,7000,12000,0,10,40,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("AM0101", "pass1234")
    response = helpers.createUser(token, json, "AM0101")
}

When(~"COY user sets the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a new agent") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "AM010111,pass124,true,Agent,ACTIVE,Test,Agent,9083453,90000,0,80000," + minbet + "," + maxbet + "," + maxpermatch + ",0,10,40,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "AM0101")
}

When(~"COY user attempts to set the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a new agent") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "AM010112,pass124,true,Agent,ACTIVE,Test,Agent,9083453,90000,0,80000," + minbet + "," + maxbet + "," + maxpermatch + ",0,10,40,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "AM0101")
}

When(~"MA user sets the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a new agent") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "AM010112,pass124,true,Agent,ACTIVE,Test,Agent,9083453,90000,0,80000," + minbet + "," + maxbet + "," + maxpermatch + ",0,10,40,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("AM0101", "pass1234")
    response = helpers.createUser(token, json, "AM0101")
}

When(~"MA  attempts to set the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a new agent") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "AM010113,pass124,true,Agent,ACTIVE,Test,Agent,9083453,90000,0,80000," + minbet + "," + maxbet + "," + maxpermatch + ",0,10,40,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("AM0101", "pass1234")
    response = helpers.createUser(token, json, "AM0101")
}

When(~"COY user sets the following Agent position takings \"([^\"]*)\" and \"([^\"]*)\" for \"([^\"]*)\"") { String maposition, String agentposition, String agent ->
    String userdata = agent + ",pass124,true,Agent,ACTIVE,Test,Agent,9083453,90000,0,80000,300,7000,12000,0," + maposition + "," + agentposition + ",0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "AM0101")
}

When(~"COY user attempts to create an agent with the following position settings \"([^\"]*)\" and \"([^\"]*)\"") { String maposition, String agentposition ->
    String userdata = "AM010120,pass124,true,Agent,ACTIVE,Test,Agent,9083453,90000,0,80000,300,7000,12000,0," + maposition + "," + agentposition + ",0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "AM0101")
}

When(~"MA user sets the following Agent position takings \"([^\"]*)\" and \"([^\"]*)\" for \"([^\"]*)\"") { String maposition, String agentposition, String agent ->
    String userdata = agent + ",pass124,true,Agent,ACTIVE,Test,Agent,9083453,90000,0,80000,300,7000,12000,0," + maposition + "," + agentposition + ",0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("AM0101", "pass1234")
    response = helpers.createUser(token, json, "AM0101")
}

When(~"MA user attempts to create an agent with the following position settings \"([^\"]*)\" and \"([^\"]*)\"") { String maposition, String agentposition ->
    String userdata = "AM010121,pass124,true,Agent,ACTIVE,Test,Agent,9083453,90000,0,80000,300,7000,12000,0," + maposition + "," + agentposition + ",0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("AM0101", "pass1234")
    response = helpers.createUser(token, json, "AM0101")
}