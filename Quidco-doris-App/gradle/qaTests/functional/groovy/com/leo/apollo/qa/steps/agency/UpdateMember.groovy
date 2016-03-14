package com.leo.apollo.qa.steps.agency

import static org.hamcrest.CoreMatchers.containsString
import static org.junit.Assert.assertThat

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

/**
 * Created by charles.moga on 10/01/2016.
 */

def token, response
When(~"COY with username \"([^\"]*)\" and password \"([^\"]*)\" edits a member and enters the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"")
        { String coyusername, String coypassword, String username, String password, String firstname, String lastname,
          String contactnumber, String status ->

            String userdata = username + "," + password + ",true,Member," + status + "," + firstname + "," + lastname + "," + contactnumber + ",75000,0,0,250,700,12000,0,25,0,0,2"
            json = helpers.createUserJson(userdata)
            token = helpers.loginCompanySite(coyusername, coypassword)

            response = helpers.updateUser(token, json, "ME010101")
        }

Then(~"the details of the member should be updated and the user gets \"([^\"]*)\" message") { String success ->
    assertThat(response, containsString(success))

}

When(~"an agent with username \"([^\"]*)\" and password \"([^\"]*)\" updates a member with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"")
        { String agentusername, String agentpassword, String username, String password, String firstname, String lastname, String contactnumber, String status ->

            String userdata = username + "," + password + ",true,Member," + status + "," + firstname + "," + lastname + "," + contactnumber + ",75000,0,0,250,700,12000,0,25,0,0,2"
            json = helpers.createUserJson(userdata)
            token = helpers.loginAgencySite(agentusername, agentpassword)
            response = helpers.updateUser(token, json, agentusername)
        }
When(~"COY with username \"([^\"]*)\" and password \"([^\"]*)\" attempts to edit a member with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String coyusername, String coypassword, String username, String password,
                                                                                                                                                                                                           String firstname, String lastname,
                                                                                                                                                                                                           String contactnumber, String status ->

    String userdata = username + "," + password + ",true,Member," + status + "," + firstname + "," + lastname + "," + contactnumber + ",75000,0,0,250,700,12000,0,25,0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite(coyusername, coypassword)
    response = helpers.updateUser(token, json, "ME010101")
}

Then(~"the operation to edit a member should fail and error \"([^\"]*)\" returned") { String success ->
    assertThat(response, containsString(success))
}

When(~"an agent with username \"([^\"]*)\" and password \"([^\"]*)\" attempts to edit a member with the following details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"") { String agentusername, String agentpassword,
                                                                                                                                                                                                                String username, String password,
                                                                                                                                                                                                                String firstname, String lastname, String contactnumber, String status ->
    String userdata = username + "," + password + ",true,Member," + status + "," + firstname + "," + lastname + "," + contactnumber + ",75000,0,0,250,700,12000,0,25,0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite(agentusername, agentpassword)
    response = helpers.updateUser(token, json, agentusername)
}

Then(~"operation to edit a member should fail and error \"([^\"]*)\" returned") { String success ->
    assertThat(response, containsString(success))
}

When(~"an SMA with username \"([^\"]*)\" and password \"([^\"]*)\" tries to update a member") { String smausername, String smapassword ->
    String userdata = "ME010101M01,pass1234,true,Member,ACTIVE,firstname,lastname,911,75000,0,0,250,700,12000,0,25,0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite(smausername, smapassword)
    response = helpers.updateUser(token, json, "ME010101")
}

Then(~"they should not be authorised and error message should be thrown") { ->
    assertThat(response, containsString("AUTH021"))
}

When(~"an MA with username \"([^\"]*)\" and password \"([^\"]*)\" tries to update a member") { String mausername, String mapassword ->
    String userdata = "ME010101M01,pass1234,true,Member,ACTIVE,firstname,lastname,911,75000,0,0,250,700,12000,0,25,0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite(mausername, mapassword)
    response = helpers.updateUser(token, json, "ME010101")
}

Then(~"they must not be authorised and error message should be thrown") { ->
    assertThat(response, containsString("AUTH021"))
}

When(~"COY user edits the following credit limits \"([^\"]*)\" for a member") { String creditlimit ->
    String userdata = "ME010101M01,pass124,true,Member,ACTIVE,Test,Member,9083453," + creditlimit + ",0,0,250,700,12000,0,25,0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "ME010101")
}

When(~"Agent user edits the following credit limits \"([^\"]*)\" for a member") { String creditlimit ->
    String userdata = "ME010101M01,pass124,true,Member,ACTIVE,Test,Member,9083453," + creditlimit + ",0,0,250,700,12000,0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("ME010101", "pass1234")
    response = helpers.updateUser(token, json, "ME010101")
}

When(~"COY user attempts to edit the following credit limits \"([^\"]*)\" for a member") { String creditlimit ->
    String userdata = "ME010101M01,pass124,true,Member,ACTIVE,Test,Member,9083453," + creditlimit + ",0,0,250,700,12000,0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "ME010101")
}

When(~"Agent user attempts to edit the following credit limits \"([^\"]*)\" for a member") { String creditlimit ->
    String userdata = "ME010101M01,pass124,true,Member,ACTIVE,Test,Member,9083453," + creditlimit + ",0,0,250,700,12000,0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("ME010101", "pass1234")
    response = helpers.updateUser(token, json, "ME010101")
}

When(~"COY user edits following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a member") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "ME010101M01,pass124,true,Member,ACTIVE,Test,Member,9083453,75000,0,0," + minbet + "," + maxbet + "," + maxpermatch + ",0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "ME010101")
}

When(~"Agent user edits the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a member") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "ME010101M01,pass124,true,Member,ACTIVE,Test,Member,9083453,75000,0,0," + minbet + "," + maxbet + "," + maxpermatch + ",0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("ME010101", "pass1234")
    response = helpers.updateUser(token, json, "ME010101")
}

