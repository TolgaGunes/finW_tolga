package com.finWorks.step_defs;

import com.finWorks.pages.BasePage;
import com.finWorks.pages.LoginPage_Walid;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Contact_Step_definitions_Walid {
    @Given("I am logged in as sales manger_WH")
    public void i_am_logged_in_as_sales_manger_wh() {
        new LoginPage_Walid().loginAsSalesManager();

    }
    @Then("i navigate to contact modules_WH")
    public void i_navigate_to_contact_modules_wh() {
        new BasePage().navigateTo("contacts");
    }
    @Then("I click on create button_WH")
    public void i_click_on_create_button_wh() {

    }
    @Then("i fill the form_WH")
    public void i_fill_the_form_wh() {

    }
    @Then("i save it_WH")
    public void i_save_it_wh() {

    }


}
