package com.finWorks.step_defs;

import com.finWorks.pages.RepairsModulePagesEnes;
import com.finWorks.utilties.BrowserUtils;
import com.finWorks.utilties.ConfigurationReader;
import com.finWorks.utilties.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class RepairsModuleStepDefinitions_Enes {
    RepairsModulePagesEnes repairsModulePagesEnes = new RepairsModulePagesEnes();


    //-----Background-----//

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webUrl"));
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("user enters username {string} and {string} and clicks login button")
    public void userEntersUsernameAndAndClicksLoginButton(String username, String password) {
        repairsModulePagesEnes.inputUsername.sendKeys(username);
        repairsModulePagesEnes.inputPassword.sendKeys(password);
        repairsModulePagesEnes.loginButton.click();
    }

    @Then("user is able access his account and see his inbox")
    public void user_is_able_access_his_account_and_see_his_inbox() {
        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("user clicks on repair in the site navigation menu bar")
    public void user_clicks_on_repair_in_the_site_navigation_menu_bar() {
        if(repairsModulePagesEnes.repairNavigationBarFromButton.isDisplayed()){
            repairsModulePagesEnes.repairNavigationBarFromButton.click();
        }else{
            repairsModulePagesEnes.repairNavigationBarFromDropdown.click();
        }

    }


    //-----Scenario 1-----//

    @Given("user is on the repair page")
    public void userIsOnTheRepairPage() {
        Assert.assertTrue(repairsModulePagesEnes.repairOrdersPageHeader.isDisplayed());
    }


    @And("user clicks on specific product to repair")
    public void userClicksOnSpecificProductToRepair() {
        repairsModulePagesEnes.firstRepairOrder.click();
    }

    @Then("user is able to see repair details")
    public void userIsAbleToSeeRepairDetails() {
        Assert.assertTrue(repairsModulePagesEnes.repairReference.isDisplayed());
    }


    //-----Scenario 2-----//

    @When("user clicks on product to repair which is supposed to be edited")
    public void userClicksOnWhichIsSupposedToBeEdited() {
        repairsModulePagesEnes.productToRepair.click();
    }

    @And("user clicks on Edit Button")
    public void userClicksOnEditButton() {
        repairsModulePagesEnes.editButton.click();
    }

    @And("user is able to change given information or add details to the repair order")
    public void userIsAbleToChangeGivenInformationOrAddDetailsToTheRepairOrder() {

        BrowserUtils.doubleClick(repairsModulePagesEnes.repairReferenceField);
        repairsModulePagesEnes.repairReferenceField.sendKeys(Keys.BACK_SPACE);
        repairsModulePagesEnes.repairReferenceField.sendKeys("TestReference");
    }

    @Then("user can save the changed order")
    public void userCanSaveTheChangedOrder() {
        repairsModulePagesEnes.saveEdit.click();
    }


    //-----Scenario 3-----//

    @Given("user clicks on Create button")
    public void userClicksOnCreateButton() {
        repairsModulePagesEnes.createButton.click();
    }


    @And("enters quantity {string}")
    public void entersProductToRepair(String quantity) {
        repairsModulePagesEnes.quantityField.click();
        repairsModulePagesEnes.quantityField.sendKeys(quantity);
    }

    @Then("save repair order")
    public void saveRepairOrder() {
        repairsModulePagesEnes.saveButton.click();
    }
}
