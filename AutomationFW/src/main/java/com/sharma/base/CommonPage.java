package com.sharma.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {

	protected WebDriver driver;
	
	@FindBy(how=How.ID,using="global-search-input")
	WebElement searchBox;
	
	@FindBy(how=How.CSS,using=".header-GlobalSearch-submit.btn")
	WebElement searchButton;
	
	@FindBy(how=How.CSS,using=".header-GlobalEyebrowNav-link")
	List<WebElement> navLinks;
	

	
	public CommonPage(WebDriver driver){
		this.driver = driver;
	}
	
	public String search(String searchdata){          //67
		
		searchBox.sendKeys(searchdata);
		searchButton.click();
		return driver.getTitle();
		
		}
	
	public int headerNavigatonLinks(){                //78
		return navLinks.size();
	}
	
	public void headerModalDropDowns(){
		List<WebElement> elements = driver.findElements(By.cssSelector("[id*='header-GlobalEyebrowNav-button']"));
		Actions action = new Actions(driver);
		for(WebElement elm : elements){
			action.moveToElement(elm).perform();
			List<WebElement> elms = driver.findElements(By.cssSelector(".header-GlobalEyebrowNav-flyout-listItem.font-normal"));
			for(WebElement elmt: elms){
				System.out.println(elmt.getText());
			}
			
		}
	}
	
	public int footerLinks(){
		return driver.findElements(By.cssSelector(".heading-f.footer-GlobalFooterItems-heading")).size();
		
	}
}


/*public String search(String searchdata){
		driver.findElement(By.id("global-search-input")).sendKeys(searchdata);
		driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn")).click();
		
		searchBox.sendKeys(searchdata);
		searchButton.click();
		
		return driver.getTitle();
		
		}
	
	public int headerNavigatonLinks(){
		//return driver.findElements(By.cssSelector(".header-GlobalEyebrowNav-link")).size();
		return navLinks.size();
	}*/