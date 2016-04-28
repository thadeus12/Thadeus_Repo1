package com.smith.test.cucumber;

import com.smith.test.helper.TextContent;
import com.smith.test.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

/**
 * Created by Thadeuss on 2/11/2015
 */



@RunWith(Cucumber.class)
@CucumberOptions( strict = true,

glue ={"com.smith.test.cucumber",
        "com.smith.test.helper",
        "com.smith.test.page_sd",
        "com.smith.test.pages",
        "com.smith.test.utility"},
        features = {"src/test/Resources"}

)

public class Runner {

    @BeforeClass
    public static void setUp() throws IOException {
        System.out.println("Starting testing");
        Driver.driver("Firefox");
        //Driver.driver(TextContent.getBrowserName());
        Driver.driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Quiting browser");
        Driver.driver.quit();
    }


}
