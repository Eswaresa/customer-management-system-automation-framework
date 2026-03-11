package com.ecommerce.testsuite.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	
	public static ExtentReports getExtendReport() {
		ExtentSparkReporter spark = new ExtentSparkReporter("reports/ExtentReport.html");
		spark.config().setReportName("reports/ExtentReport.html");
		spark.config().setReportName("Automation Test Results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		
		return extent;
	}

}
