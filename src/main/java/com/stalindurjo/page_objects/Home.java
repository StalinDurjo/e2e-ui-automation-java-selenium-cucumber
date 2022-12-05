package com.stalindurjo.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(text(), \"Home\")]")
    WebElement homeLink;

    public Home(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
