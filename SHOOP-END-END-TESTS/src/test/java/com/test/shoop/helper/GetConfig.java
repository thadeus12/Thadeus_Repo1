package com.test.shoop.helper;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetConfig {

    public static Properties CONFIG = null;
    static String search;

    private static void initializeConfig() throws FileNotFoundException,

            IOException {
        CONFIG = new Properties();

        FileInputStream fn = new FileInputStream("config.properties");
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


}
