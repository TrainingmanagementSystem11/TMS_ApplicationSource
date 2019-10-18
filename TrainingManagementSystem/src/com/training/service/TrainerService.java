package com.training.service;

import com.training.model.PostTrainingDetailsModel;
import com.training.model.TrainerViewFeedbackModel;


public interface TrainerService {	
	public String postTrainingDetails(PostTrainingDetailsModel model);

	String viewTrainingFeedback(TrainerViewFeedbackModel model);
}

