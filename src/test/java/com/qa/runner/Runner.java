package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/com/qa/features" }, 
	glue = { "com.qa.steps" }, 
	plugin = { "pretty","html:target/htmlReport", "json:target/jsonReport/jsonReport.json","junit:target/xmlReport/xmlReport.xml" },
	monochrome = true,
	strict = false,
	dryRun = false,
	tags = "@HRM")

public class Runner {
	
} 
