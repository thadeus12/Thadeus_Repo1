package com.test.shoop.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by sewadeus on 07/06/2016.
 */
public class Driver {
    public static WebDriver driver = null;
    public static Properties CONFIG = null;
    static String search;

    public static void initializeConfig() throws FileNotFoundException,IOException {
        if (driver == null) {
            CONFIG = new Properties();

            FileInputStream fn = new FileInputStream(System.getProperty("user.dir") + "\\src\\config.properties");
            CONFIG.load(fn);

            if (CONFIG.getProperty("browserType").equalsIgnoreCase("firefox") || CONFIG.getProperty("browserType").equalsIgnoreCase("")) {
                DesiredCapabilities dc = new DesiredCapabilities();
                driver = new FirefoxDriver(dc);
            } else {
                if (CONFIG.getProperty("browserType").equalsIgnoreCase("chrome")) {
                    DesiredCapabilities dc = DesiredCapabilities.chrome();
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\browserBinaries\\chromedriver.exe");
                    driver = new ChromeDriver(dc);
                }
            }
        }

    }
}
