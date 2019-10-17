package com.training.service;

import com.training.model.PostTrainingDetailsModel;

import com.training.model.ViewFeedbackModel;

import com.training.model.TrainerViewFeedbackModel;


public interface TrainerService {

	public String postTrainigDetails(TrainerModel model);
	public String deleteTrainingDetails(TrainerModel model);
	String deleteTrainigDetails(TrainerModel model);

	public String postTrainingDetails(PostTrainingDetailsModel model);

	public String viewTrainingFeedback(ViewFeedbackModel model);

    public TrainerViewFeedbackModel retrieveFeedback(int employeeId);
}

