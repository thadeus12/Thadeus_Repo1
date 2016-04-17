package com.test.quidco.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by sewadeus on 17/04/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags = "@QP-153",
        monochrome = true,
        plugin ={"pretty","html:target/cucumber"},
        glue = {"com.test.quidco","com.test.quidco.utility",
                "com.test.quidco.Cucumber" ,
        },
        features ={"src/test/resources/com/test/quidco/"}

)
public class Runner {

}
