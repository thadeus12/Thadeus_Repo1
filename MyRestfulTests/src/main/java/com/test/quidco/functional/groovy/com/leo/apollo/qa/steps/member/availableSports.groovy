package com.test.quidco.functional.groovy.com.leo.apollo.qa.steps.member

import static org.junit.Assert.assertTrue

/**
 * Created by charles.moga on 15/01/2016.
 */


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

def response
//commenting out. this test re-quires re-writing using the mocked service

When(~"a member views available sports") {  ->
     //response = helpers.getAvailableSports()
}

Then(~"they should see \"([^\"]*)\" sports") { String sports ->
    //assertTrue(sports.equals(response))
}
