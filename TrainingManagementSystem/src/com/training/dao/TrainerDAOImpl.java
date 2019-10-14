package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.training.entities.Trainer;
import com.training.integrate.ConnectionManager;
import com.training.model.PostTrainingDetailsModel;
import com.training.model.ViewFeedbackModel;

public class TrainerDAOImpl implements TrainerDAO{

	

	@Override
	public boolean viewTrainingFeedback(Trainer model) {
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("select feedback from training where employee_id=?");
		statement.setInt(1, employeeId);
		
		ResultSet resultSet=statement.executeQuery();
		Trainer trainer=new Trainer();
		while(resultSet.next()) {
			
			trainer.setEmployeeId(resultSet.getInt("employee_id"));
			
			Training training=new Training();
			training.setFeedback(resultSet.getString("feedback"));
			
			
		}
		ConnectionManager.closeConnection();
		return training;
	}
	
	
	@Override
	public boolean postTrainingDetails(Trainer trainer) throws ClassNotFoundException, SQLException{
	// TODO Auto-generated method stub
	Connection connection=ConnectionManager.openConnection();
	PreparedStatement statement=
			connection.prepareStatement("update from course set employee_id=? where course_Name=?");
	statement.setInt(1,trainer.getEmployeeId());
	statement.setString(2, trainer.getCourseName());
	int rows=statement.executeUpdate();
	ConnectionManager.closeConnection();
	if(rows>0)
		return true;
	else
	return false;
}


	@Override
	public boolean deleteTrainingDetails(Trainer trainer) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}
	}
