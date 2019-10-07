package com.training.service;

import java.sql.SQLException;

import com.training.dao.AdminDAO;
import com.training.helper.FactoryAdminDAO;
import com.training.model.AdminModel;

public class AdminServiceImpl implements AdminService{
	
		
		AdminDAO adminDAO=null;
		
		public AdminServiceImpl(){
			
			this.adminDAO=FactoryAdminDAO.createAdminDAO();
			}
		@Override
		public boolean adminAuthenticationService(AdminModel adminModel) {
			// TODO Auto-generated method stub
			boolean adminValid = false;
			try {
				adminValid=adminDAO.adminAuth(adminModel.getAdminId(), adminModel.getAdminPassword());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return adminValid;	
		}
	}



