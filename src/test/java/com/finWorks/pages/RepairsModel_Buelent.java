package com.finWorks.pages;

import com.finWorks.utilties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairsModel_Buelent {
    public RepairsModel_Buelent(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[normalize-space()='Create']")
    public WebElement createBtn;


    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listIcon;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchBox;



    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveBtn ;



    @FindBy(xpath = "//button[@class='btn btn-sm btn-default oe_highlight']")
    public WebElement  confirmRepairBtn;



    @FindBy(xpath = "//input[@id='o_field_input_90']")
    public WebElement product2Repair ;


    @FindBy(xpath = "//input[@id='o_field_input_94']")
    public WebElement customer;



    @FindBy(xpath = "//input[@id='o_field_input_96']")
    public WebElement currentLocation;


    @FindBy(xpath = "//select[@id='o_field_input_100']")
    public WebElement invoicceMethod;

}
