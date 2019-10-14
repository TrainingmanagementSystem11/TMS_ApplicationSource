package com.training.service;

import java.sql.SQLException;
import com.training.dao.TrainerDAO;
import com.training.entities.Trainer;
import com.training.exception.EmployeeIdValidException;
import com.training.helper.FactoryTrainerDB;
import com.training.model.PostTrainingDetailsModel;

public class TrainerServiceImpl implements TrainerService {
	
private TrainerDAO trainerDAO;
	
	public TrainerServiceImpl() {
		this.trainerDAO=FactoryTrainerDB.createTrainerDB();
	}

	@Override
	public String postTrainingDetails(PostTrainingDetailsModel model) {
		Trainer trainer=new Trainer();
		trainer.setCourseName(model.getCourseName());
		
		if(model.getEmployeeId()!=0) {
			trainer.setEmployeeId(model.getEmployeeId());
		}else {
			try {
			throw new EmployeeIdValidException("EmployeeId not valid");
			}catch(EmployeeIdValidException e) {
				System.out.println("!ERROR[ EmployeeId already exists]");
			}
		}
		
		String result="fail";
		try {
			boolean updated=trainerDAO.postTrainingDetails(trainer);
			if(updated)
				result="success";
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("!ERROR[Training updation failed!!]");
		}
		return result;
	}
	}
	
