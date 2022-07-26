package com.finWorks.step_defs;

import com.finWorks.pages.BasePage;
import com.finWorks.pages.BasePageGabriela;
import com.finWorks.pages.LoginPage;
import com.finWorks.pages.LoginPageGabriela;
import com.finWorks.utilties.ConfigurationReader;
import com.finWorks.utilties.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs_Gabriela extends LoginPageGabriela  {
    LoginPage loginPageGabriela = new LoginPage();
    BasePage basePageGabriela = new BasePage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void user_enters_username(String userName) {



        LoginPageGabriela.userNameGabriela.sendKeys(userName);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        LoginPageGabriela.password_Gabriela.sendKeys(password);
    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPageGabriela.loginButton.click();
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();

        // Assert.assertEquals(expectedTitle,actualTitle

        //   String actualName =basePage.inboxCell.getText();

        //   Assert.assertTrue(basePage.inboxCell.isDisplayed());


    }


    @When("user enters invalid  username {string}")
    public void user_enters_invalid_username(String userName) {
        LoginPageGabriela.userNameGabriela.sendKeys(userName);
    }

    @When("user enters invalid password {string}")
    public void user_enters_invalid_password(String Password) {
        LoginPageGabriela.userNameGabriela.sendKeys(Password);
    }

    @Then("user should not be able to login")
    public void user_should_not_be_able_to_login() {
        String expectedTitle = "Login | Best solution for startups";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }





    @When("user enters incorrect  username {string}")
    public void user_enters_incorrect_username(String incorrectUserName) {
        LoginPageGabriela.userNameGabriela.sendKeys(incorrectUserName);
    }
    @When("user enters incorrect password {string}")
    public void user_enters_incorrect_password(String incorrectPassword) {
        LoginPageGabriela.password_Gabriela.sendKeys(incorrectPassword);
    }
    @Then("user should get an incorrect credentials  message")
    public void user_should_get_an_incorrect_credentials_message() {
        Assert.assertTrue(LoginPageGabriela.WrongLoginOrPassErrorMss_Gabriela.isDisplayed());
    }





    @When("user does not enter a username {string}")
    public void user_does_not_enter_a_username(String string) {
        LoginPageGabriela.userNameGabriela.sendKeys(string);
    }
    @When("user does not enter a password {string}")
    public void user_does_not_enter_a_password(String string) {
        LoginPageGabriela.password_Gabriela.sendKeys(string);
    }
    @Then("user should not be able to login and get a warning message")
    public void user_should_not_be_able_to_login_and_get_a_warning_message() {
        String expectedWarningMessage = "Please fill out this field.";
        String actualMessage1 = LoginPageGabriela.PleaseFillOutThisFieldMssEmailBox_Gabriela.getAttribute("validationMessage");
        String actualMessage2 = LoginPageGabriela.PleaseFillOutThisFieldMssPasswordBox_Gabriela.getAttribute("validationMessage");

        Assert.assertEquals(expectedWarningMessage, actualMessage1);
        Assert.assertEquals(expectedWarningMessage,actualMessage2);


    }


}
