package com.smith.test.cucumber;

import com.smith.test.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        glue = {"com.smith.test.cucumber",
                "com.smith.test.helper",
                "com.smith.test.pages",
                "com.smith.test.pages_sd",
                "com.smith.test.utility"},
        features = "src/test/resources"
)

public class RunCukesTest {

    @BeforeClass
    public static void setUp(){
    Driver.browserType("firefox");
    Driver.driver.manage().window().maximize();
}


    @AfterClass
    public static void tearDown(){
        if(Driver.driver!=null){
            Driver.driver.quit();
        }
    }
}
