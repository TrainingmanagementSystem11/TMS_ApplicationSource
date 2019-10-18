package com.training.service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.training.dao.TraineeDAO;
import com.training.dao.TraineeDAOImpl;
import com.training.entities.Training;
import com.training.helper.FactoryEmployeeDB;
import com.training.model.FeedbackTraineeModel;
import com.training.model.FullTraineeModel;
import com.training.model.StatusManagerModel;
import com.training.model.TraineeModel;

public class TraineeServiceImpl implements TraineeService {
	
		 
	    Logger logger=Logger.getLogger(TraineeServiceImpl.class.getName());
	    private TraineeDAO traineeDAO;

	        public TraineeServiceImpl() {
	            this.traineeDAO=FactoryEmployeeDB.createTraineeDAO();
	            
	        }
 
	public boolean registerCourse(TraineeModel model)
	 {
	    logger.info("---- In TraineeServiceImpl registerCourse method started ---- ");

	        Training training=new Training();
			training.setEmployeeId(model.getEmployee_id());
			training.setCourseName(model.getCourse_name());
			boolean result=false;
			try {
				boolean stored=traineeDAO.storecourseDetails(training);
				if(stored)
					result=true;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
			    e.printStackTrace();
				System.out.println("!ERROR[Registration failed because of internal issues...]");
			}
			return result;
	 
	 
	 
	 }
	@Override
	 public boolean updatingfeedback(FeedbackTraineeModel model)
	 {
	   Training training=new Training();
	   training.setEmployeeId(model.getEmployee_id());
	   training.setCourseName(model.getCourse_name());
	   training.setFeedback(model.getFeedback());
	   boolean result=false;
		try {
	 			boolean updated=traineeDAO.uploadfeedback(training);
	 			System.out.println(updated);
				if(updated==true)
					result=true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("!ERROR[Feedback updation failed!!]");
			}
			return result;
	 
	 }
	 
	 
	
	 
	 @Override
	 public boolean deleteCourse(int employee_id,String course_name){
	   	List<Training> traineeList= new ArrayList<>();
	   	traineeList.remove(traineeList);
	     boolean result=false;
	   	try {

			boolean deleted=traineeDAO.deleteNomineeDetails(employee_id,course_name);
			if(deleted==true)
				result=true;

		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace()	;
	 
	 }
		return result;
		
	 
	 }

	@Override
	public StatusManagerModel viewStatus(int employee_id, String course_name) {
		
		Training training=null;
		StatusManagerModel model=new StatusManagerModel();
		try {
			training=traineeDAO.getStatus(employee_id, course_name);
			model.setCourseName(training.getCourseName());
			model.setEmployeeId(training.getEmployeeId());
			model.setStatus(training.getStatus());
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return model;
		// TODO Auto-generated method stub
		
		
		
		
	}}


