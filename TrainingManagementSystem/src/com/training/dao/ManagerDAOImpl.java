package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import com.training.entities.Manager;
import com.training.integrate.ConnectionManager;

public class ManagerDAOImpl {

	@SuppressWarnings("deprecation")
	public boolean postTrainingDetails(Manager manager) throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=
				connection.prepareStatement("insert into employees values(?,?,?,?,?,?)");
		statement.setInt(1,manager.getManagerId());
		statement.setInt(2,manager.getEmployeeId());
		statement.setString(3,manager.getCourseName());
		LocalDate localDate=manager.getStartDate();
		java.sql.Date startDate=new java.sql.Date(localDate.getYear(),localDate.getMonthValue(),localDate.getDayOfMonth());
		statement.setDate(4,startDate);
		LocalDate localDate1=manager.getEndDate();
		java.sql.Date endDate=new java.sql.Date(localDate1.getYear(),localDate1.getMonthValue(),localDate1.getDayOfMonth());
		statement.setDate(5,endDate);
		statement.setString(6,manager.getVenue());
		
		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();
		
		if(rows>0)
			return true;
		else
	
		return false;
	}
	
	public boolean approve(Manager manager) throws ClassNotFoundException, SQLException {
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
	}
}
