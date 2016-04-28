package com.smith.test.cucumber;

import com.smith.test.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

/**
 * Created by sewadeus on 16/02/2016.
 */



@RunWith(Cucumber.class)
@CucumberOptions( strict=true,
        plugin= {"pretty","html:target/cucumber"},
        monochrome = true,
        glue = { "com.smith.test.pages_sd",

                "com.smith.test.page","com.smith.test.helper",
                "com.smith.test.cucumber","com.smith.test.utility"},
        features={"src/test/resources"}

)

public class Runner extends Driver{


    @BeforeClass
    public static void setUp() throws IOException {
        System.out.println("Starting testing");
        Driver.browserType("firefox");
        Driver.driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Quiting browser");
        Driver.driver.quit();
    }


}