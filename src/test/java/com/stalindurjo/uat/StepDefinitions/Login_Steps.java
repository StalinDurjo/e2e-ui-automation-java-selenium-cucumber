package com.stalindurjo.uat.StepDefinitions;

import com.stalindurjo.base.BaseTest;
import com.stalindurjo.support.Configuration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

public class Login_Steps extends BaseTest {
    @Given("user is on the signin page")
    public void user_is_on_the_signin_page() {
        driver.get(Configuration.baseUrl() + "/signin");
    }
    @When("user enters valid username")
    public void user_enters_valid_username() {
        login.enterUsername(generalPurposeUser.get("username"));
    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        login.enterPassword(generalPurposeUser.get("password"));
    }
    @When("user clicks on signin button")
    public void user_clicks_on_signin_button() {
        login.clickOnSignIn();
    }
    @Then("user is validated and redirected to homepage")
    public void user_is_validated_and_redirected_to_homepage() {
        String homeLink = driver.findElement(By.xpath("//span[contains(text(), \"Home\")]")).getText();
        Assert.assertEquals("Home", homeLink);
    }

    @When("user has entered valid credentials and clicked on remember me button")
    public void user_has_entered_valid_credentials_and_clicked_on_remember_me_button() {
        login.enterUsername(generalPurposeUser.get("username"));
        login.enterPassword(generalPurposeUser.get("password"));
        login.clickOnRememberMeCheckbox();
    }

    @And("user clicks on logout button")
    public void user_clicks_on_logout_button() {
        login.ClickOnLogoutButton();
    }

    @And("user cookie is saved in browser")
    public void user_cookie_is_saved_in_browser() {
        String cookieName = null;
        for(Cookie cookie : driver.manage().getCookies()){
            if(cookie.getName().equals("connect.sid")){
                cookieName = cookie.getName();
            }
        }

        if(cookieName == null){
            Assert.fail();
        }else{
            Assert.assertTrue(true);
        }

    }

    @When("user enters invalid username")
    public void user_enters_invalid_username() {
        login.enterUsername("abcdefg");
    }

    @And("user enters invalid password")
    public void user_enters_invalid_password() {
        login.enterPassword("1234567890");
    }

    @Then("user is redirected back to signin page")
    public void user_is_redirected_back_to_signin_page() {
        String headerText = login.signinTextHeader.getText();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("Sign in", headerText);
        Assert.assertEquals(Configuration.baseUrl() + "/signin", currentUrl);
    }

    @And("error message is displayed in signin page")
    public void error_message_is_displayed_in_signin_page() {
        String alertClassName = login.errorMessageElement.getAttribute("class");
        Assert.assertEquals("MuiAlert-message", alertClassName);
    }

    @Given("this is a test scenario")
    public void this_is_a_test_scenario() {
        driver.get(Configuration.baseUrl() + "/signin");
    }

    @When("this is the second step")
    public void this_is_the_second_step() {
        driver.get(Configuration.baseUrl() + "/signin");
    }
}
