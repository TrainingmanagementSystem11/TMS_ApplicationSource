package com.training.service;

import java.util.List;

import com.training.model.TraineeModel;

public interface TraineeService {
	public String registerCourse(TraineeModel model);
	public String updatingfeedback(TraineeModel model);
	public List<TraineeModel> retrieveEmployees();
	public String deleteCourse(TraineeModel model);
	}

