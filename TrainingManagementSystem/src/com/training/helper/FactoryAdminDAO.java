package com.training.helper;

import com.training.dao.AdminDAO;
import com.training.dao.AdminDAOImpl;

public class FactoryAdminDAO {
public static AdminDAO createAdminDAO() {
		
		AdminDAO adminDAO=new AdminDAOImpl();
		
		return adminDAO;
		
}
}
