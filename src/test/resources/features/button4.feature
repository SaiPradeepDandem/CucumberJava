Feature: This is feature for button 4

  Background:
    Given this app is opened

  Scenario: Button1 scenario
    Given the mouse is on button 4
    When the mouse clicks
    Then the label in 4 should be "Clicked Button 4"