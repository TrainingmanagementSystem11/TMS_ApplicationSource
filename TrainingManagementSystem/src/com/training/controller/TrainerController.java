package com.training.controller;

import com.training.helper.FactoryTrainerDB;
import com.training.model.PostTrainingDetailsModel;
import com.training.service.TrainerService;
import com.training.view.TrainerView;

public class TrainerController {
	private TrainerService trainerService;
	TrainerView trainerView=new TrainerView();
	
	public TrainerController() {
		this.trainerService=
				FactoryTrainerDB.createTrainerService();
	}
	
public void handlepostTrainingDetails(PostTrainingDetailsModel model) {
	String outcome="fail";
		 {
		 outcome=trainerService.postTrainingDetails(model);
		if(outcome.contentEquals("success")){
			trainerView.postTrainingSuccess(model);	
		}else {
			trainerView.postTrainingFailure(model);
		}
	}
}
}

		