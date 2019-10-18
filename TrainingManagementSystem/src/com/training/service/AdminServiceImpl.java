package com.training.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.training.dao.AdminDAO;
import com.training.dao.AdminDAOImpl;
import com.training.helper.FactoryAdminDAO;
import com.training.model.AttendeesAdminModel;
import com.training.model.ScheduleAdminModel;
import com.training.model.VenueAdminModel;

public class AdminServiceImpl implements AdminService{
	
		
		AdminDAO adminDAO=null;
		
		public AdminServiceImpl(){
			
			this.adminDAO=FactoryAdminDAO.createAdminDAO();
			}

		@Override
		public boolean attendeesService(AttendeesAdminModel adminModel) 
		{
			AdminDAO adminDAO = new AdminDAOImpl();
			ResultSet count = null;
			try {
				 count=adminDAO.Numberofattendees(adminModel);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		/*@Override
		public boolean adminAuthenticationService(AdminModel adminModel) {
			// TODO Auto-generated method stub
			boolean adminValid = false;
			try {
			adminValid=adminDAO.adminAuth(adminModel.get(), adminModel.get());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return adminValid;	
		}
		@Override
		public List<AdminModel> retrieveAdmin() {
			// TODO Auto-generated method stub
			return null;
		}*/

		@Override
		public boolean venueService(VenueAdminModel venueAdminModel) 
		{
			AdminDAO adminDAO = new AdminDAOImpl();
			try {
				adminDAO.updateVenue(venueAdminModel);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			return false;
		}

		@Override
		public boolean updateDateService(ScheduleAdminModel scheduleAdminModel)
		{
			AdminDAO adminDAO = new AdminDAOImpl();
			try {
				adminDAO.updateDate(scheduleAdminModel);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		       return false;
		}
	}



