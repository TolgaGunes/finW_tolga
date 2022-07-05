
Feature: FinWork logout test

  @FNW-522
  Scenario: Verify that user can log out via the logout button in the profile dropdown menu
    Given User enters username "salesmanager15@info.com" password "salesmanager" and logins
    When Login to FinWork account successfully
    And Able to click on the profile dropdown menu
    And Able to click on Logout item
    And Able to redirect page to login page after logout successfully