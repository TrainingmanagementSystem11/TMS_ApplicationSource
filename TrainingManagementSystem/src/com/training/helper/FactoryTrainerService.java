package com.training.helper;

import com.training.service.TrainerService;
import com.training.service.TrainerServiceImpl;

public class FactoryTrainerService {
	public static TrainerService createTrainerService() {
		
		
		TrainerService trainerService=new TrainerServiceImpl();
	return trainerService;

}

}
