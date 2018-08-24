package com.apple.demotests.pageobjects.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.apple.demo.loader.HtmlElementLoader;
import com.apple.demotests.page.Page;

public class ReviewPage extends Page {

	
	@FindBy(css ="#summaryheader-form > div > span > button > span")
	private WebElement reviewBag;
	
	public ReviewPage(WebDriver driver) {
		super(driver);
		HtmlElementLoader.populatePageObject(this, driver);
		
	}


public BagCartPage selectReviewBag(){

	//WebElement reviewBag = driver.findElement(By.cssSelector("#summaryheader-form > div > span > button > span"));
	
	reviewBag.click();
	
	BagCartPage bag= new BagCartPage(driver);
	return bag;
}
	
}
