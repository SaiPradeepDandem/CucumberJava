Feature: This is feature for button 3

  Background:
    Given this app is opened

  Scenario: Button1 scenario
    Given the mouse is on button 3
    When the mouse clicks
    Then the label in 3 should be "Clicked Button 3"