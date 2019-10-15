package com.training.controller;

import java.net.Authenticator.RequestorType;
import java.util.List;
import com.training.helper.FactoryAdminDAO;
import com.training.model.AdminModel;
import com.training.service.AdminService;
import com.training.view.AdminView;
import com.training.view.UpdateAdminModel;

public class AdminController {
	private AdminService adminService;
	AdminView employeeView=new AdminView();
	
	public AdminController() {
		this.adminService=
				FactoryAdminDAO.createAdminService();
	}

		
  public void numberOfAttendees(){
	  
		
	}
	


	public void handleUpdateDate(UpdateAdminModel model) {
		// TODO Auto-generated method stub
		
	}
}

