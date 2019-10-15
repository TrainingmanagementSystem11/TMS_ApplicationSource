package com.training.dao;

import java.sql.SQLException;

import com.training.entities.Manager;
import com.training.model.ManagerModel;
import com.training.model.TrainerModel;

public interface ManagerDAO {

	
	public boolean PostTrainingDetails(Manager manager)throws ClassNotFoundException,SQLException;	
	public String Approve(Manager manager)throws ClassNotFoundException, SQLException;
	public boolean Reject(Manager manager)throws ClassNotFoundException, SQLException;
	public String PostTrainingDetails(ManagerModel model);

	
}
