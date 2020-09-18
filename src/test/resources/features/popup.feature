Feature: This is feature for popup

  Background:
    Given this app is opened

  Scenario: Popup scenario
    Given the mouse is on button 22
    When the mouse clicks
    Then the popup "popPane" should be opened