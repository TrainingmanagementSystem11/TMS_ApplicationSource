package com.training.service;

import java.sql.SQLException;
import com.training.dao.TrainerDAO;
import com.training.entities.Trainer;
import com.training.exception.NoTrainingFoundException;
import com.training.helper.FactoryTrainerDB;
import com.training.model.TrainerModel;

public class TrainerServiceImpl implements TrainerService {
	
private TrainerDAO trainerDAO;
	
	public TrainerServiceImpl() {
		this.trainerDAO=FactoryTrainerDB.createTrainerDB();
	}
	@Override
	public String postTrainigDetails(TrainerModel model) {
		// TODO Auto-generated method stub
		Trainer trainer=new Trainer();
		trainer.setEmployeeId(model.getEmployeeId());
		trainer.setTrainerId(model.getTrainerId());
		trainer.setCourseName(model.getCourseName());
		trainer.setStartDate(model.getStartDate());
		trainer.setEndDate(model.getEndDate());
		trainer.setVenue(model.getVenue());
		String result="fail";
		try {
			boolean stored=trainerDAO.postTrainingDetails(trainer);
			if(stored)
				result="success";
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("!ERROR[Updating failed because of internal issues...]");
		}
		return result;
	}
	@Override
	public String deleteTrainigDetails(TrainerModel model) {
		 String result="fail";
		boolean trainingFound=false;
		Trainer trainer=new Trainer();
		if(trainingFound) {
		try {
			boolean deleted=trainerDAO.deleteTrainingDetails(trainer);
			if(deleted)
				result="success";
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("!ERROR[Employee record deletion failed!!]");
		}	
		
	}
		else {
			try {
				throw new NoTrainingFoundException("Employee not found");
			} catch (NoTrainingFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("!ERROR[Employee with specified id does not exist!!]");
			}
		}
		return result;

}
	}
	


