package com.test.smith.cucumber;

import com.test.smith.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;



/**
 * Created by sewadeus on 25/05/2015.
 */


@RunWith(Cucumber.class)
@CucumberOptions(tags="@smoke-test12", strict=true,
        plugin= {"pretty","html:target/cucumber"},
        monochrome = true,
        glue = { "com.test.smith.page_sd",
                "com.test.smith.com.test.smith.utility",
                 "com.test.smith.page",
                 "com.test.smith.cucumber"},
        features={"src/test/Resources/CucumberFeature"}

)

public class RunnerClass{


    @BeforeClass
    public static void setUp(){
        System.out.println("Starting testing");
        Driver.driver();
        Driver.driver().manage().window().maximize();
    }





    @AfterClass
    public static void tearDown(){
    System.out.println("Quiting browser");
    Driver.driver().quit();
}


}
