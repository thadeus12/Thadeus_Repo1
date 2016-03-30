package com.test.shoop.cucumber;

import com.test.shoop.utility.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

/**
 * Created by sThadeus sewanyana on 18/03/2016.
 */
public class Hooks extends Driver {



    @Before
    public void beforeScenario(Scenario scenario) throws Exception {
        System.out.println( "Starting before test method");

    }

    public void embedScreenshot(Scenario scenario) {
        try {
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
    }

    @After
    public void afterScenario(Scenario scenario) {
        embedScreenshot(scenario);
    }


}
