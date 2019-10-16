package com.training.service;

import com.training.dao.LoginDAO;
import com.training.helper.FactoryLoginDB;
import com.training.model.LoginModel;

public class LoginServiceImpl {

	private LoginDAO loginDAO=null;

	public LoginServiceImpl() {
		this.loginDAO=FactoryLoginDB.createLoginDAO();
	}
	
	@Override
	public String userAuthenticationService(LoginModel loginModel) throws ClassNotFoundException, SQLException {
		
		// TODO Auto-generated method stub
		String userValid=loginDAO.userAuth(loginModel.getEmployeeId(),loginModel.getPassword());
		//System.out.println(userValid);
		
		return userValid;
}
}