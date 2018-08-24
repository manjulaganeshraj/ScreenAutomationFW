package com.apple.demotests.pageobjects.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.apple.demo.loader.HtmlElementLoader;
import com.apple.demotests.page.Page;

public class EngravingPage extends Page {

	
	@FindBy(css ="#summaryheader-form > div > span > button > span")
	private WebElement addToBag;
	
	public EngravingPage(WebDriver driver) {
		
		super(driver);
		HtmlElementLoader.populatePageObject(this, driver);
	}


public ReviewPage selectAddToBag(){

	//WebElement silverIPad = driver.findElement(By.cssSelector("#summaryheader-form > div > span > button > span"));
	
	addToBag.click();
	
	ReviewPage review= new ReviewPage(driver);
	return review;
}
	
}
