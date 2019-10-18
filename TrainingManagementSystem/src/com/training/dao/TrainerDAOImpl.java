package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.training.entities.Trainer;
import com.training.integrate.ConnectionManager;

public class TrainerDAOImpl implements TrainerDAO{
	


	@Override
	public boolean viewTrainingFeedback(Trainer trainer) throws SQLException, ClassNotFoundException {
		
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=connection.prepareStatement("select feedback from trainings where employee_id=?");
		//System.out.println(trainer.getEmployeeId());
		//System.out.println(trainer.getCourseName());
		statement.setString(1,trainer.getFeedback());
		statement.setInt(2,trainer.getEmployeeId());
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
			connection.prepareStatement("insert into trainings(course_name,employee_id) values(?,?)");
	//System.out.println(trainer.getEmployeeId());
	//System.out.println(trainer.getCourseName());
	statement.setString(1, trainer.getCourseName());
	statement.setInt(2,trainer.getEmployeeId());
	int rows=statement.executeUpdate();
	ConnectionManager.closeConnection();
	if(rows>0)
		return true;
	else
	return false;

}
}
