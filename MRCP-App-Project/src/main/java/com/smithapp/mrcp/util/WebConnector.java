package com.smithapp.mrcp.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebConnector {
	// initialize properties file
	// logging
	// selenium/webdriver layer - selenium commands

	Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
	Properties OR = null;
	Properties CONFIG = null;
	WebDriver driver = null;
	WebDriver firefox= null;
	WebDriver chrome = null;
	WebDriver ie = null;
	static WebConnector w;

	public WebConnector() {

		if (OR == null) {
			try {
				// initialize OR
				OR = new Properties();
				FileInputStream fp  = new 
				FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\smithapp\\mrcp\\config\\OR.properties");
				OR.load(fp);

				// initializes CONFIG to a given test env
   CONFIG = new Properties();
   fp = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\smithapps\\mrcp\\config\\"+ OR.getProperty("testEnv") + "_config.properties");
				CONFIG.load(fp);

				System.out.println(OR.getProperty("search"));
				System.out.println(CONFIG.getProperty("baseurl"));

			} catch (Exception e) {
				System.out.println("Error on intializing properties files");
			}

		}

		
		
			
	}

	// opening the browser
	public void openBrowser(String browserType) {
		log("Opening browser " + browserType);
		if (browserType.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+ "\\browser exe\\chromedriver.exe");
			driver = new ChromeDriver();
			// set the IE server exe path and initialize
		} else if (browserType.equalsIgnoreCase("IE")) {
			System.setProperty("WebDriver.IE.driver", 
			System.getProperty("user.dir")+ "\\browser exe\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
			// set the & initialize safari
		} else if (browserType.equalsIgnoreCase("safari")) {
				driver = new SafariDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	// navigates to URL
	public void navigate(String URL) {
      driver.get(CONFIG.getProperty(URL));
	}

	// clicking on any object
	public void click(String objectName) {
		log("Clicking on " + objectName);
		driver.findElement(By.xpath(OR.getProperty(objectName))).click();
	}
        //sendkeys and value
	public void type(String text, String objectName) {

		driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
	}

	public void select(String text, String objectName) {

	driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
	}

	public boolean isElementPresent(String objectName) {
      int count = driver.findElements(By.xpath(OR.getProperty(objectName)))	.size();
		if (count == 0)
			return false;
		else
			return true;
	}

	// / ****************Application dependent functions************************
	// ///

	public boolean isLoggedIn() {

		if (isElementPresent("searchText"))
			return true;
		else
			return false;
	}

	public void doDefaultLogin() {
		navigate("baseURL");
		click("signinlink");
		type(CONFIG.getProperty("defaultUsername"), "Myemail");
		type(CONFIG.getProperty("defaultPassword"), "Mypassword");
		click("loginButton");
	}

	/******** Singleton **********/
	public static WebConnector getInstance() {
		if (w == null)
			w = new WebConnector();

		return w;
	}

	/************** Logging ***************/
	public void log(String msg) {
		APPLICATION_LOGS.debug(msg);
	}

}
