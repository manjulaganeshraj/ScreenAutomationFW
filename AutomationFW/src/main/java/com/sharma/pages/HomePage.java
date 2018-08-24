package com.sharma.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sharma.base.CommonPage;

public class HomePage extends CommonPage {
	
	@FindBy(how = How.CSS,using=".TempoCategoryTile-tile-overlay")
	List<WebElement> imagesList; 
	
	@FindBy(how = How.CSS,using=".ClickThroughImage")
	List<WebElement> slidersList; 
	
	//Page classes are dependent on driver object and we need to inject driver to all page classes using constr or setter method
	//Dependency Injection
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public int imageList(){
		//return driver.findElements(By.cssSelector(".TempoCategoryTile-tile-overlay")).size();
		return imagesList.size();
	}

	public int sliderImages(){
		//return driver.findElements(By.cssSelector(".ClickThroughImage")).size();
		return slidersList.size();

	}
	
}
