package com.finWorks.step_defs;

import com.finWorks.pages.*;
import com.finWorks.utilties.ConfigurationReader;
import com.finWorks.utilties.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StefDefs_Gabriela {

    BasePage basePageGabriela = new BasePage();
    LogoutPage logoutPageGabriela= new LogoutPage();
    LoginPage loginPageGabriela= new LoginPage();


    @Given("user enters username {string} password {string}")
    public void user_enters_username_password(String userName, String password) {

        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

        LoginPageGabriela.userNameGabriela.sendKeys("salesmanager15@info.com");
        LoginPageGabriela.password_Gabriela.sendKeys("salesmanager");
    }
    @When("user  clicks the loggin button")
    public void user_clicks_the_loggin_button() {
        LoginPageGabriela.loginButton_Gabriela.click();

    }
    @When("user is logged in")
    public void user_is_logged_in() {

        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);


    }
    @When("user clicks the dropdown profile menu")
    public void user_clicks_the_dropdown_profile_menu() {
      LogoutPageGabriela.topbarDropdown_Gabriela.click();
        LogoutPageGabriela.logoutButton_Gabriela.click();
    }
    @When("user clicks the logout button")
    public void user_clicks_the_logout_button() {
        String expectedTitle= "Login | Best solution for startups";
        String actualTitle= Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("user returns to the login page")
    public void user_returns_to_the_login_page() {

    }

}
