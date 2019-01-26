package com.qa.steps;

import static com.qa.utility.Config.appURL;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.qa.driver.DriverManager;
import com.qa.utility.ReportUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends DriverManager{

	public static WebDriver hdriver;
	Logger logger = Logger.getLogger(Hooks.class);

	@Before()
	public void setUpDriver() {
		logger.info(">>> @Before Hook Step Starts");
		BasicConfigurator.configure();
		hdriver = initializeDriver();
		hdriver.get(appURL);
		hdriver.manage().window().maximize();
		hdriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		logger.info(">>> @Before Hook Step ends");
	}

	@After()
	public void closeDriver() {
		logger.info(">>> @After Hook Step Starts");
		hdriver.quit();
		logger.info(">>> @After Hook Step ends");
		
		
	}

}
