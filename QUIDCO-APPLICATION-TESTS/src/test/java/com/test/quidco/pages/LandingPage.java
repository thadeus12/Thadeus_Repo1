package com.test.quidco.pages;

import com.test.quidco.utility.Driver;

/**
 * Created by sewadeus on 15/02/2016.
 */
public class LandingPage extends Driver {

    public void navigateToHomePage(String url){

        driver.get(url);
      driver.getTitle();
    }

}
