package com.training.utilities;

public enum EmployeeType {
	EMPLOYEE("EMPLOYEE"),ADMIN("ADMIN"),MANAGER("MANAGER");
	private String val;
	private EmployeeType(String val) {
		this.val=val;
	}
	public String getVal() {
		return val;	
	}
}



