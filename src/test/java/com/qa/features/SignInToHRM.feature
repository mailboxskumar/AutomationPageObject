@HRM
Feature: As a user I want to login to Orange HRM portal
  
  @HRMRegression1
  Scenario: As a admin user want to login in Orange HRM portal
    Given I am in HRM portal login Page
    Then I enter HRM username "Admin" and password "admin123"
    When I click on login button
    Then I should be in HRM portal dashboard page
    