# new feature
# Tags: optional

@smoke
Feature: Search functioanlity


Background:
  Given the user has already navigated to the site


  Scenario: Medium search scenario

    Given the medium site is up
    When the onezero button is clicked
    Then the results are displayed


  Scenario: Medium search scenario 2

    Given the medium site is up
    When the onezero button is clicked
    Then the results are displayed