package com.training.dao;

import java.sql.SQLException;

import com.training.entities.Trainer;

public interface TraineeDAO {
		
		
		public boolean storeTrainingDetails(Trainer trainer)throws ClassNotFoundException, SQLException;
		
			
	}

