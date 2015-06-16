package com.dmgmedia.cucumber;

/**
 * Created by sewadeus on 14/06/2015.
 */


import com.dmgmedia.apputility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

import static com.dmgmedia.apputility.GetConfigProperties.getBrowserName;
import static com.dmgmedia.apputility.GetConfigProperties.getHomePageUrl;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@smoke-test", strict=true,
        plugin= {"pretty","html:target/cucumber"},
        monochrome = true,
       glue = { "com.dmgmedia.app_sd",
               "com.dmgmedia.Testcases",
               "com.dmgmedia.cucumber",
               "com.dmgmedia.apputility",
                "com.dmgmedia.pages"
        },
        features = {"src/test/Resources/cucumberFeature"}

)

public class TestRunner {

    @BeforeClass
    public static void setup() throws IOException {

        Driver.initialiseDriver(getBrowserName());
    }

    @AfterClass
    public static void teardown(){
        Driver.driver.manage().deleteAllCookies();
        Driver.driver.quit();
    }
}
