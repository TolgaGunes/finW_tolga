package com.finWorks.pages;

import com.finWorks.utilties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageGabriela extends BasePageGabriela {

    public LoginPageGabriela(){

        PageFactory.initElements(Driver.getDriver(),this);

    }




    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement loginButton_Gabriela;


    @FindBy(xpath = "nav[@id='oe_main_menu_navbar']")
    public WebElement navigationBar_Gabriela;


    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public static WebElement WrongLoginOrPassErrorMss_Gabriela;



    @FindBy(name = "login")
    public static WebElement PleaseFillOutThisFieldMssEmailBox_Gabriela;

    @FindBy(name = "password")
    public static WebElement PleaseFillOutThisFieldMssPasswordBox_Gabriela;


}
