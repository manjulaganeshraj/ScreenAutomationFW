package com.apple.demotests.pageobjects.home;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.apple.demo.loader.HtmlElementLoader;

import com.apple.demotests.page.Page;

public class SelectFeaturesPage extends Page{
	
	@FindBy(xpath ="//*[@id='dimensionColor-silver']")
	private WebElement colorSilver;
	
	@FindBy(id ="Item2-dimensionCapacity-32gb")
	private WebElement capacity32GB;
	
	@FindBy(id ="Item3-dimensionConnection-wificell")
	private WebElement wifiCellular;
	

	public SelectFeaturesPage(WebDriver driver) {
		super(driver);	
		HtmlElementLoader.populatePageObject(this, driver);
	}

   public SelectFeaturesPage selectSilver(){
	   
	   /*WebElement element = driver.findElement(By.id("dimensionColor-silver"));
	   element.click();*/
	   
	   colorSilver.click();

	return this;
}

	public SelectFeaturesPage select32GB(){
		
		/*WebElement GB32 = driver.findElement(By.id("Item2-dimensionCapacity-32gb"));
		GB32.click();
		*/
		capacity32GB.click();
		return this;
	}
	
public SelectFeaturesPage selectWifiCellular(){	
		/*WebElement wifiCellular = driver.findElement(By.id("Item3-dimensionConnection-wificell"));
		wifiCellular.click();*/
		
		wifiCellular.click();
		return this;
	}

public SelectFeaturesPage selectAppleCare(){	
	WebElement wifiCellular = driver.findElement(By.cssSelector("#applecare_open > span:nth-child(2)"));
	wifiCellular.click();
	
	WebElement addAppleCare = driver.findElement(By.cssSelector("body > overlay.as-overlay.as-overlay-popup.as-overlay-info.as-bfaccessory-overlay.applecare_overlay > materializer > div > div.as-overlay-content > div > materializer > accessory > div > div.row.as-singlepartdescription-details-container > div.column.large-9.small-12.as-singlepartdescription-details > div:nth-child(2) > button"));
	//Wait for modal popup
	//((BrowserDriver)getDriver()).waitUntilVisible(addAppleCare);
	
	addAppleCare.click();
	
	return this;
}

public EngravingPage clickContinue(){	
	
	WebElement continueButton = driver.findElement(By.cssSelector("#primary > summary-builder > div.as-purchaseinfo > div.as-purchaseinfo-details.as-purchaseinfo-background > div > div > div.grouped-button-left > div > form > div > span > button > span"));
	
	continueButton.click();
	
	EngravingPage engraving = new EngravingPage(driver); 
	
	return engraving;
}

	
}

