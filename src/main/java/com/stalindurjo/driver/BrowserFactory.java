package com.stalindurjo.driver;

import com.stalindurjo.support.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/** BrowserFactory - Provides the logic for initializing browser */
public enum BrowserFactory {

    CHROME {
        @Override
        public WebDriver initializeDriver(){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver(options());
        }

        private ChromeOptions options(){
            ChromeOptions options = new ChromeOptions();
            options.setHeadless(Configuration.headless());

            return options;
        }
    },

    FIREFOX {
        @Override
        public WebDriver initializeDriver(){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver(options());
        }

        private FirefoxOptions options(){
            FirefoxOptions options = new FirefoxOptions();
            options.setHeadless(Configuration.headless());

            return options;
        }
    };

    public abstract WebDriver initializeDriver();
}
