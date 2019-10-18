package com.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//import com.training.entities.Trainer;
import com.training.entities.Training;


public interface TraineeDAO {
		

		
	public boolean storecourseDetails(Training training) throws ClassNotFoundException, SQLException;
 	public boolean uploadfeedback(Training training) throws ClassNotFoundException, SQLException;
  	
	public boolean deleteNomineeDetails(int employee_id, String course_name) throws ClassNotFoundException, SQLException;
	public Training getStatus(int employee_id,String course_name) throws ClassNotFoundException,SQLException;


}
				
	

