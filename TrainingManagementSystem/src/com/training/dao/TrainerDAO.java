package com.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.entities.Manager;
import com.training.entities.Trainer;

public interface TrainerDAO {
	public boolean postTrainingDetails(Trainer trainer)throws ClassNotFoundException, SQLException;
	public boolean viewTrainingFeedback(Trainer trainer)throws ClassNotFoundException, SQLException;
	public boolean deleteTrainingDetails(Trainer trainer)throws ClassNotFoundException, SQLException;
	
}
	


	


