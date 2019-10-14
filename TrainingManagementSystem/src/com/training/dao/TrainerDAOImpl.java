package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import com.training.entities.Trainer;
import com.training.integrate.ConnectionManager;

public class TrainerDAOImpl implements TrainerDAO{

	@Override
	public boolean postTrainingDetails(Trainer trainer) throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=
				connection.prepareStatement("insert into employees values(?,?,?,?,?,?)");
		statement.setInt(1,trainer.getTrainerId());
		statement.setInt(2,trainer.getEmployeeId());
		statement.setString(3,trainer.getCourseName());
		LocalDate localDate=trainer.getStartDate();
		java.sql.Date startDate=new java.sql.Date(localDate.getYear(),localDate.getMonthValue(),localDate.getDayOfMonth());
		statement.setDate(4,startDate);
		LocalDate localDate1=trainer.getEndDate();
		java.sql.Date endDate=new java.sql.Date(localDate1.getYear(),localDate1.getMonthValue(),localDate1.getDayOfMonth());
		statement.setDate(5,endDate);
		statement.setString(6,trainer.getVenue());
		
		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();
		
		if(rows>0)
			return true;
		else
	
		return false;
	}
	

	@Override
	public boolean viewTrainingFeedback(Trainer trainer) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTrainingDetails(Trainer trainer) throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=
				connection.prepareStatement("delete from employees where trainer_id=?");
		statement.setInt(1, trainer.getTrainerId());
		int rows=statement.executeUpdate();
		ConnectionManager.closeConnection();
		if(rows>0)
			return true;
		else
		return false;
	}
}