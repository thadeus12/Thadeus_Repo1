package com.smith.tashh.cucumber.utility;




import com.smith.tashh.cucumber.helper.SizzleSelector;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

/**
 * Created by sewadeus on 09/08/2015.
 */
public class SmithhotelsInternetExplorerDriver extends InternetExplorerDriver {
    /**
     * Sizzle CSS Selector implementation
     */
    private final SizzleSelector sizzleSelector;

    /**
     * Driver constructor
     *
     * @param desiredCapabilities to be passed into the standard InternetExplorerDriver
     */
    public SmithhotelsInternetExplorerDriver(Capabilities desiredCapabilities) {
        super(desiredCapabilities);
        sizzleSelector = new SizzleSelector(this);
    }

    @Override
    public WebElement findElementByCssSelector(String using) {
        return sizzleSelector.findElementBySizzleCss(using);
    }

    @Override
    public List<WebElement> findElementsByCssSelector(String using) {
        return sizzleSelector.findElementsBySizzleCss(using);
    }

}
