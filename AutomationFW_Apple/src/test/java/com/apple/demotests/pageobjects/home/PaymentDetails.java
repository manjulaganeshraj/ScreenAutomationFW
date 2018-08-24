package com.apple.demotests.pageobjects.home;

import org.openqa.selenium.support.FindBy;

import com.apple.demo.annotations.Name;
import com.apple.demo.element.HtmlElement;
import com.apple.demo.element.TextInput;
import com.apple.demo.utils.enumerations.PaymentInfo;

@Name("PAYMENT_DETAILS")
//@FindBy(className = "as-creditcard")
public class PaymentDetails extends HtmlElement {
	
	@Name("CARD_NUMBER")
	@FindBy(css="[id$=cardNumber]")
	private TextInput cardNumber;
	
	@Name("EXPIRY_MONTH")
	@FindBy(css="[id$=expiration]")
	private TextInput expiryMonthYear;
	

	@Name("CVV")
	@FindBy(css="[id$=securityCode]")
	private TextInput cvv;	
		
	public void fillInfo() {
		cardNumber.sendKeys(PaymentInfo.CARD_NUMBER.toString());
		expiryMonthYear.sendKeys(PaymentInfo.MONTHYEAR.toString());
		
		cvv.sendKeys(PaymentInfo.CVV.toString());
	}	

}
