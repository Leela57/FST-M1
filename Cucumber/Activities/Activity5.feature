@activity5
Feature: Data driven test with Example

  Scenario Outline: Testing Login with Example
    Given User5 is on Login page
    When User5 enters "<Usernames>" and "<Passwords>"
    Then Read the page title and confirmation message5
    And Close the Browser5

    Examples:
      | Usernames | Passwords |
      | admin     | password  |
      | adminUser | Password  |
