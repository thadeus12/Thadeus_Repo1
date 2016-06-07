package com.test.shoop.cucumber;

import com.test.shoop.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;





@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@SH-09"},
        plugin= {"pretty","html:target/cucumber"},
        monochrome = true,
        glue = {"com.test.shoop","com.test.shoop.cucumber",
        "com.test.shoop.helper","com.test.shoop.pages_sd",
        "com.test.shoop.pages","com.test.shoop.utility"},
        features = "src/test/resources/shoopFeatures"

)
public class Runner extends Driver {
    @BeforeClass
    public static void setUp() throws IOException {
        System.out.println("Starting testing");
        Driver.initializeConfig();
        Driver.driver.manage().window().maximize();
    }


    @AfterClass
    public static void tearDown(){
        System.out.println("Quiting browser");
        Driver.driver.quit();
    }
}
