Feature: Create a new Repair Order

  User Story: As the FinWorks Repair application allows you to manage a complete after-sales process,
  but also to simply repair products you have manufactured, if they present a defect. Once in the application:
  1- User should be able to access the existing Repair Orders.
  2- User should be able to create a new Repair Order, when a customer sends a product for repair.
  User fills in the Repair Order with all the information s/he may need such as the product, the customer,
  if it has to be invoiced after or before the repair, the parts needed, etc.

  Acceptance Criteria:
  1- User first lands on Repairs Orders page
  2- User can access the existing Repair Orders
  3- User can edit the existing Repair Orders
  4- User can create a new Repair Order
  5- User can fill in the Repair Order form
  Background: For the scenarios in the feature file,user is expected to be on login page
    Given I logged into twiliaERP


  Scenario: Verify that user can access the existing repair Orders
    When I click the Repairs Module
    Then I click the Create Button
    Then I can access the Repairs Orders

  Scenario: Verify that user can create a new Repair Order
    Given I am on Repair Orders
    When I click the Create Repair Order Button
    Then Repair Orders new window opens
    And I choose product
    And I type the product quantity
    And I choose invoice method
    Then I choose customer click the save button

  Scenario: Verify that user can edit the existing repair orders
    Given I am on Repair Orders
    When I type an existing repair oder in the search box and enter
    Then the existing repair order is listed
    And I click it
    Then the existing repair order opens in a new pop up
    And I click the edit button
    And I edit x and y
    Then I click the save button and sees his or her name {string} in the title
