package com.apple.demotests.pageobjects.home;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.apple.demo.annotations.Name;

import com.apple.demo.loader.HtmlElementLoader;
import com.apple.demotests.page.Page;

public class HomePage extends Page {
	
	private final String siteUrl = "https://www.apple.com/";
	
	
	@Name("IPAD")
	@FindBy(className="ac-gn-link-ipad")
	private WebElement ipadLink;	

	public HomePage(WebDriver driver) {
		super(driver);
		HtmlElementLoader.populatePageObject(this, driver);
	}

	public HomePage open() {		
		getDriver().get(siteUrl);		 
		
		return this;
	}		
	
	public IPadPage selectIpad() {
		//WebElement element = driver.findElement(By.className("ac-gn-link-ipad"));
		//element.click();
		
		ipadLink.click();
		
		
		IPadPage ipadPage = new IPadPage(driver);
		
		return ipadPage;
	}
	
	
		
}
