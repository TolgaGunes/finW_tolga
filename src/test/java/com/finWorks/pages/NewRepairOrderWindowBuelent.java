package com.finWorks.pages;


import com.finWorks.utilties.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewRepairOrderWindowBuelent {
    public NewRepairOrderWindowBuelent() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='[253] Tshirt']")
    public WebElement tshirt;

    @FindBy(xpath = "//input[@id='o_field_input_94']")
    public WebElement product2Repair;

    @FindBy(name="partner_id")  // it works
    public WebElement customer;


    @FindBy(name = "invoice_method")
    public WebElement invoiceMethod;

    public void invoiceType(int number) {
        Select invoiceType = new Select(Driver.getDriver().findElement(By.name("invoice_method")));
        invoiceType.selectByIndex(number);
    }

    @FindBy(name = "product_qty")
    public WebElement quantity;


    @FindBy(xpath="//button[@class='btn btn-primary btn-sm o_form_button_save']")
        public WebElement saveButton;



    @FindBy(id= "//li[starts-with(@id,'ui-id')]")
    public WebElement searchCustomer;

    @FindBy(xpath = "//td[@class='o_data_cell o_readonly_modifier']")
    public WebElement clickTheResult;

    @FindBy(partialLinkText ="Lorem Ipsum")
    public WebElement clickTheCustomer;

    @FindBy(xpath ="" )
    public WebElement y;
}
