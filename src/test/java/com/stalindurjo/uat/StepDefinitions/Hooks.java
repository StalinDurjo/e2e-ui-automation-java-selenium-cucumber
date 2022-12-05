package com.stalindurjo.uat.StepDefinitions;

import com.stalindurjo.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks{
    public static WebDriver driver;

    @Before
    public void setup(){
        driver = DriverManager.createDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
