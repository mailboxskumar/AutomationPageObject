package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.driver.DriverManager;

public class HomePage extends DriverManager {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "welcome")
	@CacheLookup
	WebElement lblWelcomeUser;

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement menuAdmin;

	@FindBy(id = "menu_pim_viewPimModule")
	WebElement elePimMenu;

	public void clickOnPimMenu() {
		elePimMenu.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public boolean isWelcomeUserLableDisplayed() {
		boolean flag = false;
		if (lblWelcomeUser.isDisplayed()) {
			flag = true;
		}
		return flag;
	}
}
