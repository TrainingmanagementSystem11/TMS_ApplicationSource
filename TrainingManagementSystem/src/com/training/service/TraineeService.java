package com.training.service;

import java.util.List;

import com.training.model.FeedbackTraineeModel;
import com.training.model.FullTraineeModel;
import com.training.model.StatusManagerModel;
import com.training.model.TraineeModel;

public interface TraineeService {
	public boolean registerCourse(TraineeModel model);
	public  boolean updatingfeedback(FeedbackTraineeModel model);
   	public boolean deleteCourse(int employee_id,String course_name);
	public StatusManagerModel viewStatus(int employee_id, String course_name);
	}

