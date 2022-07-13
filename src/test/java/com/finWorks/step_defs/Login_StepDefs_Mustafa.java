package com.finWorks.step_defs;

import com.finWorks.pages.LoginPageMustafa;
import com.finWorks.utilties.ConfigurationReader;
import com.finWorks.utilties.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_StepDefs_Mustafa {
    @Given("I am on the login page_mks")
    public void iAmOnTheLoginPage_mks() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }

    @Then("I type my password")
    public void iTypeMyPassword() {
        new LoginPageMustafa().typePassword();
    }
}
