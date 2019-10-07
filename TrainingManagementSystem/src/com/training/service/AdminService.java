package com.training.service;

import com.training.model.AdminModel;

public interface AdminService {
	
	 default boolean adminAuthenticationService(AdminModel adminModel) {
		return false;
		
	}

}

	
