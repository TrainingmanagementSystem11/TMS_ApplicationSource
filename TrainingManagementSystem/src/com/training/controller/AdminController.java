package com.training.controller;

import com.training.helper.FactoryAdminService;
import com.training.model.AdminModel;
import com.training.service.AdminService;
import com.training.view.AdminView;
import com.training.view.LoginView;

public class AdminController {
	AdminService adminService;
	public AdminController(){
		
		this.adminService=FactoryAdminService.createAdminService();
	}
	public void adminAuthentication(String adminId,String adminPassword) {
		
		AdminModel adminModel=new AdminModel();
		adminModel.setAdminId(adminId);
		adminModel.setAdminPassword(adminPassword);

		boolean adminType=adminService.adminAuthenticationService(adminModel);
		 if(adminType==true) {
		     System.out.println("************************Login Successful****************************");
				
		     AdminView.adminMenu();
			
		}else {
			System.out.println("***Invalid user name or password***");
			System.out.println("***Please Try Again***");
			LoginView.adminLogin();
		
		}		
	}
}


