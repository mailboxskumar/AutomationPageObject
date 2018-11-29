package com.qa.steps;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import static com.qa.driver.DriverManager.*;
import static com.qa.utility.Config.*;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;
	Logger logger = Logger.getLogger(Hooks.class);

	@Before()
	public void setUpDriver() {
		logger.info(">>> @Before Hook Step Starts");
		BasicConfigurator.configure();
		driver = initializeDriver();
		driver.get(appURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		logger.info(">>> @Before Hook Step ends");
	}

	@After()
	public void closeDriver() {
		logger.info(">>> @After Hook Step Starts");
		driver.quit();
		logger.info(">>> @After Hook Step ends");
	}

}
