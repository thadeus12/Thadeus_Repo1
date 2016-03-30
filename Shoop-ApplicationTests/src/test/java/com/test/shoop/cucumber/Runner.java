package com.test.shoop.cucumber;

import com.test.shoop.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions( tags="@smoke-test",
        plugin= {"pretty","html:target/cucumber"},
        monochrome = true,
        glue = { "com.test.shoop.page_sd",
                "com.test.shoop.com.test.shoop.utility",
                 "com.test.shoop.page","com.test.shoop.helper",
                 "com.test.shoop.cucumber"},
        features={"src/test/resources/cucumberFeature"}

)

//tags="@Qa/Q-58",

public class Runner extends Driver {


    @BeforeClass
    public static void setUp() throws IOException {
        System.out.println("Starting testing");
        Driver.driver("chrome");
        Driver.driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown(){
    System.out.println("Quiting browser");
    Driver.driver.quit();
}


}
