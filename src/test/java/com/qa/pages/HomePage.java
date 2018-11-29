package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.driver.DriverManager;

public class HomePage extends DriverManager{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "welcome")
	@CacheLookup
	WebElement lblWelcomeUser;

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement menuAdmin;
	
	public boolean isWelcomeUserLableDisplayed() {
		boolean flag = false;
		if (lblWelcomeUser.isDisplayed()) {
			flag = true;
		}
		return flag;
	}
}
