package com.manjula;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;


public class HomePage extends base {

	@Test(dataProvider = "getData")
	public void basePageNavigation(String userName, String passWord, String text) throws IOException{
		
		driver =initialiseDriver();
		driver.get("https://talentscreen.io/#/home");
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getUserName().sendKeys(userName);
		lp.getPassWord().sendKeys(passWord);
		System.out.println(text);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[2][3];
		
		data[0][0] = "admin";
		data[0][1] = "Innovapath";
		data[0][2] = "Non-restrictedUser";
		
		data[1][0] = "candidate";
		data[1][1] = "course";
		data[1][2] = "restrictedUser";

		return data;
	}
}
