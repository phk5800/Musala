package org.example;

import dataProviders.ConfigFileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

//import dataProviders.ConfigFileReader;

public class TestsBaseClass{
	public final String dataCsvPath = "src/main/resources/data.csv";
	WebDriver driver;
	@BeforeEach
	public void setUp() throws Throwable {
		setDriverConfig();
	}
	@AfterEach
	public void tearDown() throws Exception {
		driverQuit();
	}
	public void setDriverConfig() throws Throwable {

		ConfigFileReader configFileReader = new ConfigFileReader();


		if (configFileReader.getBrowser().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", configFileReader.getDriverPath());
			driver.manage().window().maximize();
			driver.get(configFileReader.getApplicationUrl());
		}

		else if (configFileReader.getBrowser().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
			driver.manage().window().maximize();
			driver.get(configFileReader.getApplicationUrl());
		}
	}
	public void driverQuit() {
		driver.quit();
	}
}
