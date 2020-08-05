Feature: This is feature for button 9

  Background:
    Given this app is opened

  Scenario: Button9 scenario
    Given the mouse is on button 9
    When the mouse clicks
    Then the label in 9 should be "Clicked Button 9"