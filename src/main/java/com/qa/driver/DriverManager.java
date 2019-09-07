package com.qa.driver;

import static com.qa.utility.Config.browserType;
import static com.qa.utility.Config.chromeDriverVersion;
import static com.qa.utility.Config.firefoxDriverVersion;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	static Logger logger = Logger.getLogger(DriverManager.class);
	public static WebDriver driver;
	public static WebDriver initializeDriver() {
		if (browserType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().arch64().version(chromeDriverVersion).setup();
			driver = new ChromeDriver();
			logger.info(">>> Chrome Driver initialized");
			
		} else if (browserType.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().arch64().version(firefoxDriverVersion).setup();
			driver = new FirefoxDriver();
			logger.info(">>> Firefox Driver initialized");
		}
		return driver;
	}
}
