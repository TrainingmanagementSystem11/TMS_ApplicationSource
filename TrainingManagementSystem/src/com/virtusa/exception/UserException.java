package com.virtusa.exception;

public class UserException extends RuntimeException {

	private String message;
		public UserException(String message) {
			this.message=message;
		}
	
		public String getMessage() {
			return message;
		}
	}


