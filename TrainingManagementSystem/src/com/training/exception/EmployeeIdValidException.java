package com.training.exception;

public class EmployeeIdValidException extends Exception {

	String message;
	public EmployeeIdValidException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	
	
}

