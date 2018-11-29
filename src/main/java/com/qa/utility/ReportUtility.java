package com.qa.utility;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportUtility {

	static Logger logger = Logger.getLogger(ReportUtility.class);

	static ExtentHtmlReporter htmlReporter;
	static ExtentReports report;

	public static ExtentReports setupReport() {
		htmlReporter = new ExtentHtmlReporter("./Reports/extentReports/extentReport.html");
		htmlReporter.config().setTheme(Theme.DARK);
		report = new ExtentReports();
		report.attachReporter(htmlReporter);
		return report;
	}

	public static ExtentTest createTest(ExtentReports report, String testCaseName) {
		ExtentTest test = report.createTest(testCaseName);
		return test;
	}

	public static void setLogStatus(ExtentTest test, String status, String message) {
		if (status.equalsIgnoreCase("Info"))
			test.log(Status.INFO, message);
		else if (status.equalsIgnoreCase("Warning"))
			test.log(Status.WARNING, message);
		else if (status.equalsIgnoreCase("Pass")) {
			test.log(Status.PASS, message);
			try {
				String imagePath = System.getProperty("user.dir") + "\\Reports\\Screenshot.png";
				logger.info(imagePath);
				test.pass("Pass", MediaEntityBuilder.createScreenCaptureFromPath(imagePath).build());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (status.equalsIgnoreCase("Fail"))
			test.log(Status.FAIL, message);
		else if (status.equalsIgnoreCase("Error"))
			test.log(Status.ERROR, message);
	}

	public static void flushReport(ExtentReports report) {
		report.flush();
	}
}
