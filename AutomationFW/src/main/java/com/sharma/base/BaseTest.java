package com.sharma.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sharma.utils.WebDriverUtil;

public class BaseTest {

	protected WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod(){
		
		driver = WebDriverUtil.getDriver("chrome");
		driver.get("https://www.walmart.com/");
	}
	
	@AfterMethod
	public void afterClass(){
		driver.quit();
	}
}
