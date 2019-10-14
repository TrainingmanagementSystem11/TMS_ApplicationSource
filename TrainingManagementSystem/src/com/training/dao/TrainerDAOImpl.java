package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.training.entities.Trainer;
import com.training.integrate.ConnectionManager;

public class TrainerDAOImpl implements TrainerDAO{

	

	@Override
	public boolean viewTrainingFeedback(Trainer trainer) throws ClassNotFoundException, SQLException {
		return false;
	}

	@Override
	public boolean deleteTrainingDetails(Trainer trainer) throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=
				connection.prepareStatement("delete from employees where trainer_id=?");
		statement.setInt(1, trainer.getCourseId());
		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();
		if(rows>0)
			return true;
		else
		return false;
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
	}
