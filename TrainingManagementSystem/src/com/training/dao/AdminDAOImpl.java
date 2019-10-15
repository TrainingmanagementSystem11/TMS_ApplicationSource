package com.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.training.entities.Courses;
import com.training.integrate.ConnectionManager;

public class AdminDAOImpl implements AdminDAO {

	@Override
	public boolean updateDate(Courses courses) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	
		Connection connection=ConnectionManager.openConnection();
PreparedStatement statement=
    connection.prepareStatement("update courses set startDate=?,endDate=? where course_id=?");
    statement.setInt(1,courses.getCourse_Id());
    statement.setInt(2,courses.getStartDate());
    statement.setInt(3,courses.getEndDate());
    int rows=statement.executeUpdate();
	ConnectionManager.closeConnection();
	if(rows>0)
		return true;
	 else 
	   return false;
	}
    public boolean numberofattendees(String course_name)throws ClassNotFoundException, SQLException
    {
    
	Connection connection=ConnectionManager.openConnection();
	PreparedStatement statement=
		    connection.prepareStatement("select count(*) from course where course_name=?");
	  statement.setString(1, course_name);
	ResultSet resultSet=
			statement.executeQuery();
    Courses courses = new Courses(); 
	while(resultSet.next())
	{
		courses.setCourseName(resultSet.getString("course_name"));
	}
	return true;
    }	
	
	
	
	
}

