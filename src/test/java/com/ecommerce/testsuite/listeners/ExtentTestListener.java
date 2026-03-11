package com.ecommerce.testsuite.listeners;

import org.testng.ITestListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;

import com.aventstack.extentreports.*;

import com.aventstack.extentreports.ExtentReports;
import com.ecommerce.testsuite.utils.DriverFactory;
import com.ecommerce.testsuite.utils.ScreenshotUtil;

public class ExtentTestListener implements ITestListener {

	ExtentReports extent = ExtentManager.getExtendReport();
	ExtentTest test;

	public void onTestStart(ITestResult result) {

		test = extent.createTest(result.getMethod().getMethodName());

	}

	public void onTestSucess(ITestResult result) {
		test.pass("Test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		test.fail(result.getThrowable());

		String screenshotPath = ScreenshotUtil.captureScreenshot(DriverFactory.getDriver(),
				result.getMethod().getMethodName());

		test.addScreenCaptureFromPath(screenshotPath);
	}

	public void onFinish(ITestContext context) {
		extent.flush();

	}
}
