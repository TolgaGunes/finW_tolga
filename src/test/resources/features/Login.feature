
@wip
Feature: Default

  Background: user is on the login page
    Given user is on the login page of website

  @FNW-512 @FNW-508
  Scenario Outline: User should be able to login using correct credentials
  Positive login scenario
    When user enters username "<userName>"
    And user enters password "<password>"
    And user clicks to login button
    Then user should see the top-bar name "<top-barName>" at top right-hand corner of the page

    Examples: Valid Credentials
      | userName                   | password         | top-barName         |
      | salesmanager15@info.com    | salesmanager     | SalesManager15      |
      | posmanager10@info.com      | posmanager       | POSManager10        |
      | imm10@info.com             | inventorymanager | InventoryManager10  |
      | expensesmanager10@info.com | expensesmanager  | ExpensesManager10   |
      | manuf_user10@info.com      | manufuser        | ManufacturingUser10 |


  @FNW-513 @FNW-508
  Scenario Outline: Verify that user can not login with invalid credentials.(Tolga)
  Negative login scenario

    When user enters invalid username "<userName>"
    And user enters invalid password "<password>"
    And user clicks to login button
    Then user should not log in to the account

    Examples: Invalid Credentials

      | userName                    | password        |
      | salesmanager15@info.com     | sales manager   |
      | ostmanager10@info.com       | postmanager     |
      | imm10@info..com             | inventorymanage |
      | expensesemanager10@info.com | ........        |
      | manu_fuser10@info.com       | #$½#£$#£$       |



  @FNW-514 @FNW-508
  Scenario Outline: Users receive error message when they enter wrong credentials

    When user enters wrong username "<wrongUserName>"
    And user enters wrong password "<wrongPassword>"
    And user clicks to login button
    Then user should receive error message


    Examples: Invalid Credentials

      | wrongUserName               | wrongPassword   |
      | salesmanager15@info.com     | sales manager   |
      | ostmanager10@info.com       | postmanager     |
      | imm10@info..com             | inventorymanage |
      | expensesemanager10@info.com | ......          |
      | manu_fuser10@info.com       | #$½#£$#£$       |

  @FNW-515 @FNW-508
  Scenario: User attempt to login without any credential
    When user do not enters username ""
    And user do not enters password ""
    And user clicks to login button
    Then Then user should see the warning message "<warningMessage>"