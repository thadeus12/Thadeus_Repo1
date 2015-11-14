package com.smith.tashh.cucumber.runners;

import com.smith.tashh.cucumber.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Created by sewadeus on 04/10/2015.
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags="@smoke-test",
        monochrome = true, strict= true,
                 format={"html:target/cucumber"},
                  features = "src/test/resources/com/smith/tashh",
                 glue={"com.smith.tashh.cucumber.pages",
                         "com.smith.tashh.cucumber.step_def",
                         "com.smith.tashh.cucumber.utility" })
public class Runner extends Driver {
    @BeforeClass
    public static void setUp(){
        Driver.browserType("firefox");
    }

    @AfterClass
    public static void tearDown(){
        if(Driver.driver!=null){
            Driver.driver.quit();
        }
    }
}
