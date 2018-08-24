package com.apple.demotests.pageobjects.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.apple.demo.annotations.Name;
import com.apple.demo.element.TextInput;
import com.apple.demo.loader.HtmlElementLoader;
import com.apple.demo.utils.enumerations.PaymentInfo;
import com.apple.demotests.page.Page;

public class PaymentPage extends Page {

	private PaymentDetails payment;
	
	@Name("REVIEW")
	@FindBy(css="#checkout-container > div > div.rs-checkout > div:nth-child(1) > div.rs-module-loader > div > div > div.as-l-container > div.rs-checkout-action > div > div > div > button")
	private WebElement reviewOrder;
	
	@FindBy(css="[id$=cardNumber-error]")
	private WebElement valiationError;
	
	@FindBy(xpath="//*[@id='checkout.billing.billingOptions.options.0-selector']/div/label/div/div[1]/div[1]")
	private WebElement creditCardPayment;
	
	@FindBy(css="[id$=cardNumber]")
	private WebElement creditCardNumber;

	@FindBy(css="[id$=expiration]")
	private TextInput expiryMonthYear;
	
	@Name("CVV")
	@FindBy(css="[id$=securityCode]")
	private TextInput cvv;	

	
	public PaymentPage(WebDriver driver) {
		
		super(driver);
		HtmlElementLoader.populatePageObject(this, driver);
		
	}

	public String ValidationErrorText()
	{
		return valiationError.getText();
	}
	
	public void reviewOrder() {		
		reviewOrder.click();
		
		
	}
	public PaymentPage SelectCreditPayment() throws InterruptedException {	
		
		creditCardPayment.click();
		
		return this;
	}	
	
	public PaymentPage FillCreditCardInfo() throws InterruptedException {	
		
		creditCardNumber.sendKeys(PaymentInfo.CARD_NUMBER.toString());
		expiryMonthYear.sendKeys(PaymentInfo.MONTHYEAR.toString());
		cvv.sendKeys(PaymentInfo.CVV.toString());
		
		return this;
	}	
	

public PaymentDetails paymentDetails() {
	return payment;	
}

	
}
