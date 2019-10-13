package com.training.helper;

import com.training.dao.TrainerDAO;
import com.training.dao.TrainerDAOImpl;
import com.training.service.TrainerService;
import com.training.service.TrainerServiceImpl;

public class FactoryTrainerDB {
	public static TrainerDAO createTrainerDB(){
		TrainerDAO trainerDAO=new TrainerDAOImpl();
		return trainerDAO;
		
	}
	public static TrainerService createTrainerService(){
		TrainerService trainerService=
				new TrainerServiceImpl();
		return trainerService;
	}

		
	}

