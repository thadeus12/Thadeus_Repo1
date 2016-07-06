package com.test.smartfocus.pages;


import com.test.smartfocus.utility.Driver;

/**
 * Created by sewadeus on 06/07/2016.
 */
public class HomePage extends Driver {

    public void navigateToHomePage(String url){
        driver.get(url);
        System.out.println(driver.getTitle());
    }


}
