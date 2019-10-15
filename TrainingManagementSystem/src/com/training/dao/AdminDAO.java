package com.training.dao;

import java.sql.SQLException;

import com.training.entities.Courses;



public interface AdminDAO {
	
	public boolean updateDate(Courses courses)throws ClassNotFoundException, SQLException;
	public boolean numberofattendees(String course_name)throws ClassNotFoundException, SQLException;

}
