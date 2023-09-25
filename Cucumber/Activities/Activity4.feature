@activity4
Feature: Data driven test without Example

  Scenario: Testing with Data from Scenario
    Given User1 is on Login page1
    When User1 enters "admin" and "password"
    Then Read the page title and confirmation message1
    And  Close the Browser1
