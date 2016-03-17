package com.shoop.test.pages;

import com.shoop.test.utility.Driver;

/**
 * Created by sewadeus on 16/03/2016.
 */
public class HomePage extends Driver{

    public void navigateToHomePage(String url){
        driver.get(url);
        System.out.println(driver.getTitle());

    }

}
