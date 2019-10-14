package com.training.controller;

import com.training.helper.FactoryTrainerDB;
import com.training.helper.FactoryTrainerService;
import com.training.model.TrainerModel;
import com.training.service.TrainerService;
import com.training.validation.TrainerModelValidator;
import com.training.view.LoginView;
import com.training.view.TrainerView;

public class TrainerController {
	private TrainerService trainerService;
	TrainerView trainerView=new TrainerView();
	
	public TrainerController() {
		this.trainerService=
				FactoryTrainerDB.createTrainerService();
	}
	
public void handlepostTrainingDetails(TrainerModel model) {
		
		TrainerModelValidator validator=new TrainerModelValidator();
				
		if(validator.validate(model)) {
		
		String outcome=trainerService.postTrainigDetails(model);
		if(outcome.contentEquals("success")) {
			trainerView.postTrainingSuccess(model);	
		}else {
			trainerView.postTrainingSuccess(model);
		}
	}else {
		trainerView.validationFailedError();
	}
}
		public void handleDeleteTraining(TrainerModel model) {
			String outcome=trainerService.deleteTrainingDetails(model);
			if(outcome.contentEquals("success")) {
				trainerView.showDeleteSuccess(model);	
			}else {
				trainerView.showDeleteFailure(model);
			}
	}
		
}