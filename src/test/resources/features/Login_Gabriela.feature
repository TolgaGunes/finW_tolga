Feature: Login feature
  USER STORY
  As a registered user I should be able to login to my account so that I can use the modules

  Background: user is on the login page
    Given  user is on the login page
  @smoke
  Scenario Outline: AC1 - Verify that I can login with valid credentials.

    When user enters the username "<userName>"
    And user enters the password "<password>"
    And user clicks the login button
    Then user should see the dashboard



    Examples: valid credentials
      | userType               | userName                   | password         |
      | Sales manager          | salesmanager15@info.com    | salesmanager     |
      | Point of Sales Manager | posmanager10@info.com      | posmanager       |
      | Inventory Manager      | imm10@info.com             | inventorymanager |
      | Expenses Manager       | expensesmanager10@info.com | expensesmanager  |
      | Manufacturing User     | Manufacturing User         | manufuser        |


  Scenario Outline:  AC2 - Verify that I can not login with invalid credentials. Negative scenario

    When user enters a invalid  username "<userName>"
    And user enters a invalid password "<password>"
    And user clicks the login button
    Then user should not be able to login

    Examples: invalid credentials
      | userType               | userName                   | password        |
      | Sales manager          | salesmanager135@info.com    | salesmanager    |
      | Point of Sales Manager | posmanager210@info.ac       | posmanager      |
      | Inventory Manager      | imm210@info.com             | inventoryman123 |
      | Expenses Manager       | expensesmanager210@info.com | expenses!ABC    |
      | Manufacturing User     | Manufacturing User         |                 |



  Scenario Outline:  AC3 - Verify that I got error message when I enter wrong credentials.


    When user enters incorrect  username "<incorrectUserName>"
    And user enters incorrect password "<incorrectPassword>"
    And user clicks the login button
    Then user should get an incorrect credentials  message

    Examples: invalid credentials
      | userType               | userName                   | password        |
      | Sales manager          | salesmanager135@info.com    | salesmanager    |
      | Point of Sales Manager | posmanager210@info.ac       | posmanager      |
      | Inventory Manager      | imm210@info.com             | inventoryman123 |
      | Expenses Manager       | expensesmanager210@info.com | expenses!ABC    |
      | Manufacturing User     | Manufacturing User         |                 |



  Scenario: AC4: Verify that I got message if I leave empty any of credentials.

    When user does not enter a username ""
    And user does not enter a password ""
    And user clicks the login button
    Then user should not be able to login and get a warning message