When(~"COY user attempts to edit the invalid bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a member") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "ME010101M01,pass124,true,Member,ACTIVE,Test,Member,9083453,75000,0,0," + minbet + "," + maxbet + "," + maxpermatch + ",0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "ME010101")
}

When(~"Agent attempts to edits the following bet settings \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" for a member") { String minbet, String maxbet, String maxpermatch ->
    String userdata = "ME010101M01,pass124,true,Member,ACTIVE,Test,Member,9083453,75000,0,0," + minbet + "," + maxbet + "," + maxpermatch + ",0,0,25,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("ME010101", "pass1234")
    response = helpers.updateUser(token, json, "ME010101")
}

When(~"COY user edits the following Member position takings \"([^\"]*)\" for \"([^\"]*)\"") { String agentposition, String member ->
    String userdata = member + ",pass124,true,Member,ACTIVE,Test,Member,9083453,75000,0,0,250,700,12000,0," + agentposition + ",0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "ME010101")
}

When(~"COY user attempts to edit a member with the following position settings \"([^\"]*)\"") { String agentposition ->
    String userdata = "ME010101M01,pass124,true,Member,ACTIVE,Test,Member,9083453,75000,0,0,250,700,12000,0," + agentposition + ",0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginCompanySite("admin.user", "pass1234")
    response = helpers.updateUser(token, json, "ME010101")
}

When(~"Agent user edits the following Member position takings \"([^\"]*)\" for \"([^\"]*)\"") { String agentposition, String member ->
    String userdata = member + ",pass124,true,Member,ACTIVE,Test,Member,9083453,75000,0,0,250,700,12000,0," + agentposition + ",0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("ME010101", "pass1234")
    response = helpers.updateUser(token, json, "ME010101")
}

When(~"Agent user attempts to edit a member with the following position settings \"([^\"]*)\"") { String agentposition ->
    String userdata = "ME010101M01,pass124,true,Member,ACTIVE,Test,Member,9083453,75000,0,0,250,700,12000,0," + agentposition + ",0,0,2"
    json = helpers.createUserJson(userdata)
    token = helpers.loginAgencySite("ME010101", "pass1234")
    response = helpers.updateUser(token, json, "ME010101")
}