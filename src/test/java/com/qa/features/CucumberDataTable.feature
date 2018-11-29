@DataTable
Feature: Login to Salesforce application as a user

  Scenario: 
    Given I navigate to salesforce login page through chrome browser "https://login.salesforce.com/?locale=au"
    Then I see username and password textbox
    Then I see login button
    When I type username and password
	    |Test|password|
	    |Admin|Password1|
    When I click login button