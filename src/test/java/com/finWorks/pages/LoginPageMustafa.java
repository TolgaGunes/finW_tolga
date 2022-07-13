package com.finWorks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageMustafa extends BasePage {

    @FindBy(name = "password")
    private WebElement inputPassword;


    public void typePassword() {
        inputPassword.clear();
        inputPassword.sendKeys("password");
    }
}
