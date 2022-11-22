package com.stalindurjo.driver;

import com.stalindurjo.support.Configuration;
import org.openqa.selenium.WebDriver;

/** DriverManager - Provides singleton instance of WebDriver */
public final class DriverManager {
    private static WebDriver driver = null;

    private DriverManager(){}

    public static WebDriver createDriver(){
        if(driver == null){
            driver = BrowserFactory.valueOf(Configuration.browser().toUpperCase()).initializeDriver();
        }

        return driver;
    }
}
