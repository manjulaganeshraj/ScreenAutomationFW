package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;

	public WebDriver initialiseDriver() throws IOException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\manju\\workspace\\TalentScreenAutomationFW\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);                           
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\workspace\\TalentScreenAutomationFW\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		else if(browserName.equals("firefox")){
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}
}
