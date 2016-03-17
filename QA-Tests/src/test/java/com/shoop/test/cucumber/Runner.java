package com.shoop.test.cucumber;

import com.shoop.test.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

/**
 * Created by Thadeus Ssewanyana on 16/03/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags="@smoke-test", strict=true,
        plugin= {"pretty","html:target/cucumber"},
        monochrome = true,
        glue = { "com.shoop.test.cucumber",
                 "com.shoop.test.helper",
                "com.shoop.test.page_sd",
                "com.shoop.test.pages",
                "com.shoop.test.utility"},
        features={"src/test/resources/"}
)
public class Runner {


    @BeforeClass
    public static void setUp() throws IOException {
        System.out.println("Starting testing");
        Driver.driver("chrome");
        Driver.driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Quiting browser");
        Driver.driver.quit();
    }
}

