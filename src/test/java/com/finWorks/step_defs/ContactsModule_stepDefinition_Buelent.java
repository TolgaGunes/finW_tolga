package com.finWorks.step_defs;


import com.finWorks.pages.*;
import com.finWorks.utilties.BrowserUtils;
import com.finWorks.utilties.ConfigurationReader;
import com.finWorks.utilties.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ContactsModule_stepDefinition_Buelent {
    LoginPage_Buelent loginPage = new LoginPage_Buelent();
    BasePage_Buelent basePage = new BasePage_Buelent();
    ContactsTab_Buelent contactsTab = new ContactsTab_Buelent();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @Given("I logged into the twiliaERP")
    public void i_logged_into_the_twilia_erp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("signInPage"));
        loginPage.login("salesmanager15@info.com", "salesmanager");

    }

    @When("I enter {string}, {string} ,{string} and {string} then save a new contact")
    public void iEnterAndThenSaveANewContact(String fullName, String phone, String mobile, String email) {
        BrowserUtils.sleep(3);
        wait.until(ExpectedConditions.visibilityOf(basePage.contactsTab));
        basePage.contactsTab.click();
        // wait.until(ExpectedConditions.titleIs(Driver.getDriver().getTitle()));
        BrowserUtils.sleep(2);
        contactsTab.createBtn.click();

        wait.until(ExpectedConditions.visibilityOf(contactsTab.nameBox));
        contactsTab.nameBox.sendKeys(fullName);
        BrowserUtils.sleep(2);
        contactsTab.phoneBox.sendKeys(phone);
        BrowserUtils.sleep(1);
        contactsTab.mobileBox.sendKeys(mobile);
        BrowserUtils.sleep(1);
        contactsTab.emailBox.sendKeys(email);
        BrowserUtils.sleep(2);
        contactsTab.saveBtn.click();


    }

    @Then("I should see contact information for {string}")
    public void iShouldSeeContactInformationFor(String fullName) {
        BrowserUtils.sleep(2);
        basePage.contactsTab.click();

        wait.until(ExpectedConditions.visibilityOf(contactsTab.searchBox));
        BrowserUtils.sleep(4);
        contactsTab.searchBox.sendKeys(fullName + Keys.ENTER);
        System.out.println(contactsTab.searchResult(fullName));//it shows the search result

        //System.out.println(contactsTab.searchResult.getText());
        //contactsTab.searchResult.isDisplayed();

    }


    @And("I enter the TIN {string} in the TIN box")
    public void IEnterTheTINInTheTINBox(String arg0) {
        contactsTab.tinBox.sendKeys(arg0);
    }


    @Given("I am on contacts module")
    public void IamOnContactsModule() {
        Driver.getDriver().get(ConfigurationReader.getProperty("signInPage"));
        loginPage.login("salesmanager15@info.com", "salesmanager");
        BrowserUtils.sleep(3);
        basePage.contactsTab.click();
        BrowserUtils.sleep(3);
    }

    @Then("I write the name {string} in the search box and preses enter")
    public void userWriteTheNameInTheSearchBoxAndPresesEnter(String arg0) {
        BrowserUtils.sleep(2);
        contactsTab.searchBox.sendKeys(arg0 + Keys.ENTER);


    }

    @When("I click the List icon under the search box to change the view of the contacts in list")
    public void userClicksTheListIconUnderTheSearchBoxToChangeTheViewOfTheContactsInList() {
        BrowserUtils.sleep(4);
        contactsTab.listIcon.click();


    }

    @And("I navigate to contact {string} `s info page")
    public void userNavigatesToContactSInfoPage(String contactsName) {
        BrowserUtils.sleep(3);
        contactsTab.theContact.click();
        BrowserUtils.sleep(3);
        System.out.println(Driver.getDriver().getTitle());
        System.out.println(contactsTab.contactsNameElement.getText());
        contactsTab.contactsNameElement.isDisplayed();


    }


    @Given("I am on contact`s info page of {string}")
    public void IamOnContactSInfoPageOf(String Contact) {
        Driver.getDriver().get(ConfigurationReader.getProperty("signInPage"));
        loginPage.login("salesmanager15@info.com", "salesmanager");
        BrowserUtils.sleep(3);
        basePage.contactsTab.click();
        BrowserUtils.sleep(3);

        BrowserUtils.sleep(4);
        contactsTab.listIcon.click();

        BrowserUtils.sleep(4);
        contactsTab.searchBox.sendKeys(Contact + Keys.ENTER);

        BrowserUtils.sleep(3);
        contactsTab.theContact.click();
/*
        BrowserUtils.sleep(3);
        List<WebElement> contacts = contactsTab.allContacts;
        for (WebElement each : contacts) {
            System.out.println(each.getText());

            if (each.getText().contains(Contact)) {
                each.click();
                break;
            }
        }
*/
        BrowserUtils.sleep(3);
        System.out.println(Driver.getDriver().getTitle());
        System.out.println(contactsTab.contactsNameElement.getText());
        contactsTab.contactsNameElement.isDisplayed();


    }


    @And("I click on the edit button")
    public void userClicksTheEditButton() {
        BrowserUtils.sleep(1);
        contactsTab.editBtn.click();
    }

    @And("I edit my address by typing {string}, {string} ,{string} and {string}")
    public void iEditMyAddressByTypingAnd(String street, String city, String ZIP, String TIN) {


        BrowserUtils.sleep(4);
        contactsTab.streetBox1.clear();
        contactsTab.streetBox1.sendKeys(street);

        BrowserUtils.sleep(2);
        contactsTab.cityBox.clear();
        contactsTab.cityBox.sendKeys(city);
        contactsTab.zipBox.clear();
        contactsTab.zipBox.sendKeys(ZIP);
        BrowserUtils.sleep(4);
        contactsTab.tinBox.clear();
        contactsTab.tinBox.sendKeys(TIN);

    }


    @Then("I click the save button and sees his or her name {string} in the title")
    public void iClickTheSaveButtonAndSeesHisOrHerNameInTheTitle(String contact) {
        contactsTab.saveBtn.click();
        BrowserUtils.sleep(3);
        System.out.println(Driver.getDriver().getTitle());
        BrowserUtils.sleep(3);
        System.out.println(contactsTab.contactsNameElement.getText());
        contactsTab.contactsNameElement.isDisplayed();
    }


    @And("I click the contact written as in the search result.")
    public void iClickTheContactWrittenAsInTheSearchResult() {
        BrowserUtils.sleep(3);
        contactsTab.theContact.click();

        //contactsTab.contactInTheSearchResult(contact).click();

    }


    @Then("I delete the existing contact by clicking delete button.")
    public void iDeleteTheExistingContactByClickingDeleteButton() {

        BrowserUtils.sleep(3);
        contactsTab.ActionBtn.click();
        contactsTab.deleteTheContact.click();
        BrowserUtils.sleep(3);
        contactsTab.OKBtn2DeleteTheContact.click();


        BrowserUtils.sleep(3);
        System.out.println(Driver.getDriver().getTitle());

        Assert.assertTrue("Contacts - Odoo".equals(Driver.getDriver().getTitle()));
    }

    @And("I find the {string} in a list and  delete it")
    public void findTheInAList(String contact) {
        BrowserUtils.sleep(3);
        List<WebElement> contacts = contactsTab.allContacts;
        for (WebElement each : contacts) {
            System.out.println(each.getText());

            if (each.getText().contains(contact)) {
                each.click();
                break;
            }
        }
        BrowserUtils.sleep(3);
        contactsTab.ActionBtn.click();
        contactsTab.deleteTheContact.click();
        BrowserUtils.sleep(3);
        contactsTab.OKBtn2DeleteTheContact.click();


        BrowserUtils.sleep(3);
        System.out.println(Driver.getDriver().getTitle());

        Assert.assertTrue("Contacts - Odoo".equals(Driver.getDriver().getTitle()));

    }

    @And("I upload my profile picture and save it")
    public void iUploadMyProfilPictureAndSaveIt() {
        BrowserUtils.sleep(3);
        contactsTab.clearThePhoto.click();
        BrowserUtils.sleep(4);
        contactsTab.editPicture.sendKeys("C:\\Users\\bulen\\OneDrive\\Desktop\\night.jpg");
        Driver.getDriver().navigate().refresh();
        BrowserUtils.sleep(3);
        contactsTab.saveBtn.click();


    }
}
