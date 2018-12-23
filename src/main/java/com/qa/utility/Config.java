package com.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {

	public static String appURL = getProperty("appURL");
	public static String browserType = getProperty("browserType");
	public static String browserDriverPath = getProperty("browserDriverPath");

	public static String getProperty(String key) {
		Properties prop = new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream("./src/test/resources/config/config.properties");
			try {
				prop.load(file);
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

}
