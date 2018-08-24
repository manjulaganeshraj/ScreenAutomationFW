package com.apple.demotests.BaseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.apple.demo.utils.Driver.BrowserDriver;

//import org.apache.log4j.Logger;

public class BaseTestClass {
	
	public WebDriver driver;
	
	//public static Logger log = Logger.getLogger("errorLogger");
	
	@BeforeMethod
	public void setUp() {
		
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		
		driver = new BrowserDriver("chrome");
		
		driver.manage().window().maximize(); 
	}   
	      
	@AfterMethod
	public void tearDown() { 
		driver.quit(); 
	} 

}
