package com.training.helper;

import com.training.dao.AdminDAO;
import com.training.dao.AdminDAOImpl;
import com.training.service.AdminService;

public class FactoryAdminDAO {
public static AdminDAO createAdminDAO() {
		
		AdminDAO adminDAO=new AdminDAOImpl();
		
		return adminDAO;
		
}


public static AdminService createAdminService() {
	// TODO Auto-generated method stub
	return null;
}
}
