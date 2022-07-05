package com.finWorks.step_defs;

import com.finWorks.pages.LoginPage;
import com.finWorks.pages.LogoutPage;
import com.finWorks.utilties.ConfigurationReader;
import com.finWorks.utilties.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;


public class Logout_StepDefs {

    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("User enters username {string} password {string} and logins")
    public void user_enters_user_name_password_and_logins(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("finWork_url"));
        loginPage.login(username,password);


    }
    @When("Login to FinWork account successfully")
    public void login_to_fin_work_account_successfully() {
        String expectedTopBarNameText = "SalesManager15";
        String actualTopBarNameText = loginPage.topBarName.getText();
        Assert.assertEquals(expectedTopBarNameText,actualTopBarNameText);
    }



    @And("Able to click on the profile dropdown menu")
    public void ableToClickOnTheProfileDropdownMenu() {
            loginPage.topBarName.click();
    }

    @And("Able to click on Logout item")
    public void ableToClickOnLogoutItem() {
            logoutPage.logoutButton.click();
    }

    @And("Able to redirect page to login page after logout successfully")
    public void ableToRedirectPageToLoginPageAfterLogoutSuccessfully() {
        String expectedLogInPageTitle ="Login | Best solution for startups";
        String actualLogInPageTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedLogInPageTitle, actualLogInPageTitle);
    }
}

