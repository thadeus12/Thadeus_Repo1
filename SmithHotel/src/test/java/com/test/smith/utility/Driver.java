package com.test.smith.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by sewadeus on 25/05/2015.
 */
public abstract class Driver  {

   protected static WebDriver driver = null;

   public static WebDriver driver() {
      if(driver==null) {

         DesiredCapabilities dc = new DesiredCapabilities();
         driver = new SmithHotelFireFoxDriver(dc);
      }

      return driver;
   }





}