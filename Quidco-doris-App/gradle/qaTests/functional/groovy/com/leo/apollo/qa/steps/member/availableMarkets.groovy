package com.leo.apollo.qa.steps

import groovy.json.JsonSlurper
import static org.junit.Assert.assertTrue

/**
 * Created by charles.moga on 15/01/2016.
 */


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def response
List whitelisted
//commenting out. this test re-quires re-writing using the mocked service

When(~"a member views available markets for event type \"([^\"]*)\"") { String eventtype ->
//    response = helpers.getAvailableMarkets(Integer.parseInt(eventtype))
//    whitelisted = db.getWhiteListedMarkets()
}

Then(~"they should see white listed markets") { ->
//
//    def slurper = new JsonSlurper()
//    def data = slurper.parseText((String) response)
//    data.each {
//        def name = it.competition.name
//        //helpers.printdebug(whitelisted)
//        //helpers.printdebug(name)
//        assertTrue(whitelisted.contains(name))
//        //assertTrue(name.equals(whitelisted.get(id)))
//    }

}
