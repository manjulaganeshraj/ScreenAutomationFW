package com.manjula;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;


public class validateTitle extends base {

	@Test
	public void basePageNavigation() throws IOException{
		
		driver =initialiseDriver();
		driver.get("https://talentscreen.io/#/home");
		LandingPage l = new LandingPage(driver);
		String actual = l.getTitle().getText();
		String expected = "Welcome To TalentScreen!";
		Assert.assertEquals(expected, actual);
		
	}
		
}
