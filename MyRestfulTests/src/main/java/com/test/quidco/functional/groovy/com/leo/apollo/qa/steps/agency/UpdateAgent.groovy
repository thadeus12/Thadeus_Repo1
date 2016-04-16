package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.agency

import static org.hamcrest.CoreMatchers.containsString

/**
 * Created by charles.moga on 09/01/2016.
 */
import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertThat

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token, response, agent, agentpassword, agentstatus


When(~"COY with username \"([^\"]*)\" and password \"([^\"]*)\" edits an Agent and enters the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\""){
    String coyusername, String coypassword, String username, String password, String firstname, String lastname,String contactnumber, String status ->
    agent = username
    agentpassword = password
    agentstatus = status
    String userdata = username + "," + password + ",true,Agent," + status + "," + firstname + "," + lastname + "," + contactnumber + ",100000,0,90000,300,7000,12000,0,15,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite(coyusername, coypassword)
    response = helpers.updateUser(token, json, "AM0101")
}

Then(~"the Agent details should be updated and the user gets \"([^\"]*)\" message") { String success ->
    assertThat(response, containsString(success))
}

And(~"the Agent should get success response when they login to agency site after the update") { ->
    token = helpers.loginAgencySite("AM010101", "pass1234")
    if (agentstatus.equals("ACTIVE")) {
        assertFalse(token.contains("AUTH004"))
    } else {
        assertThat(token, containsString("AUTH004"))
    }
}

When(~"Coy with username \"([^\"]*)\" and password \"([^\"]*)\" attempts to edit an Agent with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"")
        { String coyusername, String coypassword, String username, String password, String firstname, String lastname, String contactnumber, String status ->
            String userdata = username + "," + password + ",true,Agent," + status + "," + firstname + "," + lastname + "," + contactnumber + ",100000,0,90000,300,7000,12000,0,15,25,0,2"
            json = helpers.createUserJson(userdata)
            token = helpers.loginCompanySite(coyusername, coypassword)
            response = helpers.updateUser(token, json, "AM0101")
        }

Then(~"the operation to edit an Agent should fail and error \"([^\"]*)\" returned") { String success ->
    assertThat(response, containsString(success))
}

When(~"an MA with username \"([^\"]*)\" and password \"([^\"]*)\" updates an Agent with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"")
        { String mausername, String mapassword, String username, String password, String firstname, String lastname, String contactnumber, String status ->
            agent = username
            agentpassword = password
            agentstatus = status
            String userdata = username + "," + password + ",true,Agent," + status + "," + firstname + "," + lastname + "," + contactnumber + ",100000,0,90000,300,7000,12000,0,15,25,0,2"
            json = helpers.createUserJson(userdata)
            token = helpers.loginAgencySite("AM0101", "pass1234")
            response = helpers.updateUser(token, json, "AM0101")
        }

When(~"an MA username \"([^\"]*)\" and password \"([^\"]*)\" attempts to upudate an Agent with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"")
        { String mausername, String mapassword, String username, String password, String firstname, String lastname, String contactnumber, String status ->
            agent = username
            agentpassword = password
            agentstatus = status
            String userdata = username + "," + password + ",true,Agent," + status + "," + firstname + "," + lastname + "," + contactnumber + ",100000,0,90000,300,7000,12000,0,15,25,0,2"
            json = helpers.createUserJson(userdata)
            token = helpers.loginAgencySite("AM0101", "pass1234")
            response = helpers.updateUser(token, json, "AM0101")
        }

When(~"SMA with username \"([^\"]*)\" and password \"([^\"]*)\" tries to edit an Agent") { String smausername, String smapassword ->
    String userdata = "AM010101,pass124,true,Agent,ACTIVE,Test,Agent,9083453,100000,0,90000,300,7000,12000,0,15,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite(smausername, smapassword)
    response = helpers.updateUser(token, json, "AA0101")
}


Then(~"they should be not be authorised and error message thrown") {->
    assertThat(response, containsString("AUTH003"))
}

When(~"COY  edits the following credit limits \"([^\"]*)\",\"([^\"]*)\" for an Agent") { String creditlimit, String membermaxcredit ->
    String userdata = "AM010101,pass124,true,Agent,ACTIVE,Test,Agent,9083453," + creditlimit + ",0," + membermaxcredit + ",300,7000,12000,0,15,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "AM0101")
}

When(~"COY user attempts to edit the following credit limits \"([^\"]*)\",\"([^\"]*)\" for an agent") { String creditlimit, String membermaxcredit ->
    String userdata = "AM010101,pass124,true,Agent,ACTIVE,Test,Agent,9083453," + creditlimit + ",0," + membermaxcredit + ",300,7000,12000,0,15,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "AM0101")
}


When(~"MA user edit the following credit limits \"([^\"]*)\",\"([^\"]*)\" for an Agent") { String creditlimit, String membermaxcredit ->
    String userdata = "AM010101,pass124,true,Agent,ACTIVE,Test,Agent,9083453," + creditlimit + ",0," + membermaxcredit + ",300,7000,12000,0,15,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("AM0101", "pass1234")
    response = helpers.updateUser(token, json, "AM0101")
}

When(~"MA user attempts to edit the following credit limits \"([^\"]*)\",\"([^\"]*)\" for an agent") { String creditlimit, String membermaxcredit ->
    String userdata = "AM010101,pass124,true,Agent,ACTIVE,Test,Agent,9083453," + creditlimit + ",0," + membermaxcredit + ",300,7000,12000,0,15,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("AM0101", "pass1234")
    response = helpers.updateUser(token, json, "AM0101")
}


When(~"COY user edits the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for an agent") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "AM010101,pass124,true,Agent,ACTIVE,Test,Agent,9083453,100000,0,90000," + minbet + "," + maxbet + "," + maxpermatch + ",0,15,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "AM0101")
}

When(~"COY user attempts to edit the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for an agent") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "AM010101,pass124,true,Agent,ACTIVE,Test,Agent,9083453,100000,0,90000," + minbet + "," + maxbet + "," + maxpermatch + ",0,15,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "AM0101")
}


When(~"MA user edits the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for an agent") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "AM010101,pass124,true,Agent,ACTIVE,Test,Agent,9083453,100000,0,90000," + minbet + "," + maxbet + "," + maxpermatch + ",0,15,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("AM0101", "pass1234")
    response = helpers.updateUser(token, json, "AM0101")
}

