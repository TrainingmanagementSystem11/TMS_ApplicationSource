package com.training.service;

import java.sql.SQLException;

import com.training.model.LoginModel;

public interface LoginService {
	
	public String userAuthenticationService(LoginModel loginModel)throws ClassNotFoundException,SQLException;



}
