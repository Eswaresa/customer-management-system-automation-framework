package com.ecommerce.testsuite.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

	public static String captureScreenshot(WebDriver driver, String testName) {

		String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		
		File folder = new File(System.getProperty("user.dir") + "/screenshots");
		if (!folder.exists()) {
		    folder.mkdir();
		}

		String path = System.getProperty("user.dir") + "/screenshots/" + testName + "_" + timeStamp + ".png";

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path);

		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return path;
	}

}
