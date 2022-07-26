package com.finWorks.pages;

import com.finWorks.utilties.ConfigurationReader;
import com.finWorks.utilties.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPageGabriela {

    public LogoutPageGabriela(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Log in']")

    public WebElement loginButton_Gabriela;

    @FindBy(className = "oe_topbar_name")
    public static WebElement topbarDropdown_Gabriela;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public static WebElement logoutButton_Gabriela;

}
