package com.stalindurjo.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;

    @FindBy(id="username")
    public WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(name = "remember")
    WebElement rememberMeCheckbox;

    @FindBy(xpath="//button[@type=\"submit\"]")
    WebElement signInBtn;

    @FindBy(xpath = "//span[contains(text(), \"Logout\")]")
    WebElement logoutButton;

    @FindBy(xpath = "//main//h1[contains(text(), \"Sign in\")]")
    public WebElement signinTextHeader;

    @FindBy(xpath = "//div[contains(text(), \"Username or password is invalid\")]")
    public WebElement errorMessageElement;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String name){
        username.sendKeys(name);
    }

    public void enterPassword(String pass){
        password.sendKeys(pass);
    }

    public void clickOnRememberMeCheckbox(){
        rememberMeCheckbox.click();
    }

    public void clickOnSignIn(){
        signInBtn.click();
    }

    public void ClickOnLogoutButton(){
        logoutButton.click();
    }

}
