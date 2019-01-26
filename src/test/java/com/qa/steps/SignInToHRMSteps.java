package com.qa.steps;

import org.apache.log4j.Logger;
import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.qa.driver.DriverManager;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import static com.qa.utility.ReportUtility.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInToHRMSteps {

	Logger logger = Logger.getLogger(HooksSteps.class);

	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();

	ExtentTest test = createTest(getExtentReports(), "Login to Application");

	@Given("^I am in HRM portal login Page$")
	public void i_am_in_HRM_portal_login_Page() {

		if (loginPage.isUserNameTextBoxDisplayed()) {
			logger.info(">>> Orange HRM login page is displayed");
			setLogStatus(test, "Pass", "Orange HRM login page is displayed");
		} else {
			logger.info(">>> Orange HRM login page is not displayed");
			setLogStatus(test, "Fail", "Orange HRM login page is not displayed");
		}
	}

	@Then("^I enter HRM username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_HRM_username_and_password(String userName, String password) {
		loginPage.enterLoginCredentials(userName, password);
		setLogStatus(test, "Info", "Login credentias entered");
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() {
		loginPage.clickLoginButton();
		setLogStatus(test, "Info", "Clicked on login button");
	}

	@Then("^I should be in HRM portal dashboard page$")
	public void i_should_be_in_HRM_portal_dashboard_page() {
		if (homePage.isWelcomeUserLableDisplayed()) {
			logger.info(">>> User successfuly logged into Orange HRM application");
			setLogStatus(test, "Pass", "Orange HRM home page is displayed");
		} else {
			logger.info(">>> User unable logged into Orange HRM application");
			setLogStatus(test, "fail", "Orange HRM home page is not displayed");
		}
	}
	
	@Then("^I should see the title of the page is \"([^\"]*)\"$")
	public void i_should_see_the_title_of_the_page_is(String title) throws Throwable {
		if(DriverManager.driver.getTitle().contains("Sanjay")) {
			setLogStatus(test, "Pass", "Portal title is correct");
		}else {
			setLogStatus(test, "Fail", "Portal title is not correct");
			Assert.assertTrue(false);
		}
	}

}
