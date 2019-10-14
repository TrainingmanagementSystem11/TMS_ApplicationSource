package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.entities.Training;
import com.training.integrate.ConnectionManager;

public class TraineeDAOImpl implements TraineeDAO {


		 
		 @Override
			public boolean storecourseDetails(Training training) throws ClassNotFoundException, SQLException {
				// TODO Auto-generated method stub
				
				Connection connection=ConnectionManager.openConnection();
				PreparedStatement statement=
						connection.prepareStatement("insert into training values(course_name,employee_id)(?,?)");
				statement.setInt(2,training.getEmployeeId());
				statement.setString(1,training.getCourseName());
				int rows=statement.executeUpdate();
				ConnectionManager.closeConnection();
				if(rows>0)
					return true;
				else
				return false;


		}
	/*	@Override
		public boolean uploadfeedback(Training training) throws ClassNotFoundException, SQLException{
		  Connection connection=ConnectionManager.openConnection();
			PreparedStatement statement=
					connection.prepareStatement("update training set feedback=? where employee_id=? and course_name=?");
			statement.setString(1,training.getFeedback());
			statement.setInt(2, training.getEmployeeId());
			statement.setString(3,training.getCourseName());
			int rows=statement.executeUpdate();
			ConnectionManager.closeConnection();
			if(rows>0)
				return true;
			else
			return false;

		}
		@Override
			public List<Training> getAllEmployees() throws ClassNotFoundException, SQLException {
				// TODO Auto-generated method stub
				Connection connection=ConnectionManager.openConnection();
				Statement statement=connection.createStatement();
				ResultSet resultSet=
						statement.executeQuery("select * from training");
				
				List<Training> employeesList=new ArrayList<Training>();
				while(resultSet.next()) {
					Training training=new Training();
					training.setEmployeeId(resultSet.getInt("employee_id"));
					training.setCourseName(resultSet.getString("course_name"));
					training.setStatus(resultSet.getString("status"));
					training.setFeedback(resultSet.getString("feedback"));
					employeesList.add(training);
				}
				ConnectionManager.closeConnection();
				return employeesList;
			}
			@Override
		public boolean deleteNomineeDetails(Training training) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			Connection connection=ConnectionManager.openConnection();
			PreparedStatement statement=
					connection.prepareStatement("delete from training where employee_id=? and course_name=?");
			statement.setInt(1, training.getEmployeeId());
			statement.setString(2,training.getCourseName());
			int rows=statement.executeUpdate();
			ConnectionManager.closeConnection();
			if(rows>0)
				return true;
			else
			return false;
		}
			
	


*/

		}

