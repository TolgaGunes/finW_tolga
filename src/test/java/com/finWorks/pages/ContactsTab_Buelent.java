package com.finWorks.pages;


import com.finWorks.utilties.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsTab_Buelent {
    public ContactsTab_Buelent() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[normalize-space()='Create']")
    public WebElement createBtn;

    @FindBy(name = "name")
    public WebElement nameBox;

    @FindBy(name = "phone")
    public WebElement phoneBox;

    @FindBy(name = "mobile")
    public WebElement mobileBox;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@placeholder='e.g. www.odoo.com']")
    public WebElement WebSiteBox;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listIcon;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[normalize-space()='Bülent']")
    public WebElement searchResult;

    public String searchResult(String searchedContact) {
        return Driver.getDriver().findElement(By.xpath("//span[normalize-space()='" + searchedContact + "']")).getText();

    }


    @FindBy(xpath = "//input[@placeholder='e.g. BE0477472701']")
    public WebElement tinBox;


    @FindBy(xpath = "//tbody//tr[1]/td[2]")
    public WebElement theContact;

    @FindBy(css = "li.active")
    public WebElement contactsNameElement;

   // @FindBy(xpath = "//button[text()='Edit']")
    @FindBy(xpath = "//button[normalize-space()='Edit']")
    public WebElement editBtn;

    @FindBy(xpath = "//input[@placeholder='Street...']")
    public WebElement streetBox1;

    @FindBy(xpath = "//input[@placeholder='Street 2...']")
    public WebElement streetBox2;

    @FindBy(xpath = "//input[@placeholder='City']")
    public WebElement cityBox;

    @FindBy(xpath = "//input[@placeholder='ZIP']")
    public WebElement zipBox;

    public WebElement contactInTheSearchResult(String contact) {
        return Driver.getDriver().findElement(By.xpath("//span[normalize-space()='" + contact + "']"));

    }

    @FindBy(css= "span.caret")
    public WebElement printBtn;


    @FindBy(xpath = "//button[normalize-space()='Action']")
    public WebElement ActionBtn;

    @FindBy(linkText = "Delete")
    public WebElement deleteTheContact;

   // @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
   @FindBy(xpath = "//button//span[text()='Ok']")
    public WebElement OKBtn2DeleteTheContact;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> allContacts;

     @FindBy(xpath="//span[@title='Edit']")
    public WebElement editPicture ;

     @FindBy(xpath = "//span[@title='Clear']")
     public WebElement clearThePhoto;

     @FindBy(xpath = "//img[@name='image']")
    public WebElement profiPhoto;

     @FindBy(xpath = "//select[@id='o_field_input_11593']")
    public WebElement languageOption;


}
