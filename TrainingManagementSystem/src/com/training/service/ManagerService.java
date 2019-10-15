package com.training.service;

import com.training.model.ManagerModel;

public interface ManagerService  {

	public String Approve(ManagerModel model);
	public String Reject(ManagerModel model);
	String postTrainigDetails(ManagerModel model);
}
