package com.apple.demotests.pageobjects.home;

import org.openqa.selenium.support.FindBy;

import com.apple.demo.annotations.Name;
import com.apple.demo.element.HtmlElement;
import com.apple.demo.element.TextInput;
import com.apple.demo.utils.enumerations.UserInfo;

@Name("SHIP_TO")
@FindBy(className = "as-address-fields")
public class ShipTo extends HtmlElement {
	
	@Name("FIRST_NAME")
	@FindBy(id="checkout.shipping.addressSelector.newAddress.address.firstName")
	private TextInput firstNameTxtBox;
	
	@Name("LAST_NAME")
	@FindBy(id="checkout.shipping.addressSelector.newAddress.address.lastName")
	private TextInput lastNameTxtBox;
		
	@Name("ADDRESS")
	@FindBy(id="checkout.shipping.addressSelector.newAddress.address.street")
	private TextInput addressTxtBox;

	@Name("CITY")
	@FindBy(id="checkout.shipping.addressSelector.newAddress.address.zipLookup.city")
	private TextInput cityTxtBox;	
	
	@Name("STATE")
	@FindBy(id="checkout.shipping.addressSelector.newAddress.address.zipLookup.state")
	private TextInput stateTxtBox;
	
	@Name("POSTAL_CODE")
	@FindBy(id="checkout.shipping.addressSelector.newAddress.address.zipLookup.postalCode")
	private TextInput postalCodeTxtBox;
		
	public void fillInfo() {
		
		firstNameTxtBox.sendKeys(UserInfo.FIRST_NAME.toString());
		lastNameTxtBox.sendKeys(UserInfo.LAST_NAME.toString());

		addressTxtBox.sendKeys(UserInfo.ADDRESS.toString());
		//cityTxtBox.sendKeys(UserInfo.CITY.toString());	
		//stateTxtBox.sendKeys(UserInfo.STATE.toString());
		
		//Clear and fill, so City and State auto fills
		postalCodeTxtBox.clear();
		postalCodeTxtBox.sendKeys(UserInfo.POSTAL_CODE.toString());
						
	}	

}
