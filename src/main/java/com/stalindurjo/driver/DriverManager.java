package com.stalindurjo.driver;

import com.stalindurjo.support.Configuration;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public final class DriverManager {

    private DriverManager(){}

    public static WebDriver createDriver(){
        WebDriver driver = BrowserFactory.valueOf(Configuration.browser().toUpperCase()).initializeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Configuration.timeout()));

        return driver;
    }
}