When(~"MA  attempts to edit the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for an agent") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "AM010101,pass124,true,Agent,ACTIVE,Test,Agent,9083453,100000,0,90000," + minbet + "," + maxbet + "," + maxpermatch + ",0,15,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("AM0101", "pass1234")
    response = helpers.updateUser(token, json, "AM0101")
}

When(~"COY user edits the following Agent position takings \"([^\"]*)\" and \"([^\"]*)\"") { String maposition, String agentposition->
    String userdata = "AM010101,pass124,true,Agent,ACTIVE,Test,Agent,9083453,100000,0,90000,300,7000,12000,0," + maposition + "," + agentposition + ",0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "AM0101")
}

When(~"COY user attempts to edit an agent with the following position settings \"([^\"]*)\" and \"([^\"]*)\"") { String maposition, String agentposition ->
    String userdata = "AM010101,pass124,true,Agent,ACTIVE,Test,Agent,9083453,100000,0,90000,300,7000,12000,0," + maposition + "," + agentposition + ",0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "AM0101")
}

When(~"MA user edits the following Agent position takings \"([^\"]*)\" and \"([^\"]*)\" for \"([^\"]*)\"") { String maposition, String agentposition, String username ->
    String userdata = "AM010101,pass124,true,Agent,ACTIVE,Test,Agent,9083453,100000,0,90000,300,7000,12000,0," + maposition + "," + agentposition + ",0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("AM0101", "pass1234")
    response = helpers.updateUser(token, json, "AM0101")
}

When(~"MA user attempts to edit an agent with the following position settings \"([^\"]*)\" and \"([^\"]*)\"") { String maposition, String agentposition ->
    String userdata = "AM010101,pass124,true,Agent,ACTIVE,Test,Agent,9083453,100000,0,90000,300,7000,12000,0," + maposition + "," + agentposition + ",0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("AM0101", "pass1234")
    response = helpers.updateUser(token, json, "AM0101")
}