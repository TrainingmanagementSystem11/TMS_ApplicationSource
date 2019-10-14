package com.training.service;

import com.training.model.PostTrainingDetailsModel;
import com.training.model.ViewFeedbackModel;

public interface TrainerService {
	public String postTrainingDetails(PostTrainingDetailsModel model);
	public String viewTrainingFeedback(ViewFeedbackModel model);
	
}