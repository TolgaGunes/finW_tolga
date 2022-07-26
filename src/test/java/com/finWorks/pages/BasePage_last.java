package com.finWorks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage_last {

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement topBarName;

}
