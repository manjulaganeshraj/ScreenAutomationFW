package com.apple.demotests.pageobjects.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.apple.demo.annotations.Name;
import com.apple.demo.loader.HtmlElementLoader;
import com.apple.demotests.page.Page;

public class IPadPage extends Page {
	
	@Name("STANDARD_IPAD")
	@FindBy(css ="#main > section.fp-hero.section-ipad.background-alt.large-section > div.fp-section-content.row > div > span > a:nth-child(2)")
	private WebElement standardIPad;
	

	public IPadPage(WebDriver driver) {
		super(driver);
		HtmlElementLoader.populatePageObject(this, driver);
		
	}

	//  
	public SelectFeaturesPage openStandardIPad() {		
		
		//WebElement standardIPad = driver.findElement(By.cssSelector("#main > section.fp-hero.section-ipad.background-alt.large-section > div.fp-section-content.row > div > span > a:nth-child(2)"));
		
		standardIPad.click();
		SelectFeaturesPage selections = new SelectFeaturesPage(driver);
		return selections;
		
	}	
	
	
	

}
