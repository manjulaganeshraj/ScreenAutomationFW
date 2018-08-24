package com.sharma.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class WebDriverUtil {

	//Factory pattern
	public static WebDriver getDriver(String browsername){
		WebDriver driver = null;
		try{
			
			switch(browsername){
			
			case "chrome" :
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
				
				case "firefox" :
					System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\resources\\geckodriver.exe");
					driver = new FirefoxDriver();
					break;
					
				case "IE" :
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					break;
					
				case "htmlunit":
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
					driver = new HtmlUnitDriver();
					break;
					
				case "phantom" :

					System.setProperty("phantomjs.binary.path", "C:\\Users\\manju\\workspace\\WebDriver-MayJune\\resources\\phantomjs.exe");
					driver = new PhantomJSDriver();
					break;
					
				default :
				
			
			
			}
			
		}catch(Exception e){
			
			System.out.println("There is an exception when creating Webdriver object");
			System.out.println(e.getStackTrace());
		}
		return driver;
	}
	
}
