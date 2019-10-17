package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

import com.training.entities.Courses;
import com.training.entities.Training;
import com.training.integrate.ConnectionManager;
import com.training.model.AttendeesAdminModel;
import com.training.model.ScheduleAdminModel;
import com.training.model.VenueAdminModel;

public class AdminDAOImpl implements AdminDAO {

	@Override
	public boolean updateDate(ScheduleAdminModel scheduleAdminModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	
		Connection connection=ConnectionManager.openConnection();
PreparedStatement statement=
    connection.prepareStatement("update courses set start_date=?,end_date=? where course_name=?");
statement.setString(1,scheduleAdminModel.getStartDate());
statement.setString(2,scheduleAdminModel.getEndDate());
statement.setString(3,scheduleAdminModel.getCourse_name());
  
    int rows=statement.executeUpdate();
	ConnectionManager.closeConnection();
	if(rows>0)
		return true;
	 else 
	   return false;
	}
    public ResultSet Numberofattendees(AttendeesAdminModel adminModel)throws ClassNotFoundException, SQLException
    {
    	
	Connection connection=ConnectionManager.openConnection();
	PreparedStatement statement=
		    connection.prepareStatement("select count(*) from trainings where course_name=?");
	  statement.setString(1, adminModel.getCourseName());
	ResultSet resultSet=
			statement.executeQuery();
  Training training=new Training();
	while(resultSet.next())
	{
		training.setCourseName(resultSet.getString(1));
	}
	return resultSet;
	//System.out.println("Number of attendees for course"+resultSet);
    }
	@Override
	public boolean updateVenue(VenueAdminModel venueAdminModel)throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		Connection connection=ConnectionManager.openConnection();
		PreparedStatement statement=
		    connection.prepareStatement("update courses(course_name,venue) set venue=? where course_name=?");
		 	statement.setString(1,venueAdminModel.getVenue());
		    statement.setString(2,venueAdminModel.getCourse_name());
		    int rows=statement.executeUpdate();
			ConnectionManager.closeConnection();
			if(rows>0) 
				return true;
			else  
			   return false;
			}
		
	}	
	
	

	


