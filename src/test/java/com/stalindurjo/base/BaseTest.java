package com.stalindurjo.base;

import com.stalindurjo.page_objects.Login;
import com.stalindurjo.support.test_data.ACCOUNT_TYPE;
import com.stalindurjo.support.test_data.UserTestData;
import com.stalindurjo.uat.StepDefinitions.Hooks;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    public WebDriver driver;
    public Login login;
    public UserTestData generalPurposeUser;
    public UserTestData firstTimeUser;

    public BaseTest(){
        driver = Hooks.driver;
        login  = new Login(driver);

        generalPurposeUser = new UserTestData(ACCOUNT_TYPE.GENERAL_PURPOSE);
        firstTimeUser = new UserTestData(ACCOUNT_TYPE.FIRST_TIME_USER);
    }

}
