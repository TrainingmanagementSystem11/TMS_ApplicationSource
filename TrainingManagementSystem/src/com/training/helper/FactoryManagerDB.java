package com.training.helper;

import com.training.dao.ManagerDAO;
import com.training.dao.ManagerDAOImpl;

public class FactoryManagerDB {
	
	public static ManagerDAO createManagerDB(){
		ManagerDAO managerDAO=(ManagerDAO) new ManagerDAOImpl();
		return managerDAO;
		
	}
	public static ManagerDAOImpl createManagerService(){
		ManagerDAOImpl managerService=
				new ManagerDAOImpl();
		return managerService;
	}

}
