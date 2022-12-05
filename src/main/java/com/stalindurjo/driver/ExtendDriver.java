package com.stalindurjo.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExtendDriver {
    WebDriver driver;

    public ExtendDriver(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getElement(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    public String getText(String xpath){
        return driver.findElement(By.xpath(xpath)).getText();
    }

//    public WebElement wait(){
//
//    }

    // TODO:: Test & Study proper usecase
    public void waitForElementVisibility(WebElement element, Duration timeoutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
