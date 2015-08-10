package com.test.smith.utility;

import com.test.smith.helper.TextContent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by sewadeus on 25/05/2015.
 */
public abstract class Driver{

   public static WebDriver driver = null;




   public static void driver(String browsertype) throws IOException {


         if(browsertype.equalsIgnoreCase("firefox")||browsertype.equalsIgnoreCase("")){
         DesiredCapabilities dc = new DesiredCapabilities();
         driver = new SmithHotelFireFoxDriver(dc);
      }else {
            if (browsertype.equalsIgnoreCase("chrome")) {
               DesiredCapabilities dc = DesiredCapabilities.chrome();
               System.setProperty("webdriver.chrome.driver", "C:\\Users\\sewadeus\\Desktop\\GitHub\\Thadeus_Repo\\SmithHotel\\src\\browserBinaries\\chromedriver.exe");
               driver = new SmithhotelsChromeDriver(dc);
            }
         }




   }}





