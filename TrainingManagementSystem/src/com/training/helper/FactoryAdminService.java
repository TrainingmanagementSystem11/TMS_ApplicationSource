package com.training.helper;

import com.training.service.AdminService;
import com.training.service.AdminServiceImpl;

public class FactoryAdminService {
	public static AdminService createAdminService() {
		
		
		AdminService adminService=new AdminServiceImpl();
	return adminService;

}
	
}
