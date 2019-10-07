package com.training.service;

import java.sql.SQLException;

import com.training.dao.TrainerDAO;
import com.training.helper.FactoryTrainerDAO;
import com.training.model.TrainerModel;

public class TrainerServiceImpl implements TrainerService {
	
	TrainerDAO trainerDAO=null;
	
	public TrainerServiceImpl(){
		
		this.trainerDAO=FactoryTrainerDAO.createAdminDAO();
		}
	@Override
	public boolean trainerAuthenticationService(TrainerModel trainerModel) {
		// TODO Auto-generated method stub
		boolean trainerValid = false;
		try {
			trainerValid=trainerDAO.trainerAuth(trainerModel.getTrainerId(), trainerModel.getTrainerpassword());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return trainerValid;	
	}
}


