package com.training.service;

import java.sql.SQLException;

import com.training.dao.ManagerDAO;
import com.training.entities.Manager;
import com.training.helper.FactoryManagerDB;
import com.training.model.ManagerModel;

public abstract  class ManagerServiceImpl implements ManagerService {
	
	private ManagerDAO managerDAO;
	public ManagerServiceImpl() {
		this.managerDAO=FactoryManagerDB.createManagerDB();
	}
	@Override
	public String postTrainigDetails(ManagerModel model) {
		// TODO Auto-generated method stub
		Manager manager=new Manager();
		manager.setEmployeeId(model.getEmployeeId());
		manager.setManagerId(model.getMangerId());
		manager.setCourseName(model.getCourseName());
		manager.setStartDate(model.getStartDate());
		manager.setEndDate(model.getEndDate());
		manager.setVenue(model.getVenue());
		String result="fail";
		try {
			boolean stored=managerDAO.PostTrainingDetails(manager);
			if(stored)
				result="success";
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("!ERROR[Feedback updation failed!!]");
		}
		return result;
 

	}

}
