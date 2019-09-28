package com.training.dao;

public interface UserDAO {
	public boolean userAuth(String userId,String password);
	public String retrieveUserType(String userType);


}
