@Login
Feature: Login to Salesforce application as a user

@TC1_Login_As_Test_User
Scenario: Login as Test user
Given I navigate to salesforce login page through chrome browser "https://login.salesforce.com/?locale=au"
Then I see username and password textbox
Then I see login button
When I enter username "Test" and password "password"
When I click login button
Then I see salesforce home page

@TC2_Login_As_Admin_User
Scenario: Login as Admin user
Given I navigate to salesforce login page through chrome browser "https://login.salesforce.com/?locale=au"
Then I see username and password textbox
Then I see login button
When I enter username "Admin" and password "password"
When I click login button
Then I see salesforce home page
