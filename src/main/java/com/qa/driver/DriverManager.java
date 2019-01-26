package com.qa.driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.qa.utility.ReportUtility;

import static com.qa.utility.Config.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	static Logger logger = Logger.getLogger(DriverManager.class);

	public static WebDriver driver;

	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static String DRIVER_PATH = "";
	
	public static WebDriver initializeDriver() {

		if (browserType.equalsIgnoreCase("chrome")) {

			/** Using WebDriverManager to create WebDrive without driver binary */

			// DRIVER_PATH = PROJECT_PATH + Config.browserDriverPath + "chromedriver.exe";
			// System.setProperty("webdriver.chrome.driver", DRIVER_PATH);

			WebDriverManager.chromedriver().arch64().version(chromeDriverVersion).setup();
			driver = new ChromeDriver();
			logger.info(">>> Chrome Driver initialized");
			
		} else if (browserType.equalsIgnoreCase("firefox")) {
			/** Using WebDriverManager to create WebDrive without driver binary */
			
			// DRIVER_PATH = PROJECT_PATH + Config.browserDriverPath + "geckodriver.exe";
			// System.setProperty("webdriver.gecko.driver", DRIVER_PATH);
			
			WebDriverManager.firefoxdriver().arch64().version(firefoxDriverVersion).setup();
			driver = new FirefoxDriver();
			logger.info(">>> Firefox Driver initialized");
		}
		return driver;
	}
}
