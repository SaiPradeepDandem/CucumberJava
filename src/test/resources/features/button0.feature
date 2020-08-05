Feature: This is feature for button 0

  Background:
    Given this app is opened

  Scenario: Button0 scenario
    Given the mouse is on button 0
    When the mouse clicks
    Then the label in 0 should be "Clicked Button 0"