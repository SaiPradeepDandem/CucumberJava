Feature: This is feature for button 5

  Background:
    Given this app is opened

  Scenario: Button1 scenario
    Given the mouse is on button 5
    When the mouse clicks
    Then the label in 5 should be "Clicked Button 5"