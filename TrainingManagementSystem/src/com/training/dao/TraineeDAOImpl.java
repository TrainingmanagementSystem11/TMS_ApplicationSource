package com.training.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.training.entities.Training;
import com.virtusa.integrate.ConnectionManager;

public class TraineeDAOImpl implements TraineeDAO {


	    Logger logger=Logger.getLogger(TraineeDAOImpl.class.getName());
		 @Override
			public boolean storecourseDetails(Training training) throws ClassNotFoundException, SQLException {
				// TODO Auto-generated method stub
			    logger.info("---- In TraineeDAOImpl storecourseDetails method started ---- ");
				Connection connection=ConnectionManager.openConnection();
		        logger.info("---- In storecourseDetails method of TraineeDAOImpl class the database connection opened---");
				PreparedStatement statement=
						connection.prepareStatement("insert into trainings(course_name,employee_id) values(?,?)");
				statement.setInt(2,training.getEmployeeId());
				statement.setString(1,training.getCourseName());
				int rows=statement.executeUpdate();
				ConnectionManager.closeConnection();
		        logger.info("---- In storecourseDetails method of TraineeDAOImpl class the database connection closed---");
		        if(rows>0)
					return true;
				else
				return false;


		}
		@Override
		public boolean uploadfeedback(Training training) throws ClassNotFoundException, SQLException{
			logger.info("---- In TraineeDAOImpl uploadfeedback method started ---- ");
		    Connection connection=ConnectionManager.openConnection();
		    logger.info("---- In uploadfeedback method of TraineeDAOImpl class the database connection opened---");
			PreparedStatement statement=
					connection.prepareStatement("update trainings set feedback=?  where employee_id=? and course_name=?");
			statement.setString(1,training.getFeedback());
			statement.setInt(2, training.getEmployeeId());
			statement.setString(3,training.getCourseName());
		    System.out.println(statement);

			int rows=statement.executeUpdate();
			ConnectionManager.closeConnection();
			logger.info("---- In uploadfeedback method of TraineeDAOImpl class the database connection closed---");

			if(rows>0)
				return true;
			else
			return false;

		}
		
		
			@Override
		public boolean deleteNomineeDetails(int employee_id, String course_name) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
				logger.info("---- In TraineeDAOImpl deleteNomineeDetails method started ---- ");
			Connection connection=ConnectionManager.openConnection();
		    logger.info("---- In deleteNomineeDetails method of TraineeDAOImpl class the database connection opened---");

			PreparedStatement statement=
					connection.prepareStatement("delete from trainings where employee_id=? and course_name=?");
			statement.setInt(1,employee_id );
			statement.setString(2,course_name);
			int rows=statement.executeUpdate();
			ConnectionManager.closeConnection();
			logger.info("---- In deleteNomineeDetails method of TraineeDAOImpl class the database connection closed---");

			if(rows>0)
				return true;
			else
			return false;
		}
			@Override
			public Training getStatus(int employee_id, String course_name) throws ClassNotFoundException, SQLException {
				// TODO Auto-generated method stub
				logger.info("---- In TraineeDAOImpl getStatus method started ---- ");
		
				Connection connection=ConnectionManager.openConnection();
				PreparedStatement statement=connection.prepareStatement("select status from trainings where employee_id=? and course_name=?");
			    logger.info("---- In getStatus method of TraineeDAOImpl class the database connection opened---");
       
				statement.setInt(1, employee_id);
				statement.setString(2,course_name);
				ResultSet resultSet=statement.executeQuery();
				Training training=new Training();
				while(resultSet.next()) {
					training.setStatus(resultSet.getString("status"));
				}
				ConnectionManager.closeConnection();
				logger.info("---- In getStatus method of TraineeDAOImpl class the database connection closed---");	
			     return training;
        
			}
			
		}


