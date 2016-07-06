package com.test.smartfocus.cucumber;

import com.test.smartfocus.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

/**
 * Created by sewadeus on 06/07/2016.
 */


@RunWith(Cucumber.class)
@CucumberOptions( tags="@smoke-test",
        plugin= {"pretty","html:target/cucumber","json:target/cucumber.json"},
        monochrome = true,
        glue = { "com.test.smartfocust",
                "com.test.smartfocust.pageStepDef",
                "com.test.smartfocust.utility",
                " com.test.smartfocust.pages",
                "com.test.smartfocust.helper",
                "com.test.smartfocust.cucumber"},
        features={"src/test/resources/cucumberFeatures"}

)


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

