package com.finWorks.pages;

import com.finWorks.utilties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePageGabriela {
    public BasePageGabriela(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//input[@name='login']")
    public static WebElement userNameGabriela;

    @FindBy(id ="password")

    public static WebElement password_Gabriela;

    @FindBy(xpath = "//span[@class='o_channel_name']")
    public WebElement inboxCell_Gabriela;
}
