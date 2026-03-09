package com.ecommerce.testsuite.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader() throws IOException {

		try {
			FileInputStream fis = new FileInputStream("src\\test\\resources\\config.properties");

			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getURL() {
		return prop.getProperty("URL");

	}

	public String getuserName() {
		return prop.getProperty("username");

	}

	public String getPassword() {
		return prop.getProperty("password");

	}

	public String getInvalidUsername() {
		return prop.getProperty("wrongusername");

	}

	public String getInvalidPassword() {
		return prop.getProperty("wrongpassword");

	}

}
