package com.ecommerce.testsuite.basetest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ecommerce.testsuite.config.ConfigReader;
import com.ecommerce.testsuite.utils.DriverFactory;

public class Basetest {

	protected WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException {
		ConfigReader config = new ConfigReader();
		String Url = config.getURL();

		DriverFactory.initDriver();

		driver = DriverFactory.getDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterMethod
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}

	}
}
