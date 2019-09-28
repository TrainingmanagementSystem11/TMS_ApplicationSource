package com.training.utilities;

public enum UserTypes {
	TRAINER("TRAINER"),TRAINEE("TRAINEE"),
	ADMIN("ADMIN"),MANAGER("MANAGER");
	private String val;
	private UserTypes(String val) {
		this.val=val;
	}
	public String getVal() {
		return val;	
	}
}



