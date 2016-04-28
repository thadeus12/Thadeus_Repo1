package com.partner.test.runners;


import com.partner.test.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

/**
 * Created by Thadeuss on 29/01/2015.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true, strict= true,
                 format={"json:target/cucumber.json","html:target/cucumber"},

                 glue={  "com.partner.test.helper",
                         "com.partner.test.pages",
                         "com.partner.test.runners",
                         "com.partner.test.step_def",
                         "com.partner.test.utility"} ,
        features ={"src/test/Resource/SmithPartnerBooking.feature"}

)
//tags="@smoke-test"

public class Runner extends Driver {
    @BeforeClass
    public static void setUp() throws IOException {
        System.out.println("Starting testing");
        Driver.driver("Firefox");
        Driver.driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown(){
        if(Driver.driver!=null){
            Driver.driver.quit();
        }
    }
}
