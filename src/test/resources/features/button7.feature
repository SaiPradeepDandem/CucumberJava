Feature: This is feature for button 7

  Background:
    Given this app is opened

  Scenario: Button1 scenario
    Given the mouse is on button 7
    When the mouse clicks
    Then the label in 7 should be "Clicked Button 7"