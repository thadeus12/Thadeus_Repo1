package com.test.quidco.cucumber;
import com.test.quidco.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber"},
        glue ={ "com.test.quidco.page_sd",
                "com.test.quidco.pages",
               "com.test.quidco.helper",
                "com.test.quidco.cucumber",
               "com.test.quidco.utility"},
        features = "src/test/resources"

)
public class Runner extends Driver {
    @BeforeClass
    public static void setUp() throws IOException {
        System.out.println("Starting testing");
        Driver.driver("firefox");
        Driver.driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Quiting browser");
        Driver.driver.quit();

    }
    }