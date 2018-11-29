package com.qa.steps;

public class HooksSteps {

	/*WebDriver driver = DriverManager.driver;
	
	Logger logger = Logger.getLogger(HooksSteps.class);

	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() {
		logger.info("Given statement started");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (driver.findElement(By.id(LoginPage.userName_ID)).isDisplayed()) {
			System.out.println("I  am in salesforce login page");
		} else {
			System.out.println("FAILED!! I am not in salesforce login page");
		}
	}

	@When("^I complete action$")
	public void i_complete_action() {
		driver.findElement(By.id(LoginPage.userName_ID)).sendKeys("mailbox.skumar-fwj4@force.com");
		driver.findElement(By.id(LoginPage.password_ID)).sendKeys("salesforce123");

	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() {
		driver.findElement(By.xpath(LoginPage.login_Xpath)).click();
	}
*/
}
