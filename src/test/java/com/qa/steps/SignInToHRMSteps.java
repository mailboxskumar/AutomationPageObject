package com.qa.steps;

import org.apache.log4j.Logger;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInToHRMSteps {

	Logger logger = Logger.getLogger(HooksSteps.class);
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();

	@Given("^I am in HRM portal login Page$")
	public void i_am_in_HRM_portal_login_Page() {

		if (loginPage.isUserNameTextBoxDisplayed()) {
			logger.info(">>> Orange HRM login page is displayed");
		} else {
			logger.info(">>> Orange HRM login page is not displayed");
		}
	}

	@Then("^I enter HRM username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_HRM_username_and_password(String userName, String password) {
		loginPage.enterLoginCredentials(userName, password);
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() {
		loginPage.clickLoginButton();
	}

	@Then("^I should be in HRM portal dashboard page$")
	public void i_should_be_in_HRM_portal_dashboard_page() {
		if (homePage.isWelcomeUserLableDisplayed())
			logger.info(">>> User successfuly logged into Orange HRM application");
		else
			logger.info(">>> User unable logged into Orange HRM application");
	}

}
