package com.training.dao;

import java.sql.SQLException;

public interface TrainerDAO {
	boolean trainerAuth(String trainerId, String trainerPassword) throws SQLException, ClassNotFoundException;		
}


