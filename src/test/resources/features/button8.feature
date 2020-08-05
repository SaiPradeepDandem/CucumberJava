Feature: This is feature for button 8

  Background:
    Given this app is opened

  Scenario: Button8 scenario
    Given the mouse is on button 8
    When the mouse clicks
    Then the label in 8 should be "Clicked Button 8"