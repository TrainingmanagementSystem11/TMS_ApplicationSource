package com.training.service;

import com.training.model.TrainerModel;

public interface TrainerService {
	 default boolean trainerAuthenticationService(TrainerModel trainerModel) {
			return false;
			
		}

}
