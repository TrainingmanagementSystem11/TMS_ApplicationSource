package com.training.controller;

import com.training.helper.FactoryTrainerService;
import com.training.model.TrainerModel;
import com.training.service.TrainerService;

import com.training.view.LoginView;
import com.training.view.TrainerView;

public class TrainerController {
	TrainerService trainerService;
	public TrainerController(){
		
		this.trainerService=FactoryTrainerService.createTrainerService();
	}
	public void trainerAuthentication(String trainerId,String trainerPassword) {
		
		TrainerModel trainerModel=new TrainerModel();
		trainerModel.setTrainerId(trainerId);
		trainerModel.setTrainerpassword(trainerPassword);

		boolean trainerType=trainerService.trainerAuthenticationService(trainerModel);
		 if(trainerType==true) {
		     System.out.println("************************Login Successful****************************");
				
		    TrainerView.trainerMenu();
			
		}else {
			System.out.println("***Invalid user name or password***");
			System.out.println("***Please Try Again***");
			LoginView.trainerLogin();
		
		}		
	}

}
