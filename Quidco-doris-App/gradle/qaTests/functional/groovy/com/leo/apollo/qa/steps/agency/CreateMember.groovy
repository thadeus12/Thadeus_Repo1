package com.leo.apollo.qa.steps.agency

import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.assertThat

/**
 * Created by charles.moga on 11/01/2016.
 */
this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def token, response

When(~"COY with username \"([^\"]*)\" and password \"([^\"]*)\" creates a Member with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String coyusername, String coypassword,
                                                                                                                                                                                                   String username, String password,
                                                                                                                                                                                                   String firstname, String lastname, String contactnumber, String status ->
    member = username
    memberpassword = password
    memberstatus = status

    String userdata = username + "," + password + ",true,Member," + status + "," + firstname + "," + lastname + "," + contactnumber + ",50000,0,0,250,700,12000,0,25,0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite(coyusername, coypassword)
    response = helpers.createUser(token, json, "ME010101")
}

Then(~"Member should be created and the user gets \"([^\"]*)\" message") { String success ->
    assertThat(response, containsString(success))
}

When(~"an Agent with username \"([^\"]*)\" and password \"([^\"]*)\" creates a Member with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") {
    String agentusername, String agentpassword, String username, String password, String firstname, String lastname, String contactnumber, String status ->
        member = username
        memberpassword = password
        memberstatus = status

        String userdata = username + "," + password + ",true,Member," + status + "," + firstname + "," + lastname + "," + contactnumber + ",50000,0,0,250,700,12000,0,25,0,0,2"
        json = helpers.createUserJson(userdata)
        token = helpers.loginAgencySite(agentusername, agentpassword)
        response = helpers.createUser(token, json, agentusername)
}
Then(~"Member must be created and the user gets \"([^\"]*)\" message") { String success ->
    assertThat(response, containsString(success))
}



When(~"COY with username \"([^\"]*)\" and password \"([^\"]*)\" attempts to create a Member with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String coyusername, String coypassword, String username, String password,
                                                                                                                                                                                                              String firstname, String lastname, String contactnumber, String status ->

    String userdata = username + "," + password + ",true,Member," + status + "," + firstname + "," + lastname + "," + contactnumber + ",50000,0,0,250,700,12000,0,25,0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite(coyusername, coypassword)
    response = helpers.createUser(token, json, "ME010101")
}


Then(~"the operation to create a Member should fail and error \"([^\"]*)\" returned") { String success ->
    assertThat(response, containsString(success))
}





When(~"an Agent with username \"([^\"]*)\" and password \"([^\"]*)\" attempts to create a Member with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String agentusername, String agentpassword,
                                                                                                                                                                                                                   String username, String password,
                                                                                                                                                                                                                   String firstname, String lastname, String contactnumber, String status ->
    String userdata = username + "," + password + ",true,Member," + status + "," + firstname + "," + lastname + "," + contactnumber + ",50000,0,0,250,700,12000,0,25,0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite(agentusername, agentpassword)
    response = helpers.createUser(token, json, agentusername)

}

Then(~"operation to create a Member should fail and error \"([^\"]*)\" returned") { String success ->
    assertThat(response, containsString(success))
}



When(~"an SMA with username \"([^\"]*)\" and password \"([^\"]*)\" tries to create a Member") { String smausername, String smapassword ->

    String userdata = "ME010101M09,pass1234,true,Member,ACTIVE,firstname,lastname,911,50000,0,0,250,700,12000,0,25,0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite(smausername, smapassword)
    response = helpers.createUser(token, json, "ME010101")
}

Then(~"they should not be authorised and error message thrown") { ->
    assertThat(response, containsString("AUTH021"))
}

When(~"an MA with username \"([^\"]*)\" and password \"([^\"]*)\" tries to create a Member") { String mausername, String mapassword ->
    String userdata = "ME010101M09,pass1234,true,Member,ACTIVE,firstname,lastname,911,50000,0,0,250,700,12000,0,25,0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite(mausername, mapassword)
    response = helpers.createUser(token, json, "ME010101")
}

