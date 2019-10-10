package com.training.helper;

import com.training.dao.TrainerDAO;
import com.training.dao.TrainerDAOImpl;

public class FactoryTrainerDAO {
public static TrainerDAO createTrainerDAO() {
		
		TrainerDAO trainerDAO=new TrainerDAOImpl();
		
		return trainerDAO;
		
		
	}


}
