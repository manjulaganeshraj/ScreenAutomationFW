package com.apple.demotests.pageobjects.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.apple.demo.loader.HtmlElementLoader;
import com.apple.demotests.page.Page;

public class SignInPage extends Page {

	
	@FindBy(id ="guest-checkout")
	private WebElement guestCheckOut;
	
	public SignInPage(WebDriver driver) {
		super(driver);
		HtmlElementLoader.populatePageObject(this, driver);
		
	}


public CheckOutPage selectGuestCheckout(){

	//WebElement reviewBag = driver.findElement(By.id("guest-checkout"));
	
	guestCheckOut.click();
	CheckOutPage checkout= new CheckOutPage(driver);
	return checkout;
}
	
}
