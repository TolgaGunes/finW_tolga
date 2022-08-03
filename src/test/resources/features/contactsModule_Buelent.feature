Feature: Create Contact
  User Story:
  As a user I should be able to create, edit and delete contacts.
  So that I can have contact list
  and I can find the related contact with search option.

  Acceptance Criteria:
  1- User should be able to create a new contact.
  2- User should be able to edit an existing contact.
  3 User should be able to find contact by list view and search box.-
  4 User should be able to delete an existing contact.
  5- Verify that user deletes an existing contact
  @createAndDelete  @FNW-434
  Scenario Outline: Create a Contact
    Given I logged into the twiliaERP
    When I enter "<fullName>", "<phone>" ,"<Mobile>" and "<email>" then save a new contact
    Then I should see contact information for "Bülent Kaya"

    Examples:
      | fullName    | phone         | Mobile        | email              |
      | Bülent Kaya | 0492866287852 | 0491754454695 | bkaya007@gmail.com |


  @createAndDelete  @FNW-435
  Scenario: Verify that I can find contact by list view.
    Given I am on contacts module
    When I click the List icon under the search box to change the view of the contacts in list
    Then I write the name "Bülent KAYA" in the search box and preses enter
    And I navigate to contact "Bülent KAYA" `s info page


  @createAndDelete  @FNW-435
  Scenario Outline: Verify that I can edit an existing contact.
    Given I am on contact`s info page of "<Contact>"
    And I click on the edit button
    And I edit my address by typing "<street>", "<city>" ,"<ZIP>" and "<TIN>"
    Then I click the save button and sees his or her name "<Contact>" in the title

    Examples:
      | Contact     | street        | city      | ZIP   | TIN        |
      | Bülent KAYA | Grüner Weg 12 | Friedberg | 61169 | A017674569 |

  @Ignore
  Scenario: Verify that I can delete an existing contact
    Given I am on contacts module
    When I click the List icon under the search box to change the view of the contacts in list
    Then I write the name "Bülent KAYA" in the search box and preses enter
    And I click the contact written as in the search result.
    Then I delete the existing contact by clicking delete button.
  @createAndDelete @FNW-438
  Scenario:Verify that I can delete an existing contact.
    Given I am on contacts module
    When I click the List icon under the search box to change the view of the contacts in list
    Then I write the name "Bülent Kaya" in the search box and preses enter
    And I find the "Bülent Kaya" in a list and  delete it
