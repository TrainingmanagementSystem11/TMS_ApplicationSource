package com.training.controller;

import java.net.Authenticator.RequestorType;
import java.util.List;
import com.training.helper.FactoryAdminDAO;
import com.training.model.AdminModel;
import com.training.service.AdminService;
import com.training.view.AdminView;

public class AdminController {
	private AdminService adminService;
	AdminView employeeView=new AdminView();
	
	public AdminController() {
		this.adminService=
				FactoryAdminDAO.createAdminService();
	}

	public void handleRetrieveEmployees(RequestorType request) {
		
		AdminView AdminView = new AdminView();
		List<AdminModel> models=AdminService.retrieveAdmin();
		AdminView mainView=new AdminView();
		switch(request) {
		
		

		
		}
	
}
}

