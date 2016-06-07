package com.test.shoop.pages;

import com.test.shoop.utility.Driver;

/**
 * Created by sewadeus on 07/06/2016.
 */
public class HomePage extends Driver{

    public void naviagetToHomePage() {
        driver.get(CONFIG.getProperty("baseURL"));
    }
}
