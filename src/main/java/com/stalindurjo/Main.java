package com.stalindurjo;

import com.stalindurjo.driver.BrowserFactory;
import com.stalindurjo.driver.DriverManager;
import com.stalindurjo.support.Configuration;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Configuration.browser());

        WebDriver driver = BrowserFactory.CHROME.initializeDriver();
//        WebDriver driver = DriverManager.createDriver();
        driver.get("https://www.google.com");
    }
}