Then(~"they must not be authorised and error message thrown") { ->
    assertThat(response, containsString("AUTH021"))
}



When(~"COY user sets the following credit limits \"([^\"]*)\" for a new Member") { String creditlimit ->
    String userdata = "ME010101M09,pass124,true,Member,ACTIVE,Test,Member,9083453," + creditlimit + ",0,0,250,700,12000,0,25,0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "ME010101")
}



When(~"COY user attempts to set the following credit limits \"([^\"]*)\" for a new Member") { String creditlimit ->
    String userdata = "ME010101M11,pass124,true,Member,ACTIVE,Test,Member,9083453," + creditlimit + ",0,0,250,700,12000,0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "ME010101")
}

When(~"Agent user sets the following credit limits \"([^\"]*)\" for a new Member") { String creditlimit ->
    String userdata = "ME010101M11,pass124,true,Member,ACTIVE,Test,Member,9083453," + creditlimit + ",0,0,250,700,12000,0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("ME010101", "pass1234")
    response = helpers.createUser(token, json, "ME010101")


}
When(~"Agent user attempts to set the following credit limits \"([^\"]*)\" for a new Member") { String creditlimit ->
    String userdata = "ME010101M11,pass124,true,Member,ACTIVE,Test,Member,9083453," + creditlimit + ",0,0,250,700,12000,0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("ME010101", "pass1234")
    response = helpers.createUser(token, json, "ME010101")
}

When(~"COY user sets following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a new Member") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "ME010101M12,pass124,true,Member,ACTIVE,Test,Member,9083453,50000,0,0," + minbet + "," + maxbet + "," + maxpermatch + ",0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "ME010101")
}


When(~"COY user attempts to set the invalid bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a new Member") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "ME010101M13,pass124,true,Member,ACTIVE,Test,Member,9083453,50000,0,0," + minbet + "," + maxbet + "," + maxpermatch + ",0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "ME010101")
}

When(~"Agent user sets the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a new Member") { String minbet, String maxbet, String maxpermatch ->

    String userdata = "ME010101M14,pass124,true,Member,ACTIVE,Test,Member,9083453,50000,0,0," + minbet + "," + maxbet + "," + maxpermatch + ",0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("ME010101", "pass1234")
    response = helpers.createUser(token, json, "ME010101")
}

When(~"Agent  attempts to set the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a new Member") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "ME010101M15,pass124,true,Member,ACTIVE,Test,Member,9083453,50000,0,0," + minbet + "," + maxbet + "," + maxpermatch + ",0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("ME010101", "pass1234")
    response = helpers.createUser(token, json, "ME010101")
}

When(~"COY user sets the following Member position takings \"([^\"]*)\" for \"([^\"]*)\"") { String agentposition, String member ->
    String userdata = member + ",pass124,true,Member,ACTIVE,Test,Member,9083453,50000,0,0,250,700,12000,0," + agentposition + ",0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "ME010101")
}

When(~"COY user attempts to create Member with the following position settings \"([^\"]*)\"") { String agentposition ->
    String userdata = "ME010101M17,pass124,true,Member,ACTIVE,Test,Member,9083453,50000,0,0,250,700,12000,0," + agentposition + ",0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.createUser(token, json, "ME010101")

}
When(~"Agent user sets the following Member position takings \"([^\"]*)\" for \"([^\"]*)\"") { String agentposition, String member ->
    String userdata = member + ",pass124,true,Member,ACTIVE,Test,Member,9083453,50000,0,0,250,700,12000,0," + agentposition + ",0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("ME010101", "pass1234")
    response = helpers.createUser(token, json, "ME010101")
}

When(~"Agent user attempts to create Member with the following position settings \"([^\"]*)\"") { String agentposition ->
    String userdata = "ME010101M18,pass124,true,Member,ACTIVE,Test,Member,9083453,50000,0,0,250,700,12000,0," + agentposition + ",0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("ME010101", "pass1234")
    response = helpers.createUser(token, json, "ME010101")
}
