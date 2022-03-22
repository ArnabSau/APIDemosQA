@smoke
Feature: Alert Dialogs Feature
  Alert dialogs feature

  @alert
  Scenario: Verify List Dialogs
    Given User is on home screen
    When User click on App
    And User click on Alert Dialogs
    And User click on LIST DIALOG
    And User select a command
    Then User should get the clicked command as message

  @alert
  Scenario: Verify Single List Dialogs
    Given User is on home screen
    When User click on App
    And User click on Alert Dialogs
    And User click on SINGLE CHOICE LIST
    And User select an option
    And User accept alert
    Then User should see selected option
