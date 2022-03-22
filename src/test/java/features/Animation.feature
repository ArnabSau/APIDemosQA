@smoke
Feature: Animation Feature
  Hide-Show Animations

  @animation
  Scenario Outline: Verify Hiding of buttons
    Given User is on home screen
    When User click on Animation
    And User click on Hide-Show Animation
    And User click on Hide(GONE) checkbox
    And User click on "<Button>"
    Then User should not see "<Button>"

    Examples: 
      | Button |
      |      2 |

  @anumation
  Scenario Outline: Verify Showing of buttons
    Given User is on home screen
    When User click on Animation
    And User click on Hide-Show Animation
    And User click on Hide(GONE) checkbox
    And User click on "<Button>"
    And User click Show Buttons
    Then User should see "<Button>"

    Examples: 
      | Button |
      |      2 |
      
