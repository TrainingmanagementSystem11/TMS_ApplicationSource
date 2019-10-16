package com.training.service;

import com.training.dao.ManagerDAO;
import com.training.entities.Training;
import com.training.helper.FactoryManagerDB;
import com.training.model.StatusManagerModel;


public  class ManagerServiceImpl implements ManagerService {
	
	private ManagerDAO managerDAO;
	public ManagerServiceImpl() {
		this.managerDAO=FactoryManagerDB.createManagerDB();
	}
	
	@Override
	public String UpdateAprroval(StatusManagerModel model) {
		// TODO Auto-generated method stub
		
		Training training=new Training();
		   training.setEmployeeId(model.getEmployeeId());
		   training.setCourseName(model.getCourseName());
		   training.setStatus(model.getStatus());
		  
		   String result="fail";
		   try {
	 			boolean updated=managerDAO.UpadateApproval(training);
				if(updated)
					result="success";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("!ERROR[Feedback updation failed!!]");
			}
			return result ;

	}

}
