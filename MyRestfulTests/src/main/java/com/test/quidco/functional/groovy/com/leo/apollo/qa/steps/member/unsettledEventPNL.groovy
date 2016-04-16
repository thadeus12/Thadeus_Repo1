package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.member

import com.leo.apollo.qa.support.EndpointClient
import groovy.json.JsonSlurper

import java.util.concurrent.ThreadLocalRandom

import static org.junit.Assert.*


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

String response, token, usercode

When(~"a member \"([^\"]*)\" views selection \"([^\"]*)\"") { String username, String eventid ->
    token = helpers.loginMemberSite(username,"pass1234")
    response = helpers.getpnl(token,username,eventid)
    helpers.printdebug(response)
}

When(~"they should see the following PnL \"([^\"]*)\"") { String pnl->
}

