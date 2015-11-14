package com.smith.tashh.cucumber.runners;

import com.smith.tashh.cucumber.utility.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

/**
 * Created by sewadeus on 04/10/2015
 */
public class Hooks extends Driver {

    @Before
    public void beforeScenario(Scenario scenario){}

    @After
    public void afterScenario(Scenario scenario){
        embedScreenshot(scenario);
    }

    private void embedScreenshot(Scenario scenario) {

        if(scenario.isFailed()){

            try{
                byte[] screenshot= ((TakesScreenshot)Driver.driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }catch(WebDriverException somePlatFormDontSupportScreenshot){}
        }
    }
}
