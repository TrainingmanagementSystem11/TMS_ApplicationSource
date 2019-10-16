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
<<<<<<< HEAD
		String outcome=trainerService.postTrainingDetails(model);
		if(outcome.contentEquals("success")) {
=======
		 outcome=trainerService.postTrainingDetails(model);
		if(outcome.contentEquals("success")){
>>>>>>> refs/heads/master
			trainerView.postTrainingSuccess(model);	
		}else {
			trainerView.postTrainingFailure(model);
		}
	}
}

public void handleRetrieveFeedback(int employeeId) {
	// TODO Auto-generated method stub
	TrainerViewFeedbackModel trainer=trainerService.retrieveFeedback(employeeId);
	   
     trainerView.showFeedback(trainer);
 }

	
}


		