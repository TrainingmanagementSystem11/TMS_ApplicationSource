package com.training.helper;

import com.training.dao.TraineeDAO;
import com.training.dao.TraineeDAOImpl;
import com.training.service.TraineeService;
import com.training.service.TraineeServiceImpl;

public class FactoryEmployeeDB {
	public static TraineeDAO createTraineeDAO(){
		TraineeDAO traineeDAO=new TraineeDAOImpl();
        return traineeDAO;
       
    }
    public static TraineeService createTraineeService(){
    	TraineeService traineeService=new TraineeServiceImpl();
        return traineeService;
    }
}
