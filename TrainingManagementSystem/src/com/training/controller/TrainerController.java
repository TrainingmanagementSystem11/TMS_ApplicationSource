package com.training.controller;

import com.training.helper.FactoryTrainerDB;
import com.training.model.PostTrainingDetailsModel;
import com.training.model.TrainerViewFeedbackModel;
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
		String outcome1=trainerService.postTrainingDetails(model);
		if(outcome1.contentEquals("success")) {
        outcome1=trainerService.postTrainingDetails(model);
		if(outcome1.contentEquals("success")){
			trainerView.postTrainingSuccess(model);	
		}else {
			trainerView.postTrainingFailure(model);
		}
		}
	}
}
	public void handleviewFeedbackDetails(TrainerViewFeedbackModel model) {
		String outcome="fail";
		{
			String outcome1=trainerService.viewTrainingFeedback(model);
			if(outcome1.contentEquals("success")) {
	        outcome1=trainerService.viewTrainingFeedback(model);
			if(outcome1.contentEquals("success")){
				trainerView.viewTrainingFeedbackSuccess(model);	
			}else {
				trainerView.viewTrainingFeedbackFailure(model);
			}
}
}
	}
	}	



		