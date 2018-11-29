package com.qa.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.driver.DriverManager;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver = DriverManager.driver;

	@Given("^I navigate to salesforce login page through chrome browser \"([^\"]*)\"$")
	public void loginApplication(String appUrl) throws Throwable {
		System.out.println("Test12234");
	}

	@Given("^As a user I am salesforce login page$")
	public void as_a_user_I_am_salesforce_login_page() throws Throwable {
		if (driver.findElement(By.id(LoginPage.userName_ID)).isDisplayed()) {
			System.out.println("I  am in salesforce login page");
		} else {
			System.out.println("FAILED!! I am not in salesforce login page");
		}
	}

	@When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_username_something_and_password_something(String userName, String password) throws Throwable {

		driver.findElement(By.id(LoginPage.userName_ID)).sendKeys(userName);
		driver.findElement(By.id(LoginPage.password_ID)).sendKeys(password);
	}

	@When("^I type username and password$")
	public void i_type_username_and_password(DataTable dataTable) throws Throwable {
		List<List<String>> dataList = dataTable.raw();
		int count = dataList.size();

		String userName = dataList.get(0).get(0);
		String password = dataList.get(0).get(1);

		driver.findElement(By.id(LoginPage.userName_ID)).sendKeys(userName);
		driver.findElement(By.id(LoginPage.password_ID)).sendKeys(password);

	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		driver.findElement(By.xpath(LoginPage.login_Xpath)).click();

	}

	@Then("^I see username and password textbox$")
	public void i_see_username_and_password_textbox() throws Throwable {
		if (driver.findElement(By.id(LoginPage.userName_ID)).isDisplayed()) {
			System.out.println("Username Text box exist in login page");
		}

		if (driver.findElement(By.id(LoginPage.password_ID)).isDisplayed()) {
			System.out.println("password Text box exist in login page");
		}
	}

	@Then("^I see login button$")
	public void i_see_login_button() throws Throwable {
		if (driver.findElement(By.xpath(LoginPage.login_Xpath)).isDisplayed()) {
			System.out.println("login button box exist in login page");
		}
	}

	@Then("^I see salesforce home page$")
	public void i_see_salesforce_home_page() throws Throwable {
		if (driver.findElement(By.id(HomePage.homePage_Icon_ID)).isDisplayed()) {
			System.out.println("user successfuly landed into homepage");
		}

	}

}
