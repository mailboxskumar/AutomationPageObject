package com.qa.steps;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.qa.driver.DriverManager;

import static com.qa.driver.DriverManager.*;
import static com.qa.utility.Config.*;

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
		
		/*initializeDriver();
		driver.get(appURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);*/
		
		
		logger.info(">>> @Before Hook Step ends");
	}

	@After()
	public void closeDriver() {
		logger.info(">>> @After Hook Step Starts");
		hdriver.quit();
		logger.info(">>> @After Hook Step ends");
	}

}
