package com.apple.demotests.pageobjects.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.apple.demo.annotations.Name;
import com.apple.demo.element.Link;
import com.apple.demo.element.TextInput;
import com.apple.demo.loader.HtmlElementLoader;
import com.apple.demo.utils.enumerations.UserInfo;
import com.apple.demotests.page.Page;

public class CheckOutPage extends Page {

	private ShipTo shipTo;
	
	
	@FindBy(css ="#checkout-container > div > div.rs-checkout > div:nth-child(1) > div.rs-module-loader > div > div > div.as-l-container.rs-checkout-action > div > div > div > button")
	private WebElement continueToShip;
	
	
	@Name("CONTINUE")
	@FindBy(css="#checkout-container > div > div.rs-checkout > div:nth-child(1) > div.rs-module-loader > div > div > div > div.rs-checkout-shipping.as-l-container > div.rs-shipping-continue > div > div > div > div > button")
	private Link continueToPaymentBtn;
	
	@Name("EMAIL")
	@FindBy(id="checkout.shipping.addressContactEmail.address.emailAddress")
	private TextInput emailTxtBox;
	
	@Name("PHONE")
	@FindBy(id="checkout.shipping.addressContactPhone.address.fullDaytimePhone")
	private TextInput phoneTxtBox;
	
	
	
	public CheckOutPage(WebDriver driver) {
		
		super(driver);
		HtmlElementLoader.populatePageObject(this, driver);
		
	}

	public CheckOutPage selectContinueToShip(){

	//WebElement reviewBag = driver.findElement(By.cssSelector("#checkout-container > div > div.rs-checkout > div:nth-child(1) > div.rs-module-loader > div > div > div.as-l-container.rs-checkout-action > div > div > div > button"));
	
	continueToShip.click();
	
	return this;
}
	
	public PaymentPage continueToPayment() {		
		continueToPaymentBtn.click();
		
		PaymentPage payment=  new PaymentPage(driver);
		return payment;
	}

public ShipTo shipTo() {
	//driver.findElement(By.xpath("//*[@id='dimensionColor-silver']"));
	
	return shipTo;	
}

public CheckOutPage FillEmailAndPhone()
{
	//TextInput email = driver.findElement(By.xpath("//*[@id='checkout.shipping.addressContactEmail.address.emailAddress']"));
	emailTxtBox.sendKeys(UserInfo.EMAIL.toString());
	
	
	//TextInput phone = (TextInput)driver.findElement(By.xpath("//*[@id='checkout.shipping.addressContactPhone.address.fullDaytimePhone']"));
	phoneTxtBox.sendKeys(UserInfo.PHONE.toString());
	
	return this;

}

	
}
