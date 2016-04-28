package com.test.smith.cucumber;

import com.test.smith.helper.TextContent;
import com.test.smith.utility.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@complete", strict=true,
        format= {"pretty","html:target/cucumber", },
        monochrome = true,
        glue = { "com.test.smith.page_sd",
                "com.test.smith.com","test.smith.utility",
                 "com.test.smith.pages","com.test.smith.helper",
                 "com.test.smith.cucumber"},
        features={"src/test/resources"}

)

public class Runner {


    @BeforeClass
    public static void setUp() throws IOException {
        System.out.println("Starting testing");
        Driver.driver(TextContent.getBrowserName());
        Driver.driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown(){
    System.out.println("Quiting browser");
    Driver.driver.quit();
}


}
