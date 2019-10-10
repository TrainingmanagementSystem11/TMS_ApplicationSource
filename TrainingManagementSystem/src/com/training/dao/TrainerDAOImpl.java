package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.training.integrate.ConnectionManager;

public class TrainerDAOImpl implements TrainerDAO{
	@Override
	public boolean trainerAuth(String trainerId,String trainerPassword) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//System.out.println(adminId);
		//System.out.println(adminPassword);
			Connection connection=ConnectionManager.openConnection();
			boolean flag=false;
			PreparedStatement statement = connection.prepareStatement("select trainer_id, trainer_Password from training where trainer_Id=? and trainer_Password=?");
			statement.setString(1, trainerId);
			statement.setString(2, trainerPassword);
 			int results=statement.executeUpdate();
			//ResultSet results=statement.executeQuery();
			//System.out.println(results);
			 ConnectionManager.closeConnection();
			 if(results==1) {
				
				 return true;
			 }else {
				 //System.out.println("false");
				 return false;
			 }
	}

	

	
	}

	
	
			

