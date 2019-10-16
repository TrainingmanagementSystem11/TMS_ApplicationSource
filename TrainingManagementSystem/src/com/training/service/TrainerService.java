package com.training.service;

import com.training.model.PostTrainingDetailsModel;
<<<<<<< HEAD
import com.training.model.ViewFeedbackModel;
=======
import com.training.model.TrainerViewFeedbackModel;
>>>>>>> refs/heads/master

public interface TrainerService {
	public String postTrainingDetails(PostTrainingDetailsModel model);
<<<<<<< HEAD
	public String viewTrainingFeedback(ViewFeedbackModel model);
=======
    public TrainerViewFeedbackModel retrieveFeedback(int employeeId);
	
>>>>>>> refs/heads/master
	
}