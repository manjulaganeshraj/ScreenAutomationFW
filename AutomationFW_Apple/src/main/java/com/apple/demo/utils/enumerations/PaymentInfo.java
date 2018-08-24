package com.apple.demo.utils.enumerations;

public enum PaymentInfo {
			
	CARD_NUMBER  ("1111111111111111"),
	MONTHYEAR    ("1221"),
	CVV          ("1234");		
		
	private String value;
	 
	private PaymentInfo(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}

}
