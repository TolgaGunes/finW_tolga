package com.finWorks.step_defs;

import com.finWorks.pages.LoginPage;
import com.finWorks.utilties.ConfigurationReader;
import com.finWorks.utilties.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    //@FNW-512
    @Given("user is on the login page of website")
    public void user_is_on_the_login_page_of_website() {
        String url = ConfigurationReader.getProperty("finWork_url");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        loginPage.inputUsername.sendKeys(username);

    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {

    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        loginPage.loginButton.click();
    }


    @Then("user should see the top-bar name {string} at top right-hand corner of the page")
    public void userShouldSeeTheTopBarNameAtTopRightHandCornerOfThePage(String topBarName) {
        String actualTopBarName = loginPage.getBarName();
    }

    // @FNW-513
    @When("user enters invalid username {string}")
    public void userEntersInvalidUsername(String username) {
        loginPage.inputUsername.sendKeys(username);
    }

    @And("user enters invalid password {string}")
    public void userEntersInvalidPassword(String password) {
        loginPage.enterPassword(password);
    }

    @Then("user should not log in to the account")
    public void user_should_not_log_in_to_the_account() {

        //LoginPage.getErrorMessage();

    }


    //@FNW-514
    @When("user enters wrong username {string}")
    public void userEntersWrongUsername(String wrongUserName) {
        loginPage.inputUsername.sendKeys(wrongUserName);
    }

    @And("user enters wrong password {string}")
    public void userEntersWrongPassword(String wrongPassword) {
        loginPage.enterPassword(wrongPassword);
    }


    @Then("user should receive error message")
    public void userShouldReceiveErrorMessage() {
        Assert.assertTrue(loginPage.wrongLoginErrorMessage.isDisplayed());
    }

    //@FNW-515

    @When("user do not enters username {string}")
    public void userDoNotEntersUsername(String string) {
        loginPage.inputUsername.sendKeys(string);
    }

    @And("user do not enters password {string}")
    public void userDoNotEntersPassword(String password) {
        loginPage.enterPassword(password);
    }

    @Then("Then user should see the warning message {string}")
    public void thenUserShouldSeeTheWarningMessage(String warningMessage) {
            //loginPage.fillOutFieldErrorMessage();
    }


}
