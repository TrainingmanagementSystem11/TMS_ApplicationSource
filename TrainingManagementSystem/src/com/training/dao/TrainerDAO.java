package com.training.dao;

import java.sql.SQLException;
import java.util.List;

public interface TrainerDAO {
	boolean trainerAuth(String trainerId, String trainerPassword) throws SQLException, ClassNotFoundException;

	
}
	


	


