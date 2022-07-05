package com.finWorks.pages;

import com.finWorks.utilties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public LogoutPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logoutButton;






}
