@Login
Feature: Login to Salesforce application as a user

  Background: 
    Given I navigate to salesforce login page through chrome browser "https://login.salesforce.com/?locale=au"
    Then I see username and password textbox
    Then I see login button
    When I enter username "<UserName>" and password "<Passowrd>"
	    |UserName|Password|
	    |Test|password|
	    |Admin|Password1|
    When I click login button

  @TC1_Login_As_Test_User1
  Scenario: Login as Test user
    Then I see salesforce Testuser home page

  @TC2_Login_As_Admin_User1
  Scenario: Login as Admin user
    Then I see salesforce AdminUser home page
