@smoke
Feature: Activity Feature
  Custom title feature

  @activity
  Scenario: Verify Change Left Title
    Given User is on home screen
    When User click on App
    And User click on Activity
    And User click on Custom Title
    And User enter a test in frist edit field
    And User click on Change Left button
    Then User should see the same text on left title

  @activity
  Scenario: Verify Change Right Title
    Given User is on home screen
    When User click on App
    And User click on Activity
    And User click on Custom Title
    And User enter a test in second edit field
    And User click on Change Right button
    Then User should see the same text on right title
