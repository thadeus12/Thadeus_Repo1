package com.test.shoop.pages;

import com.test.shoop.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Thadeus sewanyana on 21/03/2016.
 */
public class HomePage extends Driver{




    public void navigateToHomePage(String url){

        driver.get(url);

    }


}
