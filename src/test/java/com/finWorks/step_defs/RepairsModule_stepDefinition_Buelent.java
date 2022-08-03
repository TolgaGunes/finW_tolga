package com.finWorks.step_defs;

import com.finWorks.pages.*;
import com.finWorks.utilties.BrowserUtils;
import com.finWorks.utilties.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class RepairsModule_stepDefinition_Buelent {
    LoginPage_Buelent loginPage = new LoginPage_Buelent();
    BasePage_Buelent basePage = new BasePage_Buelent();
    ContactsTab_Buelent contactsTab = new ContactsTab_Buelent();
    RepairsPageBuelent repairsPage = new RepairsPageBuelent();
    NewRepairOrderWindowBuelent repairOrder = new NewRepairOrderWindowBuelent();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @When("I click the Repairs Module")
    public void iClickTheRepairsModule() {
        BrowserUtils.sleep(1);
        basePage.repairsTab.click();

    }

    @When("I click the Create Button")
    public void iClickTheCreateButton() {
        repairsPage.createBtn.click();

    }

    @Then("I can access the Repairs Orders")
    public void iCanAccessTheRepairsOrders() {
        wait.until(ExpectedConditions.visibilityOf(repairsPage.repairReference));
        assertTrue(repairsPage.repairReference.isDisplayed());

    }

    @Given("I am on Repair Orders")
    public void iAmOnRepairOrders() {
        basePage.repairsTab.click();
        wait.until(ExpectedConditions.visibilityOf(repairsPage.repairsOrder));
        System.out.println(repairsPage.repairsOrder.getText());

        assertTrue(Driver.getDriver().getTitle().equals("Repair Orders - Odoo"));

    }


    @When("I click the Create Repair Order Button")
    public void iClickTheCreateRepairOrderButton() {

        repairsPage.createBtn.click();
        BrowserUtils.sleep(2);

    }


    @Then("Repair Orders new window opens")
    public void repairOrdersNewWindowOpens() {
        BrowserUtils.sleep(1);
        wait.until(ExpectedConditions.visibilityOf(repairsPage.repairReference));
        System.out.println(Driver.getDriver().getTitle());
        assertTrue(repairsPage.repairReference.isDisplayed());


    }

    @And("I choose product")
    public void iChooseProduct() {
        repairOrder.product2Repair.click();
        repairOrder.tshirt.click();
    }


    @And("I type the product quantity")
    public void iTypeTheProductQuantity() {
        repairOrder.quantity.clear();
        repairOrder.quantity.sendKeys("10");

    }


    @And("I choose invoice method")
    public void iChooseInvoiceMethod() {
        repairOrder.invoiceMethod.click();
        BrowserUtils.sleep(1);
        repairOrder.invoiceType(2);

    }


    @Then("I choose customer click the save button")
    public void iChooseCustomer() {
        repairOrder.customer.click();
        BrowserUtils.sleep(2);
        repairOrder.clickTheCustomer.click();

        // repairOrder.searchCustomer.click();
        // contactsTab.searchBox.sendKeys("Bulent Kaya"+ Keys.ENTER);
        //  repairOrder.clickTheResult.click();
        contactsTab.saveBtn.click();
        BrowserUtils.sleep(3);

    }


    @When("I type an existing repair oder in the search box and enter")
    public void iTypeAnExistingRepairOderInTheSearchBoxAndEnter() {

    }

    @Then("the existing repair order is listed")
    public void theExistingRepairOrderIsListed() {

    }

    @And("I click it")
    public void iClickIt() {

    }

    @Then("the existing repair order opens in a new pop up")
    public void theExistingRepairOrderOpensInANewPopUp() {

    }

    @And("I edit x and y")
    public void iEditXAndY() {

    }

    @Then("I click the save button and sees his or her name \\{string} in the title")
    public void iClickTheSaveButtonAndSeesHisOrHerNameStringInTheTitle() {
    }


}
