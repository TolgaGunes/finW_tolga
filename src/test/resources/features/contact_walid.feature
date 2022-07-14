
#1- Verify that user is logged in and navigates to Contacts page
#2- Verify that user creates a new contact
  Feature: Contact feature
    Scenario: User navigates to contact module and create a new contact
      Given I am logged in as sales manger_WH
      Then i navigate to contact modules_WH
      And I click on create button_WH
      And i fill the form_WH
      Then i save it_WH