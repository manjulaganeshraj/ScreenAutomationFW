package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	By userName = By.cssSelector("input[id='username']");
	By passWord = By.cssSelector("input[id='password']");
	By loginTS = By.cssSelector("button[type='submit']");

	
	public LoginPage(WebDriver driver) {

		this .driver=driver;
	}

	public WebElement getUserName(){
		return driver.findElement(userName);
	}
	public WebElement getPassWord(){
		return driver.findElement(passWord);
	}
	public WebElement getLoginTs(){
		return driver.findElement(loginTS);
	}

	
}
