Feature: This is feature for button 2

  Background:
    Given this app is opened

  Scenario: Button2 scenario
    Given the mouse is on button 2
    When the mouse clicks
    Then the label in 2 should be "Clicked Button 2"