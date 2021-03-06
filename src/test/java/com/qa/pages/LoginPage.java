package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.driver.DriverManager;

public class LoginPage extends DriverManager {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txtUsername")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(id = "txtPassword")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='btnLogin'] | //input[@id='btnLogin1'] |")
	@CacheLookup
	WebElement btnLogin;

	public boolean isUserNameTextBoxDisplayed() {
		boolean flag = false;
		if (txtUserName.isDisplayed()) {
			flag = true;
		}
		return flag;
	}

	public boolean isPasswordTextBoxDisplayed() {
		boolean flag = false;
		if (txtPassword.isDisplayed()) {
			flag = true;
		}
		return flag;
	}

	public void enterLoginCredentials(String user, String password) {
		txtUserName.sendKeys(user);
		txtPassword.sendKeys(password);
	}

	public void clickLoginButton() {
		btnLogin.click();
	}

}
