package com.stalindurjo;

import com.stalindurjo.support.Configuration;
import com.stalindurjo.support.test_data.ACCOUNT_TYPE;
import com.stalindurjo.support.test_data.UserTestData;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        System.out.println(Configuration.browser());

//        WebDriver driver = BrowserFactory.CHROME.initializeDriver();
//        WebDriver driver = DriverManager.createDriver();
//        Login login = new Login(driver);
//
//        driver.get(Configuration.baseUrl());
//        login.enterUsername("Tavares_Barrows");
//        login.enterPassword("s3cret");
//        login.clickOnRememberMeCheckbox();
//        login.clickOnSignIn();

//        JsonNode data = JSON.getData("data.json");
//        System.out.println(data);
//        System.out.println(data.get("users").asText());
//        System.out.println(data.get("users").get(0).get("username"));

        UserTestData userTestData = new UserTestData(ACCOUNT_TYPE.GENERAL_PURPOSE);
        System.out.println(userTestData.get("password"));
    }
}