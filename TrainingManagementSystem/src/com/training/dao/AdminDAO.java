package com.training.dao;

import java.sql.SQLException;

public interface AdminDAO {
	
		boolean adminAuth(String adminId, String adminPassword) throws SQLException, ClassNotFoundException;
}
