package com.training.service;

import java.util.List;

import com.training.model.AdminModel;

public interface AdminService {
	
	 default boolean adminAuthenticationService(AdminModel adminModel) {
		return false;
		
	}

	static List<AdminModel> retrieveAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

}

	
