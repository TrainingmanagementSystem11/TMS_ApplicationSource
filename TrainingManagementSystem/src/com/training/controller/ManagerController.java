package com.training.controller;

import com.training.helper.FactoryEmployeeDB;
import com.training.model.StatusManagerModel;
import com.training.service.ManagerService;

public class ManagerController {
	private ManagerService managerService;
	
	
	public ManagerController() {
		this.managerService=
				FactoryEmployeeDB.createManagerService();
	}

	public void handleApproval(StatusManagerModel model) {
		// TODO Auto-generated method stub
		
		String outcome=managerService.UpdateAprroval(model);
		if(outcome.contentEquals("success")) {
			System.out.println("Approved Successfully");
		}else {
			System.out.println("Approval is not Successfully");
		}
		
	}



	public void handleReject(StatusManagerModel model) {
		// TODO Auto-generated method stub
		
	}

	/*public void handleReject(TraineeModel model) {
		// TODO Auto-generated method stub
		String outcome=managerService.updateReject(model);
		if(outcome.contentEquals("success")) {
			System.out.println("Rejected Successfully");
		}else {
			System.out.println("Rejection is not Successfully");
		}
	}*/

}