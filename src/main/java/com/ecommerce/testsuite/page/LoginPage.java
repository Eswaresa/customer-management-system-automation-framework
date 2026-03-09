package com.ecommerce.testsuite.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ecommerce.testsuite.utils.WaitUtils;

public class LoginPage {

	WebDriver driver;

	By UserName = By.id("user-name");
	By Password = By.id("password");
	By InvalidUserName = By.id("user-name");
	By InvalidPassword = By.id("password");
	By ClickBtn = By.id("login-button");
	By ProductTitle = By.className("title");

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public void loginUsername(String user) {
		driver.findElement(UserName).sendKeys(user);;
	}

	public void loginPassword(String pass) {
		driver.findElement(Password).sendKeys(pass);;
	}

	public void loginInvalidUsername(String invalidUser) {
		driver.findElement(InvalidUserName).sendKeys(invalidUser);;
	}

	public void loginInvalidPassword(String invalidPass) {
		driver.findElement(InvalidPassword).sendKeys(invalidPass);;
	}

	public void loginbtn() {
		driver.findElement(ClickBtn).click();
	}

	public String getProductPageTitle() {

		WebElement title = driver.findElement(ProductTitle);
		WaitUtils.waitForElementVisible(driver, title, 7);

		return title.getText();

	}

}
