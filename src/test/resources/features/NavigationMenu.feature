@navigate
Feature: Navigation Menu
  @vehicles @sales_manager @smoke
  Scenario: Navigating Fleet -- Vehicles
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Fleet, Vehicles
    Then the title should be Vehicles
  @campaigns @db
  Scenario: Navigating Marketing -- Campaigns
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Marketing, Campaigns
    Then the title should be Campaigns
  @calender_events
  Scenario: Navigating Activities -- Calender Events
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Activities, Calender events
    Then the title should be Calender
