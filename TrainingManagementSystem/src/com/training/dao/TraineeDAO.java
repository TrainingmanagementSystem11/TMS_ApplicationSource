package com.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.entities.Trainer;

public interface TraineeDAO {
		
		
	public boolean storeCourseDetails(Training training)throws ClassNotFoundException, SQLException;
  	public boolean uploadfeedback(Training training) throws ClassNotFoundException, SQLException;
  	public List<Training> getAllEmployees() throws ClassNotFoundException, SQLException ;
  	public boolean deleteNomineeDetails(Training training) throws ClassNotFoundException, SQLException ;
}
				
	

