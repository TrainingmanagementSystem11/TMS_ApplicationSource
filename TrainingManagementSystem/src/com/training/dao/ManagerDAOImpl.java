package com.training.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.training.entities.Training;
import com.training.integrate.ConnectionManager;


public class ManagerDAOImpl {

	public boolean UpdateApproval(Training training) throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=
				connection.prepareStatement("update  trainings status=? where employee_id=? and course_name=?");
		statement.setInt(1,training.getEmployeeId());
		statement.setString(2,training.getCourseName());
		statement.setString(3, training.getStatus());
		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();
		
		if(rows>0)
			return true;
		else
	
		return false;
	}
	
	/*public boolean approve(Manager manager) throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=
				connection.prepareStatement("Approve from employees where employee_id=?");
		statement.setInt(1, manager.getManagerId());
		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();
		if(rows>0)
			return true;
		else
		return false;
	}
	public boolean Reject(Manager manager) throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=
				connection.prepareStatement("Reject from employees where employee_id=?");
		statement.setInt(1, manager.getManagerId());
		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();
		if(rows>0)
			return true;
		else
		return false;
	}*/
}
