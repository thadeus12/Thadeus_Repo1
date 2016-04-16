package com.test.quidco.functional.groovy.com.leo.apollo.qa.data.agency


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

Then(~"the test data should be available in the database") { ->
}
Then(~"the database should not contain the data that was deleted") { ->
}
