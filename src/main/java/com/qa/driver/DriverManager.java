package com.qa.driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.utility.Config;

public class DriverManager {

	static Logger logger = Logger.getLogger(DriverManager.class);

	public static WebDriver driver;

	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static String DRIVER_PATH = "";

	public static WebDriver initializeDriver() {

		if (Config.browserType.equalsIgnoreCase("chrome")) {
			DRIVER_PATH = PROJECT_PATH + Config.browserDriverPath + "chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
			driver = new ChromeDriver();
			logger.info(">>> Chrome Driver initialized");
		} else if (Config.browserType.equalsIgnoreCase("firefox")) {
			DRIVER_PATH = PROJECT_PATH + Config.browserDriverPath + "geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", DRIVER_PATH);
			driver = new FirefoxDriver();
			logger.info(">>> Firefox Driver initialized");
		}
		return driver;
	}
}
