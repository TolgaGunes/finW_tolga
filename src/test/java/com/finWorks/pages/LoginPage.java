package com.finWorks.pages;

import com.finWorks.utilties.ConfigurationReader;
import com.finWorks.utilties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "login")
    public WebElement inputUsername;

    @FindBy(name = "password")
    private WebElement inputPassword;





    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement loginButton;


    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement topBarName;



    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginErrorMessage;



    @FindBy(name = "login")
    public WebElement fillOutThisFieldMessageEmailBox;

    @FindBy(name = "password")
    public WebElement fillOutThisFieldMessagePasswordBox;

    public void login(String username, String password) {
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }



    public String getBarName() {
        return topBarName.getText();
    }

    public void enterPassword(String password) {
         inputPassword.sendKeys(password);
    }
}


