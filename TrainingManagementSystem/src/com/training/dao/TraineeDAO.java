package com.training.dao;
<<<<<<< HEAD

import java.sql.ResultSet;
=======

>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
import java.sql.SQLException;
import java.util.List;

//import com.training.entities.Trainer;
import com.training.entities.Training;


public interface TraineeDAO {
		
<<<<<<< HEAD

		
=======
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
	public boolean storecourseDetails(Training training) throws ClassNotFoundException, SQLException;
 	public boolean uploadfeedback(Training training) throws ClassNotFoundException, SQLException;
<<<<<<< HEAD
  	
	public boolean deleteNomineeDetails(int employee_id, String course_name) throws ClassNotFoundException, SQLException;
	public Training getStatus(int employee_id,String course_name) throws ClassNotFoundException,SQLException;


=======
  	public List<Training> getAllEmployees() throws ClassNotFoundException, SQLException;
  	public boolean deleteNomineeDetails(Training training) throws ClassNotFoundException, SQLException ;
	
>>>>>>> branch 'master' of https://github.com/TrainingmanagementSystem11/TMS_ApplicationSource
}
				
	

