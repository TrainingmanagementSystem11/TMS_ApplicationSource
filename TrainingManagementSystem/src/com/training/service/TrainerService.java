package com.training.service;

import com.training.model.TrainerModel;

public interface TrainerService {
	public String postTrainigDetails(TrainerModel model);
	public String deleteTrainingDetails(TrainerModel model);
	
}