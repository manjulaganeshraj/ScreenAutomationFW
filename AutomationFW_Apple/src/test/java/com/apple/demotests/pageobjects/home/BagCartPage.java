package com.apple.demotests.pageobjects.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.apple.demo.loader.HtmlElementLoader;
import com.apple.demotests.page.Page;

public class BagCartPage extends Page {

	
	@FindBy(id ="shoppingCart.actions.checkout")
	private WebElement checkOut;
	
	public BagCartPage(WebDriver driver) {
		super(driver);
		HtmlElementLoader.populatePageObject(this, driver);
		
	}


public SignInPage selectCheckout(){

	//WebElement reviewBag = driver.findElement(By.id("shoppingCart.actions.checkout"));
	
	checkOut.click();
	
	SignInPage signPage =  new SignInPage(driver);
	
	return signPage;
}
	
}
