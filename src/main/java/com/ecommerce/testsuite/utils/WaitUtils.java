package com.ecommerce.testsuite.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	public static void waitForElementVisible( WebDriver driver, WebElement element, int time) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public static void waitForTitle(WebDriver driver, String title, int time) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	    wait.until(ExpectedConditions.titleContains(title));
	}
	
	
	
}
