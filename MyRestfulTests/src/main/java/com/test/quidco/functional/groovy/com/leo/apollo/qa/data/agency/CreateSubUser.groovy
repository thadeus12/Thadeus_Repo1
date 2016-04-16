package com.test.quidco.functional.groovy.com.leo.apollo.qa.data.agency

/**
 * Created by charles.moga on 14/01/2016.
 */
this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~"I delete data for create COY sub user scenarios from database") { ->
    db.deleteAgent("aa.01", "aa.02", "aa.03")
}