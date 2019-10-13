package com.training.service;

import com.training.model.TrainerModel;

public interface TrainerService {
	public String postTrainigDetails(TrainerModel model);
	public String deleteTrainigDetails(TrainerModel model);
}