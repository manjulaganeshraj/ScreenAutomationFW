package com.apple.demo.utils.enumerations;

public enum UserInfo {
	FIRST_NAME  ("manjula"),
	LAST_NAME   ("ganesh"),
	ADDRESS     ("1832 broadway"),
	CITY        ("san ramon"),	
	STATE    	("CA"),
	POSTAL_CODE ("94582"),
	EMAIL      ("test@testemail.com"),
	PHONE      ("1234567890");
	

	private String value;
	 
	private UserInfo(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}

}
