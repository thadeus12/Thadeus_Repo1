package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by sewadeus on 12/12/2015.
 */
public class HomePage {
WebDriver driver;
    public void navigateToHomePage(){
        driver = new FirefoxDriver();
        driver.get("file:///C:/Users/sewadeus/Desktop/RatePeople/index.html");
    }


}
