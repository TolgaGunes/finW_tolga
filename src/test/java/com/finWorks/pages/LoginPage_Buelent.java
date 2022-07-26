package com.finWorks.pages;


import com.finWorks.utilties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Buelent {
    public LoginPage_Buelent() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "login")
    public WebElement inputEmail;


    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;


    //@FindBy(xpath = "//p[.='Wrong login/password']")
    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@required='required']")
    public WebElement fillMessageWarning;


    @FindBy(linkText = "#")
    public WebElement resetPassword;


    public void login(String userName, String password) {
        inputEmail.sendKeys(userName);
        inputPassword.sendKeys(password);
        loginBtn.click();
    }


}
