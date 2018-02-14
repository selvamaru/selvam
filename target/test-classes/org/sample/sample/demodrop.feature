@tag
Feature: select 5 countries and verify in demoqa registration page

  @tag1
  Scenario: select 5 countries and verify in demoqa registration page
    Given I am in demoqa registration page
    When I select countries
    Then I verify the selected countries
    

 
