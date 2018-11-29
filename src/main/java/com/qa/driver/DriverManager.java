package com.qa.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.utility.Config;

public class DriverManager {

	public static WebDriver driver;

	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static String DRIVER_PATH = "";

	public static WebDriver initializeDriver() {

		if (Config.browserType.equalsIgnoreCase("chrome")) {
			DRIVER_PATH = PROJECT_PATH + Config.browserDriverPath + "chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
			driver = new ChromeDriver();
		} else if (Config.browserType.equalsIgnoreCase("firefox")) {
			DRIVER_PATH = PROJECT_PATH + Config.browserDriverPath + "geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", DRIVER_PATH);
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
