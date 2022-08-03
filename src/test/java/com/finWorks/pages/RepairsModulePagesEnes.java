package com.finWorks.pages;

import com.finWorks.utilties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairsModulePagesEnes {

    public RepairsModulePagesEnes(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li/a")
    public WebElement repairNavigationBarFromDropdown;

    @FindBy(xpath = "//a[@data-menu-xmlid='mrp_repair.menu_repair_order']/span")
    public WebElement repairNavigationBarFromButton;

    @FindBy(xpath = "//li[.='Repair Orders']")
    public WebElement repairOrdersPageHeader;

    @FindBy(xpath = "//td[@class='o_data_cell o_required_modifier']")
    public WebElement firstRepairOrder;

    @FindBy(xpath = "//label[.='Repair Reference']")
    public WebElement repairReference;

    @FindBy(xpath = "//a[@name='product_id']")
    public WebElement productToRepair;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement repairReferenceField;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveEdit;


    //-----Create Repair Order WebElements-----//

    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-sm o_list_button_add\"]")
    public WebElement createButton;


    @FindBy(xpath = "//input[@class=\"o_field_float o_field_number o_field_widget o_input o_required_modifier\"]")
    public WebElement quantityField;

    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-sm o_form_button_save\"]")
    public WebElement saveButton;
}
