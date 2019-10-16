package com.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.training.integrate.ConnectionManager;

public class LoginDAOImpl {
	
	public String userAuth(int employeeId, String password) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		String role="";
		Connection connection=(Connection) ConnectionManager.openConnection();
		
		String query2="select role from user_credentials where EmployeeId=? and user_password=?";
		PreparedStatement preparedStatement2=(PreparedStatement) connection.prepareStatement(query2);
		preparedStatement2.setInt(1, employeeId);
		preparedStatement2.setString(2, password);
	//	System.out.println("In DAO");
		ResultSet rs2 = preparedStatement2.executeQuery();
		while(rs2.next()) 
		role=rs2.getString("role");
		
		return role;
		
	}
}
