package com.training.dao;

import java.sql.SQLException;
import com.training.entities.Trainer;
import com.training.model.PostTrainingDetailsModel;
import com.training.model.ViewFeedbackModel;

public interface TrainerDAO {
	public boolean postTrainingDetails(Trainer trainer)throws ClassNotFoundException, SQLException;
	//public boolean viewTrainingFeedback(Trainer trainer)throws ClassNotFoundException, SQLException;

}
	


	


