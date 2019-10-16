package com.training.dao;

import java.sql.SQLException;
<<<<<<< HEAD
import java.util.List;

import com.training.entities.Manager;
=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
import com.training.entities.Trainer;
import com.training.model.PostTrainingDetailsModel;
import com.training.model.ViewFeedbackModel;

public interface TrainerDAO {
	public boolean postTrainingDetails(Trainer trainer)throws ClassNotFoundException, SQLException;
	//public boolean viewTrainingFeedback(Trainer trainer)throws ClassNotFoundException, SQLException;

}
	


	


