Feature: Logout feature

  USER STORY:
  As a logged in user I should be able to logout.

  @wip @regression  @smoke
  Scenario: AC: Verify that I can logout by clicking the  button in the profile dropdown menu.
    Given user enters username "salesmanager15@info.com"
    Given user enters password "salesmanager"
    When  user  clicks the loggin button
    And user is logged in
    And user clicks the dropdown profile menu
    And user clicks the logout button
    Then user returns to the login page
