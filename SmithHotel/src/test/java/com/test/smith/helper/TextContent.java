package com.test.smith.helper;

import junit.framework.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by sewadeus on 09/08/2015.
 */
public class TextContent {

    public static Properties CONFIG = null;
    static String search;

    private static void initializeConfig() throws FileNotFoundException,
            IOException {
        CONFIG = new Properties();

        FileInputStream fn = new FileInputStream("C:\\Users\\sewadeus\\Desktop\\GitHub\\Thadeus_Repo\\SmithHotel\\src\\config.properties");
        CONFIG.load(fn);
    }

    public static String getBrowserName() throws IOException {
        search = "Browser";
        String browser = null;
        initializeConfig();

        if (CONFIG.getProperty(search) != null)

            browser = CONFIG.getProperty(search);
        return browser;

    }



    public static String getHomePageUrl() throws IOException {
        String baseUrl= "HomePageUrl";
        String url = null;
        initializeConfig();

        if (CONFIG.getProperty(baseUrl) != null)

            url= CONFIG.getProperty(baseUrl);
        return url;
    }

    public static String getUsername() throws IOException {
        String username= "Username";
        String user = null;
        initializeConfig();

        if (CONFIG.getProperty(username) != null)
            user = CONFIG.getProperty(username);
        return user;
    }
    public static String getPassword() throws IOException {
        String password= "Password";
        String pass = null;
        initializeConfig();
        if (CONFIG.getProperty(password) != null)
            pass = CONFIG.getProperty(password);
        return pass;
    }
}
