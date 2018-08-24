package com.apple.demotests.page;

import org.openqa.selenium.WebDriver;

import com.apple.demo.utils.Driver.*;

public class Page implements PageInterface {
	
	public WebDriver driver;
	
	public Page(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
		
		
		
	}
	
	@Override
	public boolean urlContains(String url) {
		try {
			return ((BrowserDriver) driver).urlContains(url);
		}
		catch (Exception ex) {
			
			
			return false;
		}
	}

	@Override
	public boolean titleContains(String title) {
		try {
			return ((BrowserDriver) driver).titleContains(title);
		}
		catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean urlIs(String url) {
		try {
			return ((BrowserDriver) driver).urlIs(url);
		}
		catch (Exception ex) {
			return false;
		}
	}

	@Override
	public boolean titleIs(String title) {
		try {
			return ((BrowserDriver) driver).titleIs(title);
		}
		catch (Exception ex) {
			return false;
		}
	}

	@Override
	public String getTitle() {
		return driver.getTitle();
	}

	@Override
	public String getUrl() {
		return driver.getCurrentUrl();
	}

	@Override
	public void reload() {
		driver.navigate().refresh();		
	}	

	
	public void ThreadWait() throws InterruptedException
	{
		Thread.sleep(1000);
	}
	public void ThreadWaitMore() throws InterruptedException
	{
		Thread.sleep(2000);
	}
}
