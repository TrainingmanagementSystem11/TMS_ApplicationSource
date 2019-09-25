package com.training.entities;

import com.training.utilities.EmployeeType;

public class Employee{
	private String userName;
	private String password;
	
	
	protected String firstName;
	protected String lastName;
	protected String dateOfBirth;
	protected String emailAddress;
	protected String phoneNumber;
	
	protected EmployeeType EmployeeType;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public EmployeeType getEmployeeType() {
		return EmployeeType;
	}
	public void setUserType(EmployeeType EmployeeType) {
		this.EmployeeType = EmployeeType;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", dateOfBirth=" + dateOfBirth + ", emailAddress=" + emailAddress + ", phoneNumber="
				+ phoneNumber + ", EmployeeType=" + EmployeeType + "]";
	}
	
	
	
	
}



