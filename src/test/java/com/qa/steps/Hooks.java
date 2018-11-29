package com.qa.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import static com.qa.driver.DriverManager.*;
import static com.qa.utility.Config.*;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;

	@Before()
	public void setUpDriver() {
		System.out.println("start-Before cucumber hooks");
		driver = initializeDriver();
		driver.get(appURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("end-Before cucumber hooks");
	}

	@After()
	public void closeDriver() {
		System.out.println("start-After cucumber hooks");
		driver.quit();
		System.out.println("end-After cucumber hooks");
	}

}
