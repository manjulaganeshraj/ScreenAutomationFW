package com.sharma;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sharma.base.BaseTest;
import com.sharma.pages.HomePage;

public class HomePageTest extends BaseTest {

	HomePage hm;
	
	@Test
	public void searchTest(){
		//hm = new HomePage(driver);
		
		hm = PageFactory.initElements(driver, HomePage.class);
		String actual = hm.search("Laptop");
		Assert.assertEquals("Laptop - Walmart.com", actual);
		
	}
	
	@Test
	public void headerLinksTest(){
		//hm = new HomePage(driver);

		hm = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(6, hm.headerNavigatonLinks());
		
		
	}
	
	@Test
	public void sliderImagesTest(){
		//hm = new HomePage(driver);

		hm = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(5, hm.sliderImages());
	}
	
	
}
