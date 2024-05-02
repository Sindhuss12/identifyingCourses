
Feature: Filling the ready to transfer form and printing the error message
  Scenario: Filling the form 
    Given Page is loaded and form is viewed
    When  Form is filled and error message is captured
    Then The page is successfully closed