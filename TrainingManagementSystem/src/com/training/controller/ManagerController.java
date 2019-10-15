package com.training.controller;

import java.sql.SQLException;

import com.training.dao.ManagerDAO;
import com.training.entities.Manager;
import com.training.helper.FactoryManagerDB;
import com.training.model.ManagerModel;
import com.training.view.ManagerView;


public class ManagerController {

	
	private ManagerDAO managerService;
	ManagerView managerView=new ManagerView();
	
	public ManagerController() {
		this.managerService=
				FactoryManagerDB.createManagerDB();
	}
	
public void handlepostTrainingDetails(ManagerModel model) {
		
		ManagerModel validator=new ManagerModel();
				
		if(validator.validate(model)) {
		
		String outcome=managerService.PostTrainingDetails(model);
		if(outcome.contentEquals("success")) {
			managerView.postTrainingSuccess(model);	
		}else {
			managerView.postTrainingSuccess(model);
		}
	}else {
		managerView.validationFailedError();
	}
}
		public void Approve(Manager model) {
			String outcome = null;
			try {
				outcome = managerService.Approve(model);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(outcome.contentEquals("success")) {
				ManagerView.showApprovedSuccessful(model);	
			}else {
				ManagerView.showApprovePending(model);
			}
	}
}
