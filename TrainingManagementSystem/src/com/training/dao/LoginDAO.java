package com.training.dao;

import java.sql.SQLException;

public interface LoginDAO {
	
	String userAuth(int employeeId, String password)throws ClassNotFoundException,SQLException;
}
