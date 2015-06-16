package com.dmgmedia.pages;

import com.dmgmedia.apputility.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.dmgmedia.apputility.GetConfigProperties.getBrowserName;
import static com.dmgmedia.apputility.GetConfigProperties.getHomePageUrl;
import static com.dmgmedia.apputility.GetConfigProperties.getmageUploadPageUrl;

/**
 * Created by sewadeus on 14/06/2015.
 */
public class HomePage extends Driver{

    final static String pageTitleHomePage= "Mail Plus";
    final static String pageTitleImageUploadPage= "Free Image Hosting";



  public static void navigateToHomePage() throws IOException {
      String url= getHomePageUrl();
      driver.manage().window().maximize();
      driver.get(url);
      Assert.assertTrue(driver.getTitle().contains(pageTitleHomePage));

  }

    public static void navigateToImageUploadPage() throws IOException {
        String url= getmageUploadPageUrl();
        driver.manage().window().maximize();
        driver.get(url);
        Assert.assertTrue(driver.getTitle().contains(pageTitleImageUploadPage));

    }

}
