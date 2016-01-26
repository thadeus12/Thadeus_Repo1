package utility;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by sewadeus on 12/12/2015.
 */

@RunWith(Cucumber.class)
@CucumberOptions(tags="@complete", strict=true,
        plugin= {"pretty","html:target/cucumber"},
        monochrome = true,
        glue = { "page_sd", "utility", "page", },
        features={"src/test/resources"}

)
public class Runner {
}
