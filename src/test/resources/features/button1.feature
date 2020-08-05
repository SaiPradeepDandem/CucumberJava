Feature: This is feature for button 1

  Background:
    Given this app is opened

    @B1
  Scenario: Button1 scenario
    Given the mouse is on button 1
    When the mouse clicks
    Then the label in 1 should be "Clicked Button 1"