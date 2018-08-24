package com.apple.demotests.testpages;

import static org.testng.Assert.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.apple.demotests.pageobjects.home.*;
import com.apple.demotests.testlisteners.TestListener;
import com.apple.demo.utils.Property.PropertyFile;

@Listeners(TestListener.class)
public class TestClass extends com.apple.demotests.BaseTest.BaseTestClass{

	@Test
	public void transactionFailsForIncorrectPaymentInfo() throws InterruptedException { 	
		
		HomePage homePage = new HomePage(driver);
		
		IPadPage ipadPage = homePage.open().selectIpad();
		
		SelectFeaturesPage featurePage =  ipadPage.openStandardIPad();
		featurePage.ThreadWaitMore();
		featurePage.selectSilver().ThreadWait();
		featurePage.select32GB().ThreadWait();
		featurePage.selectWifiCellular().ThreadWait();
		featurePage.selectAppleCare().ThreadWait();
		
		EngravingPage engravingPage = featurePage.clickContinue();
		
		ReviewPage reviewPage = engravingPage.selectAddToBag();
		
		BagCartPage bagPage = reviewPage.selectReviewBag();
		SignInPage signInPage = bagPage.selectCheckout();
		
		CheckOutPage checkOutPage = signInPage.selectGuestCheckout();
		checkOutPage.selectContinueToShip();
		
		//Fill Shipping & Contact
		checkOutPage.shipTo().fillInfo();
		
		
		PaymentPage paymentPage = checkOutPage.FillEmailAndPhone().continueToPayment();
		
		//Fill Credit card
		paymentPage.SelectCreditPayment().ThreadWait();
		paymentPage.FillCreditCardInfo().reviewOrder();
		
		PropertyFile property = new PropertyFile();
		String expectedError = property.get("creditCardInvalidErrorMessage");
		String pageValidationError= paymentPage.ValidationErrorText();
		
		Thread.sleep(2000);// Just to view in browser during manual test
		
		assertEquals(pageValidationError, expectedError) ;		
	}

}
