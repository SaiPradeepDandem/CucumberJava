Feature: This is feature for button 6

  Background:
    Given this app is opened

  Scenario: Button6 scenario
    Given the mouse is on button 6
    When the mouse clicks
    Then the label in 6 should be "Clicked Button 6"