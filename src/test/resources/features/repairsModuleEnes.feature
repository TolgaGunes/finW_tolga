@FNW-539
Feature: FinWorks repair feature

  AC:
  1- User first lands on Repairs Orders page
  2- User can access the existing Repair Orders
  3- User can edit the existing Repair Orders
  4- User can create a new Repair Order
  5- User can fill in the Repair Order form

  Background: User is on repairs order page
    Given user is on login page
    Then user enters username "posmanager10@info.com" and "posmanager" and clicks login button
    And user is able access his account and see his inbox
    Then user clicks on repair in the site navigation menu bar

  @accessRepairOrders
  Scenario: User is able to access existing repair orders
    Given user is on the repair page
    And user clicks on specific product to repair
    Then user is able to see repair details

  @editRepairOrders
  Scenario: User can edit the existing Repair Orders
    Given user clicks on specific product to repair
    When user clicks on product to repair which is supposed to be edited
    And user clicks on Edit Button
    And user is able to change given information or add details to the repair order
    Then user can save the changed order

  @createRepairOrder
  Scenario: User can create a new Repair Order
    Given user clicks on Create button
    And enters quantity "2"
    Then save repair order
