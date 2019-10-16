package com.training.service;

import java.util.List;

import com.training.model.FeedbackTraineeModel;
import com.training.model.FullTraineeModel;
import com.training.model.TraineeModel;

public interface TraineeService {
	public boolean registerCourse(TraineeModel model);
	public  boolean updatingfeedback(FeedbackTraineeModel model);
	public List<TraineeModel> retrieveEmployees();
   	public boolean deleteCourse(TraineeModel model);
	}

