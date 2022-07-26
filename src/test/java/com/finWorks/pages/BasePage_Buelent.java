package com.finWorks.pages;


import com.finWorks.utilties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage_Buelent {
    public BasePage_Buelent(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = "a[data-menu='68'] span")
    public WebElement contactsTab;

    @FindBy(linkText = "Repairs")
    public WebElement repairsTab;


}
