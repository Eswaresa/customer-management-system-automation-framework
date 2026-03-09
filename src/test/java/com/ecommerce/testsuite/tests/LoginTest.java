package com.ecommerce.testsuite.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.testsuite.basetest.Basetest;
import com.ecommerce.testsuite.config.ConfigReader;
import com.ecommerce.testsuite.page.LoginPage;
import com.ecommerce.testsuite.utils.WaitUtils;

public class LoginTest extends Basetest {

	LoginPage lp;

	@BeforeMethod
	public void initpage() {
		lp = new LoginPage(driver);
	}

	@Test
	public void LoginTestPositiveTC() throws IOException {
		ConfigReader config = new ConfigReader();

		String username = config.getuserName();
		String password = config.getPassword();

		lp.loginUsername(username);
		lp.loginPassword(password);
		lp.loginbtn();
		WaitUtils.waitForTitle(driver, "Swag Labs", 7);

		String title = driver.getTitle();

		Assert.assertEquals(title, "Swag Labs");

	}

}
