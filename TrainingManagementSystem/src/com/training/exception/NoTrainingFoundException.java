package com.training.exception;

public class NoTrainingFoundException extends Exception {

	String message;
	public NoTrainingFoundException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
	
	
}

