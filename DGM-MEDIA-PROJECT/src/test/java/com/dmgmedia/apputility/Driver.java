package com.dmgmedia.apputility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by sewadeus on 14/06/2015.
 */
public class Driver {

    public static WebDriver driver;

    public static void initialiseDriver(String Browser) {

        String s = Browser.toUpperCase();
        if (s.equals("FIREFOX")) {
            driver = new FirefoxDriver();

        } else if (s.equals("CHROME")) {
            String chromePath = "selenium_standalone_binaries/chrome/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromePath);
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability("chrome.switches",
                    Arrays.asList("--no-default-browser-check"));
            HashMap<String, String> chromePreferences = new HashMap<String, String>();
            chromePreferences.put("profile.password_manager_enabled", "false");
            capabilities.setCapability("chrome.prefs", chromePreferences);
            driver = new ChromeDriver(capabilities);


        } else {
            driver = new FirefoxDriver();

        }


        }

    }


